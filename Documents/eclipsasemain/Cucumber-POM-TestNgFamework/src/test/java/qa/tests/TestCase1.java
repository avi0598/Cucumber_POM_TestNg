package qa.tests;

import org.testng.annotations.Test;

import baseTest.baseTest;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;
import utils.constants;

@Test
public class TestCase1 extends baseTest{


 

	ElementFetch ele = new ElementFetch();
	HomePageEvents homePage= new HomePageEvents();
	LoginPageEvents loginPage = new LoginPageEvents();

	@BeforeAll	
	public void intializingBrowser() throws InterruptedException {

		setupDriverr();

		baseTest.driver.manage().window().maximize();
		baseTest.driver.get(constants.url);
		Thread.sleep(5000);

	}

 	@Given("UserIsOnloginpage")
	public void UserIsOnloginpage(){
 		homePage.userIsOnLoginPage();
 
	}
 	@When("user entered username and password and click on login")
	public void user_entered_username_and_password_and_click_on_login() {
 		
		loginPage.enterCredentials();

	}
 	@Then("logginsucessfull")
	public void logginsucessfull() {
		System.out.println("login sucessful");
			
	} 
	
 	
	@AfterAll
	public void aftertest() {
System.out.println("After All");
	}


}