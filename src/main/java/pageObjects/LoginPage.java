package pageObjects;

import javax.mail.MessagingException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Utilities;


public class LoginPage {

	public WebDriver driver;
	Utilities util = new Utilities();
	
	@FindBy(xpath = "//*[@id='tilesHolder']/div //small[contains(.,'microsoft')]")
	private WebElement loginAccount;
	
	@FindBy(xpath = "//small[contains(text(),'v-spednekar@microsoft.com')]")
	private WebElement ShriUSername;
	
	@FindBy(xpath = "//*[@id=\"i0116\"]")
	private WebElement LoginID;
	
	
	
	
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public HomePage LoginToAccount() {
		loginAccount.click();
		return new HomePage(driver);
	}
	
	public void clickOnProductInnovationDevelopmentServicesLink()
	{
		util.clickOnElementUsingActions(driver, ShriUSername);
	}
	public void enterLoginID(String StoryDetails) {
		LoginID.sendKeys(StoryDetails);
	}
	
}
