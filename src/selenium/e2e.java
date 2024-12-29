package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class e2e {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[text()=' Delhi (DEL)']")).click();
	driver.findElement(By.xpath("(//a[text()=' Goa (GOI)'])[2]")).click();
	
	driver.findElement(By.xpath("(//a[text()='20'])[1]")).click();
	driver.findElement(By.id("divpaxinfo")).click();
	for(int i=1;i<3;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
	}
	driver.findElement(By.id("btnclosepaxoption")).click();
	driver.findElement(By.xpath("(//input[@value='Search'])[1]")).click();
}
}
