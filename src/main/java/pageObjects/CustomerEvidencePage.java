package pageObjects;


import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.Utilities;


public class CustomerEvidencePage {
	
	public WebDriver driver;
	Utilities util = new Utilities();
	
	@FindBy(xpath = "//*[@id=\"menubar1\"]/li[3]/a")
	private WebElement customerEvidenceMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	private WebElement customerEvidenceHomeMenu;
	
	@FindBy(xpath = "//input[@placeholder=('Search customer win wires and delivery stories')]")
	private WebElement customerEvidenceSearchTextBox;
	
	@FindBy(xpath = "//img[@alt=\"Search Icon\"]")
	private WebElement customerEvidenceSearchButton;
	
	@FindBy (xpath="//*[@id=\"ms-carousel-pause-button\"]/img") 
	private WebElement carouselLearnMoreOnEvidance;
	
	@FindBy (xpath="//span[contains(text(),'Submit a New Story')]") 
	private WebElement submitNewStory;
	
	@FindBy (xpath="//span[contains(text(),'Automotive, Mobility and Transportation')]") 
	private WebElement AutomotiveMobilityandTransportationCustomerStoriesSearchButton;
	
	@FindBy (xpath="//h1[contains(text(),'Automotive, Mobility and Transportation Customer S')]") 
	private WebElement AutomotiveMobilityandTransportationCustomerStoriesTitle;
	
	@FindBy (xpath="//span[contains(text(),'Cross Industry')]") 
	private WebElement CrossIndustryCustomerStoriesSearchButton;
	
	@FindBy (xpath="//h1[contains(text(),'Cross-Industry Customer Stories')]") 
	private WebElement CrossIndustryCustomerStoriesTitle;
	
	@FindBy (xpath="//span[contains(text(),'Defense and Intelligence')]") 
	private WebElement DefenseandIntelligenceCustomerStoriesSearchButton;
	
	@FindBy (xpath="//h1[contains(text(),'Defense and Intelligence Customer Stories')]") 
	private WebElement DefenseandIntelligenceCustomerStoriesTitle;
	
	@FindBy (xpath="//span[contains(text(),'Education')]") 
	private WebElement EducationCustomerStoriesSearchButton;
	
	@FindBy (xpath="//h1[contains(text(),'Education Customer Stories')]") 
	private WebElement EducationCustomerStoriesTitle;
	
	@FindBy (xpath="//span[contains(text(),'Energy and Resources')]") 
	private WebElement EnergyandResourcesCustomerStoriesSearchButton;
	
	@FindBy (xpath="//h1[contains(text(),'Energy and Resources Customer Stories')]") 
	private WebElement EnergyandResourcesCustomerStoriesTitle;
	
	@FindBy (xpath="//span[contains(text(),'Financial Services')]") 
	private WebElement FinancialServicesCustomerStoriesSearchButton;
	
	@FindBy (xpath="//h1[contains(text(),'Financial Services Customer Stories')]") 
	private WebElement FinancialServicesCustomerStoriesTitle;
	
	@FindBy (xpath="//span[contains(text(),'Government')]") 
	private WebElement GovernmentCustomerStoriesSearchButton;
	
	@FindBy (xpath="//h1[contains(text(),'Government Customer Stories')]") 
	private WebElement GovernmentCustomerStoriesTitle;
	
	@FindBy (xpath="//span[contains(text(),'Healthcare')]") 
	private WebElement HealthcareCustomerStoriesSearchButton;
	
	@FindBy (xpath="//h1[contains(text(),'Healthcare Customer Stories')]") 
	private WebElement HealthcareCustomerStoriesTitle;
	
	@FindBy (xpath="//span[contains(text(),'Industrials and Manufacturing')]") 
	private WebElement IndustrialandManufacturingCustomerStoriesSearchButton;
	
	@FindBy (xpath="//h1[contains(text(),'Industrials and Manufacturing Customer Stories')]") 
	private WebElement IndustrialandManufacturingCustomerStoriesTitle;
	
	@FindBy (xpath="//span[contains(text(),'Retail and Consumer Goods')]") 
	private WebElement RetailandConsumerGoodsCustomerStoriesSearchButton;
	
