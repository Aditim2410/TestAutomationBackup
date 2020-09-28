package com.test;

import org.testng.annotations.Test;

public class Invocationcount {
	
	@Test(invocationCount=5)
	
	public void sum(){
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println("value of c is" +c);
	}
}
