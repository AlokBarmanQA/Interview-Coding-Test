package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandlingDemo2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		driver.manage().window().maximize();
		String row = "//div[@id='leftcontainer']/table/tbody/tr";
		int rowCount = driver.findElements(By.xpath(row)).size();
		String column = "//div[@id='leftcontainer']/table/tbody/tr[1]/td";
		int columnCount = driver.findElements(By.xpath(column)).size();
		
		String first_part_xpath = "//div[@id='leftcontainer']/table/tbody/tr[";
		String second_part_xpath = "]/td[";
		String third_part_xpath = "]";
		
		for (int i=1; i<=rowCount; i++) {
			for (int j=1; j<=columnCount; j++) {
				String completeDynamicXpath = first_part_xpath+i+second_part_xpath+j+third_part_xpath;
				String text = driver.findElement(By.xpath(completeDynamicXpath)).getText();
				System.out.print(text+" | ");
			}
			System.out.println();
		}
		driver.quit();
	}
}
