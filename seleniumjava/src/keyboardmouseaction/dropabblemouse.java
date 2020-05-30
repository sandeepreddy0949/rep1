package keyboardmouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dropabblemouse {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/draggable/");
		
		WebElement fram=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(fram);
		WebElement drag=driver.findElement(By.id("draggable"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(drag, 393, 228).build().perform();;
		

	}

}
