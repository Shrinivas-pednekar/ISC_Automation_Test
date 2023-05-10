package resources;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Utilities {

	public Select select;
	public Actions actions;

	//To Select a value from Drop Down by using SelectByVisibleText Method.
	public void selectValueFromDropDownByText(WebElement element, String value) 
	{
		select = new Select(element);
		select.selectByVisibleText(value);
	}

	//To Select a value from Drop Down by using SelectByIndex Method.
	public void selectValueFromDropDownByIndex(WebElement element, int value) 
	{
		select = new Select(element);
		select.selectByIndex(value - 1);
	}

	//To Select a value from Drop Down by using SelectByValue Method.
	public void selectValueFromDropDownByValue(WebElement element, String value) 
	{
		select = new Select(element);
		select.selectByValue(value);
	}

	//To get Selected value from Drop Down by using FirstSelectedOption Method.
	public String getSelectedOption(WebElement element) 
	{
		select = new Select(element);
		return select.getFirstSelectedOption().getText();
	}

	//To get number of options in Drop Down by using getOptions Method.
	public int getDropdownSize(WebElement element) 
	{
		select = new Select(element);
		return select.getOptions().size();
	}
	
	//To get All Selected values from Drop Down by using AllSelectedOptions Method.
	public List<String> getAllSelectedOptions(WebElement element) 
	{
		select = new Select(element);
		List<WebElement> allSelectedElements = select.getAllSelectedOptions();
		List<String> allSelectedOptions = new ArrayList();
		
		for(WebElement e : allSelectedElements) {
			String text = e.getText();
			allSelectedOptions.add(text);
		}
		return allSelectedOptions;
	}
	
	// Iterating through the list and selecting the desired option
	public void selectValueFromDropDown(List<WebElement> dropdown_list, String value) {
		for(int j = 0; j < dropdown_list.size(); j++){
			System.out.println(dropdown_list.get(j).getText());
			if(dropdown_list.get(j).getText().contains(value)){
				dropdown_list.get(j).click();
				break;
			}
		}
	}

	//To perform Double Click action using Actions Class.
	public void doubleClick(WebDriver driver, WebElement element) 
	{
		actions = new Actions(driver);
		actions.doubleClick(element).build().perform();
	}

	//To Click on Element using Actions Class.
	public void clickOnElementUsingActions(WebDriver driver, WebElement element) 
	{
		actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
	}

	//To Mouse Hover and Click or Select an Element using Actions Class.
	public void moveToElement(WebDriver driver, WebElement element) 
	{
		actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}
	
	//Explicit Wait for All Elements To Be Visible.
	public void waitForAllElementsToBeVisible(WebDriver driver, List<WebElement> elementsList, Duration timeout)
	{
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.visibilityOfAllElements(elementsList));
	}

	//Explicit Wait for All Elements To Be Invisible.
	public void waitForAllElementsToBeInvisible(WebDriver driver, List<WebElement> elementsList, Duration timeout)
	{
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.invisibilityOfAllElements(elementsList));
	}

	//Explicit Wait for Element To Be Invisible.
	public void waitForElementToBeInvisible(WebDriver driver, WebElement element, Duration timeout)
	{
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.invisibilityOf(element));
	}

	//Explicit Wait for Element To Be Visible.
	public void waitForElementToBeVisible(WebDriver driver, WebElement element )
	{
		new WebDriverWait(driver, null).
		until(ExpectedConditions.visibilityOf(element));
	}

	//Explicit Wait for Refreshed Element To Be Visible.
	public void waitForRefreshedElementToBeVisible(WebDriver driver, WebElement element, Duration timeout)
	{
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
	}

	//To get current date and time
	public String getDate() {
		// Create object of SimpleDateFormat class and decide the format
		DateFormat dateFormat = new SimpleDateFormat("ddMM_HHmm");
		//get current date time with Date()
		Date date = new Date();
		// Now format the date
		String currentdate = dateFormat.format(date);
		return currentdate;
	}
	
	//To scroll 500 pixels vertical
	public void scrollDownForElementToBeVisible(WebDriver driver,WebElement element, int timeout)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)","");
	}
	
	//To scroll to bottom of webpage
	public void scrollDownToBottom(WebDriver driver, WebElement element, int timeout)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	public void sendEmail(String emailTo) throws MessagingException {
	        
		final String username = "shrinivas_pednekar@persistent.com";
	    final String password = "Password";

	    Properties props = new Properties();
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.smtp.host", "smtp-mail.outlook.com");
	    props.put("mail.smtp.port", "587");
	   // props.put("mail.smtp.starttls.method", "STARTTLS");
	    

	    Session session = Session.getInstance(props,
	            new javax.mail.Authenticator() {
	                protected PasswordAuthentication getPasswordAuthentication() {
	                    return new PasswordAuthentication(username, password);
	                }
	            });

	    try {
	        Message message = new MimeMessage(session);
	        message.setFrom(new InternetAddress(username));
	        message.setRecipients(Message.RecipientType.TO,
	                InternetAddress.parse(emailTo));
	        message.setSubject("Extent Report for Test Execution");
	        
	        // Create a multipart message for the body and attachment
	        Multipart multipart = new MimeMultipart();
	        
	        // Create HTML body part of email
	        MimeBodyPart messageBodyPart = new MimeBodyPart();
	        messageBodyPart.setContent("<p>Dear User,</p><p>Please find the attached extent report for the test execution.</p>", "text/html");
	        multipart.addBodyPart(messageBodyPart);
	        
	        // Create extent report attachment
	        MimeBodyPart extentReportPart = new MimeBodyPart();
	        String reportFilePath = "C:\\Users\\v-spednekar\\eclipse-workspace\\ISCatalogue_Automation.html"; // Replace with actual report file path
	        DataSource source = new FileDataSource(reportFilePath);
	        extentReportPart.setDataHandler(new DataHandler(source));
	        extentReportPart.setFileName(source.getName());
	        multipart.addBodyPart(extentReportPart);
	        
	        // Add the multipart message parts to the message
	        message.setContent(multipart);
	        
	        // Send the email
	        Transport.send(message);

	        System.out.println("Email with extent report sent successfully!");

	    } catch (MessagingException e) {
	        throw new RuntimeException(e);
	    }
}}
