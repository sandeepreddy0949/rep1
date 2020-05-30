package Radiocheckbox;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radio1 {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		WebElement block=driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		List<WebElement> m=block.findElements(By.tagName("input"));
		System.out.println("size"+m.size());
		
		for (int i = 0; i < m.size(); i++) {
			String s=m.get(i).getAttribute("value");
			System.out.println(s);
			if(s.equalsIgnoreCase("milk"))
			{
				m.get(i).click();
			}
			if(s.equalsIgnoreCase("water"))
			{
				m.get(i).click();
			}
			
		}
		
		
		
	}

}
