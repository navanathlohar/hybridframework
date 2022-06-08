package pageobjectmodel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	static WebDriver driver;

	public void setUp() throws IOException
	{
		Flib flib = new Flib();
		String url = flib.readPropertyFile("./Data/config.properties", "url");
		String browservalue = flib.readPropertyFile("./Data/config.properties", "browser");

		if(browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		}
		else if(browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		}
		else
		{
			System.out.println("enter your choice");
		}

	}
	public void tearDown()
	{
		driver.quit();
	}

}
