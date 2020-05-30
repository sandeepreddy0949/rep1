package Radiocheckbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ccheckbox {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		WebElement block=driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		List<WebElement> k=block.findElements(By.tagName("input"));
		
	   System.out.println(k.size());
          for (int i = 0; i < k.size(); i++) {
        	  
        	String s= k.get(i).getAttribute("value");
        	    System.out.println(s);
        	    
		
		}	    	
	
	}

}
