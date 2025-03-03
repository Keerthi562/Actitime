package qsp;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPageLoadTimeOut {
	public static void main(String[] args)    {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		try {
			driver.get("https://online.actitime.com/student21");
			System.out.println("page is  loaded within 5 seconds and pass");
		}
		catch(TimeoutException e) {
			System.out.println("page is not loaded within 5 seconds and fail");
		}
		driver.quit();
	}
}
