package Dayjan29;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFile {

	public static void main(String[] args) throws Exception  {
       PropertyFile pl=new PropertyFile();
       pl.print();
	}
	public void print() throws Exception{
		String path="./Data/commondata.property";
	       FileInputStream fs=new FileInputStream(path);
	       Properties p=new Properties();
	       p.load(fs);
	       String url=p.getProperty("url");
	       String un=p.getProperty("un");
	       String pwd=p.getProperty("pwd");
	       WebDriver driver =new ChromeDriver();
	       driver.get(url);
	       driver.switchTo().activeElement().sendKeys(un);
	       Robot r=new Robot();
	       r.keyPress(KeyEvent.VK_TAB);
	       driver.switchTo().activeElement().sendKeys(pwd);
	       r.keyPress(KeyEvent.VK_TAB);
	       r.keyPress(KeyEvent.VK_TAB);
	       driver.switchTo().activeElement().click();
	       Thread.sleep(3000);
	       driver.close();
	}

}

