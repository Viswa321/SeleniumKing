import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		Thread.sleep(5000);
		WebElement Checkbox= driver.findElement(By.id("checkBoxOption1"));
		Checkbox.click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());

		Thread.sleep(5000);
		Checkbox.click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		
		//Total check boxes
		
		System.out.println(driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size());
	
		
		
	
//		if (condition) {
//			
//		} else {
//
//		}
		
		
	
		
	}

}
