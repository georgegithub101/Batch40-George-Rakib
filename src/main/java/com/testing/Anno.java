package com.testing;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Anno {
	
	@Test
	public void getCart() {
		System.out.println("This is Test annotation");
		}

	@BeforeMethod
	public void getShopping() 
	{System.out.println("This is before Method."); }
	
	
	@AfterSuite
	public void getMethod()
	{System.out.println("After Suite");}
		
}
