package xpathlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAssignementOfFlipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    driver.findElement(By.name("q")).sendKeys("iphone");
	    driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	   String c=driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Black, 128 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[text()='₹46,999']")).getText();
	    

	}

}
