package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoRunTimePolymorphism {

public static WebDriver driver;	
	public static void main(String[] args) {
		System.out.println("Enter the browser name");
		Scanner sc=new Scanner(System.in);
		String browser = sc.nextLine();
//		if(browser.equals("chrome")) {
//			 driver=new ChromeDriver();
//		}
//		else if(browser.equals("firefox")) {
//			driver=new FirefoxDriver();
//		}
//		else if(browser.equals("edge")) {
//			driver=new EdgeDriver();
//		}
		switch(browser) {
		case "chrome":driver=new ChromeDriver();break;
		case "edge":driver=new EdgeDriver();break;
		case "firefox": driver=new FirefoxDriver();break;
		default: driver=new ChromeDriver();
				}
driver.get("https://www.google.com/");
String title = driver.getTitle();
System.out.println(title);
driver.quit();
	}

}
