
package portfolio_test.user;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Set;
import javax.swing.text.Utilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.CampaignsPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import resources.TestBase;

public class TC07_BrokenLinkChecker extends TestBase {
	LoginPage loginPage;
	Utilities util;
	public static Logger log = LogManager.getLogger(TestBase.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized");

		driver.get(prop.getProperty("ManagedIP"));
		util = new Utilities();
		loginPage = new LoginPage(driver);
	}
	@Test(priority = 22, enabled = true)
	public void testBrokenLinks() throws IOException, InterruptedException {
		
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
				
				System.out.println("Broken Link: |" + url + " | Response Code: |" + responseCode);

			} else {
				System.out.println("Working Link: |" + url + " | Response Code: |" + responseCode);

			}
			Thread.sleep(2000);
		}
	}
}