package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosegestivedropdowns {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		List <WebElement> options =driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
	//	WebElement cty = driver.findElement(By.xpath("//*[text()='India']"));
		//String country = cty.getText();
		
       // List<WebElement>options=driver.findElements(By.xpath("//li[@class=\"ui-menu-item\"]"));
      int listsize= options.size();
      System.out.println(listsize);
       for (WebElement option: options) {
    	   
		//String country = option.getText();
		if (option.getText().equalsIgnoreCase("india")) {
			option.click();
			break;
	
			
		}
	}
        }
	}
