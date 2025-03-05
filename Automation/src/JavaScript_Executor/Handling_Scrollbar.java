package JavaScript_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Scrollbar {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bbc.com/");
	JavascriptExecutor j=(JavascriptExecutor) driver;
	j.executeScript("window.scrollTo(0,6000)");
	
	}

}
