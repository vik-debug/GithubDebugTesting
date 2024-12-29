package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locator {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin12");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click(); 
		String validation = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
		System.out.println(validation);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	}

}
