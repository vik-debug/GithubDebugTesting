package selenium;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDeleteCookies {

	public static void main(String[] args) throws IOException {

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("ADsdgfdhj");
		
		driver.get("https://www.google.com");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File destination= new File(System.getProperty("user.dir")+"\\Screenshots\\ScreenShot.png");
		File destination= new File(".\\Screenshots\\ScreenShot1.png");
		src.renameTo(destination);
	}

}
