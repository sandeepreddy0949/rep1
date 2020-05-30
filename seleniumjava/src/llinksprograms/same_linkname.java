package llinksprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class same_linkname {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.primusbank.qedgetech.com/sitemap.html");
		//driver.findElement(By.linkText("Home")).click(); //same link one is selected
		//way-1
//		WebElement w=driver.findElement(By.xpath("//a[@href='home.aspx']"));
//		w.click();
		//way-2
	/*	WebElement section=driver.findElement(By.xpath("//table[@id='Table_011']/tbody/tr[2]/td"));
		List<WebElement> l=section.findElements(By.tagName("a"));
		
		for (int i = 0; i<l.size(); i++) {
			String k=l.get(i).getText();
			System.out.println(k);
			
			if (k.equalsIgnoreCase("home")) {
				System.out.println("we found the link");
				 l.get(i).click();
				 break;
			}
		
		}*/
		//way-3
		Thread.sleep(5000);
  WebElement d=driver.findElement(By.xpath("//table[@id='Table_011']/tbody/tr[2]/td"));
  
             d.findElement(By.linkText("Home")).click();
		
		
		
		
		

	}

}
