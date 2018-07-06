package com.truaxis.reporting.pageobjects;

import org.openqa.selenium.WebDriver;

import com.core.config.BasicConfig.selectSite;
import com.core.maindriver.DriverScript;
import com.truaxis.common.PageBase;
import com.truaxis.common.PageFactory;
import static com.truaxis.common.GlobalStaticInfo.*;

public class RDLoginPage extends PageBase {
	private String rdURL;

	public RDLoginPage(WebDriver webDriver, PageFactory pgFactory) {
		super(webDriver, pgFactory);
	}

	public RDLoginPage openRdLoginpage() {
		rdURL = DriverScript.settings.getHomePage(selectSite.RD_HOME);
		// openBankSiteHomepage(rdURL);
		openHomepage(rdURL);
		return this;
	}
	
	public boolean veirfyPageTitle(String title) {
		boolean flag=getWebDriver().getTitle().equalsIgnoreCase(title);
		return flag;
	}
	

	public RDLoginPage enterEmail(String email) {
		enterValue(HOMEPAGE_LOGIN_USERNAME, email);
		return this;
	}

	public RDLoginPage enterPassword(String password) {
		enterValue(HOMEPAGE_LOGIN_PASSWORD, password);
		return this;
	}
	
	public RDLoginPage clickOnLoginButton(){
		clickElement(HOMEPAGE_LOGIN_LOGIN_BUTTON);
		return this;
	}
	
	public RDHomePage goToHomePage(String email,String password){
		enterEmail(email);
		enterPassword(password);
		clickOnLoginButton();
		return getPageFactory().rdHomePage();
	}

}
	

