package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWebDriverManagerWithVersion {

	public static void main(String[] args) {
		
//		WebDriverManager.firefoxdriver().driverVersion("80.0.1.").setup();
		WebDriverManager.chromedriver().driverVersion("81.0.4044.138").setup();
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
//		driver.quit();

	}

}
