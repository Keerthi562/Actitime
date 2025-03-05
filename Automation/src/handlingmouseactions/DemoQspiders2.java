package handlingmouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQspiders2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		Actions a=new Actions(driver); 
		WebElement click1 = driver.findElement(By.xpath("//p[text()='UI Testing Concepts']"));
		a.click(click1).perform();
		
		WebElement click2=driver.findElement(By.xpath("//section[text()='Mouse Actions']"));
		a.click(click2).perform();
		
		WebElement click3=driver.findElement(By.xpath("//section[text()='Drag & Drop']"));
		a.click(click3).perform();
		
		WebElement click4=driver.findElement(By.linkText("Drag Multiple"));
		a.click(click4).perform();
		
		for(int i=1;i<3;i++) {
			WebElement src = driver.findElement(By.id("dragElement"+i));
			WebElement dest=driver.findElement(By.id("dropZone"+i));
			a.dragAndDrop(src, dest);
		}
	}

}
