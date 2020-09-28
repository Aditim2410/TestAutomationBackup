package com.test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class validations {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		
       System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("http://google.com/");
	}
	
	
	@Test
	
	public void getAmazonTitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Google","Title is not ok");
	}

	@AfterMethod
	
	public void tearDown() {
		driver.quit();
	}
}
