package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserChrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); //to open the browser
		driver.get("https://www.instagram.com");
		Thread.sleep(20000); 
		driver.close();//to close the browser

	}

}
