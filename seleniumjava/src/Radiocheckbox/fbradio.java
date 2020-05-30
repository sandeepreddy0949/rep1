package Radiocheckbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fbradio {

	public static void main(String[] args) {
	
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	     driver.findElement(By.id("u_0_c")).sendKeys("monika");;
		

		
		}
		
	

}
