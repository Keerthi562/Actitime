package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxFB {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.findElement(By.xpath("//a[contains(@data-testid, 'open')]")).click();
		WebElement ele1=d.findElement(By.id("day"));
		Select s1=new Select(ele1);
		s1.selectByIndex(10);
		WebElement ele2=d.findElement(By.id("month"));
		Select s2=new Select(ele2);
		s2.selectByValue("11");
		WebElement ele3=d.findElement(By.id("year"));
		Select s3=new Select(ele3);
		s3.selectByVisibleText("1998");
	}
}