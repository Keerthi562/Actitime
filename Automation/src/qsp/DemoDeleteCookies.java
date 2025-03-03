package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoDeleteCookies {

public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().window().minimize();
driver.manage().window().maximize();
driver.quit();
	}
}
