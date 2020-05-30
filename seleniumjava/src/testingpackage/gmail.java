package testingpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmail {

	public static void main(String[] args) throws InterruptedException {
     WebDriver  driver =new FirefoxDriver();
     
     driver.get("http://www.gmail.com");
   driver.findElement(By.id("identifierId")).sendKeys("veerati.monika@gmail.com");
   driver.findElement(By.xpath("//span[text()='Next']")).click();
   Thread.sleep(5000);
   driver.findElement(By.name("password")).sendKeys("monika@12345");
   driver.findElement(By.xpath("//span[text()='Next']")).click();
   Thread.sleep(5000);
   driver.findElement(By.xpath("//span[@aria-hidden='true']")).click();
    Thread.sleep(8000);
    driver.findElement(By.partialLinkText("Sign")).click();
    
	}

}
