package Radiocheckbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cchekbox2 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		WebElement block=driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		List<WebElement> k=block.findElements(By.tagName("input"));//check(milk,cheese)(butter)
		
		 System.out.println(k.size());
		/* for (int i = 0; i < k.size(); i++) {
		      if(!k.get(i).isSelected())//all are checked
		      {
		    	 k.get(i).click(); 
		      }
		    	*/ 
		 
		 for (int i = 0; i < k.size(); i++)//cheese&milk checked
			 if (k.get(i).isSelected())
			       k.get(i).click();
			 else
				 k.get(i).click();//butter uncheck
		 
		 }

	}


