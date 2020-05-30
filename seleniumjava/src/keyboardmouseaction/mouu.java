package keyboardmouseaction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class mouu {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.ca/?tag=hydcaabkg-20&hvadid=317549713819&hvpos=1t1&hvnetw=g&hvrand=17345403411337604014&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9000384&hvtargid=kwd-13273016&ref=pd_sl_7na9ri0ehg_e&hydadcr=20060_10818753&gclid=EAIaIQobChMInMiAspqZ4gIVwksNCh1S3gO_EAAYASAAEgL4l_D_BwE");
		/*
		WebElement w=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions act=new Actions(driver);
		act.moveToElement(w).perform();
		driver.findElement(By.linkText("Baby Registry")).click();*/
		
		WebElement wb=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s=new Select(wb);
		
		List <WebElement> all=s.getOptions();
		
	    System.out.println("size is......."+all.size());
	    
	    
	    for (int i = 0; i < all.size(); i++) {
	    	
	    	String k=all.get(i).getText();
	    	System.out.println("k"+k);
			
		}
	
		
		
		
		
				
	}

}
