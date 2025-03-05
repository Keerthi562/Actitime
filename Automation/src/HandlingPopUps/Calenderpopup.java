package HandlingPopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenderpopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.navigate().to("https://www.makemytrip.com/");
	driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]")).click();
	driver.findElement(By.xpath("//span[text()='Departure']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//p[text()='5'])[2]")).click();
}
}
