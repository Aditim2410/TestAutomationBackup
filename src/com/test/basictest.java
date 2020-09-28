package com.test;

import org.testng.annotations.Test;

public class basictest {
	
	
@Test
	public void login()
	{
	System.out.println("login test");
	//int i=9/0;
	}

	@Test(dependsOnMethods="login")
	
	public void GoogleTestTitle()
	{
		System.out.println("Title Verified");
	}

}
