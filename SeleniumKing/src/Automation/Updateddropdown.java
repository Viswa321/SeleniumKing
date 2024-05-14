package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Updateddropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_SeniorCitizenDiv']")).click();

		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		System.out.println(driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size());

		driver.findElement(By.id("divpaxinfo")).click();
		// driver.manage().window().maximize();

		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		for (int i = 0; i < 5; i++) {

			driver.findElement(By.id("hrefIncAdt")).click();

		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "6 Adult");

		Thread.sleep(2000);
		driver.quit();
	}
}
