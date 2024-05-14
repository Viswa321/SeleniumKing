import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");

		// Select from and To
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@value=\"MAA\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']"))
				.click();

		// select date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();

		// Passengers
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		for (int i = 0; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		// Family checkbox
		// ctl00_mainContent_chk_friendsandfamily
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();

		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(3000);
		// driver.findElement(By.cssSelector("input[@type='Search']")).click();

		// driver.quit();
		// .ui-state-default.ui-state-highlight.ui-state-hover

	}
}
