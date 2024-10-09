package com.testing;

import org.junit.Test;

public class PracticeTestNG {

	 @Test(expected = 1)
	    public void getLogin() {
	        System.out.println("This is the Login Method");
	    }

	    @Test(expected = 2), invocationCount=5)
	    public void getCart1() {
	        System.out.println("This is the Search Method");
	    }

	    @Test(expected = 3, expected = {"getCart1()"})
	    public void getCart() {
	        System.out.println("This is the Cart Method");

		}


