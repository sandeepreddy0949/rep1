package methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods {
	
	public static String expval,actval;
	public static WebDriver driver;
	
	public String launch( String url)
	{
		expval="Login";
		driver=new FirefoxDriver();
		
		driver.get(url);
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		if (expval.equalsIgnoreCase(actval))
		{
			return "launch successfully done";
			
		} else 
			{
				return "launch failed";
			}
	}
		
		public String login(String uname,String pass) throws InterruptedException
		{
			expval="welcome";
			driver.findElement(By.id("txtUsername")).sendKeys(uname);
			driver.findElement(By.id("txtPassword")).sendKeys(pass);
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(2000);
			
			actval=driver.findElement(By.id("welcome")).getAttribute("id");
			if (expval.equalsIgnoreCase(actval))
			{
				return "login successfully done";
				
			} else 
				{
					return "login failed";
				}
		}
		
		public String logout() 
		{
			expval="Login";
			driver.findElement(By.partialLinkText("Welcome")).click();
			driver.findElement(By.linkText("Logout")).click();
			
			actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
			
			if (expval.equalsIgnoreCase(actval))
			{
				return "logout successfully done";
				
			} else 
				{
					return "logout failed";
				}
		}

	
		public void close()
		{
			driver.close();
		}
				
	
		public String empreg(String fname,String lname,String id) throws InterruptedException
		
		{
			expval=fname+" "+lname;
			//System.out.println(expval);
			driver.findElement(By.linkText("PIM")).click();
			driver.findElement(By.linkText("Add Employee")).click();
			
			driver.findElement(By.id("firstName")).sendKeys(fname);
			driver.findElement(By.id("lastName")).sendKeys(lname);
			driver.findElement(By.id("employeeId")).clear();
			driver.findElement(By.id("employeeId")).sendKeys(id);
			
			driver.findElement(By.id("btnSave")).click();
			
			Thread.sleep(5000);
			
			actval=driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
			
			//System.out.println("am is"+actval);
			if (expval.equalsIgnoreCase(actval))
			{
				return "login successfully done";
				
			} else 
				{
					return "login failed";
				}
			
		}
		
		
		public String userreg(String ename,String username,String userpass,String compass) throws InterruptedException
		{	
			boolean cont=false;
			expval=username;
			driver.findElement(By.linkText("Admin")).click();
			driver.findElement(By.linkText("User Management")).click();
			driver.findElement(By.id("btnAdd")).click();
			
			driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(ename);
			driver.findElement(By.id("systemUser_userName")).sendKeys(username);
			driver.findElement(By.id("systemUser_password")).sendKeys(userpass);
			driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(compass);
			driver.findElement(By.id("btnSave")).click();
			Thread.sleep(5000);
			
			List <WebElement> l=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
			
			for (int i = 0; i < l.size(); i++) {
				
				List <WebElement> cc=l.get(i).findElements(By.tagName("td"));
				actval=cc.get(1).getText();
				
			if (expval.equalsIgnoreCase(actval))
				{
					cont=true;
					break;	
			     }
             }
			if (cont==true) 
			{
				return "userreg.......... suceess";
			
			}
			 else
			{
				return "....not sucess userreg....";
			}
		}
}
