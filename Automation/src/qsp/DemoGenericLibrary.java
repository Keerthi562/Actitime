package qsp;

import java.io.IOException;

import com.actitime.generic.FileLib;

public class DemoGenericLibrary {

	public static void main(String[] args) throws IOException {
	FileLib f=new FileLib();
	//reading the data from property file
	System.out.println(f.getPropertyData("url"));
	System.out.println(f.getPropertyData("username"));
	System.out.println(f.getPropertyData("password"));
	//reading the data from excel file
	System.out.println(f.getExcelData("CreateCustomer",1, 2 ));
	//writing the data to excel  file
	f.setExcelData("CreateCustomer", 1, 4, "Skipped");
	}
}


