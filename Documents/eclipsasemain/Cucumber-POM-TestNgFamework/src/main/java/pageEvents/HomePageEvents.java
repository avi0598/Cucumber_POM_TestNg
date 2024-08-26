package pageEvents;

import pageObjects.HomePageElements;
import utils.ElementFetch;

public class HomePageEvents {
	ElementFetch ele = new ElementFetch();
	
	public  void  userIsOnLoginPage() {
		if(ele.getWebElement("XPATH", HomePageElements.signInButtonText).isDisplayed()) {
			System.out.println(" user is on  loginpage");
		}
		else{
			System.out.println("  loginpage not loaded");
		}
	}
	public void signInButton() {
		ele.getWebElement("XPATH", HomePageElements.signInButtonText).click(); 
	}
	

}
