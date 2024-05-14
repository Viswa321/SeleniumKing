package GreenKart;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {
	public static void main(String[] args) {

		String[] ListItems = { "Brocolli", "Cauliflower", "Carrot" };
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		// Implicit wait
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Explict wait
		WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(7));
		driver.manage().window().maximize();
		additems(driver, ListItems);
		driver.findElement(By.xpath("//a[@class='cart-icon']/img[@alt=\"Cart\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"action-block\"]/button[text()='PROCEED TO CHECKOUT']")).click();
		
		webdwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class=\"promoCode\"]")));
		driver.findElement(By.xpath("//input[@class=\"promoCode\"]")).sendKeys("rahulshettyacademy");

		driver.findElement(By.xpath("//button[text()='Apply']")).click();

		webdwait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

		//// button[text()='Place Order']
		// driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	}

	public static void additems(WebDriver driver, String[] ListItems) {
		List<WebElement> Products = driver.findElements(By.xpath("//h4[@class=\"product-name\"]"));

		for (int i = 0; i < Products.size(); i++) {

			String[] name = Products.get(i).getText().split("-");
			String formatedName = name[0].trim();

			List<String> itemList = Arrays.asList(ListItems);

			if (itemList.contains(formatedName))

			{
				int j = 3;
				j++;

				driver.findElements(By.xpath("//div[@class=\"product-action\"]")).get(i).click();

				if (j == ListItems.length) {
					break;

				}

			}

		}

	}

}
