package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertions {
 public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']
		//check it checkbox is selected or not
		//Assert.assertTrue(driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).isSelected());
		Assert.assertFalse(driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).isSelected());

		int totalcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(totalcheckbox);
		
		Assert.assertEquals(totalcheckbox, 6);  
	
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		driver.findElement(By.xpath("(//a[text()='19'])[1]")).click();
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
		
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		
		driver.findElement(By.xpath("//a[text()='16']")).click();
		
		}
}
