package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetTitleWithoutGetTitle {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://google.com");
	driver.switchTo().activeElement().sendKeys("INDIA");
	String text = driver.findElement(By.id("APjFqb")).getAttribute("value");
	System.out.println(text);
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	System.out.println(jse.executeScript("return document.title"));
	String url = (String) jse.executeScript("return document.URL");
	System.out.println(url);
	driver.quit();
}
}