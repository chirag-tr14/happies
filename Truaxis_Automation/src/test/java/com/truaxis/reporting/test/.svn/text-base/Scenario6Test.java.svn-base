package com.truaxis.reporting.test;

import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.core.reports.TestNGCustomReporter;
import com.truaxis.common.BaseTest;

import com.truaxis.reporting.pageobjects.WeeklyStatementCreditPerformancePage;

public class Scenario6Test extends BaseTest {

	private Map<String, String> td = getTestDataProperties();

	private WeeklyStatementCreditPerformancePage weeklyStatementCreditPerformancePage;

	@BeforeMethod
	public void setUpOnce1() {
		weeklyStatementCreditPerformancePage = getPageFactory().weeklyStatementCreditPerformancePage();
		weeklyStatementCreditPerformancePage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password"))
		.clickWeeklyStatementCreditPerformanceSubMenu();
	}

	@Test()
	public void testRD_6_1() {
		boolean actual = weeklyStatementCreditPerformancePage
				.verifyWeeklyStatementCreditPerformancePageHeaderText(td.get("weeklystatementcredit_header"));
		Assert.assertEquals(actual,true,
				"Reporting: Weekly Statement Credit Performance,is not displayed on Weekly Statement Credit Performance");
	}

	@Test()
	public void testRD_6_2() {
		boolean actual = weeklyStatementCreditPerformancePage.
				verifyExportLabelsAndButtons(td.get("common_exports_text"), td.get("common_exports_button"));
		Assert.assertEquals(actual,true,"Export,PDF,Excel,CSV labels,are not displayed on Weekly Statement Credit Performance");
	}

	@Test()
	public void testRD_6_3() {
		boolean actual = weeklyStatementCreditPerformancePage.verifyMerchantFilterBlock(td.get("merchant_text"));
		Assert.assertEquals(actual,true,"Merchant Filter Block,is not displayed on Weekly Statement Credit Performance");
	}
	
	@Test()
	public void testRD_6_4() {
		boolean actual = weeklyStatementCreditPerformancePage.verifyMerchantFilterDropDownLabels(td.get("merchant_filters"));
		Assert.assertEquals(actual,true,"Merchant Filter DropDown Labels,is not displayed on Weekly Statement Credit Performance");
	}

	@Test()
	public void testRD_6_5() {
		boolean actual = weeklyStatementCreditPerformancePage.verifyDurationFilterBlock(td.get("duration_text"));
		Assert.assertEquals(actual,true,"Duration Filter Block,is not displayed on Weekly Statement Credit Performance");
	}

	@Test()
	public void testRD_6_6() {
		boolean actual = weeklyStatementCreditPerformancePage
				.verifyUpdatedFilterButtonAppearance(td.get("updated_filters"),td.get("button_color"));
		Assert.assertEquals(actual,true,"Updated Filter Button,is not displayed on Weekly Statement Credit Performance");
	}

	@Test()
	public void testRD_6_7() {
		boolean actual = weeklyStatementCreditPerformancePage.verifyShowExtraFiltersLink(td.get("show_exta_filters"));
		Assert.assertEquals(actual,true,"Show Extra Filters Link,is not displayed on Weekly Statement Credit Performance");
	}
	
	@Test()
	public void testRD_6_8() {
		boolean actual=weeklyStatementCreditPerformancePage.selectMerchantdropdown(td.get("merchantvalue"));
		Assert.assertEquals(actual,true,"Merchant Filter DropDown  item ,is not Selected on Statement Credit page");
	}
	
	@Test
	public void testRD_6_9()
	{
		boolean actual=weeklyStatementCreditPerformancePage.verifythedurationDropdownfunctionality(td.get("Yearly"));
		Assert.assertTrue(actual,
		 		"Failed After selecting Duration (yearly) dropdown on statement credit Page,  " + "Either because of " +
		 				"1.Year Dropdown is not displyed 2.Data on dropdown is not in a proper format");
	}
	
