package Selenium4;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) throws IOException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentId = it.next();
		String childID = it .next();
		driver.switchTo().window(childID);
		driver.get("https://rahulshettyacademy.com/");
		String courseName = driver.findElement(By.xpath("//a[text()='Core java for Automation Testers + Interview Programs']")).getText();
		driver.switchTo().window(parentId);
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys(courseName);
		File file = name.getScreenshotAs(OutputType.FILE);
		File destination= new File(System.getProperty("user.dir")+"\\Screenshots\\name.png");
		file.renameTo(destination);
		
		//not working latest see
		//FileUtils.copyFile(file, new File("logo.png"));
		
		//get height and width 
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
	}

}
