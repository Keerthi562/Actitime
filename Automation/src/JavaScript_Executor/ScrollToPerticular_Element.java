package JavaScript_Executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToPerticular_Element {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.bbc.com/");
	int y = driver.findElement(By.xpath("//h2[text()='Must watch']")).getLocation().getY();
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollTo(0,"+y+")");
	}

}
