package Windowbasedpopups;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fileupload2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://laptop-rpk18c26/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.id("loginButton")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.linkText("Settings")).click();
	    driver.findElement(By.partialLinkText("Logo ")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("uploadNewLogoOption")).click();
	    
	    Actions act=new Actions(driver);
	    WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
	    act.doubleClick().perform();
	    Thread.sleep(3000);
	    File a=new File("./autoscripts/nava.exe");
	    String abs = a.getAbsolutePath();
	    Runtime.getRuntime().exec(abs);
	    Thread.sleep(3000);
	    Runtime.getRuntime().exec(abs);
	    
	    
	    
	    
	    
	    

	}

}

