package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class No5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    driver.get("https://www.bluestone.com");
	    driver.findElement(By.id("denyBtn")).click();
	    Thread.sleep(5000);
	    WebElement targetmousehover = driver.findElement(By.xpath("//a[text()='Diamond'][@title='Diamond Rings']"));
	
	    Actions act=new Actions(driver);
	    act.moveToElement(targetmousehover).perform();
	    driver.findElement(By.xpath("//a[text()='Diamond'][@title='Diamond Rings']")).click();
	    

       List<WebElement> list = driver.findElements(By.xpath("//span[@class='new-price']"));
       for(int i=0;i<list.size();i++)
       {
    	   WebElement obj1 = list.get(i);
    	   String text1 = obj1.getText();
    	   System.out.println(text1);
       }
       System.out.println("---------------------");
       
       WebElement element1 = driver.findElement(By.xpath("//span[text()=' Popular ']"));
       Thread.sleep(5000);
       act.moveToElement(element1).perform();
       driver.findElement(By.xpath("//a[text()='Price Low to High ']")).click();
       List<WebElement> list1 = driver.findElements(By.xpath("//span[@class='new-price']"));
       System.out.println("------------------");
       for(int i=0;i<list1.size();i++)
       {
    	   WebElement obj2 = list1.get(i);
    	  String text2 = obj2.getText();
    	  System.out.println(text2);
       }
       if(list.equals(list1))
       {
    	   System.out.println("both prices same");
    	   
       }
       else 
       {
    	   System.out.println("prices are not same");
       }
       Thread.sleep(4000);
       driver.close();
	    
	    

	}

}
