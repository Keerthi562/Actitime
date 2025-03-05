package HandlingPopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPopup {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver  driver = new FirefoxDriver();
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_P);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_TAB);
	for(int i = 0 ; i<=4 ;i++) {
		r.keyPress(KeyEvent.VK_DOWN);
	}
}
}
