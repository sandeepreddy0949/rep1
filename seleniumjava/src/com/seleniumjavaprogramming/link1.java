package com.seleniumjavaprogramming;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class link1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https:google.ca");
		List<WebElement> links =driver.findElements(By.tagName("a"));
		int  x = links.size();
		System.out.println(x);
		for (int i = 0; i <x; i++) {
			String k=links.get(i).getText();
			//if (k=" ")
				
				
				
			System.out.println(links.get(i).getText());
			

				
		}
	}

}
