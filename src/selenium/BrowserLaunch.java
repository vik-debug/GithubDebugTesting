package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
        
		//firefox launch
		//gecko.driver
		//System.setProperty("webdriver.gecko.driver","C:\Users\admin\OneDrive\Desktop\Selenium new\driver\geckodriver.exe")
		//WebDriver driver=new FirefoxDriver();
		  
		//System.setProperty("webdriver.edge.driver","C:\Users\admin\OneDrive\Desktop\Selenium new\driver\msedgedriver.exe")
		WebDriver driver=new EdgeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
