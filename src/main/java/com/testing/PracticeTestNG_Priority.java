package com.testing;

import org.junit.Test;

//9/21/24 at 15min this code doesn't work

public class PracticeTestNG_Priority {
	@Test(timeout=0)
	public void getLogin() {
		System.out.println("This is Login Method");
	}

	@Test(timeout=1)
	public void getSearch() {
		System.out.println("This is Search Method");}
	
	@Test(priority=2)
	public void getCart() {
		System.out.println("This is Cart Method");}
	
	@Test(priority=3)
	public void getPayment() {
		System.out.println("This is Payment Method");}
	
	@Test(priority=3, invocationCount=5)
	public void getEnd() {
		System.out.println("This is Payment Method");}
	
}
