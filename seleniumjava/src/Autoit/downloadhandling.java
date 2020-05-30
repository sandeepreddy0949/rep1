package Autoit;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class downloadhandling {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download/");
		driver.findElement(By.linkText("3.141.59")).click();;
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("C:\\Users\\monika\\Desktop\\filedownload12.exe");
	}

}
