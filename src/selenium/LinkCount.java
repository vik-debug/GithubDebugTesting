package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int noOfLINL = driver.findElements(By.tagName("a")).size();
		System.out.println(noOfLINL);
		List<WebElement> Links = driver.findElements(By.xpath("//div[@id='gf-BIG']//a"));
		for(int i=0;i<Links.size();i++) {
			String allLink = Links.get(i).getText();
			System.out.println(allLink);
		}
		}

}
