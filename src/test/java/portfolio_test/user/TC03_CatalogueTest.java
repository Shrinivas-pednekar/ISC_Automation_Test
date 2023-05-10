
package portfolio_test.user;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.swing.text.Utilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.CataloguePage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import resources.TestBase;

public class TC03_CatalogueTest extends TestBase {
	public WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	CataloguePage cataloguePage;

	Utilities util;
	public static Logger log = LogManager.getLogger(TestBase.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("produrl"));
		util = new Utilities();
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		cataloguePage = new CataloguePage(driver);
	}
	//-------------------------------Transformative Deals Page------------------------------------
	@Test(priority = 1)
	public void verifyEmergingInnovationEngineeringPageOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		cataloguePage.clickOnEmergingInnovationEngineeringPagesMenuButton();
		Thread.sleep(3000);
		try
		{

		if (cataloguePage.getSubscribeButton().isDisplayed()) {
			 Thread.sleep(1000);
			cataloguePage.clickOnSubscribeButton();
			 Thread.sleep(3000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
		} else {
			cataloguePage.clickOnUnsubscribeButton();
			 Thread.sleep(3000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
		}
		}
		catch (NoSuchElementException e) {
			cataloguePage.clickOnUnsubscribeButton();
			 Thread.sleep(3000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
		}
		
		Thread.sleep(7000);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult2 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult2);
		cataloguePage.clickOnShowDetailsButton();
		Thread.sleep(2000);
		cataloguePage.clickselectAllBomButton();
		Assert.assertTrue(cataloguePage.isDisplayedDownloadButton());
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Emerging Innovation & Engineering"));

		Thread.sleep(3000);

	}
	//--------------------------------------------Solution Area Innovation-----------------------
	@Test(priority = 2)
	public void verifyAdoptionChangeandServicesManagementPageOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnAdoptionChangeandServicesManagementMenuButton();
		Thread.sleep(5000);
		// boolean isTrue ;
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(2000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(2000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult2 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult2);
		System.out.println("Solution is displayed ");
		cataloguePage.clickOnShowDetailsButton();
		Thread.sleep(5000);
		boolean actualResult4 = cataloguePage.getEDFEvidenceCheck().getText().contains("EDF - PowerPlatform Center of Excellence");
		System.out.println("Evidence displaed as expected =" +cataloguePage.getEDFEvidenceCheck().getText() );
		Assert.assertTrue(actualResult4);
		System.out.println("Displayed EDF Evidence");

		cataloguePage.clickOnBOMTABButton();
		Thread.sleep(2000);
		cataloguePage.clickACMselectAllBomButton();
		Assert.assertTrue(cataloguePage.isDisplayedDownloadButton());
		System.out.println("BOB is displayed and able to download ");
		
		cataloguePage.clickOnDownloadSectionCloseButton();
		cataloguePage.clickPackageButton();
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		Thread.sleep(3000);
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		System.out.println("Package is displayed ");
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Adoption, Change, and Services Management"));
		System.out.println("Adoption, Change, and Services Management is loaded sucessfully ");
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void verifyBusinessAppsPageButtonOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnBusinessAppsMenuButton();
		Thread.sleep(5000);
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(2000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}
		Thread.sleep(3000);
		boolean actualResult3 = cataloguePage.getContractCount().getText().contains("296");
		Assert.assertTrue(actualResult3);
		cataloguePage.clickViewMoreSalseStatButton();
		Thread.sleep(3000);
		Assert.assertTrue(cataloguePage.isDisplayedCompassOneDealsLabel());
		System.out.println("Sales stat cound and table is verified ");
		
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult2 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult2);
		System.out.println("Solution is displayed ");
		
		cataloguePage.clickOnShowDetailsButton();
		Thread.sleep(5000);
		boolean actualResult4 = cataloguePage.getEDFEvidenceCheck().getText().contains("Ministry of Education Tāhūrangi Online Curric...");
		System.out.println("Evidence displaed as expected =" +cataloguePage.getEDFEvidenceCheck().getText() );
		Assert.assertTrue(actualResult4);
		System.out.println("Displayed EDF Evidence");
		Thread.sleep(3000);
		cataloguePage.clickOnBOMTABButton();
		Thread.sleep(2000);
		cataloguePage.clickABAselectAllBomButton();
		Assert.assertTrue(cataloguePage.isDisplayedDownloadButton());
		System.out.println("BOB is displayed and able to download ");
		Thread.sleep(3000);
		cataloguePage.clickOnDownloadSectionCloseButton();
		Thread.sleep(2000);
		cataloguePage.clickPackageButton();
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		Thread.sleep(3000);
		boolean actualResult5 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult5);
		System.out.println("Package is displayed ");
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Business Apps"));
		Thread.sleep(3000);
	}

	@Test(priority = 4)
	public void verifyCrossSolutionAreaandFunctionalSolutionOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnCrossSolutionAreaandFunctionalSolutionsMenuButton();
		Thread.sleep(5000);
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(2000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}
		
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult2 = homePage.getCustomerEvidenceSearchResults().getText().contains("3 Result(s)");
		Assert.assertTrue(actualResult2);
		System.out.println("Solution is displayed ");
		
		cataloguePage.clickOnShowDetailsButton();
		Thread.sleep(2000);
		cataloguePage.clickonCSAselectAllBomButton();
		Assert.assertTrue(cataloguePage.isDisplayedDownloadButton());
		System.out.println("BOB is displayed and able to download ");
		//cataloguePage.clickOnDownloadSectionCloseButton();
		Thread.sleep(2000);
		
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Cross Solution Area and Functional Solutions"));
		Thread.sleep(3000);
	}

	@Test(priority = 5)
	public void verifyDigitalandApplicationInnovationOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnDigitalandApplicationInnovationMenuButton();
		Thread.sleep(5000);
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(2000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}
		
		Thread.sleep(3000);
		boolean actualResult3 = cataloguePage.getContractCount().getText().contains("339");
		System.out.println("ContractCount=" +cataloguePage.getContractCount().getText() );
		Assert.assertTrue(actualResult3);
		cataloguePage.clickViewMoreSalseStatButton();
		Thread.sleep(3000);
		Assert.assertTrue(cataloguePage.isDisplayedCompassOneDealsLabel());
		System.out.println("Sales stat cound and table is verified ");
		
		cataloguePage.clickonDAIselectAllBomButton();
		Assert.assertTrue(cataloguePage.isDisplayedDownloadButton());
		System.out.println("BOB is displayed and able to download ");
		Thread.sleep(2000);
		cataloguePage.clickOnDownloadSectionCloseButton();
		Thread.sleep(2000);
		cataloguePage.clickonSolutionsPackagesButton();
		
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		Thread.sleep(5000);
		boolean actualResult2 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult2);
		System.out.println("Solution is displayed ");	
		
		
		Thread.sleep(2000);
		cataloguePage.clickPackageButton();
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		Thread.sleep(5000);
		boolean EvidenceCheck = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(EvidenceCheck);
		System.out.println("Package is displayed ");
		
		
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Digital and Application Innovation"));
		Thread.sleep(3000);
	}

	@Test(priority = 6)
	public void verifyDataandAIOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(2000);
		cataloguePage.clickOnDataandAIMenuButton();
		Thread.sleep(7000);
		
		try {
			if (cataloguePage.getDataAISubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnDataAISubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(2000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}
		
		boolean actualResult3 = cataloguePage.getContractCount().getText().contains("435");
		Assert.assertTrue(actualResult3);
		cataloguePage.clickViewMoreSalseStatButton();
		Thread.sleep(3000);
		Assert.assertTrue(cataloguePage.isDisplayedCompassOneDealsLabel());
		System.out.println("Sales stat cound and table is verified ");
		
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		Thread.sleep(5000);
		boolean actualResult2 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult2);
		System.out.println("Solution is displayed ");	
		
		cataloguePage.clickOnShowDetailsButton();
		Thread.sleep(7000);
		boolean actualResult4 = cataloguePage.getEDFEvidenceCheck().getText().contains("AI Bot SaaS Platform Solution Powered by Micr...");
		System.out.println("Evidence displaed as expected =" +cataloguePage.getEDFEvidenceCheck().getText() );
		Assert.assertTrue(actualResult4);
		System.out.println("Evidence displaed as expected");
		
		cataloguePage.clickOnBOMTABButton();
		Thread.sleep(2000);
		cataloguePage.clickonDandIselectAllBomButton();
		Assert.assertTrue(cataloguePage.isDisplayedDownloadButton());
		System.out.println("BOB is displayed and able to download ");
		Thread.sleep(3000);
		cataloguePage.clickOnDownloadSectionCloseButton();
		Thread.sleep(3000);
		cataloguePage.clickPackageButton();
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		Thread.sleep(3000);
		boolean EvidenceCheck = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(EvidenceCheck);
		System.out.println("Package is displayed ");

		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Data and AI"));
		Thread.sleep(3000);
	}

	@Test(priority = 7)
	public void verifyInfrastructureOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnInfrastructureMenuButton();
		Thread.sleep(5000);
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(2000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}
		Thread.sleep(3000);
		boolean actualResult3 = cataloguePage.getContractCount().getText().contains("340");
		Assert.assertTrue(actualResult3);
		cataloguePage.clickViewMoreSalseStatButton();
		Thread.sleep(3000);
		Assert.assertTrue(cataloguePage.isDisplayedCompassOneDealsLabel());
		System.out.println("Sales stat cound and table is verified ");
		
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult2 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult2);
		System.out.println("Solution is displayed ");
		
		cataloguePage.clickOnShowDetailsButton();
		Thread.sleep(2000);
		cataloguePage.clickonInfraselectAllBomButton();
		Assert.assertTrue(cataloguePage.isDisplayedDownloadButton());
		System.out.println("BOB is displayed and able to download ");
		cataloguePage.clickOnDownloadSectionCloseButton();
		Thread.sleep(2000);
		cataloguePage.clickPackageButton();
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		Thread.sleep(3000);
		boolean actualResult4 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult4);
		System.out.println("Package is displayed ");
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Infrastructure"));
		Thread.sleep(3000);
	}

	@Test(priority = 8)
	public void verifyModernWorkOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(2000);
		cataloguePage.clickOnModernWorkMenuButton();
		Thread.sleep(5000);
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(2000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}
		
		boolean actualResult3 = cataloguePage.getContractCount().getText().contains("409");
		Assert.assertTrue(actualResult3);
		cataloguePage.clickViewMoreSalseStatButton();
		Thread.sleep(3000);
		Assert.assertTrue(cataloguePage.isDisplayedCompassOneDealsLabel());
		System.out.println("Sales stat cound and table is verified ");
		
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		Thread.sleep(5000);
		boolean actualResult2 = homePage.getCustomerEvidenceSearchResults().getText().contains("6 Result(s)");
		Assert.assertTrue(actualResult2);
		System.out.println("Solution is displayed ");	
		
		cataloguePage.clickOnShowDetailsButton();
		Thread.sleep(7000);
		boolean actualResult4 = cataloguePage.getEDFEvidenceCheck().getText().contains("ISD Partnership at Merck Results in 30K Seat ...");
		System.out.println("Evidence displaed as expected =" +cataloguePage.getEDFEvidenceCheck().getText() );
		Assert.assertTrue(actualResult4);
		System.out.println("Evidence displaed as expected");
		
		cataloguePage.clickOnBOMTABButton();
		Thread.sleep(2000);
		cataloguePage.clickonModernWorkselectAllBomButton();
		Assert.assertTrue(cataloguePage.isDisplayedDownloadButton());
		System.out.println("BOB is displayed and able to download ");
		
		cataloguePage.clickOnDownloadSectionCloseButton();
		
		cataloguePage.clickPackageButton();
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		Thread.sleep(3000);
		boolean PackageCheck = homePage.getCustomerEvidenceSearchResults().getText().contains("2 Result(s)");
		Assert.assertTrue(PackageCheck);
		System.out.println("Package is displayed ");
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Modern Work"));
		Thread.sleep(3000);
	}

	@Test(priority = 9)
	public void verifySecurityOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnSecurityMenuButton();
		Thread.sleep(5000);
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(2000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}
		
		boolean actualResult3 = cataloguePage.getContractCount().getText().contains("474");
		Assert.assertTrue(actualResult3);
		cataloguePage.clickViewMoreSalseStatButton();
		Thread.sleep(3000);
		Assert.assertTrue(cataloguePage.isDisplayedCompassOneDealsLabel());
		System.out.println("Sales stat cound and table is verified ");
		
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		Thread.sleep(5000);
		boolean actualResult2 = homePage.getCustomerEvidenceSearchResults().getText().contains("8 Result(s)");
		Assert.assertTrue(actualResult2);
		System.out.println("Solution is displayed ");	
		
		cataloguePage.clickOnShowDetailsButton();
		Thread.sleep(7000);
		boolean actualResult4 = cataloguePage.getEDFEvidenceCheck().getText().contains("Bradesco Leap Program - Win Wire");
		System.out.println("Evidence displaed as expected =" +cataloguePage.getEDFEvidenceCheck().getText() );
		Assert.assertTrue(actualResult4);
		System.out.println("Evidence displaed as expected");
		
		cataloguePage.clickOnBOMTABButton();
		Thread.sleep(2000);
		cataloguePage.clickonSecurityselectAllBomButton();
		Assert.assertTrue(cataloguePage.isDisplayedDownloadButton());
		System.out.println("BOB is displayed and able to download ");
		
		cataloguePage.clickOnDownloadSectionCloseButton();
		
		cataloguePage.clickPackageButton();
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		Thread.sleep(3000);
		boolean PackageCheck = homePage.getCustomerEvidenceSearchResults().getText().contains("28 Result(s)");
		Assert.assertTrue(PackageCheck);
		System.out.println("Package is displayed ");
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Security"));
		Thread.sleep(3000);
	}
	//-------------------------------Industry Innovation---------------------------
	@Test(priority = 10)
	public void verifyAutomotiveMobilityandTransportationOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnAutomotiveMobilityandTransportationMenuButton();
		Thread.sleep(3000);
		try {
			if (cataloguePage.getSubscribeButton().isDisplayed()) {
				Thread.sleep(1000);
				cataloguePage.clickOnSubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("Subscribe button working as expected ");
			} else {
				cataloguePage.clickOnUnsubscribeButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubscribeSliderButton();
				Thread.sleep(3000);
				cataloguePage.clickOnSubmitButton();
				Thread.sleep(3000);
				Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
				System.out.println("UnSubscribe button working as expected ");
			}
		} catch (NoSuchElementException e) {
			cataloguePage.clickOnUnsubscribeButton();
			Thread.sleep(2000);
			cataloguePage.clickOnSubscribeSliderButton();
			Thread.sleep(3000);
			cataloguePage.clickOnSubmitButton();
			Thread.sleep(3000);
			Assert.assertTrue(cataloguePage.isDisplayedSubscribeSucessMsg());
			System.out.println("UnSubscribe button working as expected ");
		}
		boolean actualResult3 = cataloguePage.getContractCount().getText().contains("188");
		Assert.assertTrue(actualResult3);
		cataloguePage.clickViewMoreSalseStatButton();
		Thread.sleep(3000);
		Assert.assertTrue(cataloguePage.isDisplayedCompassOneDealsLabel());
		System.out.println("Sales stat cound and table is verified ");
		
		cataloguePage.clickOnShowDetailsButton();
		Thread.sleep(5000);
		boolean actualResult4 = cataloguePage.getEDFEvidenceCheck().getText().contains("Komatsu- AVOps Win Wire");
		System.out.println("Evidence displaed as expected =" +cataloguePage.getEDFEvidenceCheck().getText() );
		Assert.assertTrue(actualResult4);
		System.out.println("Evidence displaed as expected");
		
		cataloguePage.clickOnBOMTABButton();
	
		Thread.sleep(2000);
		cataloguePage.clickOnAMTselectAllBomButton();
		Assert.assertTrue(cataloguePage.isDisplayedDownloadButton());
		System.out.println("BOB is displayed and able to download ");
		
		cataloguePage.clickOnDownloadSectionCloseButton();
		cataloguePage.clickPackageButton();
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		Thread.sleep(3000);
		boolean EvidenceCheck = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(EvidenceCheck);
		System.out.println("Package is displayed ");
		
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Automotive, Mobility and Transportation"));
		Thread.sleep(3000);

	}

	@Test(priority = 11)
	public void verifyCrossIndustryOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnCrossIndustryMenuButton();
		Thread.sleep(3000);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Cross-Industry"));
		Thread.sleep(3000);
	}

	@Test(priority = 12)
	public void verifyDefenseandIntelligenceOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnDefenseandIntelligenceMenuButton();
		Thread.sleep(3000);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Defense and Intelligence"));
		Thread.sleep(3000);
	}

	@Test(priority = 13)
	public void verifyEducationOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnEducationMenuButton();
		Thread.sleep(3000);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Education"));
		Thread.sleep(3000);
	}

	@Test(priority = 14)
	public void verifyEnergyandResourcesOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnEnergyandResourcesMenuButton();
		Thread.sleep(3000);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Energy and Resources"));
		Thread.sleep(3000);
	}

	@Test(priority = 15)
	public void verifyFinancialServicesOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnFinancialServicesMenuButton();
		Thread.sleep(3000);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Financial Services"));
		Thread.sleep(3000);
	}

	@Test(priority = 16)
	public void verifyGovernmentOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnGovernmentMenuButton();
		Thread.sleep(3000);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Government"));
		Thread.sleep(3000);
	}

	@Test(priority = 17)
	public void verifyHealthcareOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnHealthcareMenuButton();
		Thread.sleep(3000);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Healthcare"));
		Thread.sleep(3000);
	}

	@Test(priority = 18)
	public void verifyIndustrialsandManufacturingOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnIndustrialsandManufacturingMenuButton();
		Thread.sleep(3000);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Industrials and Manufacturing"));
		Thread.sleep(3000);
	}

	@Test(priority = 19)
	public void verifyRetailandConsumerGoodsOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnRetailandConsumerGoodsMenuButton();
		Thread.sleep(3000);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Retail and Consumer Goods"));
		Thread.sleep(3000);
	}

	@Test(priority = 20)
	public void verifySustainabilityOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnSustainabilityMenuButton();
		Thread.sleep(3000);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Sustainability"));
		Thread.sleep(5000);
	}

	@Test(priority = 21)
	public void verifyTelecommunicationsandMediaOnCataloguePage() throws Throwable {

		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnTelecommunicationsandMediaMenuButton();
		Thread.sleep(3000);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Telecommunications and Media"));
	}
	@Test(priority = 22, enabled = false)
	public void testBrokenLinks() throws IOException, InterruptedException {
		cataloguePage.clickOncataloguePagesMenuButton();
		Thread.sleep(3000);
		cataloguePage.clickOnBusinessAppsMenuButton();
		Thread.sleep(30000);
		List<WebElement> links = driver.findElements(By.xpath("//a[contains(@href,'.')]"));
		System.out.println("Total links on the page: " + links.size());
		HttpURLConnection.setFollowRedirects(false); // disable automatic redirects
		int maxRedirects = 5;
		for (WebElement link : links) {
			//Thread.sleep(3000);
			String url = link.getAttribute("href");
			//Thread.sleep(3000);

			if (url == null || url.isEmpty()|| url.startsWith("mailto:")) {
				continue;
			}
			HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
			//Thread.sleep(3000);
			connection.setRequestMethod("GET");
			//Thread.sleep(3000);
			int responseCode = connection.getResponseCode();
			
			if (responseCode >= 400) {
				/*connection.connect();
				InputStream errorStream = connection.getErrorStream();
				BufferedReader reader = new BufferedReader(new InputStreamReader(errorStream));
				String line;
				StringBuilder errorMessage = new StringBuilder();
				while ((line = reader.readLine()) != null) {
					errorMessage.append(line);
				}
				reader.close();
				System.out.println("Error message: " + errorMessage.toString());*/

				System.out.println("Broken Link: |" + url + " | Response Code: |" + responseCode);

			} else {
				System.out.println("Working Link: |" + url + " | Response Code: |" + responseCode);

			}
			Thread.sleep(2000);
		}
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}