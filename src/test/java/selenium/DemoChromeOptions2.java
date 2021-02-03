package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DemoChromeOptions2 {

	public static void main(String[] args) {
		
//		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setAcceptInsecureCerts(true);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-infobars");
//		options.addArguments("enable-automation");
		
//		options.addExtensions(new File(""));
//		options.setHeadless(true);
		options.merge(cap);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

	}

}
