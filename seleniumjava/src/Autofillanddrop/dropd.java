package Autofillanddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropd {
	

   public static void main(String[] args) throws InterruptedException {
			
		 
		 
			 WebDriver driver= new FirefoxDriver();
			 driver.get("https://www.flightnetwork.com/");
			 Thread.sleep(5000);
			 WebElement w=driver.findElement(By.xpath("//div[@class='homePagesearchForm-Dropdown-select ']"));
			Select se = new Select(w);
			Thread.sleep(10000);
			se.selectByIndex(2);

	}

}
