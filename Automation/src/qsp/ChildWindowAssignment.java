package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowAssignment {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dummysoftware.com/popupdummy_testpage.html");
		String eText = "the Anti-Popup-Blocker";
		Set<String> allWh = driver.getWindowHandles();
		for(String wh:allWh) {
			driver.switchTo().window(wh);
			String htmlCode = driver.getPageSource();
			if(htmlCode.contains(eText)) 
			{
				String title = driver.getTitle();
				System.out.println(title);
			}
		driver.close();
		}
	}
}
