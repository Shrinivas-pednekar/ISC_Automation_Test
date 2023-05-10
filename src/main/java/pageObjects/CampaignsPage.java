package pageObjects;


import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Utilities;


public class CampaignsPage {
	
	public WebDriver driver;
	Utilities util = new Utilities();
	
	@FindBy(xpath = "//*[@id=\"menubar1\"]/li[4]/a")
	private WebElement CampaignsMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Top ACR and DV Generators')]")
	private WebElement TopACRandDVGeneratorsMenu;

	@FindBy(xpath = "//a[contains(text(),'Do More With Less')]")
	private WebElement DoMoreWithLessMenu;
	
	public CampaignsPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String getPageTitle() {
		return driver.getTitle();
	}

	public void clickOnCampaignsMenuButton()
	{
		util.clickOnElementUsingActions(driver, CampaignsMenu);
	}
	public void clickOnTopACRandDVGeneratorsMenuButton()
	{
		util.clickOnElementUsingActions(driver, TopACRandDVGeneratorsMenu);
	}
	public void clickOnDoMoreWithLessMenuButton()
	{
		util.clickOnElementUsingActions(driver, DoMoreWithLessMenu);
	}
}
