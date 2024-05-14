import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtables {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.manage().window().maximize();
	WebElement tablelist =	driver.findElement(By.id("product"));
	System.out.println("Total Number of Rows"+ " "+ tablelist.findElements(By.tagName("tr")).size());
	System.out.println("Total Number of columns"+ " "+tablelist.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
	
	List<WebElement> Secondrow = driver.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
	System.out.println(Secondrow.get(0).getText());
	System.out.println(Secondrow.get(1).getText());
	System.out.println(Secondrow.get(2).getText());
		
		//System.out.println();driver.findElement(By.cssSelector(".table-display td:nth-child(3)")).getSize();

	}

}
