package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class TestMethodCls {

	@Test
	public void validLogin() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		LoginPage l=new LoginPage(driver);
		l.setLogin("admin", "manager");	
	}
}