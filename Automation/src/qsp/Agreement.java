package qsp;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Agreement {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8080/login.do");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@type=\"password\"][1]")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	driver.findElement(By.xpath("//div[@class='popup_menu_icon support_icon']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='Read License Agreement']")).click();
	Thread.sleep(2000);
	Set<String> allwh = driver.getWindowHandles();
	for(String wh:allwh)
	{
	driver.switchTo().window(wh);
	}
	
	List<WebElement> heading = driver.findElements(By.tagName("h2"));
	System.out.println(heading.size());
	
	for (int i = 0; i < heading.size(); i++) {
		String ele = heading.get(i).getText();
		
		System.out.println(ele);
	}
		
		String pwh = driver.getWindowHandle();
		driver.switchTo().window(pwh);
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
			if(!wh.equals(pwh))
			{
				driver.close();
				Thread.sleep(3000);
				
		    }
			else
			{
				
			}
			}
		driver.quit();
			
		
	}
}
