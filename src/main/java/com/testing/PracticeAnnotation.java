package com.testing;

import org.junit.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class PracticeAnnotation {
	@Test
	public void getCart() 
	{System.out.println("This is Annotation...");	}
	
	@BeforeMethod
	public void getShopping() 
	{System.out.println("This is before Method."); }
	
	@AfterSuite
	public void getMethod()
	{System.out.println("After Suit."); }
	
	//STCM Suite, Test, CLass, Method
}
