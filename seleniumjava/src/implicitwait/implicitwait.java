package implicitwait;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class implicitwait {

	public static void main(String[] args) {
		
 WebDriver  driver =new FirefoxDriver();
	     
	     driver.get("http://www.gmail.com");
	     driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	     
	   driver.findElement(By.id("identifierId")).sendKeys("veerati.monika@gmail.com");
	   driver.findElement(By.xpath("//span[text()='Next']")).click();
	   
	   driver.findElement(By.name("password")).sendKeys("monika@12345");
	   driver.findElement(By.xpath("//span[text()='Next']")).click();
	   
	   driver.findElement(By.xpath("//span[@aria-hidden='true']")).click();
	    
	    driver.findElement(By.partialLinkText("Sign")).click();
	    
	}

}
