package qsp;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintWIthoutDuplicates {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/QSP/Desktop/Hotel.html");
		WebElement mtrListbox = driver.findElement(By.id("mtr"));	
		Select s=new Select(mtrListbox);
		List<WebElement> allOptions = s.getOptions();
		TreeSet<String> ts=new TreeSet<String>();
		for(WebElement option:allOptions) {
			String text = option.getText();
			ts.add(text);
		}
		for(String noDuplicates:ts) {
			System.out.println(noDuplicates);
		}
		driver.quit();
	}
}
