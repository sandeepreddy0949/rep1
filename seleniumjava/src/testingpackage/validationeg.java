package testingpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class validationeg {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		String expval = "google";
		driver.get("http://google.com");
		String actval=driver.getTitle();
		if (expval.equalsIgnoreCase(actval))
		{
			System.out.println("oped browser");
			
		}
		else
			System.out.println("wrong browser");
	}
	

}
