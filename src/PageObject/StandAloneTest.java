package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class StandAloneTest {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("vikijadhav755@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Viki@123");
		driver.findElement(By.id("login")).click();
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='card-body']/h5"));
		for(WebElement product:products) {
		System.out.println(product.getText());
		}
	}

}