	@Test
	public void testRD_6_10()
	{
		boolean actual=weeklyStatementCreditPerformancePage.verifythedurationDropdownfunctionality(td.get("Monthly"));
		Assert.assertTrue(actual,
		 		"After selecting Duration (Monthly) dropdown on statement credit Page, Either " +
		 		"1.Monthly dropdown is missing 2.data on dropdown is not in a proper format");
	}
	
	@Test
	public void testRD_6_11()
	{
		boolean actual=weeklyStatementCreditPerformancePage.verifythedurationDropdownfunctionality(td.get("Weekly"));
		Assert.assertTrue(actual,
				 "After selecting Duration (Weekly) dropdown on statement credit Page, Either " +
				 "1.Weekly dropdown is missing 2.data on dropdown is not in a proper format");
	}
	
	@Test
	public void testRD_6_12()
	{
		boolean actual=weeklyStatementCreditPerformancePage.verifythedurationDropdownfunctionality(td.get("Custom"));
		Assert.assertTrue(actual,
				 "After selecting Duration (Custom) dropdown on statement credit Page, Either " +
				 "1.Custom dropdown is missing 2.Start and End calendar is not visible");
	}
	
	@Test
	public void testRD_6_13()
	{
		boolean actual1=weeklyStatementCreditPerformancePage.verifythedurationDropdownfunctionality(td.get("Custom"));
		boolean actual2=weeklyStatementCreditPerformancePage.verifytheCalendarFunctionality("apply");
		Assert.assertTrue(actual1&&actual2,
				"Failed either 1.Calender is not displaying properly 2.Selected date is not higlighting on text field" );
	}
	
	@Test
	public void testRD_6_14()
	{
		weeklyStatementCreditPerformancePage.verifythedurationDropdownfunctionality(td.get("Custom"));
		boolean actual=weeklyStatementCreditPerformancePage.verifytheCalendarFunctionality("Cancel");
		Assert.assertTrue(actual,"Failed either 1.Calender is not displaying properly 2.Selected date is higlighting on text field" );
	}
	
	@Test
	public void testRD_6_15()
	{
		weeklyStatementCreditPerformancePage.displayCampaignNamesWithValuesForYearly();
	}
	
	@Test
	public void testRD_6_16()
	{
		weeklyStatementCreditPerformancePage.displayCampaignNamesWithValuesForMonthly(td.get("Monthly"), td.get("Month_data"));
	}
	
	@Test
	public void testRD_6_17()
	{
		weeklyStatementCreditPerformancePage.displayCampaignNamesWithValuesForWeekly(td.get("Weekly"), td.get("Week_data"));
	}
	
	@Test
	public void testRD_6_18()
	{
		boolean actual=weeklyStatementCreditPerformancePage.verifyDataDisplayedForCustomDuration(td.get("Custom"),td.get("date"));
		Assert.assertTrue(actual,"Failed either 1.Custom is not selected 2.Data not displayed for custom date" );
	}
	
	@Test
	public void testRD_6_19()
	{
		boolean actual=weeklyStatementCreditPerformancePage.verifyDataNotDisplayedForCustomDuration(td.get("Custom"));
		Assert.assertTrue(actual,"Failed either 1.Custom is not selected 2.Data displayed for not selecting custom date" );
	}
	
	@Test
	public void testRD_6_20()
	{
		boolean actual=weeklyStatementCreditPerformancePage.verifyColumnNames(td.get("column_names"));
		Assert.assertEquals(actual, true, "All Columns are not present" );
	}
	
	@Test
	public void testRD_6_21()
	{
		boolean actual=weeklyStatementCreditPerformancePage.verifyWeekendColumnForEmpty();
		Assert.assertEquals(actual, true, "Weekend column is having empty value" );
	}
	
	@Test
	public void testRD_6_22()
	{
		boolean actual=weeklyStatementCreditPerformancePage.verifyImpressionsColumnForEmpty();
		Assert.assertEquals(actual, true, "Impressions column is having empty value" );
	}
	
	@Test
	public void testRD_6_23()
	{
		boolean actual=weeklyStatementCreditPerformancePage.verifyActivationsColumnForEmpty();
		Assert.assertEquals(actual, true, "Activations column is having empty value" );
	}
	
