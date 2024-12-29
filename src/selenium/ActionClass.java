package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		//div[@class='_1wE2Px']
		Actions action=new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX'] "));
		action.moveToElement(driver.findElement(By.className("Pke_EE"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		action.moveToElement(move).contextClick().build().perform();
		
		
		
		
		 
	}

}
