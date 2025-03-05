package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShot {

	WebDriver driver;
	@BeforeMethod
	public void openbrowser() {
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	}
	@Test
	public void screenShot() throws IOException {
		driver.get("file:///C:/WebPages/MultipleOptions.html");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./data/ss.png");
		FileUtils.copyFile(src,dest);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
