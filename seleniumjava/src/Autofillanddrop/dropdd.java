package Autofillanddrop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdd {

	public static void main(String[] args) {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://www.flightcentre.ca/");
		WebElement w=d.findElement(By.id("class"));
		Select sc =new Select(w);
		sc.selectByIndex(1);
		List <WebElement> k=sc.getOptions();
		for (int i = 0; i <k.size(); i++) 
		{
			String s =k.get(i).getText();
		System.out.println(s);
			
		}

}
}