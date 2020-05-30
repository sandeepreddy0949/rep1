package testingpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("veerati.monika@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("8686411510");
		Thread.sleep(5000);
		driver.findElement(By.id("u_0_2")).click();
		driver.findElement(By.id("userNavigationLabel")).click();
		//driver.findElement(By.className("_54nh")).click();
	//driver.close();
		
	}

}
