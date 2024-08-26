package qa.tests;

 
import java.time.Duration;

import org.testng.annotations.Test;

import baseTest.baseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;
import utils.constants;
 
 public class TestCase1 extends baseTest{
	 
	 
	
	
	ElementFetch ele = new ElementFetch();
	HomePageEvents homePage= new HomePageEvents();
	LoginPageEvents loginPage = new LoginPageEvents();

 	
public void intializingBrowser() {

	baseTest.driver.manage().window().maximize();
	baseTest.driver.get(constants.url);
	baseTest.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	
}
 
	
 
 @Test(priority=1) 
@Given("user is on loginpage")
 public void user_is_on_loginpage() throws InterruptedException {
	 intializingBrowser();
	loginPage.verifyIfLoginPageIsLoaded();
 
	//loginPage.enterCredentials();
 }
 @Test(priority=2) 
 @When("user entered username and password and click on login")
public void user_entered_username_and_password_and_click_on_login() {
	loginPage.enterCredentials(); 

}
 @Test(priority=3) 
 @Then("logginsucessfull")
public void logginsucessfull() {
	System.out.println("login sucessful");
} 

//
//@Test
//public void sampleMethodForEnteringCredentials() {
//	
//homePage.signInButton();
//loginPage.verifyIfLoginPageIsLoaded(); 
//loginPage.enterCredentials();
//}
}