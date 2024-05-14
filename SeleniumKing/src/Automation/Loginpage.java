package Automation;

import java.time.Duration;
import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Loginpage {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Viswa");
		driver.findElement(By.name("inputPassword")).sendKeys("qWERTY");
		//driver.findElement(By.className("signInBtn")).click();
		//Css selector with classname.
		//Id
		driver.findElement(By.cssSelector("button.signInBtn")).click();
		//Thread.sleep(2000);
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		//Foreget password
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("Viswa");
	    driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("viswa.phvs@gmail.com");
	    //driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).clear();
	    driver.findElement(By.xpath("//input[@placeholder=\"Phone Number\"]")).sendKeys("9490123418");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//div/button[2]")).click();
	    System.out.println(driver.findElement(By.xpath("//p[@class=\"infoMsg\"]")).getText());
	    
	    driver.findElement(By.cssSelector("button[class=\"go-to-login-btn\"]")).click();
	    driver.findElement(By.id("inputUsername")).sendKeys("Viswa");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		driver.findElement(By.id("chkboxOne")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] p")).getText(),"You are successfully logged in.");
		
	}
	public static String GetPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"reset-pwd-btn\"]")).click();
		String Passwordtext= driver.findElement(By.xpath("//p[@class=\"infoMsg\"]")).getText();

		//Please use temporary password 'rahulshettyacademy' to Login.
		//index -- 0 Please use temporary password
		//index-- 1 rahulshettyacademy' to Login.
		
		//index--0 rahulshettyacademy
		//index--1 to login

		String [] PasswordArray = Passwordtext.split("'");
		String Password =  PasswordArray[1].split("'")[0];
		return Password;
		
	    
		
		
		
		
	}


}
