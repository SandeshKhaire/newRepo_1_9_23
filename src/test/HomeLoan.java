package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeLoan {
	@Test
	public void HomeLoan1() 
	{
		System.out.println("I m in HomeLoan1");
	}
	
	@Test(groups = "SMOKE")
	public void HomeLoan2()
	{
		System.out.println("I m in HomeLoan2");
	}
	
	@Test
	public void HomeLoan3()
	{
		System.out.println("I m in HomeLoan3");
	}
	

}
