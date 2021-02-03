package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Drug and Drop, Double click, Right click, Mouse hover
		WebElement source = driver.findElement(By.xpath(""));
		WebElement target = driver.findElement(By.xpath(""));
		
		Actions action = new Actions(driver);
		
		//Drug and Drop
		action.dragAndDrop(source, target).build().perform();
		//Double click
		action.doubleClick(source).build().perform();
		//Right click
		action.contextClick(source).build().perform();
		//Mouse hover
		action.moveToElement(source).build().perform();

	}

}
