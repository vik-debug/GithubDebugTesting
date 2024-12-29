package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locator3 {

	public static void main(String[] args) throws InterruptedException {

		String name="bicky";
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String pass=getPassword(driver);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("bicky");
		//accesing direct password here we are by passing pass in send keys
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(pass);
		//if xpath is dynamicaly  changing
		System.out.println("zhal ith");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText(),"You are successfully logged in.");
        System.out.println(driver.findElement(By.tagName("h2")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello "+name+",");
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        
        driver.close();
	}
	//we get password directly by creating method
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String password = driver.findElement(By.cssSelector(".infoMsg")).getText();
		String[] passArray = password.split("'");
		//then we get
		//passArray[0]th index=Please use temporary password
		//passArray[1]st index=rahulshettyacademy' to Login.
		
		String pass = passArray[1].split("'")[0];
		System.out.println("ok");
		System.out.println(pass);
		return pass;
	}

}
