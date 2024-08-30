package pageEvents;

import pageObjects.HomePageElements;
import pageObjects.LoginPageElement;
import utils.ElementFetch;

public class HomePageEvents {
	
 
  	ElementFetch ele = new ElementFetch();
	
	public   void  userIsOnLoginPage()  {
		
	
	
	if(ele.getWebElement("XPATH", LoginPageElement.LogInButtonText).isDisplayed())
	{
		System.out.println(" user is on  loginpage");
	}
	else{
		System.out.println("  loginpage not loaded");
	}
	}
	public void signInButton() {
		ele.getWebElement("XPATH", HomePageElements.LogInButtonText).click();
	}
	

}
