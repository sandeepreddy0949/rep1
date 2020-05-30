package llinksprograms;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class jumpurl {

	public static void main(String[] args) {
	   WebDriver driver=new FirefoxDriver();
	   driver.get("http://www.primusbank.qedgetech.com//sitemap.html");
	   
	   WebElement section=driver.findElement(By.xpath("//table[@id='Table_011']/tbody/tr[2]/td"));
	   List<WebElement> l=section.findElements(By.tagName("a"));
	   for (int i = 0; i<l.size(); i++){
		   l.get(i).click();
		   String url=driver.getCurrentUrl();
		   String title=driver.getTitle();
		  
		   System.out.println(l.get(i).getText()+"url"+url+"title"+title);
		   driver.navigate().back();
		   
	   }
	}

}
