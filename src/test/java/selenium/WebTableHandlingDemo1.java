package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandlingDemo1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		driver.manage().window().maximize();
		List <WebElement> table = driver.findElements(By.xpath("//div[@id='leftcontainer']"));
//		List <WebElement> rows = driver.findElements(By.xpath("//tr"));
		for (WebElement webElement : table) {
			String str = webElement.getText();
			System.out.print(str);
		}
		driver.quit();
	}

}
