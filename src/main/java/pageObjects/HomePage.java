package pageObjects;


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Utilities;


public class HomePage {
	
	public WebDriver driver;
	Utilities util = new Utilities();
	
	@FindBy(xpath = "//*[@id=\"msCarousel\"]/div[1]/div[2]/div/div/p[2]/a")
	private WebElement carouselLearnMore2;
	
	@FindBy(xpath="//*[@id=\"copyToClipboard\"]") 
	private WebElement filteredLink;
	
	@FindBy(xpath="//button[@id='ArchView']")
	private WebElement ArchView;
	
	@FindBy (xpath="//*[@id=\"msCarousel\"]/div[1]/div[1]/div/div/p[2]/a")
	private WebElement carouselLearnMore1;
	
	@FindBy (xpath="//*[@id=\"ms-carousel-play-button\"]/img")
	private WebElement carouselPlayButton;
	
	@FindBy(xpath="//button[@id='ISView']")
	private WebElement ISView;
	
	@FindBy(xpath="//a[contains(text(),'Customer Evidence Search')]")
	private WebElement CustomerEvidenceSearch;
	
	@FindBy(xpath="//a[contains(text(),'View Campaign Page')]")
	private WebElement ViewCampaignPage;
	
	@FindBy(xpath="//h4[contains(text(),'Cloud Transition Services')]")
	private WebElement CloudTransitionServicesLink;
	
	@FindBy(xpath="//h4[contains(text(),'Cloud Management Operations')]")
	private WebElement CloudManagementOperationsLink;
	
	@FindBy(xpath="//h4[contains(text(),'Data Strategy')]")
	private WebElement DataStrategyLink;
	
	@FindBy(xpath="//a[contains(text(),'View all top offers')]")
	private WebElement ViewalltopoffersLink;
	
	@FindBy(xpath="//h2[@id='lblCounter']")
	private WebElement CustomerEvidenceSearchResult;
	
	@FindBy(xpath="//a[contains(@href,'.')]")
	private WebElement Linkshref;
	
	@FindBy(xpath="//a[contains(text(),'Eureka')]")
	private WebElement Eureka;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String getPageTitle() {
		return driver.getTitle();
	}
	public WebElement getcarouselLearnMoreButton() {
		return carouselPlayButton;
	}
	public boolean isDisplayedLearnMore()
	{
	 return getcarouselLearnMoreButton().isDisplayed();
	}
	public WebElement getfilteredLinkButton() {
		
		return filteredLink;
	}
	public WebElement getCustomerEvidenceSearchButton() {
		
		return CustomerEvidenceSearch;
	}
	
	public WebElement getCustomerEvidenceSearchResults() {
		
		return CustomerEvidenceSearchResult;
	}
	public boolean isDisplayedfilteredLinkButton()
	{
		//util.clickOnElementUsingActions(driver,carouselPlayButton);
		return getfilteredLinkButton().isDisplayed();
	}
	public boolean isDisplayedCustomerEvidenceSearchButton()
	{
		//util.clickOnElementUsingActions(driver,carouselPlayButton);
		return getCustomerEvidenceSearchButton().isDisplayed();
	}
	public void clickOnArchView()
	{
		util.clickOnElementUsingActions(driver, ArchView);
	//	util.scrollDownForElementToBeVisible(driver,filteredLink,2000);
	}
	public void clickOnISView()
	{
		util.clickOnElementUsingActions(driver, ISView);
	}
	public void clickOnViewCampaignPage()
	{
		util.clickOnElementUsingActions(driver, ViewCampaignPage);
	}
	public Set<String> getWindowHandles() 
	{
	    return driver.getWindowHandles();
	}
	public void clickOnCloudTransitionServicesLink()
	{
		util.clickOnElementUsingActions(driver, CloudTransitionServicesLink);
	}
	public void clickOnCloudManagementOperationsLink()
	{
		util.clickOnElementUsingActions(driver, CloudManagementOperationsLink);
	}
	public void clickOnDataStrategyLink()
	{
		util.clickOnElementUsingActions(driver, DataStrategyLink);
	}
	public void clickOnViewalltopoffersLink()
	{
		util.clickOnElementUsingActions(driver, ViewalltopoffersLink);
	}
	public void clickOnCustomerEvidenceSearchButton()
	{
		util.clickOnElementUsingActions(driver, CustomerEvidenceSearch);
	}
	public void CustomerEvidenceSearchResultwaitForElementToBeVisible()
	{
		util.waitForElementToBeVisible(driver, CustomerEvidenceSearchResult);
	}
	public WebElement getLinkshref() {
		
		
		return Linkshref;
	}
	
	public void clickOnEurekaButton()
	{
		util.clickOnElementUsingActions(driver, Eureka);
	}
	
}
