package handlingmouseactions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class AllCapitals {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	
		for(int i=1;i<=7;i++) {
			WebElement allSources = driver.findElement(By.id("box"+i));Thread.sleep(2000);
			WebElement allDestination = driver.findElement(By.id("box10"+i));Thread.sleep(2000);
			Actions a=new Actions(driver);
			a.dragAndDrop(allSources, allDestination).perform();Thread.sleep(1000);
			
		}
		
		
		
		
	}

}
