package llinksprograms;

import org.openqa.selenium.chrome.ChromeDriver;


public class practise {

	public static void main(String[] args) {
				ChromeDriver driver=new ChromeDriver();
				
				
					driver.get("http://www.google.com");
					String s1=driver.getCurrentUrl();
					
					driver.get("http://www.facebook.com");
					String s2=driver.getCurrentUrl();
					
					driver.get("http://www.gmail.com");
					String s3=driver.getCurrentUrl();
					
					System.out.println(s1);
					System.out.println(s2);
					System.out.println(s3);
					
					driver.close();
				

	}

}
