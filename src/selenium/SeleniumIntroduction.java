package selenium;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		
		//invoke browser
		// chrome - ChromeDriver -->methods
		//Firefox - FireFOXdriver -->methods
		//ChromeDriver driver= new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		//EdgeDriver driver =new EdgeDriver();
		
		// chromedriver.exe-->chrome browser
		//webdriver.chrome.driver-->vale of path
		//System.setProperty("webdriver.chrome.driver", "/path of driver here")
		
		//webdriver method + class method
		WebDriver driver=new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java");
        @Nullable
		String title = driver.getTitle();
        System.out.println(title);
        
        System.out.println(driver.getCurrentUrl());
        driver.close();
        }

}
