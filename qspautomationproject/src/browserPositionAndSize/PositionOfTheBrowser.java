package browserPositionAndSize;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositionOfTheBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//set position of the browser  x   y
		Point targetPosition=new Point(80,250);
		driver.manage().window().setPosition(targetPosition);
		

	}

}
