package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathLocator1 {

	public static void main(String[] args)throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("123");
		driver.findElement(By.id("pass")).sendKeys("456");
		driver.findElement(By.name("login")).click();
		
		
	

	}

}
