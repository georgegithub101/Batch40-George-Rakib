package com.practice;

public class Condition {
	public void getCondition (String name) {
		
		if(name.contains("D")) {
			System.out.println("It is Dasha");
			
		}	else if(name.contains("G")) {
				System.out.println("It is George");
			
		} else {
			System.out.println("Not Dasha");
			
		}
		
	}
	
	public static void main(String[] args) {
		Condition obj = new Condition();
		obj.getCondition ("mmm");
		obj.getCondition ("George");
		obj.getCondition ("jsghdfuvksgd");
		obj.getCondition ("Daria");
	}
}


