package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Suraj/OneDrive/Desktop/HTML/forlocator.html");
		//driver.findElement(By.tagName("file:///C:/Users/Suraj/OneDrive/Desktop/HTML/webpage.html"));
		driver.findElement(By.id("i1")).sendKeys("admin");
		driver.findElement(By.id("i2")).sendKeys("manager");
		Thread.sleep(5000);
		driver.close();

	}

}
