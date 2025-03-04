package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class InsurancePolicy{

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement monthListBox=driver.findElement(By.className("ui-datepicker-month"));
		Select s=new Select(monthListBox);
		s.selectByVisibleText("Feb");
		WebElement yearListBox=driver.findElement(By.className("ui-datepicker-year"));
		Select s1=new Select(yearListBox);
		s1.selectByVisibleText("2002");
		driver.findElement(By.linkText("3")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.id("renew_policy_submit")).click();
		WebElement element=driver.findElement(By.id("policynumberError"));
		String text = element.getText();
		if(element.isDisplayed()) {
			System.out.println("passed");
			System.out.println(text);
		}
		else {
			System.out.println("fail");
		}
		driver.quit();
	}
}

