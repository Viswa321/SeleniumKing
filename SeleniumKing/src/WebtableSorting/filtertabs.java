package WebtableSorting;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class filtertabs {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.id("search-field")).sendKeys("Rice");
	List<WebElement>	itemlist =driver.findElements(By.xpath("//tbody//td[1]"));
	
	//5 reslut
	List<WebElement>filteredlist =
	itemlist.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
	//now it contains only one result	
	Assert.assertEquals(itemlist.size(), filteredlist.size());
		
	}

}
