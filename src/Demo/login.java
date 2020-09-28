package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class login {

	public static void main(String[] args) {
		//How to run browser using headless browser
		
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("window-size-1400,800");// Its good practice to add this for all application.This is compulsary
		
		option.addArguments("headless");
		
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("http://www.google.com");
		
		System.out.println("Google page is opened");
		
		driver.close();
		

	}

}
