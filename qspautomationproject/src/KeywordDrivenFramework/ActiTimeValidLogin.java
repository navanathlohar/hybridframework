package KeywordDrivenFramework;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeValidLogin extends BaseTest{

	public static void main(String[] args) throws InterruptedException, IOException {
		//object creation

		BaseTest bt = new BaseTest();
		Flib flib = new Flib();

		//read the data from property file using generic usauable method
		String username = flib.readPropertyFile("./Data/config.properties", "username");
		
		String password = flib.readPropertyFile("./Data/config.properties", "password");
		

		//open the browser
		bt.openBrowser();
		Thread.sleep(4000);

		//login operation
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);

		//close the browser
		bt.closeBrowser();



	}

}
