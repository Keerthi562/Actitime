package HandlingPopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllAddress {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://secure.indeed.com/auth?hl=en_IN&co=IN&continue=https%3A%2F%2Fin.indeed.com%2F&tmpl=desktop&from=gnav-util-homepage&jsContinue=https%3A%2F%2Fprofile.indeed.com%2Fwelcome%3Fhl%3Den_IN%26co%3DIN%26from%3Dgnav-homepage%26continue%3Dhttps%253A%252F%252Fonboarding.indeed.com%252Fonboarding%253Fhl%253Den_IN%2526co%253DIN%2526from%253Dgnav-homepage&empContinue=https%3A%2F%2Faccount.indeed.com%2Fmyaccess");
	driver.findElement(By.id("login-google-button")).click();
	driver.findElement(By.id("apple-signin-button")).click();
	Thread.sleep(3000);
String parent = driver.getWindowHandle();
System.out.println(parent);
Set<String> all = driver.getWindowHandles();
for (String  one : all) {
	System.out.println(one);
}
driver.quit();
}
}
