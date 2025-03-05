package handlingmouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToMultiple?sublist=3");
		WebElement source = driver.findElement(By.xpath("(//div[@class='draggable'])[1]"));
		WebElement destination = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		Actions a=new Actions(driver);Thread.sleep(2000);
		a.dragAndDrop(source, destination).perform();Thread.sleep(2000);
	}

}
