package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAutomate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement src1=d.findElement(By.id("box1"));
		WebElement src2=d.findElement(By.id("box2"));
		WebElement src3=d.findElement(By.id("box3"));
		WebElement src4=d.findElement(By.id("box4"));
		WebElement src5=d.findElement(By.id("box5"));
		WebElement src6=d.findElement(By.id("box6"));
		WebElement src7=d.findElement(By.id("box7"));
		WebElement des1=d.findElement(By.xpath("//div[text()='Norway']"));
		WebElement des2=d.findElement(By.xpath("//div[text()='Sweden']"));
		WebElement des3=d.findElement(By.xpath("//div[text()='United States']"));
		WebElement des4=d.findElement(By.xpath("//div[text()='Denmark']"));
		WebElement des5=d.findElement(By.xpath("//div[text()='South Korea']"));
		WebElement des6=d.findElement(By.xpath("//div[text()='Italy']"));
		WebElement des7=d.findElement(By.xpath("//div[text()='Spain']"));
		Actions a=new Actions(d);
		Thread.sleep(5000);
		a.dragAndDrop(src1, des1).perform();
		a.dragAndDrop(src2, des2).perform();
		a.dragAndDrop(src3, des3).perform();
		a.dragAndDrop(src4, des4).perform();
		a.dragAndDrop(src5, des5).perform();
		a.dragAndDrop(src6, des6).perform();
		a.dragAndDrop(src7, des7).perform();
	}
}