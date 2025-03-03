package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAlignment {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("http://localhost/login.do");
int x1 = driver.findElement(By.id("username")).getRect().getX();
int x2 = driver.findElement(By.name("pwd")).getRect().getX();
if(x1==x2) {
System.out.println("username and password textbox are aligned properly and pass");
}
else {
System.out.println("username and password textbox are not  aligned properly and fail");
}
driver.quit();
	}
}
