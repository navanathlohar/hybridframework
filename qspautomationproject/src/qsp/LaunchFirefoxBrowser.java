package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	 FirefoxDriver driver=new FirefoxDriver(); //to opne browser
	 driver.manage().window().maximize();//to maximize browser
	 driver.get("https://www.instagram.com"); //launch web app
	 Thread.sleep(10000); //provide the delay of 10seconds
	 driver.close(); //close the browser

	}

}
