package pageObjects;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import resources.Utilities;

public class CataloguePage {

	public WebDriver driver;
	Utilities util = new Utilities();

	@FindBy(xpath = "//*[@id=\"menubar1\"]/li[2]/a")
	private WebElement cataloguePagesMenu;

	@FindBy(xpath = "//a[contains(text(),'Emerging Innovation & Engineering')]")
	private WebElement EmergingInnovationEngineeringPagesMenu;

	@FindBy(xpath = "//a[contains(text(),'Adoption, Change, and Services Management')]")
	private WebElement AdoptionChangeandServicesManagementMenu;

	@FindBy(xpath = "//a[contains(text(),'Business Apps')]")
	private WebElement BusinessAppsMenu;

	@FindBy(xpath = "//a[contains(text(),'Cross Solution Area and Functional Solutions')]")
	private WebElement CrossSolutionAreaandFunctionalSolutionsMenu;

	@FindBy(xpath = "//a[contains(text(),'Digital and Application Innovation')]")
	private WebElement DigitalandApplicationInnovationMenu;

	@FindBy(xpath = "//a[contains(text(),'Data and AI')]")
	private WebElement DataandAIMenu;

	@FindBy(xpath = "//a[contains(text(),'Infrastructure')]")
	private WebElement InfrastructureMenu;

	@FindBy(xpath = "//a[contains(text(),'Modern Work')]")
	private WebElement ModernWorkMenu;

	@FindBy(xpath = "//a[contains(text(),'Security')]")
	private WebElement SecurityMenu;

	@FindBy(xpath = "//a[contains(text(),'Automotive, Mobility and Transportation')]")
	private WebElement AutomotiveMobilityandTransportationMenu;

	@FindBy(xpath = "//a[contains(text(),'Cross-Industry')]")
	private WebElement CrossIndustryMenu;

	@FindBy(xpath = "//a[contains(text(),'Defense and Intelligence')]")
	private WebElement DefenseandIntelligenceMenu;

	@FindBy(xpath = "//a[contains(text(),'Education')]")
	private WebElement EducationMenu;

	@FindBy(xpath = "//a[contains(text(),'Energy and Resources')]")
	private WebElement EnergyandResourcesMenu;

	@FindBy(xpath = "//a[contains(text(),'Financial Services')]")
	private WebElement FinancialServicesMenu;

	@FindBy(xpath = "//a[contains(text(),'Government')]")
	private WebElement GovernmentMenu;

	@FindBy(xpath = "//a[contains(text(),'Healthcare')]")
	private WebElement HealthcareMenu;

	@FindBy(xpath = "//a[contains(text(),'Industrials and Manufacturing')]")
	private WebElement IndustrialsandManufacturingMenu;

	@FindBy(xpath = "//a[contains(text(),'Retail and Consumer Goods')]")
	private WebElement RetailandConsumerGoodsMenu;

	@FindBy(xpath = "//a[contains(text(),'Sustainability')]")
	private WebElement SustainabilityMenu;

	@FindBy(xpath = "//a[contains(text(),'Telecommunications and Media')]")
	private WebElement TelecommunicationsandMediaMenu;

	@FindBy(xpath = "(//*[@aria-label =\"Show Details\"])[1]")
	private WebElement ShowDetailsButton;

