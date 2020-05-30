package llinksprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basiclink {

	public static void main(String[] args) {
	
		int cont=0;
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
	  List<WebElement> list= driver.findElements(By.tagName("a"));
	  
	  System.out.println("no of links"+list.size());
	  
	  for (int i = 0; i < list.size(); i++) 
	  {
		 String lname= list.get(i).getText();
		 
		
		  if (!lname.equals("")){
			  cont=cont+1;
			  System.out.println(list.get(i).getText());
		  
	       }
		  }
		
     
	  System.out.println("no of visible links"+cont);
     
	}

}
