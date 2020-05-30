package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class testNGmaster {
	
	public static String expval,actval;
	public static WebDriver driver;
	public static String url="http://orangehrm.qedgetech.com";
	public static String uname="Admin";
	public static String pass="Qedge123!@#";
	public static String fname="thirupathiii";
	public static String lname="reddyy";
	public static String id="12sttt6";
	public static String ename="Nididh G";
	public static String unamed="NididhG12334";
	public static String passed="Monikkka123!@#";
	public static String compass="Monikkka123!@#";
	@BeforeSuite
	public void launch() throws InterruptedException
	{
		expval="LOGIN";
		driver=new FirefoxDriver();
		
		driver.get(url);
		Thread.sleep(3000);
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");

		Assert.assertEquals(actval, expval,"launch failed");
	}
	@BeforeTest
	public void login() throws InterruptedException
	{
		expval="welcome";
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		
		actval=driver.findElement(By.id("welcome")).getAttribute("id");
		Assert.assertEquals(actval, expval,"login failed");
			
	}
	@AfterTest
	public void logout() throws InterruptedException 
	{
		expval="LOGIN";
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(5000);
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		
		Assert.assertEquals(actval, expval,"logout failed");
	}
	@AfterSuite
	public void close()
	{
		driver.close();
	}
	
}