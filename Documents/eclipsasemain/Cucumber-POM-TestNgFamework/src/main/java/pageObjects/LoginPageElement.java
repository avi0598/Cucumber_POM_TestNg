package pageObjects;

public interface LoginPageElement {
	
	  	 String LogInButtonText="//span[contains(text(),'Log In')]";

	 String LoginText= "//div[@class='ui fluid large blue submit button']"; 
	  public String emailAddress= "//input[@placeholder='Email']";
	 String passwordField= "//input[@placeholder='Password']";

}
