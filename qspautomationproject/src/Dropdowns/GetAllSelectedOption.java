package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/HTML2/multiselectdropdown.html");
	
		WebElement dropdown = driver.findElement(By.id("menu"));
		Select sel=new Select(dropdown);
		
		for(int i=1;i<=7;i++)
		{
			sel.selectByIndex(i);
			
		}
		List<WebElement> allops = sel.getAllSelectedOptions();
		
		for(WebElement we:allops)
		{
			String ops = we.getText();
			System.out.println(ops);
		}

	}

}
