import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assignment3 {

	public static void main(String[] args) {
		// String[] listitems = {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		WebDriverWait time = new WebDriverWait(driver, Duration.ofSeconds(7));

		// Usename
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");

		// Password
		driver.findElement(By.id("password")).sendKeys("learning");

		// Select user
		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		time.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		Assert.assertEquals(driver.findElement(By.id("okayBtn")).getText(), "Okay");
		driver.findElement(By.id("okayBtn")).click();

		// Select list
		WebElement selectUser = driver.findElement(By.xpath("//select[@class=\"form-control\"]"));
		Select list = new Select(selectUser);
		list.selectByVisibleText("Consultant");
		list.getFirstSelectedOption().getText();

		// Agrre checkbox
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

		// Sign Button
		driver.findElement(By.id("signInBtn")).click();
		time.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@class=\"card-footer\"]/button[@class=\"btn btn-info\"]")));

		List<WebElement> products = driver
				.findElements(By.xpath("//div[@class=\"card-footer\"]/button[@class=\"btn btn-info\"]"));
		//// X-Path div[@class="card-footer"]/button[@class="btn btn-info"]
		// CSS .card-footer .btn-info

		for (int i = 0; i < products.size(); i++) {

			products.get(i).click();

		}
		time.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		driver.findElement(By.partialLinkText("Checkout")).click();
		
		time.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("button[@class=\"btn btn-success\"]")));
		driver.findElement(By.xpath("button[@class=\"btn btn-success\"]")).click();
		////button[@class="btn btn-success"]
		

	}

}
