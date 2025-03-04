package handlingmouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.vtiger.com/");
		WebElement loginPage = driver.findElement(By.id("loginspan"));
		Actions a=new Actions(driver);Thread.sleep(2000);
		a.doubleClick(loginPage).perform();Thread.sleep(2000);
		boolean loginPageIsDisplayed = driver.findElement(By.xpath("//body/..")).isDisplayed();
		if(loginPageIsDisplayed==true) {
			System.out.println("Login page is displayed");
		}
		else {
			System.out.println("Login page is not displayed");
		}
		
	}

}
