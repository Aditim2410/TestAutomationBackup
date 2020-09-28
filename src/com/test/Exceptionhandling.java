package com.test;

import org.testng.annotations.Test;

public class Exceptionhandling {
	
	@Test(invocationTimeOut=2,expectedExceptions=NumberFormatException.class)
	
	public void add()
	{
		int i=1;
		while (i==1) {
			System.out.println(i);
		}
				
	}

}
