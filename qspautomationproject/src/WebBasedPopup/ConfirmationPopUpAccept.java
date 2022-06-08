package WebBasedPopup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUpAccept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Suraj/OneDrive/Desktop/HTML/alert.html");
		
		driver.findElement(By.xpath("//button[text()='I am Hungry']")).click();
		Thread.sleep(5000);
		
		Alert al=driver.switchTo().alert();
		al.accept();

	}

}
