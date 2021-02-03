package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWebDriverManager {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new ChromeDriver();
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
//		driver.quit();

	}

}
