package Practice;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrintAlphaOrder {

	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	}
	@Test
	public void printOrder() {
		driver.get("file:///C:/WebPages/MultipleOptions.html");
		WebElement mtrbx = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrbx);
		List<WebElement> allopt = s.getOptions();
		TreeSet<String> ts=new TreeSet<String>();
		for(WebElement opt:allopt) {
			String text = opt.getText();
			ts.add(text);
		}
		for(String i:ts) {
			System.out.println(i);
		}
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
