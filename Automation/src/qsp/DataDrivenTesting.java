package qsp;

import java.util.ArrayList;
import java.util.HashMap;

public class DataDrivenTesting {

	public static void main(String[] args) {
ArrayList<String> al=new ArrayList<String>();
al.add("http://localhost/login.do");
al.add("admin");
al.add("admin@actitime.com");
al.add("manager");
System.out.println(al.get(2));

HashMap<String, String> hm=new HashMap<>();
hm.put("url","http://localhost/login.do");
hm.put("username", "admin");
hm.put("email", "admin@actitime.com");
hm.put("password", "manager");
System.out.println(hm.get("password"));
	}
}
