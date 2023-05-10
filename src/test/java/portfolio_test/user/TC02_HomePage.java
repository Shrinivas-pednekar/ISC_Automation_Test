
package portfolio_test.user;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import javax.swing.text.Utilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import resources.TestBase;

public class TC02_HomePage extends TestBase {
	public WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;

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
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}

	@Test(priority = 1)
	public void verifyHomepage() {

		Assert.assertTrue(driver.getCurrentUrl().contains("Home"));
		log.info("Home page displayed");
	}

	@Test(priority = 2)
	public void verifyCatalogueNavigatorOnHomepage() throws Throwable {
		Thread.sleep(5000);
		homePage.clickOnArchView();
		Thread.sleep(5000);
		Assert.assertTrue(homePage.isDisplayedfilteredLinkButton());
		log.info("Catalogue Navigator displayed");
	}

	@Test(priority = 3)
	public void verifyCustomerEvidenceSectionOnHomepage() throws Throwable {

		homePage.clickOnISView();
		Thread.sleep(5000);
		Assert.assertTrue(homePage.isDisplayedCustomerEvidenceSearchButton());
	}

	@Test(priority = 4)
	public void verifyViewCampaignPageOnHomepage() throws Throwable {

		homePage.clickOnViewCampaignPage();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Top ACR and DV Generators"));
		driver.close();
		driver.switchTo().window(mainTab);
		Thread.sleep(5000);
	}

	@Test(priority = 5)
	public void verifyCloudTransitionServicesPageOnHomepage() throws Throwable {

		homePage.clickOnCloudTransitionServicesLink();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Cloud Transition Services"));
		driver.close();
		driver.switchTo().window(mainTab);
		Thread.sleep(5000);
	}

	@Test(priority = 6)
	public void VerifyCloudManagementOperationsPageOnHomepage() throws Throwable {
		homePage.clickOnCloudManagementOperationsLink();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Cloud Management and Operations"));
		driver.close();
		driver.switchTo().window(mainTab);
		Thread.sleep(5000);
	}

	@Test(priority = 7)
	public void VerifyDataStrategyPageOnHomepage() throws Throwable {
		homePage.clickOnDataStrategyLink();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Data Strategy"));
		driver.close();
		driver.switchTo().window(mainTab);
		Thread.sleep(5000);
	}

	@Test(priority = 8)
	public void VerifyViewalltopoffersPageOnHomepage() throws Throwable {
		homePage.clickOnViewalltopoffersLink();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Top ACR and DV Generators"));
		driver.close();
		driver.switchTo().window(mainTab);
		Thread.sleep(5000);
	}

	@Test(priority = 9)
	public void VerifyCustomerEvidenceSearchPageFromHomepage() throws Throwable {
		homePage.clickOnCustomerEvidenceSearchButton();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Customer Evidence Search"));
		homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible();
		boolean actualResult = homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		System.out.println("Actual Result - " + actualResult);
		Assert.assertTrue(actualResult);
		driver.close();
		driver.switchTo().window(mainTab);

	}
	
	@Test(priority = 10)
	public void VerifyEurekaPageFromHomepage() throws Throwable {
		homePage.clickOnEurekaButton();
		Thread.sleep(5000);
		Set<String> allTabs = homePage.getWindowHandles();
		String mainTab = driver.getWindowHandle();
		allTabs.remove(mainTab);
		String newTab = allTabs.iterator().next();
		driver.switchTo().window(newTab);
		System.out.println("New Tab URL - " + driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Eureka - Home"));
		/*
		 * homePage.CustomerEvidenceSearchResultwaitForElementToBeVisible(); boolean
		 * actualResult =
		 * homePage.getCustomerEvidenceSearchResults().getText().contains("Result(s)");
		 * System.out.println("Actual Result - " + actualResult);
		 * Assert.assertTrue(actualResult);
		 */
		driver.close();
		driver.switchTo().window(mainTab);

	}
	
	@Test(priority = 11, enabled = false)
	public void testBrokenLinks() throws IOException, InterruptedException {
		List<WebElement> links = driver.findElements(By.xpath("//a[contains(@href,'.')]"));
		System.out.println("Total links on the page: " + links.size());
		HttpURLConnection.setFollowRedirects(false); // disable automatic redirects
		int maxRedirects = 5;
		for (WebElement link : links) {
			//Thread.sleep(3000);
			String url = link.getAttribute("href");
			//Thread.sleep(3000);

			if (url == null || url.isEmpty()) {
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
		}
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}
}