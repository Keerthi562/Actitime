package MadhuAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printSeleniumSearchs
{
	public static void main(String []args) throws InterruptedException
	{
WebDriver driver=new ChromeDriver();//open the browzer
driver.get("https://www.google.com/");//enter the url
driver.findElement(By.id("APjFqb")).sendKeys("Selenium");//type java in text box
Thread.sleep(2000);
List<WebElement>allsugg=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));//capture all auto suggestion
		int count=allsugg.size();//print the count of all auto suggestion
		System.out.println(count);
		for(int i=0;i<count;i++)//print all text of auto suggestion
		{
			String text=allsugg.get(i).getText();
			System.out.println(text);
		}
		allsugg.get(count-1).click();//select first auto suggestion
		}


}
