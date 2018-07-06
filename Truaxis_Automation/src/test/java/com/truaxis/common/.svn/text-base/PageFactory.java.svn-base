package com.truaxis.common;

import org.openqa.selenium.WebDriver;

import com.truaxis.reporting.pageobjects.CouponRewardsPage;
import com.truaxis.reporting.pageobjects.EmailSettingsPage;
import com.truaxis.reporting.pageobjects.EmailStatementCreditPage;
import com.truaxis.reporting.pageobjects.PrepaidGiftCardPage;
import com.truaxis.reporting.pageobjects.RDHomePage;
import com.truaxis.reporting.pageobjects.RDLoginPage;
import com.truaxis.reporting.pageobjects.StatementCreditPage;
import com.truaxis.reporting.pageobjects.TagCampaignMappingPage;
import com.truaxis.reporting.pageobjects.WeeklyStatementCreditPerformancePage;


public class PageFactory {
	
	private WebDriver webDriver;
	
	public PageFactory(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
	public RDLoginPage rdLoginPage() {
		return new RDLoginPage(webDriver,this);
	}
	
	public RDHomePage rdHomePage() {
		return new RDHomePage(webDriver,this);
	}
	
	public EmailStatementCreditPage emailStatemetmentpage() {
		return new EmailStatementCreditPage(webDriver,this);
	}
	
	public StatementCreditPage statementCreditPage() {
		return new StatementCreditPage(webDriver,this);
	}
	
	public CouponRewardsPage couponRewardsPage() {
		return new CouponRewardsPage(webDriver,this);
	}
	
	public PrepaidGiftCardPage prepaidGiftCardPage() {
		return new PrepaidGiftCardPage(webDriver,this);
	}
	
	public WeeklyStatementCreditPerformancePage weeklyStatementCreditPerformancePage() {
		return new WeeklyStatementCreditPerformancePage(webDriver,this);
	
	}
	
	public EmailSettingsPage  emailSettingsPage () {
		return new EmailSettingsPage (webDriver,this);
	
	}
	
	public TagCampaignMappingPage  tagCampaignMappingPage () {
		return new TagCampaignMappingPage (webDriver,this);
	
	}	
	
}

