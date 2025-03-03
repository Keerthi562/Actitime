package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo {

	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	
	Options o = driver.manage();
	Window w = o.window();
	w.maximize();
	}
}