	@Test
	public void testRD_6_24()
	{
		boolean actual=weeklyStatementCreditPerformancePage.verifyRedemptionsColumnForEmpty();
		Assert.assertEquals(actual, true, "Redemptions column is having empty value" );
	}
	
	@Test
	public void testRD_6_25()
	{
		boolean actual=weeklyStatementCreditPerformancePage.verifyTotalSpendColumnForEmpty();
		Assert.assertEquals(actual, true, "Total Spend column is having empty value" );
	}
	
	@Test
	public void testRD_6_26()
	{
		boolean actual=weeklyStatementCreditPerformancePage.verifyTotalCashbackColumnForEmpty();
		Assert.assertEquals(actual, true, "Total Cashback column is having empty value" );
	}
	
	@Test
	public void testRD_6_27()
	{
		boolean actual=weeklyStatementCreditPerformancePage.verifyRedemptionRateColumnForEmpty();
		Assert.assertEquals(actual, true, "Redemption Rate column is having empty value" );
	}
	
	@Test
	public void testRD_6_28()
	{
		boolean actual=weeklyStatementCreditPerformancePage.verifyAvgSpendColumnForEmpty();
		Assert.assertEquals(actual, true, "Avg Spend column is having empty value" );
	}
	
	@Test
	public void testRD_6_29()
	{
		boolean actual=weeklyStatementCreditPerformancePage.verifyCommissionColumnForEmpty();
		Assert.assertEquals(actual, true, "Commission column is having empty value" );
	}
	
	@Test
	public void testRD_6_30()
	{
		boolean actual=weeklyStatementCreditPerformancePage.verifyRoasColumnForEmpty();
		Assert.assertEquals(actual, true, "ROAS column is having empty value" );
	}
	
	@Test
	public void testRD_6_31()
	{
		boolean actual=weeklyStatementCreditPerformancePage
				.verifyShowMoreFiltersLabels(td.get("platform_label"), td.get("financial_institute_label"), td.get("show_label"));
		Assert.assertEquals(actual, true, "Filters labels are not present" );
	}
	
	@Test
	public void testRD_6_32() throws InterruptedException
	{
		boolean actual=weeklyStatementCreditPerformancePage.verifyHideExtraFilters(td.get("show_exta_filters"));
		Assert.assertEquals(actual, true, "Platform, FI and Show filters are still present" );
	}
	
	@Test
	public void testRD_6_33() throws InterruptedException
	{
		boolean actual=weeklyStatementCreditPerformancePage.verifyPlatformFilterDropdown(td.get("platform_default"));
		Assert.assertEquals(actual, true, "Platform filter dropdown is not present" );
	}
	
	@Test
	public void testRD_6_34()
	{
		boolean actual=weeklyStatementCreditPerformancePage.verifyFinancialInstituteFilterDropdown(td.get("financial_institute_default"));
		Assert.assertEquals(actual, true, "Financial Institute filter dropdown is not present" );
	}
	
	@Test
	public void testRD_6_35()
	{
		boolean actual=weeklyStatementCreditPerformancePage.verifyShowFilterDropdown(td.get("show_default"));
		Assert.assertEquals(actual, true, "Show filter dropdown is not present" );
	}
		
	@Test
	public void testRD_6_36()
	{
		boolean actual=weeklyStatementCreditPerformancePage
				.verifyWeeklyStatementTableHeaders(td.get("merchantname"),td.get("merchant_bodyshop"));
		Assert.assertEquals(actual, true, "Statement Credit Report for merchant is not found" );
	}
	
	@Test
	public void testRD_6_37()
	{
		List<String> adminColumn = weeklyStatementCreditPerformancePage.adminTableColumnNames();
		weeklyStatementCreditPerformancePage.closeBrowserOfAdmin();
		initWebDriver();
		weeklyStatementCreditPerformancePage = getPageFactory().weeklyStatementCreditPerformancePage();
		weeklyStatementCreditPerformancePage.openRdLoginpage().goToHomePage(td.get("merchant_email"), td.get("merchnat_password"))
		.clickWeeklyStatementCreditPerformanceSubMenu();
		List<String> merchantColumn =weeklyStatementCreditPerformancePage.merchantTableColumnNames(td.get("Yearly"));
		boolean actual=adminColumn.equals(merchantColumn);
		Assert.assertEquals(actual, true, "Column names of admin and merchant is not matching" );
	}
		
