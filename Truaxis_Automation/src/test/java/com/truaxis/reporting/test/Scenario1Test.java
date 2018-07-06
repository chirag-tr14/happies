package com.truaxis.reporting.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.truaxis.common.BaseTest;
import com.truaxis.reporting.pageobjects.RDLoginPage;

public class Scenario1Test extends BaseTest {

	private Map<String, String> td = getTestDataProperties();
	private RDLoginPage loginPage = null;

	@BeforeClass
	public void setUpOnce() {
		loginPage = getPageFactory().rdLoginPage();
	}

	@Test(priority = 1)
	public void testRD_1() {
		boolean actual = loginPage.openRdLoginpage().veirfyPageTitle(
				td.get("loginpage_title"));
		Assert.assertEquals(actual, true, " login page is not displayed");
	}

	@Test(priority = 2)
	public void testRD_2() {
		boolean actual = loginPage.openRdLoginpage()
				.goToHomePage(td.get("admin_email"), td.get("admin_password"))
				.verifyLogOutAndHelpButtons();
		Assert.assertEquals(actual, true, " Email page is not displayed");
	}

	@Test(priority = 3)
	public void testRD_3() {
		boolean actual = loginPage
				.openRdLoginpage()
				.goToHomePage(td.get("admin_email"),
						td.get("admin_password_invalid"))
				.veirfyPageTitle(td.get("loginpage_title"));
		Assert.assertEquals(actual, true, " Login page is not displayed");
	}

	@Test(priority = 4)
	public void testRD_4() {
		boolean actual = loginPage
				.openRdLoginpage()
				.goToHomePage(td.get("admin_email_invalid"),
						td.get("admin_password"))
				.veirfyPageTitle(td.get("loginpage_title"));
		Assert.assertEquals(actual, true, " login page is not displayed");
	}

	@Test(priority = 5)
	public void testRD_5() {
		boolean actual = loginPage
				.openRdLoginpage()
				.goToHomePage(td.get("admin_email_invalid"),
						td.get("admin_password_invalid"))
				.veirfyPageTitle(td.get("loginpage_title"));
		Assert.assertEquals(actual, true, " login page is not displayed");
	}

	@Test(priority = 6)
	public void testRD_6() {
		boolean actual = loginPage
				.openRdLoginpage()
				.goToHomePage(td.get("admin_email_invalid"),
						td.get("admin_password_blank"))
				.veirfyPageTitle(td.get("loginpage_title"));
		Assert.assertEquals(actual, true, " login page is not displayed");
	}

	@Test(priority = 7)
	public void testRD_7() {
		boolean actual = loginPage
				.openRdLoginpage()
				.goToHomePage(td.get("admin_email_blank"),
						td.get("admin_password"))
				.veirfyPageTitle(td.get("loginpage_title"));
		Assert.assertEquals(actual, true, " login page is not displayed");
	}

	@Test(priority = 8)
	public void testRD_8() {
		boolean actual = loginPage
				.openRdLoginpage()
				.goToHomePage(td.get("admin_email_blank"),
						td.get("admin_password_blank"))
				.veirfyPageTitle(td.get("loginpage_title"));
		Assert.assertEquals(actual, true, " login page is not displayed");
	}

	// Merchnat login

	@Test(priority = 9)
	public void testRD_9() {

		boolean actual = loginPage
				.openRdLoginpage()
				.goToHomePage(td.get("merchant_email"),
						td.get("merchnat_password"))
				.verifyLogOutAndHelpButtons();
		Assert.assertEquals(actual, true, " Email page is not displayed");

	}

	public void testRD_10() {

		boolean actual = loginPage.openRdLoginpage().veirfyPageTitle(
				td.get("loginpage_title"));
		Assert.assertEquals(actual, true, " login page is not displayed");

	}

}
