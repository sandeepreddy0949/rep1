package xlops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelop {

	public static void main(String[] args) throws IOException
	{
		String xpath="D:\\seleliumjava\\seleniumjava\\src\\testdata\\orangedata.xlsx";
		
		FileInputStream f1=new FileInputStream(xpath);
		
		XSSFWorkbook ww=new XSSFWorkbook(f1);
		
		XSSFSheet ws=ww.getSheet("sara");
		
		//XSSFRow r=ws.getRow(2);
		
	//XSSFCell c=r.getCell(2);
		
		
		int k=ws.getLastRowNum();
		System.out.println(k);

	}

}
