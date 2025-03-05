package HandlingPopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopups {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://in.indeed.com/");
	String add = driver.getWindowHandle();
	System.out.println(add);
	driver.quit();
}
}
