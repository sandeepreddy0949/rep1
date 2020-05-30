package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fraewithwebelem {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='packageFrame']")));
		driver.findElement(By.linkText("Actions")).click();
	}

}
