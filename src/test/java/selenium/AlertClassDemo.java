package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertClassDemo {

	WebDriver driver;
	//Alert present or not
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public void handleAlert() {
		WebDriverManager.chromedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://www.google.com");
		driver.switchTo().alert().accept();//accept
		driver.switchTo().alert().dismiss();//dismiss
		//Get alert name
		Alert alert = driver.switchTo().alert();
		String alertName = alert.getText();
		System.out.println(alertName);
	}

}
