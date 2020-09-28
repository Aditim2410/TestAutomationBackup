package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	@BeforeSuite
	
	public void setup()
	{
		System.out.println("system property available");
	}
	
	@BeforeClass
	
	
	public void launchbrowser()
	{
		System.out.println("browser launched");
	}

	
	@BeforeTest
	
	public void login()
	{
		System.out.println();
	}

	@Test
	
	public void GoogleTestTitle()
	{
		System.out.println("Title Verified");
	}
	
	@AfterMethod
	
	public void Logout()
	{
		System.out.println("logout successfully");
	}
	
	@AfterSuite
	
	public void close()
	
	{
		System.out.println("Browser is closed");
	}
}
