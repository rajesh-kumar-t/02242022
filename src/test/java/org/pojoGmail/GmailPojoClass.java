package org.pojoGmail;

import org.helperGmail.GmailHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailPojoClass extends GmailHelper {
	
	public GmailPojoClass() {
	
		PageFactory.initElements(driver, this);
				
	}
	
	@FindBy(name="identifier")
	private WebElement emailid;
	
	@FindBy(id="password")
	private WebElement passwd;

	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getPasswd() {
		return passwd;
	}
	
	@FindBy(className = "VfPpkd-vQzf8d")
	private WebElement btnNxt;

	public WebElement getBtnNxt() {
		return btnNxt;
	}
	
	

}
