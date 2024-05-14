package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseActions {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//Action class
		Actions a = new Actions(driver);
		Thread.sleep(5000);
		a.moveToElement(driver.findElement(By.xpath("//input[@type=\"text\"]"))).click().keyDown(Keys.SHIFT).sendKeys("Mobiles");
		a.moveToElement(driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']"))).build().perform();
		////div[@class='H6-NpN _3N4_BX']
		
	}

}
