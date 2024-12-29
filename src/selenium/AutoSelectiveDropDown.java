package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSelectiveDropDown {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		
		//li[@class='ui-menu-item']/a
		List<WebElement> options=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		
		for(WebElement option:options) {
			if(option.getText().equals("India")) {
				option.click();
				break;
			}
		}
	}

}
