package Autofillanddrop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RedbusAutofill {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.redbus.in/");
	    Thread.sleep(5000);
		driver.findElement(By.id("src")).sendKeys("H");
		 Thread.sleep(5000);
		List<WebElement> l=driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
	    int k=	l.size();
	    System.out.println("length is"+k);
	    for (int i = 0; i < l.size(); i++) {
	    	String w=l.get(i).getText();
	    	System.out.println(+i+" "+w);
	    	
	    	if(w.equalsIgnoreCase("hubli")){
	    		System.out.println("found");
	    		l.get(i).click();
	    		break;
	    	}
			
		}
		

	}

	
	}


