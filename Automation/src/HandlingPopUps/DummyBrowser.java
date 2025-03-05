package HandlingPopUps;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DummyBrowser {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.dummysoftware.com/popupdummy_testpage.html");
	Thread.sleep(3000);
	String text = "This is the Anti-Popup-Blocker screen";
	Set<String> all = driver.getWindowHandles();
	for (String  one : all) {
		driver.switchTo().window(one);
		String two = driver.getPageSource();
		if(two.contains(text)) {
			String title = driver.getTitle();
			System.out.println(title);
		}
	}
	driver.quit();
}
}
