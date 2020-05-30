package exceloper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;




import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readfromfile {

	public static void main(String[] args) throws IOException   {
		
String xpath="D:\\seleliumjava\\seleniumjava\\src\\testdata\\moni.xlsx";
		
		FileInputStream f1=new FileInputStream(xpath);
		
		XSSFWorkbook ww=new XSSFWorkbook(f1);
		
		XSSFSheet ws=ww.getSheet("Sheet1");

		int k=ws.getLastRowNum();
		System.out.println(k);
	}
}