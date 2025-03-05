package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDataToExcel {

public static void main(String[] args) throws EncryptedDocumentException,IOException {
//get the java representative object of the physical file
FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
//create or load the workbook
Workbook wb = WorkbookFactory.create(fis);
//get the control of the sheet,then row,then cell,then type the data
wb.getSheet("CreateCustomer").getRow(1).getCell(4).setCellValue("skipped");
//get the physical file of the java representative object
FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
//save the workbook (actual writing happens here)
wb.write(fos);
	}
}
