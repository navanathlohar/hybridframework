package testngflags;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
	@Test
	public void login()
	{
		Reporter.log("login", true);
	}

	@Test(dependsOnMethods="login")
	public void createUser()

	{
		Assert.fail();
		Reporter.log("create user",true);

	}

	@Test(dependsOnMethods="createuser")
	public void logout()

	{

		Reporter.log("logout",true);

	}

}
