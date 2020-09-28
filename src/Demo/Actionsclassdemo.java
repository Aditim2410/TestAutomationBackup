package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsclassdemo {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(3000);
		
		Actions action=new Actions(driver);
		
		//action.moveToElement(driver.findElement(By.linkText("Add-Ons"))).build().perform();
		
		action.moveToElement(driver.findElement(By.xpath("\r\n" + 
				"//a[text()='Add-Ons']"))).build().perform();
		
		Thread.sleep(3000);
		System.out.println("hover action completed");
		
		//driver.findElement(By.linkText("Spicemax")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'SpiceMax')]")).click();
		System.out.println("clicked successfully");
		
		driver.close();

	}

}
