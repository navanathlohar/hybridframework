package Dropdowns;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TreeSetMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Suraj/OneDrive/Desktop/HTML/singleselectdropdown.html");
		
		WebElement dropdown = driver.findElement(By.id("menu"));
		
		Select option=new Select(dropdown);
		
	      List<WebElement> obj = option.getOptions();
	      TreeSet<String> s=new TreeSet<String>();
	      
	      for(int i=0;i<obj.size();i++)
	      {
	    	  WebElement list = obj.get(i);
	    	  String finalist = list.getText();
	    	  s.add(finalist);
	    	
	      }
	       for(String se:s)
	       {
	    	   System.out.println(se);
	       }
		

	}

}