package KeywordDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	       BaseTest bt=new BaseTest();
	       bt.openBrowser();
	       Thread.sleep(3000);
	       
	       Flib flib=new Flib();

	     int rc = flib.getrowCount("./Data/ActiTimeTestData.xlsx","Invalidcreds");

		for(int i=1;i<=rc;i++)
		{
			String username = flib.readExcelData("./Data/ActiTimeTestData.xlsx","Invalidcreds", i,0);
			String password = flib.readExcelData("./Data/ActiTimeTestData.xlsx","Invalidcreds", i,1);

			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);

			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(3000);

			driver.findElement(By.name("username")).clear();
		}
		bt.closeBrowser();



	}

}
