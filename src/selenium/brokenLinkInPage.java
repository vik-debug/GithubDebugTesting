package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class brokenLinkInPage {

	public static void main(String[] args) throws IOException, IOException {

		WebDriver driver=new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 List<WebElement> Links = driver.findElements(By.xpath("//div[@id='gf-BIG']//td//li/a"));
		 SoftAssert a=new SoftAssert();
		 for(WebElement link:Links) { 
			 @Nullable
			String url = link.getAttribute("href");
			 
			 HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			 conn.setRequestMethod("HEAD");
			 conn.connect();
			 int respcode = conn.getResponseCode();
			 System.out.println(respcode);
			 a.assertEquals(respcode<400, "the link with text "+link.getText()+" response code is "+respcode);
			
		 }
		 a.assertAll();
	}

}
