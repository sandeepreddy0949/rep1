package testNG;

import org.junit.BeforeClass;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test2 {
	
	@Test
	
	public void zebra()
	{
		System.out.println("apple");
	}

	@Test
	
	public void apple()
	{
		System.out.println("pineapple");
		throw new SkipException("not impl");
	}
	@Test(priority=1)

	public void ban()
	{
	System.out.println("banannaapple");
	}
	
	@Test
	public void stil()
	{
	System.out.println("banannaapple");
	}
	
	
	@BeforeMethod
	
	public void bm()
	{
		System.out.println("bm");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("am");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("bc");
		
	}
	@AfterClass
	public void ac()
	{
		System.out.println("ac");
		
	}
	@BeforeTest
	
	public void bt()
	{
		System.out.println("Bt");
		
	}
@AfterTest
	
	public void at()
	{
		System.out.println("At");
		
	}
	
}





