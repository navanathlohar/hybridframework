package Assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class SoftAndHardAssertion {
	WebDriver driver;
	
	@BeforeTest
	
	public void setProperty()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	
	@BeforeMethod
	
	public void launchBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@Test
	public void testCase() throws InterruptedException
	{
		SoftAssert softassert = new SoftAssert();
		String actualloginpagetitle = driver.getTitle();
		softassert.assertEquals(actualloginpagetitle, "OrangeHRM");
	    driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    
	    WebElement dashboard = driver.findElement(By.xpath("//h1[.='Dashboard']"));
	    boolean statusOfDashboard = dashboard.isDisplayed();
	    Assert.assertEquals(statusOfDashboard, true);
	    Thread.sleep(5000);
	    String homePageTitle = driver.getTitle();
	    
		
		
	}

}
