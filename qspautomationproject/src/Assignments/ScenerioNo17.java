

	package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScenerioNo17 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	    driver.get("https://www.bluestone.com");
	     driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
	    Thread.sleep(5000);
	   WebElement target = driver.findElement(By.xpath("//a[text()='Coins ']"));
	    Actions act=new Actions(driver);
	    act.moveToElement(target).perform();
	    driver.findElement(By.xpath("//span[text()='50 gram' and @class='prcs-d' and @data-p='gold-coins-weight-50gms,m']")).click();
	    List<WebElement> list = driver.findElements(By.xpath("//h1[text()='50 gram 24 KT Gold Coin']"));
	    for(int i=0;i<list.size();i++)
	    {
	    	WebElement obj = list.get(i);
	    	boolean obj2 = obj.isDisplayed();
	    	System.out.println(obj2);
	    }
	    
	    
	

	}

}


