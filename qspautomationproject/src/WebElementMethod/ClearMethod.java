package WebElementMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	   WebElement untextbox = driver.findElement(By.name("txtUsername"));
	    WebElement passtextbox = driver.findElement(By.id("txtPassword"));
	    untextbox.sendKeys("Navanath");
	    passtextbox.sendKeys("Navanath123");
	    Thread.sleep(3000);
	    passtextbox.clear();
	    
	    
	    
	    
	    

	}

}
