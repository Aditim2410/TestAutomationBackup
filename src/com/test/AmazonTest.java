package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTest {

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
		
		driver.get("https://www.amazon.in/");
	}
	
	
	@Test(priority=2)
	
	public void getAmazonTitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	//@Test
	
	//public void Printmessage()
	//{
	//	System.out.println("Amazon opened succcessfully");
	//}
	
	@Test(priority=1)
	
	public void clickonMobile()
	{
		boolean b=driver.findElement(By.xpath("//a[text()=''Mobiles']")).isDisplayed();
	}
	
	@AfterMethod
	
	public void tearDown() {
		driver.quit();
	}
}
