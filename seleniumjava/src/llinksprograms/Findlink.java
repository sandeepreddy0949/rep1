
//find the string in the links
package llinksprograms;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Findlink {
	public static void main(String[] args) {
		boolean flase = false;
		boolean flag=flase;
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		int nolinks=links.size();
		System.out.println("no of links are" +nolinks) ;
		for(int i=0;i<nolinks;i++){
		    String k=links.get(i).getText();
		    
		       if (k.equalsIgnoreCase("sign up")) {
			  flag=true;
			   break;	
		       }
		}
		
      if (flag==true)
      {
    	  System.out.println("we fond");
      }
      else
    	  System.out.println("we didnt found");
	
		}
	}
