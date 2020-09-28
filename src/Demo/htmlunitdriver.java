package Demo;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class htmlunitdriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
		
		//WebDriver driver=new ChromeDriver();
		
		WebDriver driver=new HtmlUnitDriver();
		
		driver.manage().window();
		driver.manage().deleteAllCookies();
		
		driver.get("https://google.com/");
		
		System.out.println("Html unit browser launched successfully");
		
		
		driver.close();
		
		//To implement html headless browser import jar files of htmlunit driver browser
		
		//advantages:
		//fast
		//no browser,improved performance,not suitable for action class
		//suitable for small scripting
		
		//Thread.sleep(3000);
		
		

	}

}
