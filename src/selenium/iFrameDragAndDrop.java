package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iFrameDragAndDrop {
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable");
		
		//if element comes uder frame then it thro no such elemnt exception
		//we can handle the frame by using this
		//driver.switchTo().frame(index);
		//driver.switchTo().frame(string name);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.id("draggable")).click();
		Actions a=new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		//once you have work with iframe then to shift to frame to window we use it
		driver.switchTo().defaultContent();
		
	}
}
