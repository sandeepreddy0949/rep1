package keyboardmouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class carmax {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.carmax.com/");
		WebElement w1=driver.findElement(By.linkText("CARS FOR SALE"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(w1).perform();
		driver.findElement(By.linkText("Accessories")).click();
	
	
}
}