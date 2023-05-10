package portfolio_test.user;

import java.io.IOException;

import javax.mail.MessagingException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import resources.TestBase;
import resources.Utilities;

public class TC01_UserLoginTest extends TestBase {

	public WebDriver driver;
	LoginPage loginPage;
	Utilities util;
	public static Logger log = LogManager.getLogger(TestBase.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized");

		driver.get(prop.getProperty("produrl"));
		util = new Utilities();
		loginPage = new LoginPage(driver);
	}

	@Test(priority = 1)
	public void loginPageTitleTest() throws MessagingException, InterruptedException {
		
		//loginPage.enterLoginID("v-spednekar@microsoft.com");
	//	loginPage.clickOnProductInnovationDevelopmentServicesLink();
		Thread.sleep(3000);
		Assert.assertEquals(loginPage.getLoginPageTitle(), "IS Catalogue");
		
		log.info("Successfully logged into IS Catalogue");
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
