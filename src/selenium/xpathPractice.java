package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathPractice {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("vicky");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("viki619.jadhav@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9922411451");
		driver.findElement(By.xpath("//div/button[2]")).click();
		System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
		driver.findElement(By.xpath("//div/button[1]")).click();
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("bicky");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rahulshettyacademy");
		//if xpath is dynamicaly  changing
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		//driver.close();
		
	}

}
