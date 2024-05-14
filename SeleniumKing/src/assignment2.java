import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
		//Enter Name 
		driver.findElement(By.xpath("//div[@class=\"form-group\"]//input[@name=\"name\"]")).sendKeys("Viswa");
		
		//Enter Email
		driver.findElement(By.xpath("//div[@class=\"form-group\"]//input[@name=\"email\"]")).sendKeys("contact@rahulshettyacademy.com");
		
		//Enter Password
		driver.findElement(By.xpath("//div[@class=\"form-group\"]//input[@type=\"password\"]")).sendKeys("Qwerty@123");
		
		//check Box
		driver.findElement(By.xpath("//div[@class=\"form-check\"]//input[@type=\"checkbox\"]")).click();
		
		//Gender
		WebElement Genderlist = driver.findElement(By.id("exampleFormControlSelect1"));
		Select list = new Select(Genderlist);
		list.selectByVisibleText("Male");
		System.out.println(list.getFirstSelectedOption().getText());
		
		//Employment status
		driver.findElement(By.id("inlineRadio1")).click();
		
		//Enter Date
		driver.findElement(By.xpath("//div[@class=\"form-group\"]//input[@type=\"date\"]")).sendKeys("03-02-1998");
		
		//input[@type='submit']
		//click Submit
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//success message
		 driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();
		 driver.quit();
		 
		 ////div[@class='alert alert-success alert-dismissible']
		 //.alert.alert-success.alert-dismissible
		
		
	
	
	
	
	
	
	}
	

}
