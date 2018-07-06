package com.truaxis.reporting.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.truaxis.common.BaseTest;
import com.truaxis.reporting.pageobjects.EmailSettingsPage;

public class Scenario7Test extends BaseTest {

	private Map<String, String> td = getTestDataProperties();

	private com.truaxis.reporting.pageobjects.EmailSettingsPage emailSettingsPage;

	@BeforeClass
	public void setUpOnce1() {
		emailSettingsPage = getPageFactory().emailSettingsPage();
		emailSettingsPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickEmailSettingsPageSubMenu();
	}
	
	@Test
	public void testRD_7_1() {
		boolean actual = emailSettingsPage.verifyEmailSettingsHeaderText(td.get("email_settings_page_header"));
		Assert.assertEquals(actual,true,"Reporting: Email Setting page,is not displayed on Email Settings page");
	}
	
	@Test
	public void testRD_7_2() {
		boolean actual = emailSettingsPage.verifyLabelAndDropDown(td.get("email_settings_page_label"));
		Assert.assertEquals(actual,true,"Please select merchant label is not displayed on Email Settings page");
	}
	
	@Test
	public void testRD_7_3() {
		boolean actual = emailSettingsPage.verifyTextFieldAndButton(td.get("email_settings_page_report_label"));
		Assert.assertEquals(actual,true,"Text field and Button are not displayed");
	}

	@Test
	public void testRD_7_4() {
		boolean actual = emailSettingsPage.verifyNameErrorMessage(td.get("email_settings_page_name_error_message"));
		Assert.assertEquals(actual,true,"Please select a nick name error message is not displayed");
	}
	
	@Test
	public void testRD_7_5() {
		boolean actual = emailSettingsPage.verifyEmailErrorMessage(td.get("email_settings_page_email_error_message"));
		Assert.assertEquals(actual,true,"Please enter a valid email Id error message is not displayed");
	}

	@Test
	public void testRD_7_6() {
		boolean actual = emailSettingsPage.verifyRecipientAdded(td.get("email_settings_page_report_header_label"));
		Assert.assertEquals(actual,true,"Please enter a valid email Id error message is not displayed");
	}	
	
	@Test
	public void testRD_7_7() {
		boolean actual = emailSettingsPage.verifyRecipientRemove(td.get("email_settings_page_report_header_label"));
		Assert.assertEquals(actual,true,"Deletion of entry is not successfull.");
	}

}