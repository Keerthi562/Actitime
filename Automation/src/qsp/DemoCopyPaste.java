package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCopyPaste {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/QSP/Desktop/input.html");
driver.findElement(By.xpath("//input[@type='text' and @value='A']")).sendKeys(Keys.CONTROL+"ac");
driver.findElement(By.xpath("//input[@type='text' and @value='B']")).sendKeys(Keys.CONTROL+"av");
	}
}
