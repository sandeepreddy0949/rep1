package MulitipleWindows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiwin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com/");
	
		String ss=driver.getWindowHandle();
		
		driver.findElement(By.linkText("Privacy")).click();
		//driver.findElement(By.linkText("Help")).click();
		
		Set<String> s=driver.getWindowHandles();
		Iterator<String> it=s.iterator();
		
		while(it.hasNext()){
			
			String id=it.next();
			
			System.out.println("the id is"+id);
			driver.switchTo().window(id);
			System.out.println(driver.getCurrentUrl()+"......................"+driver.getTitle());
			
			if (driver.getTitle().contains("Privacy")){
				
				driver.findElement(By.linkText("Terms of Service")).click();
				System.out.println("clicked");
				System.out.println(driver.getCurrentUrl()+"......................"+driver.getTitle());
				
			}
				
				
			}
		driver.switchTo().window(ss);
		System.out.println(ss);
		driver.findElement(By.linkText("Help")).click();
		Set<String> s2=driver.getWindowHandles();
		System.out.println("size now"+s2.size());
		Iterator<String> it2=s2.iterator();
		while(it2.hasNext()){
			
			String id1=it2.next();
			
			System.out.println("the id is"+id1);
			driver.switchTo().window(id1);
			System.out.println(driver.getCurrentUrl()+"......................"+driver.getTitle());
		}
		
		
	
	}

}
