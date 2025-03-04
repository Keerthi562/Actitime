package handlingmouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQspiders {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		Actions a=new Actions(driver);
		WebElement click1 = driver.findElement(By.xpath("//p[text()='UI Testing Concepts']"));
		a.click(click1).perform();
		WebElement click2=driver.findElement(By.xpath("//section[text()='Button']"));
		a.click(click2).perform();
		WebElement click3=driver.findElement(By.linkText("Double Click"));
		a.click(click3).perform();
		
		WebElement doubleClick=driver.findElement(By.xpath("//button[@id='btn20']"));Thread.sleep(2800);
		a.doubleClick(doubleClick).perform();
		
		boolean text=driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']")).isDisplayed();
		if(text==true) {
			System.out.println("Text is displayed");
		}
		else {
			System.out.println("Text is not displayed");
		}
		
	}

}
