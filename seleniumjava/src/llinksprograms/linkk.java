package llinksprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkk {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		driver.findElement(By.xpath("//i[@class='a-icon a-icon-next-rounded']")).click();
	
	}

}
