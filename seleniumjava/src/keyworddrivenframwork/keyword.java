package keyworddrivenframwork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import methods.Methods;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class keyword {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		String xpath="D:\\seleliumjava\\seleniumjava\\src\\testdata\\moni.xlsx";
		FileInputStream fi=new FileInputStream(xpath);
		Methods m=new Methods();
		String res = null;
		
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws_tc=wb.getSheet("tc");
		XSSFSheet ws_ts=wb.getSheet("ts");
		XSSFSheet s3=wb.getSheet("data");
		int Tc_rc=ws_tc.getLastRowNum();
		int Ts_rc=ws_ts.getLastRowNum();
		
		for (int i = 1; i <=Tc_rc; i++) {
			
			String val=ws_tc.getRow(i).getCell(2).getStringCellValue();
			ws_tc.getRow(i).createCell(3);
			if (val.equalsIgnoreCase("y"))
			{
				String str1=ws_tc.getRow(i).getCell(0).getStringCellValue();
				 
				for (int j = 1; j <Ts_rc ; j++) {
					
				String str2=ws_ts.getRow(i).getCell(0).getStringCellValue();
				
				 if (str1.equalsIgnoreCase(str2))
				 {
					 String str3=ws_tc.getRow(i).getCell(4).getStringCellValue();
					 
					switch (str3) {
					case "launch":
						res=m.launch(s3.getRow(1).getCell(0).getStringCellValue());
						break;

					case "login":
						String uname=s3.getRow(1).getCell(1).getStringCellValue();
						String pass=s3.getRow(1).getCell(2).getStringCellValue();
						res=m.login(uname, pass);
						break;
					case "logout":
							res=m.logout();
							m.close();
							break;
					case "empreg":
						String fname=s3.getRow(1).getCell(3).getStringCellValue();
						String	lname=s3.getRow(1).getCell(4).getStringCellValue();
						String	id=s3.getRow(1).getCell(5).getStringCellValue();
							res=m.empreg(fname, lname, id);
							break;
							
					case "userreg":
						String ename=s3.getRow(1).getCell(6).getStringCellValue();
						String username=s3.getRow(1).getCell(7).getStringCellValue();
						String userpass=s3.getRow(1).getCell(8).getStringCellValue();
						String compass=s3.getRow(1).getCell(9).getStringCellValue();
							res=m.userreg(ename, username, userpass, compass);
							break;
					case "elogin":
						String usname=s3.getRow(1).getCell(7).getStringCellValue();
						String uspass=s3.getRow(1).getCell(8).getStringCellValue();
						res=m.login(usname, uspass);
						break;
					default:
						break;
						
					}
					//writing to test step sheet
					ws_ts.getRow(j).createCell(4).setCellValue(res);
					
					if (ws_tc.getRow(i).getCell(3)) {
						
					}
				 }
					 
				}
				
			}
			else
			{
				ws_tc.getRow(i).getCell(3).setCellValue("Blocked");
			}
			
		}
		
	
		
	}

}
