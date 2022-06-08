package xpathlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathLocaterAssignmentOfSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		driver.findElement(By.name("card-link")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='API Docs']/ancestor::div[@class='row justify-content-center px-5 pb-5']"));
		

	}

}
