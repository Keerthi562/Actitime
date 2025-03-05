package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Print_all_links {
	WebDriver driver;

	@BeforeMethod
	public void opneBrowser() {
		Reporter.log("open browser");
		driver=new ChromeDriver();
	}
	@Test
	public void print() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.flipkart.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));

		for(WebElement l:links) {
			String text = l.getText();
			System.out.println(text);
		}
	}
	@AfterMethod
	public void closeBrowser() {
		Reporter.log("close Browser");
		driver.quit();
	}
}
