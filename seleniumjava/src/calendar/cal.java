package calendar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cal {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		String Date="9-May-2020";
		String[] da=Date.split("-");
		String date=da[0];
		String month=da[1];
		String year=da[2];
		System.out.println(date+"...."+month+"........."+year);
		
		driver.findElement(By.id("DepartDate")).click();
	    WebElement calyear=driver.findElement(By.className("ui-datepicker-year"));
	    String x= calyear.getText();
	    System.out.println(x);
	    
	    while (!x.equals(year)){
	    	driver.findElement(By.className("nextMonth ")).click();
	    	  calyear=driver.findElement(By.className("ui-datepicker-year"));
	 	     x= calyear.getText();
	 	     System.out.println(x);
	    	 }
	   WebElement calmonth= driver.findElement(By.className("ui-datepicker-month"));
			   String y=calmonth.getText();
	    while(!y.equals(month)){
	    	
	    	driver.findElement(By.className("nextMonth ")).click();
	    	 calmonth= driver.findElement(By.className("ui-datepicker-month"));
			   y=calmonth.getText();
			   System.out.println(y);
			   
	    	 }

		
		List <WebElement> d=driver.findElements(By.xpath("//table[@class='calendar']/tbody/tr/td"));
	
		for (int i = 0; i < d.size(); i++) {
			
			String dat=d.get(i).getText();
			System.out.println(dat);
			
			if ( dat.equals(date))
			{
				d.get(i).click();
				System.out.println("click done");
				break;
			}
			
	
		}
	

	}

}
