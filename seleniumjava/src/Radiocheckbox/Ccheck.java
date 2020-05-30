package Radiocheckbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ccheck {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		WebElement k=driver.findElement(By.name("option1"));
		
		   if(!k.isSelected()) {
			   k.click();
		   }
		
		
		
	}

}
