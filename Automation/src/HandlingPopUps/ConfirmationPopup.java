package HandlingPopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]")).click();
	driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().dismiss();
	boolean yes = driver.findElement(By.id("demo")).isDisplayed();
	if(yes==true) {
		System.out.println("it is displyed");
	}
	else {
		System.out.println("it is not displayed");
	}
	driver.quit();
}
}