	@Test
	public void testRD_6_38()
	{
		List<String> adminData = weeklyStatementCreditPerformancePage
				.adminTableElementsForYearly(td.get("merchant_bodyshop"),td.get("Yearly"),td.get("Year_data"));
		weeklyStatementCreditPerformancePage.closeBrowserOfAdmin();
		initWebDriver();
		weeklyStatementCreditPerformancePage = getPageFactory().weeklyStatementCreditPerformancePage();
		weeklyStatementCreditPerformancePage.openRdLoginpage().goToHomePage(td.get("merchant_email"), td.get("merchnat_password"))
		.clickWeeklyStatementCreditPerformanceSubMenu();
		List<String> merchantData =weeklyStatementCreditPerformancePage
				.merchantTableElementsForYearly(td.get("Yearly"),td.get("Year_data"));
		boolean actual=adminData.equals(merchantData);
		Assert.assertEquals(actual, true, "Statement Credit of Yearly Report for admin and merchant is not matching" );
	}
	
	@Test
	public void testRD_6_39()
	{
		List<String> adminData = weeklyStatementCreditPerformancePage
				.adminTableElementsForMonthly(td.get("merchant_bodyshop"),td.get("Monthly"), td.get("Month_data"));
		weeklyStatementCreditPerformancePage.closeBrowserOfAdmin();
		initWebDriver();
		weeklyStatementCreditPerformancePage = getPageFactory().weeklyStatementCreditPerformancePage();
		weeklyStatementCreditPerformancePage.openRdLoginpage().goToHomePage(td.get("merchant_email"), td.get("merchnat_password"))
		.clickWeeklyStatementCreditPerformanceSubMenu();
		List<String> merchantData =weeklyStatementCreditPerformancePage
				.merchantTableElementsForMonthly(td.get("Monthly"), td.get("Month_data"));
		boolean actual=adminData.equals(merchantData);
		Assert.assertEquals(actual, true, "Statement Credit of Monthly Report for admin and merchant is not matching" );
	}
	
	@Test
	public void testRD_6_40()
	{
		List<String> adminData = weeklyStatementCreditPerformancePage
				.adminTableElementsForWeekly(td.get("merchant_bodyshop"),td.get("Weekly"), td.get("Week_data"));
		weeklyStatementCreditPerformancePage.closeBrowserOfAdmin();
		initWebDriver();
		weeklyStatementCreditPerformancePage = getPageFactory().weeklyStatementCreditPerformancePage();
		weeklyStatementCreditPerformancePage.openRdLoginpage().goToHomePage(td.get("merchant_email"), td.get("merchnat_password"))
		.clickWeeklyStatementCreditPerformanceSubMenu();
		List<String> merchantData =weeklyStatementCreditPerformancePage
				.merchantTableElementsForWeekly(td.get("Weekly"), td.get("Week_data"));
		boolean actual=adminData.equals(merchantData);
		Assert.assertEquals(actual, true, "Statement Credit of Weekly Report for admin and merchant is not matching" );
	}
	
	@Test
	public void testRD_6_41()
	{
		List<String> adminData = weeklyStatementCreditPerformancePage
				.adminTableElementsForCustom(td.get("merchant_bodyshop"),td.get("Custom"), td.get("date"));
		weeklyStatementCreditPerformancePage.closeBrowserOfAdmin();
		initWebDriver();
		weeklyStatementCreditPerformancePage = getPageFactory().weeklyStatementCreditPerformancePage();
		weeklyStatementCreditPerformancePage.openRdLoginpage().goToHomePage(td.get("merchant_email"), td.get("merchnat_password"))
		.clickWeeklyStatementCreditPerformanceSubMenu();
		List<String> merchantData =weeklyStatementCreditPerformancePage
				.merchantTableElementsForCustom(td.get("Custom"), td.get("date"));
		boolean actual=adminData.equals(merchantData);
		Assert.assertEquals(actual, true, "Statement Credit of Custom Report for admin and merchant is not matching" );
	}
	
