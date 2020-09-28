package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertdemo {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/button")).click();
		
		Thread.sleep(5000);
		
		Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String text= alert.getText();
		
		
		if(text.equals("I am an alert box!"))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		
		alert.accept();
		
		
		driver.close();
		

	}

}
