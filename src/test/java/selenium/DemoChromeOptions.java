package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoChromeOptions {

	public static void main(String[] args) {
		
//		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
//		Chrome is being controlled by automated test software
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-infobars");
//		options.addArguments("enable-automation");
		options.setAcceptInsecureCerts(true);
//		options.addExtensions(new File(""));
		options.addArguments("--incognito");
//		options.setHeadless(true);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

	}

}
