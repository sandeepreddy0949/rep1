package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frame1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		Thread.sleep(5000);
		
		//@frameid
		driver.switchTo().frame("classFrame");
		
		WebElement f1=driver.findElement(By.linkText("com.thoughtworks.selenium"));
		
		f1.click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("AddLocationStrategy")).click();
		
		
		driver.switchTo().defaultContent();
	}

}