	@FindBy(xpath = "//*[@id=\"bom-2478\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement selectAllBom;

	@FindBy(xpath = "//*[@id=\"bom-2033\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement ACMselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"bom-2099\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement BAselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"bom-2567\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement AMTselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"bom-2412\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement CSAselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"OfferIP\"]/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement DAIselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"bom-2431\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement DandIselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"bom-2479\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement InfraselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"bom-2463\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement ModernWorkselectAllBom;
	
	@FindBy(xpath = "//*[@id=\"bom-2418\"]/section/div/section/div/div[1]/div/div[2]/div/div/div[1]/p/label")
	private WebElement SecurityselectAllBom;
	

	@FindBy(xpath = "//span[contains(text(),'Download Selected')]")
	private WebElement DownloadSelected;

	@FindBy(xpath = "//a[contains(text(),'Subscribe')]")
	private WebElement SubscribeButton;
	
	@FindBy(xpath = "//*[@id=\"spanSubscribe\"]/a")
	private WebElement DataAISubscribeButton;

	@FindBy(xpath = "//*[@id=\"sub-entities\"]/div[1]/div/span/label/span")
	private WebElement SubscribeSliderButton;

	@FindBy(xpath = "//input[@id='btnSubmit']")
	private WebElement SubmitButton;

	@FindBy(xpath = "//p[contains(text(),'Your subscription preference is successfully updat')]")
	private WebElement SubscribeSucessMsg;

	@FindBy(xpath = "//a[contains(text(),'Unsubscribe')]")
	private WebElement UnsubscribeButton;

	@FindBy(xpath = "//div[@class='evidence itemCol scene scene--card']//div[@class='itemDetails']")////a[contains(text(),'EDF - PowerPlatform Center of Excellence')]
	private WebElement EDFEvidenceCheck;

	@FindBy(xpath = "//*[@id=\"offertabguide\"]/li[2]/a")
	private WebElement BOMButton;

	@FindBy(xpath = "//button[contains(text(),'Package')]")
	private WebElement PackageButton;

	@FindBy(xpath = "//*[@id=\"dvOfferMetrics\"]/div[1]/div[2]/div[1]/div") //p[contains(text(),'296')]
	private WebElement ContractCount;

	@FindBy(xpath = "//button[@id='spanToggleStat']")
	private WebElement ViewMoreSalseStat;

	@FindBy(xpath = "//a[contains(text(),'CompassOne Deals')]")
	private WebElement CompassOneDealsLabel;
	
	@FindBy(xpath = "//button[contains(text(),'X')]")
	private WebElement DownloadSectionCloseButton;
	
	@FindBy(xpath = "//a[contains(text(),'Solutions & Packages')]")
	private WebElement SolutionsPackagesButton;

	public CataloguePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public Set<String> getWindowHandles() {
		return driver.getWindowHandles();
	}

	public void clickOncataloguePagesMenuButton() {
		util.clickOnElementUsingActions(driver, cataloguePagesMenu);
	}

	public void clickOnEmergingInnovationEngineeringPagesMenuButton() {
		util.clickOnElementUsingActions(driver, EmergingInnovationEngineeringPagesMenu);
	}

	public void clickOnAdoptionChangeandServicesManagementMenuButton() {
		util.clickOnElementUsingActions(driver, AdoptionChangeandServicesManagementMenu);
	}

	public void clickOnBusinessAppsMenuButton() {
		util.clickOnElementUsingActions(driver, BusinessAppsMenu);
	}

	public void clickOnCrossSolutionAreaandFunctionalSolutionsMenuButton() {
		util.clickOnElementUsingActions(driver, CrossSolutionAreaandFunctionalSolutionsMenu);
	}

	public void clickOnDigitalandApplicationInnovationMenuButton() {
		util.clickOnElementUsingActions(driver, DigitalandApplicationInnovationMenu);
	}

	public void clickOnDataandAIMenuButton() {
		util.clickOnElementUsingActions(driver, DataandAIMenu);
	}

	public void clickOnInfrastructureMenuButton() {
		util.clickOnElementUsingActions(driver, InfrastructureMenu);
	}

	public void clickOnModernWorkMenuButton() {
		util.clickOnElementUsingActions(driver, ModernWorkMenu);
	}

	public void clickOnSecurityMenuButton() {
		util.clickOnElementUsingActions(driver, SecurityMenu);
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
	}

	public void clickOnAutomotiveMobilityandTransportationMenuButton() {
		util.clickOnElementUsingActions(driver, AutomotiveMobilityandTransportationMenu);
	}

	public void clickOnCrossIndustryMenuButton() {
		util.clickOnElementUsingActions(driver, CrossIndustryMenu);
	}

	public void clickOnDefenseandIntelligenceMenuButton() {
		util.clickOnElementUsingActions(driver, DefenseandIntelligenceMenu);
	}

	public void clickOnEducationMenuButton() {
		util.clickOnElementUsingActions(driver, EducationMenu);
	}

	public void clickOnEnergyandResourcesMenuButton() {
		util.clickOnElementUsingActions(driver, EnergyandResourcesMenu);
	}

	public void clickOnFinancialServicesMenuButton() {
		util.clickOnElementUsingActions(driver, FinancialServicesMenu);
	}

	public void clickOnGovernmentMenuButton() {
		util.clickOnElementUsingActions(driver, GovernmentMenu);
	}

	public void clickOnHealthcareMenuButton() {
		util.clickOnElementUsingActions(driver, HealthcareMenu);
	}

	public void clickOnIndustrialsandManufacturingMenuButton() {
		util.clickOnElementUsingActions(driver, IndustrialsandManufacturingMenu);
	}

	public void clickOnRetailandConsumerGoodsMenuButton() {
		util.clickOnElementUsingActions(driver, RetailandConsumerGoodsMenu);
	}

	public void clickOnSustainabilityMenuButton() {
		util.clickOnElementUsingActions(driver, SustainabilityMenu);
	}

	public void clickOnTelecommunicationsandMediaMenuButton() {
		util.clickOnElementUsingActions(driver, TelecommunicationsandMediaMenu);
	}

	public void clickOnShowDetailsButton() {
		util.scrollDownForElementToBeVisible(driver, ShowDetailsButton, 2000);
		util.clickOnElementUsingActions(driver, ShowDetailsButton);
	}

	public void clickselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, selectAllBom, 2000);
		util.clickOnElementUsingActions(driver, selectAllBom);

	}

