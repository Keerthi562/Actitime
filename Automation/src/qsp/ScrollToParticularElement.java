package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToParticularElement {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bbc.com/");
	WebElement target =driver.findElement(By.xpath("//h2[text()='Video']"));
	Actions a=new Actions(driver);
	a.scrollToElement(target).perform();
	}
}
