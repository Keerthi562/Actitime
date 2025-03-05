package DataDrivenTesting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriven {

	public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("http://localhost/login.do");
	al.add("admin");
	al.add("admin@gmail.com");
	al.add("manager");
	System.out.println(al.get(2));
	HashMap<String, String> hm=new HashMap<String, String>();
	hm.put("url", "http://localhost/login.do");
	hm.put("user name", "admin");
	hm.put("email", "admin@gmail.com");
	hm.put("password", "manager");
	System.out.println(hm.get("password"));
		
	}

}
