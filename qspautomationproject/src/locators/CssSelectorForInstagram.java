package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorForInstagram {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		
		//login operation:::
		driver.findElement(By.name("username")).sendKeys("NAVANATH");
		driver.findElement(By.name("password")).sendKeys("nava123");
		driver.findElement(By.cssSelector("button[class*='L3NKy']")).click();
		
		
		

	}

}
