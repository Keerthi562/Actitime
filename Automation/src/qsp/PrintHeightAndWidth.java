package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintHeightAndWidth {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("http://localhost/login.do");
WebElement untbx = driver.findElement(By.id("username"));
int height = untbx.getRect().getHeight();
int width = untbx.getRect().getWidth();
System.out.println("Height = "+height);
System.out.println("Width = "+width);
	}
}
