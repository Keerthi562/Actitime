package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrintAutoSugg {

	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	}
	@Test
	public void printAutoSugg() {
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("java");
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		for(WebElement sugg:allsugg) {
			String text = sugg.getText();
			System.out.println(text);
		}
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	
}
