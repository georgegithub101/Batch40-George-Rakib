package com.testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeParameterTestNG {
	@Test
	@Parameters("myName")
	public void getName(String myName) {
		System.out.println(myName);
	}

}
