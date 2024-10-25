package com.testing;

import org.testng.Assert;
import org.testng.annotations.Test;
////9/25/24 1:30min
public class Assertion {
	int x = 100;
	/*
	 * @Test public void getSalary(int x) { if(x==100)
	 * {System.out.println("Number matches!");} else
	 * {System.out.println("Number doesn't match");}
	 * 
	 * }
	 * 
	 * }
	 */

	@Test
	public void getMoney() { Assert.assertEquals(100, x);}

}