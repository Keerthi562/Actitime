package JavaScript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Handling_Disable_Elements {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/fayaz/OneDrive/Desktop/Disable.html");
		Thread.sleep(3000);
			driver.findElement(By.id("d1")).sendKeys("admin");
			RemoteWebDriver r=(RemoteWebDriver) driver;
			r.executeScript("document.getElementById('d2').value=\"manager\"");
			Thread.sleep(3000);
			r.executeScript("document.getElementById('d2').value=\"\"");
			Thread.sleep(3000);
			r.executeScript("document.getElementById('d2').value=\"admin\"");
		
	}

}
