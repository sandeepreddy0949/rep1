package keyboardmouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class keymouseactio {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com");
		WebElement gm=driver.findElement(By.linkText("Gmail"));
		Actions act=new Actions(driver);
		
		act.contextClick(gm).perform();
		Thread.sleep(5000);
		
		act.sendKeys(Keys.chord("S")).perform();
		//act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN);

	    //act.sendKeys(Keys.ENTER).build().perform();
		
		
		
		
	
	}

}
