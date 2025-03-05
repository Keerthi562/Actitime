package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrlNavigation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		String url = driver.getCurrentUrl();
		if(url.equals("https://www.selenium.dev/")) 
		{
			System.out.println("url is navigating  and pass");
		}
		else 
		{
			System.out.println("url is not navigating and fail");
		}
		driver.quit();
	}
}
