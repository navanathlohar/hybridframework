package pageobjectmodel;

import java.io.IOException;

public class ActiTimeSaveLeaveBtn extends BaseTest {

	public static void main(String[] args) throws InterruptedException, IOException {

		BaseTest bt = new BaseTest();
		bt.setUp();      //open the browser

		Flib flib = new Flib();

		//read the data from excel file by using generic reusuable method
		String validUsername = flib.readPropertyFile("./Data/config.properties","username" );
		String validPassword = flib.readPropertyFile("./Data/config.properties", "password");

		LoginPage lp = new LoginPage(driver);
		lp.actiTimeValidLogin(validUsername, validPassword);
		Thread.sleep(8000);

		HomePage hp = new HomePage(driver);
		hp.clickSaveLeaveButton();


	}

}
