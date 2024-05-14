package MiscellaneousTopics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookies {
	
public static void main(String[] args) throws IOException {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	

	
	driver.get("http://www.google.com/");
	File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	// Now you can do whatever you need to do with it, for example copy somewhere
	FileUtils.copyFile(scr, new File("D:\\ScreenShots\\ScreenShots.png"));
	
	
}
}
