import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DinamicAssignment {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("checkBoxOption3")).click();
		String Optionselected = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]")).getText();
		
		WebElement Selectlist = driver.findElement(By.id("dropdown-class-example"));
		
		Select sc = new Select(Selectlist);
		sc.selectByVisibleText(Optionselected);
		driver.findElement(By.id("name")).sendKeys(Optionselected);
		driver.findElement(By.id("alertbtn")).click();
		
		
		String Text = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		if (Text.contains(Optionselected)) {
			
			System.out.println("Succes");
			
		}
		else {
			System.out.println("Some thing went wrong");
		}
		
	}

}
