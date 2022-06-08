package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Declaration
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginbutton;
	@FindBy(id="keepLoggedInCheckBox") private WebElement keepmelogin;
	@FindBy(xpath = "//img[contains(@src,'timer')]") private WebElement logo;
	@FindBy(id="licenseLink") private WebElement license;


	
	 //initalization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//utilization
	public WebElement getUsn() {
		return usn;
	}
	
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
	public WebElement getKeepmelogin() {
		return keepmelogin;
	}
	public WebElement getLogo() {
		return logo;
	}
	public WebElement getLicense() {
		return license;
	}
	
	
	//generic reusable method
	public void actiTimeValidLogin(String validUsername , String validPassword)
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginbutton.click();
		
	}
	public void actiTimeInvalidLogin(String invalidUsername , String invalidPassword) throws InterruptedException
	{
		usn.sendKeys(invalidUsername);
		pass.sendKeys(invalidPassword);
		loginbutton.click();
		Thread.sleep(2000);
		usn.clear();
		
	}
    
	
	
	
	
	
	
	
	
	

}