	@Test
	public void testRD_6_42()
	{
		List<String> adminData = weeklyStatementCreditPerformancePage
				.adminTableElementsForYearly(td.get("merchant_sears"),td.get("Yearly"),td.get("Year_data"));
		weeklyStatementCreditPerformancePage.closeBrowserOfAdmin();
		initWebDriver();
		weeklyStatementCreditPerformancePage = getPageFactory().weeklyStatementCreditPerformancePage();
		weeklyStatementCreditPerformancePage.openRdLoginpage().goToHomePage(td.get("merchant_email"), td.get("merchnat_password"))
		.clickWeeklyStatementCreditPerformanceSubMenu();
		List<String> merchantData =weeklyStatementCreditPerformancePage
				.merchantTableElementsForYearly(td.get("Yearly"),td.get("Year_data"));
		boolean actual=weeklyStatementCreditPerformancePage.verifyAdminAndMerchantValues(adminData, merchantData);
		Assert.assertEquals(actual, true, "Statement Credit of Yearly Report for admin and merchant should not match" );
	}
	
	@Test
	public void testRD_6_43()
	{
		List<String> adminData = weeklyStatementCreditPerformancePage
				.adminTableElementsForMonthly(td.get("merchant_sears"),td.get("Monthly"), td.get("Month_data"));
		weeklyStatementCreditPerformancePage.closeBrowserOfAdmin();
		initWebDriver();
		weeklyStatementCreditPerformancePage = getPageFactory().weeklyStatementCreditPerformancePage();
		weeklyStatementCreditPerformancePage.openRdLoginpage().goToHomePage(td.get("merchant_email"), td.get("merchnat_password"))
		.clickWeeklyStatementCreditPerformanceSubMenu();
		List<String> merchantData =weeklyStatementCreditPerformancePage
				.merchantTableElementsForMonthly(td.get("Monthly"), td.get("Month_data"));
		boolean actual=weeklyStatementCreditPerformancePage.verifyAdminAndMerchantValues(adminData, merchantData);
		Assert.assertEquals(actual, true, "Statement Credit of Monthly Report for admin and merchant should not match" );
	}
	
	@Test
	public void testRD_6_44()
	{
		List<String> adminData = weeklyStatementCreditPerformancePage
				.adminTableElementsForWeekly(td.get("merchant_sears"),td.get("Weekly"), td.get("Week_data"));
		weeklyStatementCreditPerformancePage.closeBrowserOfAdmin();
		initWebDriver();
		weeklyStatementCreditPerformancePage = getPageFactory().weeklyStatementCreditPerformancePage();
		weeklyStatementCreditPerformancePage.openRdLoginpage().goToHomePage(td.get("merchant_email"), td.get("merchnat_password"))
		.clickWeeklyStatementCreditPerformanceSubMenu();
		List<String> merchantData =weeklyStatementCreditPerformancePage
				.merchantTableElementsForWeekly(td.get("Weekly"), td.get("Week_data"));
		boolean actual=weeklyStatementCreditPerformancePage.verifyAdminAndMerchantValues(adminData, merchantData);
		Assert.assertEquals(actual, true, "Statement Credit of Weekly Report for admin and merchant should not match" );
	}
	
	@Test
	public void testRD_6_45()
	{
		List<String> adminData = weeklyStatementCreditPerformancePage
				.adminTableElementsForCustom(td.get("merchant_sears"),td.get("Custom"), td.get("date"));
		weeklyStatementCreditPerformancePage.closeBrowserOfAdmin();
		initWebDriver();
		weeklyStatementCreditPerformancePage = getPageFactory().weeklyStatementCreditPerformancePage();
		weeklyStatementCreditPerformancePage.openRdLoginpage().goToHomePage(td.get("merchant_email"), td.get("merchnat_password"))
		.clickWeeklyStatementCreditPerformanceSubMenu();
		List<String> merchantData =weeklyStatementCreditPerformancePage
				.merchantTableElementsForCustom(td.get("Custom"), td.get("date"));
		boolean actual=weeklyStatementCreditPerformancePage.verifyAdminAndMerchantValues(adminData, merchantData);
		Assert.assertEquals(actual, true, "Statement Credit of Weekly Report for admin and merchant should not match" );
	}
	
