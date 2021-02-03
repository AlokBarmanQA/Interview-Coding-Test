package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandlingDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.livescore.in/bangladesh/");
		driver.manage().window().maximize();
		List <WebElement> cell = driver.findElements(By.xpath("//div[@id='live-table']"));
//		List <WebElement> rows = driver.findElements(By.xpath("//tr"));
		for (WebElement webElement : cell) {
			String str = webElement.getText();
			System.out.println(": "+str);
		}
		driver.quit();
	}

}
