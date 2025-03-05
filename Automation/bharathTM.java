package DayJan24;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bharathTM  {

	public static void main(String[] args) throws AWTException, InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("http://localhost/login.do");
    driver.switchTo().activeElement().sendKeys("admin");
    Thread.sleep(2000);
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_TAB);
    driver.switchTo().activeElement().sendKeys("manager");
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_TAB);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_TAB);
    Thread.sleep(2000);
    driver.switchTo().activeElement().sendKeys(Keys.ENTER);
    
    	
    		
	}
}
