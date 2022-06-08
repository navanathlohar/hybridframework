package Windowbasedpopups;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload3 {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://laptop-rpk18c26/login.do");
		driver.get("https://imagetopdf.com/");
		driver.findElement(By.xpath("//span[.='Upload Files']")).click();
		Thread.sleep(2000);
		File obj=new File("./autoitscripts/imgtopdf.exe");
		String img = obj.getAbsolutePath();
		Runtime.getRuntime().exec(img);
		
		
	    
	    
	    
	    
	    

	}

}


