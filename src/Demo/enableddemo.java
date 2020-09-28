package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//1. isDisplayed() is the method used to verify the presence of a web element within the web page. The method returns a “true” value if the specified web element is present on the web page and a “false” value if the web element is not present on the webpage.
//2. isDisplayed() is capable to check for the presence of all kinds of web elements available.
//3. isEnabled() is the method used to verify if the web element is enabled or disabled within the web page.
//4. isEnabled() is primarily used with buttons.
//5. isSelected() is the method used to verify if the
//web element is selected or not. 6. isSelected() method 
//is predominantly used with radio buttons, dropdowns and checkboxes.

public class enableddemo {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.phptravels.net/home");
		Thread.sleep(1000);
	
		boolean b1=driver.findElement(By.xpath("//a[text()='Home']")).isDisplayed();
		System.out.println(b1);
		System.out.println("displayed is print here");
		
		driver.navigate().refresh();
		
		//boolean b2=driver.findElement(By.xpath("//a[text()='Home']")).isEnabled();
		//System.out.println(b2);
		//System.out.println("enabled is print here");
		
		driver.quit();
		
		
		

	}

}
