package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBbc {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bbc.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		List<WebElement> more_news= driver.findElements (By.xpath("//h2[contains(text(),'More news')]/۰۰/۰۰/۰۰/۰۰/../..//h2[@data-testid='card-headline']"));
		int count = more_news.size();
		for(int i=0;i<count;i++){
			String news=more_news.get(i).getText();
			System.out.println(i+1+")"+" "+news);
		}
	}
}
