package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Find_All_Broken_Links {

	public static void main(String[] args) {
		String homePage = "http://www.zlti.com";
		String linkUrl = "";
		int responseCode=200;
		HttpURLConnection huc = null;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(homePage);
		driver.manage().window().maximize();
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		Iterator<WebElement> it = allLinks.iterator();

		while (it.hasNext()) {
			linkUrl = it.next().getAttribute("href");
			System.out.println(linkUrl);
			if(linkUrl==null || linkUrl.isEmpty()) {
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}
			if(!linkUrl.startsWith(homePage)) {
				System.out.println("URL belongs to another domain, skipping it");
				continue;
			}
			try {
				huc = (HttpURLConnection)(new URL(linkUrl).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				responseCode = huc.getResponseCode();
				if(responseCode>=400) {
					System.out.println(linkUrl+" is a broken link");
				}
				else {
					System.out.println(linkUrl+" is a valid link");
				}
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		driver.close();
	}

}
