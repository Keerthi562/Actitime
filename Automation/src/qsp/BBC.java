package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBC {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.bbc.com/");
	List<WebElement> allEle = driver.findElements(By.xpath
("//h2[text()='More news']/../../../../../../div[2]/div/div/a/div/div[1]/div/h2"));
//h2[text()='More news']/../../../../../..//h2[@data-testid='card-headline']
	for(int i=0;i<allEle.size();i++) {
		WebElement ele = allEle.get(i);
		System.out.println(ele.getText());
	}
}
}
