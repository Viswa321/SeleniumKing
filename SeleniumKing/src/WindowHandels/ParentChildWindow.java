package WindowHandels;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ParentChildWindow {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set<String> Windows = driver.getWindowHandles();//Get all the windowhandels
		Iterator<String> it = Windows.iterator();//All the windows will iterat
		String parent = it.next();
		String Child = it.next();
		driver.switchTo().window(Child);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".im-para.red")));
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
	String split=	driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	
	driver.switchTo().window(parent);
	driver.findElement(By.id("username")).sendKeys(split);
		
	}

}
