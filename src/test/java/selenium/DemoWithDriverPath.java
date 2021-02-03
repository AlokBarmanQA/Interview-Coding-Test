package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoWithDriverPath {
	
	private static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		
//		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
//		driver = new ChromeDriver();
		
		driver.get("https://www.yahoo.com");
		driver.manage().window().maximize();
		driver.quit();
	}

}
