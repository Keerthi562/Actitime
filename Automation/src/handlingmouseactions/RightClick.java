package handlingmouseactions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("http://localhost/login.do");
		WebElement target = driver.findElement(By.partialLinkText("actiTIME Inc."));
		Actions a=new Actions(driver);
		Thread.sleep(1000);
		a.contextClick(target).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_W);
		
	}

}
