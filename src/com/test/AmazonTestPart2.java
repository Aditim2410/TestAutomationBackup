package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTestPart2 {
	
	
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
	
	
	@Test(priority=1,groups="Title")
	
	public void getAmazonTitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	
	@Test(priority=2,groups="Click")
	
	public void clickonMobile()
	{
		boolean b=driver.findElement(By.xpath("//a[text()=''Mobiles']")).isDisplayed();
	}
	
	
	@Test(priority=3,groups="Bestsellers")
	
	public void besetSellers()
	{
		System.out.println("Print all best selleres");
	}
	
	
	@Test(priority=4,groups="Pantry")
	
	public void Pantry()
	{
		System.out.println("Print all Pantry option");
	}
	
	@Test(priority=5,groups="electronicGadget")
	
	public void electronicGadget()
	{
		System.out.println("Print all electronicGadget ");
	}
	
	
	@AfterMethod
	
	public void tearDown() {
		driver.close();
	}
	

}
