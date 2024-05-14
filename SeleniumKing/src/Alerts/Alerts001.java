package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts001 {
	public static void main(String[] args) {

		String name = "viswa";
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("confirmbtn")).click();

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

	}

}
