package handlingmouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.vtiger.com/");
		Actions a=new Actions(driver);
		WebElement target = driver.findElement(By.partialLinkText("Company"));
		a.moveToElement(target).perform();Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Contact Us")).click();Thread.sleep(1000);
		String text=driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]")).getText();Thread.sleep(1000);
		System.out.println(text);
				
				
	}

}
