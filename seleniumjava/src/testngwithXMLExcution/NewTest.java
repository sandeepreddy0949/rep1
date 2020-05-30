package testngwithXMLExcution;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
  @BeforeTest
  public void login() 
  { 
	 System.out.println("sucessful login");
	  
 }
  @AfterTest
  public void logout() 
  {
	 System.out.println("sucessful logout");
		  
   }
  @Test
  public void addvendor() 
  {
	 System.out.println("sucessful addvendor");
		  
   }
  @Test
  public void addcurrency() 
  {
	 System.out.println("sucessful addcurrency ");
		  
   }
  @Test
  public void addproduct() 
  {
	 System.out.println("sucessful addproduct ");
		  
   }
  
  
}
