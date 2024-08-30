package pageEvents;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import pageObjects.HomePageElements;
import pageObjects.LoginPageElement;
import utils.ElementFetch;


public class LoginPageEvents {
	ElementFetch ele= new ElementFetch();
	public void verifyIfLoginPageIsLoaded() throws InterruptedException {
		
	ele.getWebElement("XPATH", HomePageElements.LogInButtonText).click();
	Thread.sleep(100);
	{
	Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElement.LoginText).size()>0,"not found");
	}
	System.out.println(" login page is loaded");
}
	public void enterCredentials()
	{
		
		ele.getWebElement("XPATH", LoginPageElement.LogInButtonText).click();

 
	ele.getWebElement("XPATH", LoginPageElement.emailAddress).sendKeys("rmishra@gmail.com");
	System.out.println("email entered");
	ele.getWebElement("XPATH", LoginPageElement.passwordField).sendKeys("12345");
	System.out.println("password entered");

 }}
