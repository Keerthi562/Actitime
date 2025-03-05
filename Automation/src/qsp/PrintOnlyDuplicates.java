package qsp;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintOnlyDuplicates {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/QSP/Desktop/Hotel.html");
	WebElement mtrListbox = driver.findElement(By.id("mtr"));	
	Select s=new Select(mtrListbox);
	List<WebElement> allOptions = s.getOptions();
	int count = allOptions.size();
	HashSet<String> hs=new HashSet<String>();
	for(int i=0;i<count;i++) {
		String text = allOptions.get(i).getText();
		if(hs.add(text)==false) 
		{
			System.out.println(text);
		}
	}
	driver.quit();
	}

}
