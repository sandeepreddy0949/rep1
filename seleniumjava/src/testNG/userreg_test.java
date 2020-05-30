package testNG;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class userreg_test extends testNGmaster{
	
	@Test
	public void userreg() throws InterruptedException
	{
		boolean cont=false;
		expval=unamed;
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.id("btnAdd")).click();
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(ename);
		driver.findElement(By.id("systemUser_userName")).sendKeys(unamed);
		driver.findElement(By.id("systemUser_password")).sendKeys(passed);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(compass);
		driver.findElement(By.id("btnSave")).click();
		
		Thread.sleep(5000);
		
		List <WebElement> l=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		
		for (int i = 0; i < l.size(); i++)
		{
			
			List <WebElement> cc=l.get(i).findElements(By.tagName("td"));
			actval=cc.get(1).getText();
			System.out.println("in for"+actval);
			if (expval.equalsIgnoreCase(actval))
			{
				cont=true;
				break;	
		     }
			
			
         }
		Assert.assertEquals(cont, true);
	}

	}


