package testNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class emploreg_testNG extends testNGmaster {
	
	@Test(dataProvider="data")
	
	public void empreg(String fname,String lname,String id) throws InterruptedException {
	
	expval=fname+" "+lname;

	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Add Employee")).click();
	
	driver.findElement(By.id("firstName")).sendKeys(fname);
	driver.findElement(By.id("lastName")).sendKeys(lname);
	driver.findElement(By.id("employeeId")).clear();
	driver.findElement(By.id("employeeId")).sendKeys(id);
	
	driver.findElement(By.id("btnSave")).click();
	
	Thread.sleep(5000);
	
	actval=driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
	Assert.assertEquals(actval, expval,"emp_reg failed");
	
    }
	@DataProvider
	public Object[][] data()
	{
		Object[][] x=new Object[4][3];
		
		x[0][0]="sample11";
		x[0][1]="monika11";
		x[0][2]="st2313";
		
		x[1][0]="sample21";
		x[1][1]="monika12";
		x[1][2]="st233413";
		
		x[2][0]="sample31";
		x[2][1]="monika13";
		x[2][2]="st236ds713";
		

		x[2][0]="sample41";
		x[2][1]="monika13";
		x[2][2]="st236dsdf713";
		
		return x;
	}
}