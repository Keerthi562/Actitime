package Mouse_Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.bbc.com/");
		WebElement target = driver.findElement(By.xpath("//h2[text()='Video']"));
		Actions a=new Actions(driver);
		a.scrollToElement(target).perform();
		Thread.sleep(2000);
		
		WebElement target2 = driver.findElement(By.xpath("//button[text()='BBC in other languages']"));
		a.scrollToElement(target2).perform();
		driver.close();
	}

}
