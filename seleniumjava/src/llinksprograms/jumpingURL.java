package llinksprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class jumpingURL {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		   driver.get("http://www.primusbank.qedgetech.com//sitemap.html");
		   driver.manage().window().maximize();
		   Thread.sleep(3000);
		   WebElement section=driver.findElement(By.xpath("//table[@id='Table_011']/tbody/tr[2]/td"));
		   List<WebElement> l=section.findElements(By.tagName("a"));
		   System.out.println("size of block"+l.size());
		   
		   for (int i = 0; i<=l.size(); i++)
		   {
			   String s=l.get(i).getText();
			   
			 System.out.println(s);
			 l.get(i).click();
			   Thread.sleep(5000);
			   
			   String title=driver.getTitle();
			  
			   System.out.println("title="+title);
			   driver.navigate().back();
			
			   section= driver.findElement(By.xpath("//table[@id='Table_011']/tbody/tr[2]/td"));
			   l=section.findElements(By.tagName("a"));
		   
			  }

}
}
