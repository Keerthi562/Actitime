package HandlingPopUps;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuppload {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/FileUpload.html");
	File f = new File("C:\\Users\\MOHAMMED MOIN PASHA\\Desktop\\New Text Document.txt");
	String path = f.getAbsolutePath();
	driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys(path);
	System.out.println(path);
}
}