	public WebElement getDownloadSelectedText() {
		return DownloadSelected;
	}

	public boolean isDisplayedDownloadButton() {
		// util.clickOnElementUsingActions(driver,carouselPlayButton);
		return getDownloadSelectedText().isDisplayed();
	}

	public void clickOnSubscribeButton() {
		util.clickOnElementUsingActions(driver, SubscribeButton);
	}

	public void clickOnSubscribeSliderButton() {
		util.clickOnElementUsingActions(driver, SubscribeSliderButton);
	}

	public void clickOnSubmitButton() {
		util.clickOnElementUsingActions(driver, SubmitButton);
	}

	public WebElement getSubscribeSucessMsg() {
		return SubscribeSucessMsg;
	}

	public boolean isDisplayedSubscribeSucessMsg() {
		// util.clickOnElementUsingActions(driver,carouselPlayButton);
		return getSubscribeSucessMsg().isDisplayed();
	}

	public WebElement getSubscribeButton() {
		return SubscribeButton;
	}
	public WebElement getDataAISubscribeButton() {
		return DataAISubscribeButton;
	}
	public void clickOnDataAISubscribeButton() {
		util.clickOnElementUsingActions(driver, DataAISubscribeButton);
	}

	public void clickOnUnsubscribeButton() {
		util.clickOnElementUsingActions(driver, UnsubscribeButton);
	}

	public WebElement getEDFEvidenceCheck() {
		return EDFEvidenceCheck;
	}

	public boolean isDisplayedgetEDFEvidence() {
		// util.clickOnElementUsingActions(driver,carouselPlayButton);
		return getEDFEvidenceCheck().isDisplayed();
	}

	public void clickOnBOMTABButton() {
		util.scrollDownForElementToBeVisible(driver, BOMButton, 2000);
		util.clickOnElementUsingActions(driver, BOMButton);
	}

	public void clickACMselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, ACMselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, ACMselectAllBom);

	}

	public void clickPackageButton() {
		//util.scrollDownForElementToBeVisible(driver, PackageButton, 2000);
		util.clickOnElementUsingActions(driver, PackageButton);
	}
	public WebElement getContractCount() {
		return ContractCount;
	}
	public void clickViewMoreSalseStatButton() {
		util.scrollDownForElementToBeVisible(driver, ViewMoreSalseStat, 2000);
		util.clickOnElementUsingActions(driver, ViewMoreSalseStat);
	}
	public WebElement getCompassOneDealsLabel() {
		return CompassOneDealsLabel;
	}
	public boolean isDisplayedCompassOneDealsLabel() {
		// util.clickOnElementUsingActions(driver,carouselPlayButton);
		return getCompassOneDealsLabel().isDisplayed();
	}
	public void clickABAselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, BAselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, BAselectAllBom);
	}
	public void clickOnDownloadSectionCloseButton() 
	{
		util.clickOnElementUsingActions(driver, DownloadSectionCloseButton);
	}
	public void clickOnAMTselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, AMTselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, AMTselectAllBom);
	}
	public void clickonCSAselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, CSAselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, CSAselectAllBom);
	}
	public void clickonDAIselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, DAIselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, DAIselectAllBom);
	}
	public void clickonSolutionsPackagesButton() {
		util.clickOnElementUsingActions(driver, SolutionsPackagesButton);
	}
	public void clickonDandIselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, DandIselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, DandIselectAllBom);
	}
	public void clickonInfraselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, InfraselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, InfraselectAllBom);
	}
	public void clickonModernWorkselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, ModernWorkselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, ModernWorkselectAllBom);
	}
	public void clickonSecurityselectAllBomButton() {
		util.scrollDownForElementToBeVisible(driver, SecurityselectAllBom, 2000);
		util.clickOnElementUsingActions(driver, SecurityselectAllBom);
	}
}
