package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//Declaration
	@FindBy(xpath="//a[.='Logout']") private WebElement logoutLink;
	@FindBy(xpath="//a[.='Create new tasks']") private WebElement createnewtask;
	@FindBy(linkText="Settings") private WebElement settings;
	@FindBy(id="SubmitTTButton") private WebElement savebtn;



	//Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	//Utilization

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getCreatenewtask() {
		return createnewtask;
	}
	public WebElement getSettings() {
		return settings;
	}


	public WebElement getSavebtn() {
		return savebtn;
	}





	//operational method
	public void clickLogout()
	{
		logoutLink.click();
	}
	public void clickSaveLeaveButton()
	{
		savebtn.click();
	}

}
