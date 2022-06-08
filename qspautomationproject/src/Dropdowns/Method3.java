package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Method3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/HTML2/singleselectdropdown.html");
		Thread.sleep(3000);
		WebElement dropdown = driver.findElement(By.id("menu"));
		Select sel=new Select(dropdown);
		sel.selectByVisibleText("Shira");
		Thread.sleep(3000);
		

	}

}
