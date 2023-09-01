package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoanDepartment {

	@Test
	public void Loan1() {
		System.out.println("I m in Loan1");
	}
	
	@Test(groups = "SMOKE")
	public void Loan2() {
		System.out.println("I m in Loan2");
	}
	@Test
	public void Loan3() {
		System.out.println("I m in Loan3");
	}
	
	
	
}
