package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement dropDownElement = driver.findElement(By.xpath(""));
		//Select drop down value
		Select select = new Select(dropDownElement);
		select.selectByIndex(0);
		select.selectByValue("Value");
		select.selectByVisibleText("ANTARCTICA");
		//Print all value from drop down
		List <WebElement> elementsList = select.getOptions();
		for (WebElement webElement : elementsList) {
			String element = webElement.getText();
			System.out.println(element);
		}
		
		//Bootstrap drop down
		List <WebElement> element_dd = driver.findElements(By.xpath(""));
		for(WebElement element : element_dd) {
			String innerHtml = element.getAttribute("innerHTML");
			System.out.println(innerHtml);
			if(innerHtml.equals("JavaScript")) {
				element.click();
			}
		}
	}

}