	@FindBy (xpath="//h1[contains(text(),'Retail and Consumer Goods Customer Stories')]") 
	private WebElement RetailandConsumerGoodsCustomerStoriesTitle;
	
	@FindBy (xpath="//span[contains(text(),'Sustainability')]") 
	private WebElement SustainabilityCustomerStoriesSearchButton;
	
	@FindBy (xpath="//h1[contains(text(),'Sustainability Customer Stories')]") 
	private WebElement SustainabilityCustomerStoriesTitle;
	
	@FindBy (xpath="//span[contains(text(),'Telecommunications and Media')]") 
	private WebElement TelecommunicationsandMediaCustomerStoriesSearchButton;
	
	@FindBy (xpath="//h1[contains(text(),'Telecommunications and Media Customer Stories')]") 
	private WebElement TelecommunicationsandMediaCustomerStoriesTitle;
	
	@FindBy (xpath="//a[contains(text(),'Solution Area Stories')]") 
	private WebElement SolutionAreaStoriesButton;
	
	@FindBy (xpath="//span[contains(text(),'Business Apps')]") 
	private WebElement BusinessAppsCustomerStoriesSearchButton;
	
	@FindBy (xpath="//h1[contains(text(),'Business Apps Customer Stories')]") 
	private WebElement BusinessAppsCustomerStoriesTitle;
	
	@FindBy (xpath="//span[contains(text(),'Data & AI')]") 
	private WebElement DataAICustomerStoriesSearchButton;
	
	@FindBy (xpath="//h1[contains(text(),'Data and AI Customer Stories')]") 
	private WebElement DataAICustomerStoriesTitle;
	
	@FindBy (xpath="//span[contains(text(),'Digital and Application Innovation')]") 
	private WebElement DigitalandApplicationInnovationCustomerStoriesSearchButton;
	
	@FindBy (xpath="//h1[contains(text(),'Digital and Application Innovation Customer Storie')]") 
	private WebElement DigitalandApplicationInnovationCustomerStoriesTitle;
	
	@FindBy (xpath="//span[contains(text(),'Infrastructure')]") 
	private WebElement InfrastructureCustomerStoriesSearchButton;
	
	@FindBy (xpath="//h1[contains(text(),'Infrastructure Customer Stories')]") 
	private WebElement InfrastructureCustomerStoriesTitle;
	
	@FindBy (xpath="//span[contains(text(),'Modern Work')]") 
	private WebElement ModernWorkCustomerStoriesSearchButton;
	
	@FindBy (xpath="//h1[contains(text(),'Modern Work Customer Stories')]") 
	private WebElement ModernWorkCustomerStoriesTitle;
	
	@FindBy (xpath="//*[@id=\"yourActivityTab\"]/div/section/div/div/div/ul/li[6]/div/a/span") 
	private WebElement SecurityCustomerStoriesSearchButton;
	
	@FindBy (xpath="//*[@id=\"spmaincontentplaceholder\"]/div[1]/div[1]/div/h1") 
	private WebElement SecurityCustomerStoriesTitle;
	
	@FindBy (xpath="//span[contains(text(),'Win Wires')]") 
	private WebElement WinWiresCustomerStoriesSearchButton;
	
	@FindBy (xpath="//span[@id='lifecycleStage']") 
	private WebElement StorytypeButton;
	
	@FindBy (xpath="//*[@id=\"Win Wires\"]") 
	private WebElement WinWiresCheckbox;
	
	@FindBy (xpath="//span[contains(text(),'Delivery Stories')]") 
	private WebElement DeliveryStoriesCustomerStoriesSearchButton;
	
	@FindBy (xpath="//input[@id='Delivery Stories']") 
	private WebElement DeliveryStoriesCheckbox;
	
	@FindBy(xpath = "//a[contains(text(),'Win Wires')]")
	private WebElement customerEvidenceWinWiresMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Delivery Stories')]")
	private WebElement customerEvidenceDeliveryStoriesMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Submit a Story')]")
	private WebElement customerEvidenceSubmitaStoryMenu;
	
	@FindBy(xpath = "//a[contains(text(),'About Customer Evidence')]")
	private WebElement AboutCustomerEvidenceMenu;
	
