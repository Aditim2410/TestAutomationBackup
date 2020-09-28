package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://html.com/input-type-file/");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[3]/article/header/h1/thrive_headline/input")).sendKeys("C:\\Users\\admin\\Desktop\\example.html");
		
		System.out.println("file uploaded successfully");
		
		driver.close();
		

	}

}
