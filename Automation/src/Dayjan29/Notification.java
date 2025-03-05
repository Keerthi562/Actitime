package Dayjan29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {

	public static void main(String[] args) {
     ChromeOptions cs =new ChromeOptions();
     cs.addArguments(" disable notification ");
     WebDriver driver= new ChromeDriver(cs);
     driver.navigate().to("https://www.easemytrip.com/");
     
	}

}
