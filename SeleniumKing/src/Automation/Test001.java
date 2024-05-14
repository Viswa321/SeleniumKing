package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Test001 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.quit();
	}

}
