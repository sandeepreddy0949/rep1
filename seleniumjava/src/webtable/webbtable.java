package webtable;

import java.util.List;

import org.openqa.jetty.html.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webbtable {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://orangehrm.qedgetech.com/");
	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
	driver.findElement(By.id("btnLogin")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Employee List")).click();
    List<WebElement> rows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
    
    		for (int i = 0; i < rows.size(); i++) {
    			String e=rows.get(i).getText();
    			//System.out.println(i+"....."+e);
    			
    			List<WebElement> col=rows.get(i).findElements(By.tagName("td"));
    			String k=col.get(1).getText();
    			System.out.println(k);
    			if (k.equalsIgnoreCase("0929")) {
    				col.get(0).click();
    				driver.findElement(By.id("btnDelete")).click();
    				driver.findElement(By.id("dialogDeleteBtn")).click();
    				break;
    				
					
				}
    			
				
			}

	}

}
