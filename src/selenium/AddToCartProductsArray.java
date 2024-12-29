package selenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartProductsArray {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//for using break statement for array
		int j=0;
		//here declear string array
		String [] arr= {"Cucumber","Brocolli","Tomato"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			//her we want only Cucumber not Cucumber - 1 Kg thats way use split
			String[] name = products.get(i).getText().split("-");
			String formatedName = name[0].trim(); //we use trim remove white space
			
			//convert array into array list for easy search
			//check whether name you extracted is present in array list or not
			//google the things convert array to array list everyone using

			 List itemsNeeded = Arrays.asList(arr);
			 //here we change logic  //insted of name use formatedname
			if (itemsNeeded.contains(formatedName)) {
				// System.out.println(name);
				j++;
				//here we change xpath add to card bcz its changing
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				//we add her arr.length bcz we get added value in array somit perfecty match to array value
				if(j==arr.length) {
					break;
				}
				//here we can not use break bcz we want multiple items it jump out of for loop
				//break;
			}
		}
	}

}