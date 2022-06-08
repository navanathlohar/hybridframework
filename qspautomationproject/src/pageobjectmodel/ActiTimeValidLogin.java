package pageobjectmodel;

import java.io.IOException;

public class ActiTimeValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException {


		//object creation 
		BaseTest bt = new BaseTest();

		//for open the browser
		bt.setUp();

		Flib flib = new Flib();
		String validusername = flib.readPropertyFile("./Data/config.properties","username");
		String validpassword = flib.readPropertyFile("./Data/config.properties", "password");

		LoginPage lp = new LoginPage(driver);
		//perform the login
		
		lp.actiTimeValidLogin(validusername, validpassword);
		
            //close the browser
		bt.tearDown();
		


	}

}
