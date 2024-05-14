package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.manage().window().maximize();
		
//	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
//	driver.findElement(By.xpath("//a[@value='BLR']")).click();
//	driver.findElement(By.xpath("//a[@value='MAA']")).click();	
//	
		driver.manage().window().maximize();
	driver.navigate().to("https://www.spicejet.com/#sourceautocomplete");
	driver.findElement(By.xpath("//div[text()='From']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='From']//following-sibling::div//child::input[@type='text']")).sendKeys("MAA");
	//driver.quit();
	}

}
