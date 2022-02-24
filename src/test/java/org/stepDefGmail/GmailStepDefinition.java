package org.stepDefGmail;

import org.helperGmail.GmailHelper;
import org.pojoGmail.GmailPojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GmailStepDefinition extends GmailHelper {

	@Given("User is in Gmail login page")
	public void user_is_in_Gmail_login_page() {
			
		launchbrowser();
		loadUrl("http://mail.google.com/mail/");
		maxBrowser();
	
	}

	@When("User enters valid email")
	public void user_enters_valid_email() {

		GmailPojoClass G=new GmailPojoClass();
		filltextbox(G.getEmailid(), "Victor.thangaraj@gmail.com");
		
	}

	@When("User clicks on Next button")
	public void user_clicks_on_Next_button() {
	
		GmailPojoClass G=new GmailPojoClass();
		btnNxt(G.getBtnNxt());
		
	}

	@When("User enters invalid password")
	public void user_enters_invalid_password() {
		
		GmailPojoClass G=new GmailPojoClass();
		filltextbox(G.getPasswd(), "gmaillogin");
	
	}

	@When("User clicks on next button")
	public void user_clicks_on_next_button() {
	
		GmailPojoClass G=new GmailPojoClass();
		btnNxt(G.getBtnNxt());
		
	}

	@Then("User should received invalid credentials error message")
	public void user_should_received_invalid_credentials_error_message() {

		driver.getTitle();
	}



	
}
