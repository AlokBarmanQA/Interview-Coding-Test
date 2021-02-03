package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandlingDemo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		WebElement web_frame = driver.findElement(By.xpath(""));
		
		driver.switchTo().frame(1); // index
		driver.switchTo().frame("frame name"); // farme name
		driver.switchTo().frame(web_frame); // web element
		driver.switchTo().frame("a077aa5e"); // frame id
	}

}
