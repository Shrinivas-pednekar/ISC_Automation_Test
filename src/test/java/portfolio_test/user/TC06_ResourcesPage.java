
package portfolio_test.user;

import java.io.IOException;
import java.util.Set;
import javax.swing.text.Utilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.CampaignsPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ResourcesPage;
import resources.TestBase;

public class TC06_ResourcesPage extends TestBase {
	public WebDriver driver;
	CampaignsPage campaignsPage;
	HomePage homePage;
	ResourcesPage resourcesPage;

	Utilities util;
	public static Logger log = LogManager.getLogger(TestBase.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("produrl"));
		util = new Utilities();
		resourcesPage = new ResourcesPage(driver);
		homePage = new HomePage(driver);
		
	}


	/*@Test(priority = 1)
	public void verifyIndustrySolutionsPageFromResourcesMenu() throws Throwable {
		
		resourcesPage.clickOnResourcesMenuButton();
		resourcesPage.clickOnIndustrySolutionsMenuButton();	
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		driver.close();
		driver.switchTo().window(mainTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Microsoft Industry Solutions | Powering your digital transformation"));
		driver.navigate().back();
		}

	@Test(priority = 2)
	public void verifyLEDPortalPageFromResourcesMenu() throws Throwable {
		
		resourcesPage.clickOnResourcesMenuButton();
		resourcesPage.clickOnLEDPortalMenuButton();
		//resourcesPage.clickOnLoginButton();
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		driver.close();
		driver.switchTo().window(mainTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("LED Portal - Home"));
		driver.navigate().back();	
	}
	
	@Test(priority = 3)
	public void verifyRFPIOPageFromResourcesMenu() throws Throwable {
		resourcesPage.clickOnResourcesMenuButton();
		resourcesPage.clickOnRFPIOMenuButton();
		//resourcesPage.clickOnLoginButton();
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		driver.close();
		driver.switchTo().window(mainTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("RFPIO"));
	}
	
	*/
	
	@Test(priority = 4)
	public void verifyISCloudsOverviewPageFromResourcesMenu() throws Throwable {
		driver.get(prop.getProperty("produrl"));
		resourcesPage.clickOnResourcesMenuButton();
		resourcesPage.clickOnISCloudsOverviewMenuButton();
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Industry Solutions Delivery and the industry clouds"));
		
	}
	@Test(priority = 5)
	public void verifyCustomerHubPageFromResourcesMenu() throws Throwable 
	{
		resourcesPage.HRefresh();
		resourcesPage.clickOnResourcesMenuButton();
		resourcesPage.clickOnCustomerHubMenuButton();
		resourcesPage.clickOnshowSearchListButton();
		Thread.sleep(3000);
		resourcesPage.clickOnselectAPMøller();
		Thread.sleep(1000);
		boolean actualResult = resourcesPage.getcustomerNameValue().getText().contains("A.P. Møller - Maersk Group");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		Thread.sleep(1000);
		//Assert.assertTrue(resourcesPage.isDisplayedCustomerEvidenceInCustomerHub()); 
		//System.out.println("DisplayedCustomerEvidenceInCustomerHub");
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Customer Hub"));
		
	}
	
	@Test(priority = 6)
	public void verifyDatabookPageFromResourcesMenu() throws Throwable {
		resourcesPage.clickOnResourcesMenuButton();
		Thread.sleep(2000);
		resourcesPage.clickOnDatabookMenuButton();
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Databook"));
	}
	@Test(priority = 7)
	public void verifyFundingPageFromResourcesMenu() throws Throwable {
		resourcesPage.clickOnResourcesMenuButton();
		resourcesPage.clickOnFundingMenuButton();
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Funding Deck"));
	}
	@Test(priority = 8)
	public void verifyAboutISCataloguePageFromResourcesMenu() throws Throwable {
		resourcesPage.clickOnResourcesMenuButton();
		resourcesPage.clickOnAboutISCatalogueMenuButton();
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("About IS Catalogue"));
	}
	
	@Test(priority = 9)
	public void verifyEmergingSolutionsPageFromResourcesMenu() throws Throwable {
		resourcesPage.clickOnResourcesMenuButton();
		resourcesPage.clickOnEmergingSolutionsMenuButton();
		Thread.sleep(5000);
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult3 = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResult3);
		
		System.out.println("New Tab URL - " + driver.getTitle());
		//Assert.assertTrue(driver.getTitle().contains("Emerging Solutions"));
		
	}
	
	@Test(priority = 10)
	public void verifyManageCatalogueSubscriptionsPageFromResourcesMenu() throws Throwable {
		resourcesPage.clickOnResourcesMenuButton();
		resourcesPage.clickOnManageCatalogueSubscriptionsMenuButton();
		Thread.sleep(5000);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("My Subscriptions"));
	}
	
	@Test(priority = 11)
	public void verifyCatalogueRoadmapPageFromResourcesMenu() throws Throwable {
		resourcesPage.clickOnResourcesMenuButton();
		resourcesPage.clickOnCatalogueRoadmapMenuButton();
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		Thread.sleep(5000);
		boolean actualResultRD = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		Assert.assertTrue(actualResultRD);
		
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Industry Solutions Portfolio - Offer Roadmap"));
	}
	
	@Test(priority = 12)
	public void verifySolutionTruthPageFromResourcesMenu() throws Throwable {
		resourcesPage.clickOnResourcesMenuButton();
		resourcesPage.clickOnSolutionTruthMenuButton();
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Solution Truth"));
	}
	@Test(priority = 13)
	public void verifyISSolutionsPlaybookPageFromResourcesMenu() throws Throwable {
		
		driver.get(prop.getProperty("produrl"));
		resourcesPage.clickOnResourcesMenuButton();
		resourcesPage.clickOnISSolutionsPlaybookMenuButton();
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		driver.close();
		Thread.sleep(5000);
		driver.switchTo().window(mainTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Overview - Microsoft Solutions Playbook"));
		Thread.sleep(3000);
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}