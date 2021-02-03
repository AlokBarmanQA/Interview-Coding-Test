package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintDataFromTable {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		WebElement data_table = driver.findElement(By.tagName("table"));
		List <WebElement> rows_number = data_table.findElements(By.tagName("tr"));
		for(int row=0;row<rows_number.size();row++) {
			List <WebElement> col_number = rows_number.get(row).findElements(By.tagName("td"));
			for(int col=0;col<col_number.size();col++) {
				String text = col_number.get(col).getText();
				System.out.print(text+", ");
			}
			System.out.println();
			System.out.println("---------------------------------");
		}

		driver.quit();

	}

}
