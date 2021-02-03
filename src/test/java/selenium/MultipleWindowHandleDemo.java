package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandleDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.naukri.com/");
		String parent_Window = driver.getWindowHandle();
//		System.out.println(parent_Window);
		Set <String> all_Window = driver.getWindowHandles();
//		for(String window_Name : all_Window) {
//			System.out.println(window_Name);
//			if(!window_Name.contentEquals(parent_Window)) {
//				driver.switchTo().window(window_Name).getTitle();
//				driver.switchTo().window(window_Name).close();
//			}
//		}
		Iterator <String> it = all_Window.iterator();
		while (it.hasNext()) {
//			System.out.println(it);
			String child_Window_Name = it.next();
//			System.out.println(child_Window_Name);
			if (!child_Window_Name.equals(parent_Window)) {
				driver.switchTo().window(child_Window_Name).getTitle();
//				driver.switchTo().window(child_Window_Name).close();
			}
		}
		System.out.println(driver.switchTo().defaultContent().getTitle());
//		driver.switchTo().window(parent_Window);
//		driver.switchTo().window(parent_Window).getTitle();
		
		driver.quit();
	}
}
