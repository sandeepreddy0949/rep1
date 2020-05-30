package keyboardmouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonclick {

	public static void main(String[] args) {
		
WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		WebElement gm=driver.findElement(By.id("nav-link-shopall"));
		Actions act=new Actions(driver);
		act.moveToElement(gm).build().perform();
		
		WebElement gm1=driver.findElement(By.className("nav-text"));
		act.moveToElement(gm1).build().perform();
		WebElement gm2=driver.findElement(By.xpath("//span[@aria-label='Mobiles, Computers']"));
		act.moveToElement(gm2).build().perform();
		driver.findElement(By.xpath("//span[text()='Power Banks']")).click();

	}

}
