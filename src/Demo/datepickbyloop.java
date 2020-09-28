package Demo;

import java.util.concurrent.TimeUnit;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class datepickbyloop {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://spicejet.com/"); // enter URL
		
		String date="21-May-2020";
		String datearr[]=date.split("-");
		String day=datearr[0];
		String month=datearr[1];
		String year=datearr[2];
		
	    Select select=new Select(driver.findElement(By.name("ctl00$mainContent$view_date1")));
	    select.selectByVisibleText(month);
	    
	    Select select1=new Select(driver.findElement(By.name("ctl00$mainContent$view_date1")));
	    select1.selectByVisibleText(year);
	    
		
		
		

	}

}