	@Test
	public void testRD_6_46()
	{
		weeklyStatementCreditPerformancePage.displayDataForShowMoreFilters(td.get("merchant_bodyshop"),td.get("Yearly"),
				td.get("Year_data"), td.get("Month_data_platform"), td.get("Week_data_platform"),td.get("date_platform"),
				td.get("Platform_data"), td.get("FI_data"), td.get("Show_data"));
	}
	
	@Test
	public void testRD_6_47()
	{
		weeklyStatementCreditPerformancePage.displayDataForShowMoreFilters(td.get("merchant_bodyshop"),td.get("Monthly"),
				td.get("Year_data"), td.get("Month_data_platform"), td.get("Week_data_platform"),td.get("date_platform"),
				td.get("Platform_data"), td.get("FI_data"), td.get("Show_data"));
	}
	
	@Test
	public void testRD_6_48()
	{
		weeklyStatementCreditPerformancePage.displayDataForShowMoreFilters(td.get("merchant_bodyshop"),td.get("Weekly"),
				td.get("Year_data"), td.get("Month_data_platform"), td.get("Week_data_platform"),td.get("date_platform"),
				td.get("Platform_data"), td.get("FI_data"), td.get("Show_data"));
	}
	
	@Test
	public void testRD_6_49()
	{
		weeklyStatementCreditPerformancePage.displayDataForShowMoreFilters(td.get("merchant_bodyshop"),td.get("Custom"),
				td.get("Year_data"), td.get("Month_data_platform"), td.get("Week_data_platform"),td.get("date_platform"),
				td.get("Platform_data"), td.get("FI_data"), td.get("Show_data"));
	}
	
	@Test
	public void testRD_6_50()
	{
		boolean actual = weeklyStatementCreditPerformancePage.displayNoTagsDataForShowMoreFilters(td.get("merchant_bodyshop"),
				td.get("Yearly"),td.get("Year_data"), td.get("Month_data_platform"), td.get("Week_data_platform"),td.get("date_platform"),
				td.get("Platform_data"), td.get("FI_data"), td.get("Show_data_campaigns"));
		Assert.assertEquals(actual, true, "Filter by Show for Campaigns is not working correctly for Year duration");
	}
	
	@Test
	public void testRD_6_51()
	{
		boolean actual = weeklyStatementCreditPerformancePage.displayNoTagsDataForShowMoreFilters(td.get("merchant_bodyshop"),
				td.get("Monthly"),td.get("Year_data"), td.get("Month_data_platform"), td.get("Week_data_platform"),td.get("date_platform"),
				td.get("Platform_data"), td.get("FI_data"), td.get("Show_data_campaigns"));
		Assert.assertEquals(actual, true, "Filter by Show for Campaigns is not working correctly for Month duration");
	}
	
	@Test
	public void testRD_6_52()
	{
		boolean actual = weeklyStatementCreditPerformancePage.displayNoTagsDataForShowMoreFilters(td.get("merchant_bodyshop"),
				td.get("Weekly"),td.get("Year_data"), td.get("Month_data_platform"), td.get("Week_data_platform"), td.get("date_platform"),
				td.get("Platform_data"), td.get("FI_data"), td.get("Show_data_campaigns"));
		Assert.assertEquals(actual, true, "Filter by Show for Campaigns is not working correctly for Week duration");
	}
	
	@Test
	public void testRD_6_53()
	{
		boolean actual = weeklyStatementCreditPerformancePage.displayNoTagsDataForShowMoreFilters(td.get("merchant_bodyshop"),
				td.get("Custom"),td.get("Year_data"), td.get("Month_data_platform"), td.get("Week_data_platform"),td.get("date_platform"),
				td.get("Platform_data"), td.get("FI_data"), td.get("Show_data_campaigns"));
		Assert.assertEquals(actual, true, "Filter by Show for Campaigns is not working correctly for Custom duration");
	}
}