	public CustomerEvidencePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public Set<String> getWindowHandles() 
	{
	    return driver.getWindowHandles();
	}
	public WebElement getAutomotiveMobilityandTransportationCustomerStoriesTitle() {
		return AutomotiveMobilityandTransportationCustomerStoriesTitle;
	}
	public WebElement getcarouselLearnMoreButtonOnEvidence() {
		return carouselLearnMoreOnEvidance;
	}
	public void clickOncustomerEvidenceMenuButton()
	{
		util.clickOnElementUsingActions(driver, customerEvidenceMenu);
	}

	public void clickOncustomerEvidenceHomeMenuButton()
	{
		util.clickOnElementUsingActions(driver, customerEvidenceHomeMenu);
	}
	public void enterStoryDetails(String StoryDetails) {
		customerEvidenceSearchTextBox.sendKeys(StoryDetails);
	}
	public void clickOncustomerEvidenceSearchButton()
	{
		util.clickOnElementUsingActions(driver, customerEvidenceSearchButton);
	}
	public void clickOnsubmitNewStoryButton()
	{
		util.clickOnElementUsingActions(driver, submitNewStory);
	}
	public void clickOnAutomotiveMobilityandTransportationCustomerStoriesSearchButton()
	{
		util.clickOnElementUsingActions(driver, AutomotiveMobilityandTransportationCustomerStoriesSearchButton);
	}
	public WebElement getCrossIndustryCustomerStoriesTitle() {
		return CrossIndustryCustomerStoriesTitle;
	}
	public void clickOnCrossIndustryCustomerStoriesSearchButton()
	{
		util.clickOnElementUsingActions(driver, CrossIndustryCustomerStoriesSearchButton);
	}
	public void clickOnDefenseandIntelligenceCustomerStoriesSearchButton()
	{
		util.clickOnElementUsingActions(driver, DefenseandIntelligenceCustomerStoriesSearchButton);
	}
	public WebElement getDefenseandIntelligenceCustomerStoriesTitle() {
		return DefenseandIntelligenceCustomerStoriesTitle;
	}
	public void clickOnEducationCustomerStoriesSearchButton()
	{
		util.clickOnElementUsingActions(driver, EducationCustomerStoriesSearchButton);
	}
	public WebElement getEducationCustomerStoriesTitle() {
		return EducationCustomerStoriesTitle;
	}
	public void clickOnEnergyandResourcesCustomerStoriesSearchButton()
	{
		util.clickOnElementUsingActions(driver, EnergyandResourcesCustomerStoriesSearchButton);
	}
	public WebElement getEnergyandResourcesCustomerStoriesTitle() {
		return EnergyandResourcesCustomerStoriesTitle;
	}
	public void clickOnFinancialServicesCustomerStoriesSearchButton()
	{
		util.clickOnElementUsingActions(driver, FinancialServicesCustomerStoriesSearchButton);
	}
	public WebElement getFinancialServicesCustomerStoriesTitle() {
		return FinancialServicesCustomerStoriesTitle;
	}
	public void clickOnGovernmentCustomerStoriesSearchButton()
	{
		util.clickOnElementUsingActions(driver, GovernmentCustomerStoriesSearchButton);
	}
	public WebElement getGovernmentCustomerStoriesTitle() {
		return GovernmentCustomerStoriesTitle;
	}
	public void clickOnHealthcareCustomerStoriesSearchButton()
	{
		util.clickOnElementUsingActions(driver, HealthcareCustomerStoriesSearchButton);
	}
	public WebElement getHealthcareCustomerStoriesTitle() {
		return HealthcareCustomerStoriesTitle;
	}
	public void clickOnIndustrialandManufacturingCustomerStoriesSearchButton()
	{
		util.clickOnElementUsingActions(driver, IndustrialandManufacturingCustomerStoriesSearchButton);
	}
	public WebElement getIndustrialandManufacturingCustomerStoriesTitle() {
		return IndustrialandManufacturingCustomerStoriesTitle;
	}
	public void clickOnRetailandConsumerGoodsCustomerStoriesSearchButton()
	{
		util.clickOnElementUsingActions(driver, RetailandConsumerGoodsCustomerStoriesSearchButton);
	}
	public WebElement getRetailandConsumerGoodsCustomerStoriesTitle() {
		return RetailandConsumerGoodsCustomerStoriesTitle;
	}
	public void clickOnSustainabilityCustomerStoriesSearchButton()
	{
		util.clickOnElementUsingActions(driver, SustainabilityCustomerStoriesSearchButton);
	}
	public WebElement getSustainabilityCustomerStoriesTitle() {
		return SustainabilityCustomerStoriesTitle;
	}
	public void clickOnTelecommunicationsandMediaCustomerStoriesSearchButton()
	{
		util.clickOnElementUsingActions(driver, TelecommunicationsandMediaCustomerStoriesSearchButton);
	}
	public WebElement getTelecommunicationsandMediaCustomerStoriesTitle() 
	{
		return TelecommunicationsandMediaCustomerStoriesTitle;
	}
	public void clickOnSolutionAreaStoriesButton()
	{
		util.clickOnElementUsingActions(driver, SolutionAreaStoriesButton);
	}
	public void clickOnBusinessAppsCustomerStoriesSearchButton()
	{
		util.clickOnElementUsingActions(driver, BusinessAppsCustomerStoriesSearchButton);
	}
	public WebElement getBusinessAppsCustomerStoriesTitle() 
	{
		return BusinessAppsCustomerStoriesTitle;
	}	
	public void clickOnDataAICustomerStoriesSearchButton()
	{
		util.clickOnElementUsingActions(driver, DataAICustomerStoriesSearchButton);
	}
	public WebElement getDataAICustomerStoriesTitle() 
	{
		return DataAICustomerStoriesTitle;
	}
	public void clickOnDigitalandApplicationInnovationCustomerStoriesSearchButton()
	{
		util.clickOnElementUsingActions(driver, DigitalandApplicationInnovationCustomerStoriesSearchButton);
	}
	public WebElement getDigitalandApplicationInnovationCustomerStoriesTitle() 
	{
		return DigitalandApplicationInnovationCustomerStoriesTitle;
	}
	public void clickOnInfrastructureCustomerStoriesSearchButton()
	{
		util.clickOnElementUsingActions(driver, InfrastructureCustomerStoriesSearchButton);
	}
	public WebElement getInfrastructureCustomerStoriesTitle() 
	{
		return InfrastructureCustomerStoriesTitle;
	}
	public void clickModernWorkCustomerStoriesSearchButton()
	{
		util.clickOnElementUsingActions(driver, ModernWorkCustomerStoriesSearchButton);
	}
	public WebElement getModernWorkCustomerStoriesTitle() 
	{
		return ModernWorkCustomerStoriesTitle;
	}
	public void clickSecurityCustomerStoriesSearchButton()
	{
		util.clickOnElementUsingActions(driver, SecurityCustomerStoriesSearchButton);
	}
	public WebElement getSecurityCustomerStoriesTitle() 
	{
		return SecurityCustomerStoriesTitle;
	}
	public void clickOnWinWiresCustomerStoriesSearchButton()
	{
		util.clickOnElementUsingActions(driver, WinWiresCustomerStoriesSearchButton);
	}
	public void clickOnStorytypeButton()
	{
		util.clickOnElementUsingActions(driver, StorytypeButton);
	}
	public WebElement getWinWiresCheckboxButton() 
	{
		return WinWiresCheckbox;
	}
	public void clickOnDeliveryStoriesCustomerStoriesSearchButton()
	{
		util.clickOnElementUsingActions(driver, DeliveryStoriesCustomerStoriesSearchButton);
	}
	public WebElement getDeliveryStoriesCheckbox() 
	{
		return DeliveryStoriesCheckbox;
	}
	public void clickOncustomerEvidenceWinWiresMenuButton()
	{
		util.clickOnElementUsingActions(driver, customerEvidenceWinWiresMenu);
	}
	public void clickOncustomerEvidenceDeliveryStoriesMenuButton()
	{
		util.clickOnElementUsingActions(driver, customerEvidenceDeliveryStoriesMenu);
	}
	public void clickOncustomerEvidenceSubmitaStoryMenuButton()
	{
		util.clickOnElementUsingActions(driver, customerEvidenceSubmitaStoryMenu);
	}
	public void clickOnAboutCustomerEvidenceMenuButton()
	{
		util.clickOnElementUsingActions(driver, AboutCustomerEvidenceMenu);
	}
	}
