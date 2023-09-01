package test;

import org.testng.annotations.Test;

public class CarLoan {

	@Test
	public void CarLoan1() 
	{
		System.out.println("I m in CarLoan1");
	}
	
	@Test(groups = "SMOKE")
	public void CarLoan2()
	{
		System.out.println("I m in CarLoan2");
	}
	
	@Test
	public void CarLoan3()
	{
		System.out.println("I m in CarLoan3");
	}
}
