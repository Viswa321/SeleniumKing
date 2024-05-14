package Frames;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class scope {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerlist = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerlist.findElements(By.tagName("a")).size());

		WebElement ColumnList = footerlist.findElement(By.xpath("//table/tbody/tr/td/ul[1]"));
		System.out.println(ColumnList.findElements(By.tagName("a")).size());
		
		//Clicking each link in the column and check if the pages are opening or not
		
		for (int i = 1; i < ColumnList.findElements(By.tagName("a")).size(); i++) {
			
		String Clicklinks =	Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			ColumnList.findElements(By.tagName("a")).get(i).sendKeys(Clicklinks);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("a")));
			
			
			
		}
		//iterate the windows
		
		Set<String> Windows = driver.getWindowHandles();
		Iterator<String> iterator = Windows.iterator();
	while(iterator.hasNext()) {
			driver.switchTo().window(iterator.next());
			System.out.println(driver.getTitle());
			
		}
	}

}
