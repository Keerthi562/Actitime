package Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Perform_DragAndDrop {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
	
	}

}
