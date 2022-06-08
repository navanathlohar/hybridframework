package pageobjectmodel;

import java.io.IOException;

public class ActiTimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
      BaseTest bt = new BaseTest();
      bt.setUp();   //open the browser
      
      Flib flib = new Flib();
      LoginPage lp = new LoginPage(driver);
      int rc = flib.getRowCount("./Data/ActiTimeTestData.xlsx", "Invalidcreds");
      
      //get the row count to iterate the for loop 
      for(int i=1;i<=rc;i++)
      {
    	 String invalidusername = flib.readExcelData("./Data/ActiTimeTestData.xlsx","Invalidcreds", i, 0);
    	 String invalidpassword = flib.readExcelData("./Data/ActiTimeTestData.xlsx", "Invalidcreds", i, 1);
    	 
    	 //perform invalid login
    	lp.actiTimeInvalidLogin(invalidusername, invalidpassword);
      }
      
      //close the browser
      bt.tearDown();
      
      
      
	}

}
