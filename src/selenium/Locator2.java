package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;





public class Locator2 {

	public static void main(String[] args) {

		String name="bicky";
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("bicky");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rahulshettyacademy");
		//if xpath is dynamicaly  changing
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		System.out.println(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText(),"You are successfully logged in.");
        System.out.println(driver.findElement(By.tagName("h2")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello "+name+",");
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        
        driver.close();
        
	}

}
