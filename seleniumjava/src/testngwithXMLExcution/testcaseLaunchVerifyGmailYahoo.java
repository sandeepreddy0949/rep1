package testngwithXMLExcution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testcaseLaunchVerifyGmailYahoo {
	
public static WebDriver driver;

@BeforeMethod
public void launchbrowser()
{
	driver=new FirefoxDriver();
}
@AfterMethod
public void closebrowser()
{
	driver.close();;
}
@Test
public void gmaillogin()
{
	driver.get("https://www.gmail.com");
	Assert.assertEquals("Gmail",driver.getTitle());
}
@Test
public void yahoologin()
{
	driver.get("https://www.yahoo.com");
	Assert.assertEquals("Yahoo",driver.getTitle());
}
	

}
