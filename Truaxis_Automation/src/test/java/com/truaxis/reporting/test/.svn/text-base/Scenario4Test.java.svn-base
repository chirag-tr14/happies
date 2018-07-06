package com.truaxis.reporting.test;


import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.core.util.Utility;
import com.truaxis.common.BaseTest;
import com.truaxis.reporting.pageobjects.PrepaidGiftCardPage;
import com.truaxis.reporting.valueobjects.CampaignPerformanceVO;

public class Scenario4Test extends BaseTest
{

	private Map<String, String> td = getTestDataProperties();
	List<CampaignPerformanceVO> merchantNamesonAdminPage=null;
	List<CampaignPerformanceVO> merchantNamesonMerchantPage=null;

	private PrepaidGiftCardPage prepaidGiftCardPage;


	@BeforeClass
	public void setUpOnce1() {
		prepaidGiftCardPage = getPageFactory().prepaidGiftCardPage();
		prepaidGiftCardPage.openRdLoginpage()
				.goToHomePage(td.get("admin_email"), td.get("admin_password"))
				.clickPrepaidGiftCardsSubMenu();
	}

	@Test()
	public void testRD_4_1() {
		boolean actual = prepaidGiftCardPage.verifyHeaderText(td
				.get("prepaid_gift_header"));
		Assert.assertEquals(
				actual,
				true,
				"Reporting: Prepaid Gift Card Page,is not displayed on Prepaid Gift Cards Page");
	}

	
	@Test()
	public void testRD_4_2() {
		boolean actual = prepaidGiftCardPage.verifyExportLabelsAndButtons(
				td.get("common_exports_text"), td.get("common_exports_button"));
		Assert.assertEquals(
				actual,
				true,
				"Export,PDF,Exel,CSV labels,are not displayed on Prepaid Gift Cards Page");
	}

	@Test()
	public void testRD_4_3() {
		boolean actual = prepaidGiftCardPage.verifyMerchantFilterBlock(td
				.get("merchant_text"));
		Assert.assertEquals(
				actual,
				true,
				"Merchant Filter Block,is not displayed on Prepaid Gift Cards Page");
	}

	@Test()
	public void testRD_4_4() {
		boolean actual = prepaidGiftCardPage.verifyDurationFilterBlock(td
				.get("duration_text"));
		Assert.assertEquals(
				actual,
				true,
				"Duration Filter Block,is not displayed on Prepaid Gift Cards Page");
	}

	@Test()
	public void testRD_4_5() {
		boolean actual = prepaidGiftCardPage
				.verifyUpdatedFilterButtonAppearance(td.get("updated_filters"),
						td.get("button_color"));
		Assert.assertEquals(
				actual,
				true,
				"Updated Filter Button,is not displayed on Prepaid Gift Cards Page");
	}

	@Test()
	public void testRD_4_6() {
		boolean actual = prepaidGiftCardPage.verifyShowExtraFiltersLink(td
				.get("show_exta_filters"));
		Assert.assertEquals(
				actual,
				true,
				"Show Extra Filters Link,is not displayed on Prepaid Gift Cards Page");
	}

	@Test()
	public void testRD_4_7() {
		boolean actual = prepaidGiftCardPage
				.verifyMerchantFilterDropDownLabels(td.get("merchant_filters"));
		Assert.assertEquals(
				actual,
				true,
				"Merchant Filter DropDown Labels,is not displayed on Prepaid Gift Cards Page");
	}
	
	@Test(priority=8)
	public void testRD_4_8()
	{
		
		boolean actual=prepaidGiftCardPage.verifythedurationDropdownfunctionality(td.get("Yearly"));
		Assert.assertTrue(actual, "Failed After selecting Duration (yearly) dropdown on Prepaid gift card page,  Either becuase of 1.Year Dropdown is not displyed 2.Data on dropdown is not in a proper format");
		
	}
	
	@Test(priority=9)
	public void testRD_4_9()
	{
		
		boolean actual=prepaidGiftCardPage.verifythedurationDropdownfunctionality(td.get("Monthly"));
		Assert.assertTrue(actual, "After selecting Duration (Monthly) dropdown on Prepaid gift card page, Either 1.Monthly dropdown is missing 2.data on dropdown is not in a proper format");
		
		
	}
	
	@Test(priority=10)
	public void testRD_4_10()
	{
		
		boolean actual=prepaidGiftCardPage.verifythedurationDropdownfunctionality(td.get("Weekly"));
		Assert.assertTrue(actual, "After selecting Duration (Weekly) dropdown on Prepaid gift card page, Either 1.Weekly dropdown is missing 2.data on dropdown is not in a proper format");
		
		
	}
	
	@Test(priority=11)
	public void testRD_4_11()
	{
		
		boolean actual=prepaidGiftCardPage.verifythedurationDropdownfunctionality(td.get("Custom"));
		Assert.assertTrue(actual, "After selecting Duration (Custom) dropdown on Prepaid gift card page, Either 1.Custom dropdown is missing 2.Start and End calendar is not visible");
		
		
	}
		
	@Test(priority=12)
	public void testRD_4_12()
	{
		//prepaidGiftCardPage = getPageFactory().prepaidGiftCardPage();
		//prepaidGiftCardPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickPrepaidGiftCardsSubMenu();
		boolean actual1=prepaidGiftCardPage.verifythedurationDropdownfunctionality(td.get("Custom"));
		boolean actual2=prepaidGiftCardPage.verifytheCalendarFunctionality(td.get("Apply"));
		Assert.assertTrue(actual1&&actual2,"Failed either 1.Calender is not displaying properly 2.Selected date is not higlighting on text field" );
		
	}
	
	@Test(priority=13)
	public void testRD_4_13()
	{
		prepaidGiftCardPage = getPageFactory().prepaidGiftCardPage();
		prepaidGiftCardPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickPrepaidGiftCardsSubMenu();
		prepaidGiftCardPage.verifythedurationDropdownfunctionality("Custom");
		boolean actual=prepaidGiftCardPage.verifytheCalendarFunctionality(td.get("Cancel"));
		Assert.assertTrue(actual,"Failed either 1.Calender is not displaying properly 2.Selected date is higlighting on text field" );
		
	}
	
	@Test(priority=14)
	public void testRD_4_14()
	{
		
	/*
		prepaidGiftCardPage = getPageFactory().prepaidGiftCardPage();
		prepaidGiftCardPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickPrepaidGiftCardsSubMenu();
	*/	boolean actual=prepaidGiftCardPage.verifytheUpdatebuttonwithoutSpecificMerchant(td.get("Yearly"));
		Assert.assertTrue(actual,"Failed to load image and Row data after clicking on  UpdateFilter 1.Either data is not available 2.Failed to click Update button");
	}
	
	@Test(priority=15)
	public void testRD_4_15()
	{
		prepaidGiftCardPage = getPageFactory().prepaidGiftCardPage();
		prepaidGiftCardPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickPrepaidGiftCardsSubMenu();
		boolean flag1=prepaidGiftCardPage.selectMerchantDropdown(td.get("merchant_Name"));
		boolean flag2=prepaidGiftCardPage.verifytheUpdatebuttonwithSpecificMerchant(td.get("Yearly"));
		Assert.assertTrue(flag1&&flag2,"Failed either because 1.MerchantName not available 2.Update filter button dint display any result ");
	}
	
	@Test(priority=16)
	public void testRD_4_16()
	{
	/*	prepaidGiftCardPage = getPageFactory().prepaidGiftCardPage();
		prepaidGiftCardPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickPrepaidGiftCardsSubMenu();
	*/	boolean flag1=prepaidGiftCardPage.selectMerchantDropdown(td.get("merchant_Name"));
		boolean flag2=prepaidGiftCardPage.selectDurationDropDown(td.get("Yearly"));
		boolean flag3=prepaidGiftCardPage.selectYeardorpdown(""+(Integer.parseInt((Utility.getTodaysDate("YYYY")))-1));
		boolean flag4=prepaidGiftCardPage.verifyTheResultAfterUpdatefilterbuttonClickWithMerchantName();
		Assert.assertTrue(flag1&&flag2&&flag3&&flag4,"Failed either because 1.MerchantName not available 2 Failed to select year and Click Update Filter button 3.Failed give the result aftre update filter button Click");
	}

	@Test(priority=17)
	public void testRD_4_17()
	{
	/*	prepaidGiftCardPage = getPageFactory().prepaidGiftCardPage();
		prepaidGiftCardPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickPrepaidGiftCardsSubMenu();
	*/	boolean flag1=prepaidGiftCardPage.selectMerchantDropdown(td.get("merchant_Name"));
		boolean flag2=prepaidGiftCardPage.selectDurationDropDown(td.get("Monthly"));
		boolean flag3=prepaidGiftCardPage.selectMonthDropdown(td.get("Month_data"));
		boolean flag4=prepaidGiftCardPage.verifyTheResultAfterUpdatefilterbuttonClickWithMerchantName();
		Assert.assertTrue(flag1&&flag2&&flag3&&flag4,"Failed either 1. Failed to locate Merchant dropdown 2.Failed to locate Month Dropdown 3.Failed to locate month specified in testdata 4.Failed to load result" );
	}
	@Test(priority=18)
	public void testRD_4_18()
	{
	/*	prepaidGiftCardPage = getPageFactory().prepaidGiftCardPage();
		prepaidGiftCardPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickPrepaidGiftCardsSubMenu();
	*/	boolean flag1=prepaidGiftCardPage.selectMerchantDropdown(td.get("merchant_Name"));
		boolean flag2=prepaidGiftCardPage.selectDurationDropDown(td.get("Yearly"));
		
		boolean flag3=prepaidGiftCardPage.verifytheMerchantHeaderAfterUpdatefilterClick(td.get("merchant_Name"));
		Assert.assertTrue(flag1&&flag2&&flag3,"Failed either 1. Failed to locate Merchant dropdown 2.Failed to locate Month Dropdown 3.Failed to locate month specified in testdata 4.Failed to locate selected merchant name on result page/or Failed " );
	}
	
	@Test(priority=19)
	public void testRD_4_19()
	{
	/*	prepaidGiftCardPage = getPageFactory().prepaidGiftCardPage();
		prepaidGiftCardPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickPrepaidGiftCardsSubMenu();
	*/	boolean flag1=prepaidGiftCardPage.selectMerchantDropdown(td.get("merchant_Name"));
		boolean flag2=prepaidGiftCardPage.selectDurationDropDown(td.get("Monthly"));
		boolean flag3=prepaidGiftCardPage.selectMonthDropdown(td.get("Month_data"));
		boolean flag4=prepaidGiftCardPage.verifytheMerchantHeaderAfterUpdatefilterClick(td.get("merchant_Name"));
		boolean flag5=prepaidGiftCardPage.verifyTheResultAfterUpdatefilterbuttonClickWithMerchantName();
		Assert.assertTrue(flag1&&flag2&&flag3&&flag4&&flag5,"Failed either 1. Failed to locate Merchant dropdown 2.Failed to locate Monthly drop down in duration 3.Failed to locate month specified in testdata 4.Failed to locate selected merchant Header  on result page/or Failed to load the result 5.Failed to load Image on Tables data" );
	}
	
	@Test(priority=20)
	public void testRD_4_20()
	{
	/*	prepaidGiftCardPage = getPageFactory().prepaidGiftCardPage();
		prepaidGiftCardPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickPrepaidGiftCardsSubMenu();
	*/	boolean flag1=prepaidGiftCardPage.selectMerchantDropdown(td.get("merchant_Name"));
		boolean flag2=prepaidGiftCardPage.selectDurationDropDown(td.get("Weekly"));
		boolean flag3=prepaidGiftCardPage.selectWeekDropdown(td.get("Week_data"));
		boolean flag4=prepaidGiftCardPage.verifytheMerchantHeaderAfterUpdatefilterClick(td.get("merchant_Name"));
		boolean flag5=prepaidGiftCardPage.verifyTheResultAfterUpdatefilterbuttonClickWithMerchantName();
		Assert.assertTrue(flag1&&flag2&&flag3&&flag4&&flag5,"Failed either 1. Failed to locate Merchant dropdown 2.Failed to locate Monthly drop down in duration 3.Failed to locate week specified in testdata 4.Failed to locate selected merchant Header  on result page/or Failed to load the result 5.Failed to load Image on Tables data" );
	}
	
	@Test(priority=21)
	public void testRD_4_21()
	{
	   
		boolean flag1=prepaidGiftCardPage.selectMerchantDropdown(td.get("merchant_Name"));
		boolean flag2=prepaidGiftCardPage.selectDurationDropDown(td.get("Custom"));
		boolean flag3=prepaidGiftCardPage.selectCalenderDate();
		boolean flag4=prepaidGiftCardPage.verifytheMerchantHeaderAfterUpdatefilterClick(td.get("merchant_Name"));
		boolean flag5=prepaidGiftCardPage.verifyTheResultAfterUpdatefilterbuttonClickWithMerchantName();
		Assert.assertTrue(flag1&&flag2&&flag3&&flag4&&flag5,"Failed either 1. Failed to locate Merchant dropdown 2.Failed to locate Custom drop down in duration 3.Failed to click on Calendar date 4.Failed to locate selected merchant Header  on result page/or Failed to load the result 5.Failed to load Image on Tables data" );
	}
	
	@Test(priority=22)
	public void testRD_4_22()
	{
	/*	prepaidGiftCardPage = getPageFactory().prepaidGiftCardPage();
		prepaidGiftCardPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickPrepaidGiftCardsSubMenu();
	*/	boolean flag1=prepaidGiftCardPage.selectMerchantDropdown(td.get("merchant_Name"));
		boolean flag2=prepaidGiftCardPage.selectDurationDropDown(td.get("Custom"));
		prepaidGiftCardPage.clickEmailStatementUpdatefiltesbutton();
		boolean flag3=prepaidGiftCardPage.getPageHeader(td.get("prepiad_giftcardHeader"));
		Assert.assertTrue(flag1&&flag2&&flag3&&flag3,"Failed either 1. Failed to locate Merchant dropdown 2.Failed to locate Custom drop down in duration 3.Failed to click on Calendar date 4.Failed to locate selected merchant Header  on result page/or Failed to load the result 5.Failed to load Image on Tables data" );	
	}
	
	@Test(priority=23)
	public void testRD_4_23()
	{
		
		/*
		prepaidGiftCardPage = getPageFactory().prepaidGiftCardPage();
		prepaidGiftCardPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickPrepaidGiftCardsSubMenu();
		*/boolean flag1=prepaidGiftCardPage.selectDurationDropDown(td.get("Yearly"));
		boolean flag2=prepaidGiftCardPage.selectYeardorpdown(Utility.getTodaysDate("YYYY"));
		prepaidGiftCardPage.clickEmailStatementUpdatefiltesbutton();
		boolean flag3=prepaidGiftCardPage.verifyKeyperformanceHeaders(td.get("KeyPerformanceHeaders").split(","));
		Assert.assertTrue(flag1&&flag2&&flag3,"Failed either 1.Failed to select Duration dropdown or Failed to locate yearly 2. Failed to locate Specified year 3.Failed to Load the specified headers Under KeyPerformance");
		
	}
	
	@Test(priority=24)
	public void testRD_4_24()
	{
		//check  Columns names  are Available in  Campaign Performance table
		/*prepaidGiftCardPage = getPageFactory().prepaidGiftCardPage();
		prepaidGiftCardPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickPrepaidGiftCardsSubMenu();
		*/boolean flag1=prepaidGiftCardPage.selectDurationDropDown(td.get("Yearly"));
		boolean flag2=prepaidGiftCardPage.selectYeardorpdown(Utility.getTodaysDate("YYYY"));
		prepaidGiftCardPage.clickEmailStatementUpdatefiltesbutton();
		boolean flag3=prepaidGiftCardPage.verifyCampaignPerformanceHeaders(td.get("CampignPerformanceHeaders").split(","));
		Assert.assertTrue(flag1&&flag2&&flag3,"Failed either 1.Failed to select Duration dropdown or Failed to locate yearly 2. Failed to locate Specified year 3.Failed to Load the specified headers Under Campign Performance");
		
	}
	
	@Test(priority=25)
	public void testRD_4_25()
	{
		prepaidGiftCardPage = getPageFactory().prepaidGiftCardPage();
		prepaidGiftCardPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickPrepaidGiftCardsSubMenu();
		prepaidGiftCardPage.selectDurationDropDown(td.get("Yearly"));
		prepaidGiftCardPage.clickEmailStatementUpdatefiltesbutton();
		boolean actual = prepaidGiftCardPage.VerifyKeyPerformancetablevalues().getImpressions().trim().isEmpty();
		Assert.assertFalse(actual,"Failed Either 1.Not Loaded result after click on Update Filter 2. KeyPerformance Table is not displayed 3. Failed to display Impressions data");
	}
	
	@Test(priority=26)
	public void testRD_4_26()
	{
		
		boolean actual = prepaidGiftCardPage.VerifyKeyPerformancetablevalues().getExpansions().isEmpty();
		Assert.assertFalse(actual,"Failed Either 1.Not Loaded result after click on Update Filter 2. KeyPerformance Table is not displayed 3. Failed to display Expansion data");
	}
	
	@Test(priority=27)
	public void testRD_4_27()
	{
	
		boolean actual = prepaidGiftCardPage.VerifyKeyPerformancetablevalues().getClicks().isEmpty();
		Assert.assertFalse(actual,"Failed Either 1.Not Loaded result after click on Update Filter 2. KeyPerformance Table is not displayed 3. Failed to display Clicks data");
	}
	@Test(priority=28)
	public void testRD_4_28()
	{
		
		boolean actual = prepaidGiftCardPage.VerifyKeyPerformancetablevalues().getPurchase().isEmpty();
		Assert.assertFalse(actual,"Failed Either 1.Not Loaded result after click on Update Filter 2. KeyPerformance Table is not displayed 3. Failed to display Purchase data");
	}
	
	@Test(priority=29)
	public void testRD_4_29()
	{
		
		boolean actual = prepaidGiftCardPage.VerifyKeyPerformancetablevalues().getCommission().isEmpty();
		Assert.assertFalse(actual,"Failed Either 1.Not Loaded result after click on Update Filter 2. KeyPerformance Table is not displayed 3. Failed to display Commision data");
	}
	
	@Test(priority=30)
	public void testRD_4_30()
	{
		prepaidGiftCardPage = getPageFactory().prepaidGiftCardPage();
		prepaidGiftCardPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickPrepaidGiftCardsSubMenu();
	    prepaidGiftCardPage.selectMerchantDropdown(td.get("merchant_Name"));
		prepaidGiftCardPage.selectDurationDropDown(td.get("Yearly"));
		prepaidGiftCardPage.clickEmailStatementUpdatefiltesbutton();
	    merchantNamesonAdminPage= prepaidGiftCardPage.getCampaignPerformancetablevaluesonAdminPage();
		prepaidGiftCardPage.openRdLoginpage().goToHomePage(td.get("merchant_email"), td.get("merchnat_password")).clickPrepaidGiftCardsSubMenu();
		prepaidGiftCardPage.selectDurationDropDown(td.get("Yearly"));
		prepaidGiftCardPage.clickEmailStatementUpdatefiltesbutton();
		merchantNamesonMerchantPage= prepaidGiftCardPage.getCampaignPerformancetablevaluesMerchantPage();
		
		boolean actual=prepaidGiftCardPage.CompareMerchantNamedata(merchantNamesonAdminPage, merchantNamesonMerchantPage);
		Assert.assertTrue((actual)&&(merchantNamesonAdminPage.size()==merchantNamesonMerchantPage.size()),"Failed Either 1.Not Loaded result after click on Update Filter 2.Campaign Peformance table is not present  3. Mismatch in Merchnat name / Count in Merchant and Admin page");
	}
	

	@Test(priority=31)
	public void testRD_4_31()
	{
		boolean actual=prepaidGiftCardPage.CompareCampaignName(merchantNamesonAdminPage, merchantNamesonMerchantPage);
		Assert.assertTrue((actual)&&(merchantNamesonAdminPage.size()==merchantNamesonMerchantPage.size()),"Failed Either 1.Not Loaded result after click on Update Filter 2.Campaign Peformance table is not present  3. Mismatch in Campaign name / Count in Merchant and Admin page");
	}
	
	@Test(priority=32)
	public void testRD_4_32()
	{
		boolean actual=prepaidGiftCardPage.CompareImpression(merchantNamesonAdminPage, merchantNamesonMerchantPage);
		Assert.assertTrue((actual)&&(merchantNamesonAdminPage.size()==merchantNamesonMerchantPage.size()),"Failed Either 1.Not Loaded result after click on Update Filter 2.Campaign Peformance table is not present  3. Mismatch in Impressions / Count in Merchant and Admin page");
	}
	
	@Test(priority=33)
	public void testRD_4_33()
	{
		boolean actual=prepaidGiftCardPage.CompareExpansion(merchantNamesonAdminPage, merchantNamesonMerchantPage);
		Assert.assertTrue((actual)&&(merchantNamesonAdminPage.size()==merchantNamesonMerchantPage.size()),"Failed Either 1.Not Loaded result after click on Update Filter 2.Campaign Peformance table is not present  3. Mismatch in Expansions / Count in Merchant and Admin page");
	}
	
	@Test(priority=34)
	public void testRD_4_34()
	{
		boolean actual=prepaidGiftCardPage.CompareClicks(merchantNamesonAdminPage, merchantNamesonMerchantPage);
		Assert.assertTrue((actual)&&(merchantNamesonAdminPage.size()==merchantNamesonMerchantPage.size()),"Failed Either 1.Not Loaded result after click on Update Filter 2.Campaign Peformance table is not present  3. Mismatch in Clicks / Count in Merchant and Admin page");
	}
	@Test(priority=35)
	public void testRD_4_35()
	{
		
		boolean actual=prepaidGiftCardPage.ComparePurchases(merchantNamesonAdminPage, merchantNamesonMerchantPage);
		Assert.assertTrue((actual)&&(merchantNamesonAdminPage.size()==merchantNamesonMerchantPage.size()),"Failed Either 1.Not Loaded result after click on Update Filter 2.Campaign Peformance table is not present  3. Mismatch in Purchases / Count in Merchant and Admin page");
	}

	
	
	@Test(priority=36)
	public void testRD_4_36()
	{
		
		boolean actual=prepaidGiftCardPage.CompareCommission(merchantNamesonAdminPage, merchantNamesonMerchantPage);
		Assert.assertTrue((actual)&&(merchantNamesonAdminPage.size()==merchantNamesonMerchantPage.size()),"Failed Either 1.Not Loaded result after click on Update Filter 2.Campaign Peformance table is not present  3. Mismatch in Commisions / Count in Merchant and Admin page");
	}

	@Test(priority=37)
	public void testRD_4_37()
	{
		boolean actual=prepaidGiftCardPage.verifyMerchantNamePopulatedInvaliddataOntable(merchantNamesonAdminPage);
		Assert.assertTrue(actual,"Failed Either 1.Not Loaded result after click on Update Filter 2.Campaign Peformance table is not present  3. Populated merchant name on table is either empty or null when logged in as admin");
	}
	@Test(priority=38)
	public void testRD_4_38()
	{
		boolean actual=prepaidGiftCardPage.verifyCampaignNamePopulatedInvaliddataOntable(merchantNamesonAdminPage);
		Assert.assertTrue(actual,"Failed Either 1.Not Loaded result after click on Update Filter 2.Campaign Peformance table is not present  3. Populated Campaign name on table is either empty or null when logged in as admin");
	}
	
	@Test(priority=39)
	public void testRD_4_39()
	{
		boolean actual=prepaidGiftCardPage.verifyImpressionsPopulatedInvaliddataOntable(merchantNamesonAdminPage);
		Assert.assertTrue(actual,"Failed Either 1.Not Loaded result after click on Update Filter 2.Campaign Peformance table is not present  3. Populated Impression data on table is either empty or null when logged in as admin");
	}
	
	@Test(priority=40)
	public void testRD_4_40()
	{
		boolean actual=prepaidGiftCardPage.verifyExpansionsPopulatedInvaliddataOntable(merchantNamesonAdminPage);
		Assert.assertTrue(actual,"Failed Either 1.Not Loaded result after click on Update Filter 2.Campaign Peformance table is not present  3. Populated Expansions data on table is either empty or null when logged in as admin");
	}
	
	@Test(priority=41)
	public void testRD_4_41()
	{
		boolean actual=prepaidGiftCardPage.verifyClicksPopulatedInvaliddataOntable(merchantNamesonAdminPage);
		Assert.assertTrue(actual,"Failed Either 1.Not Loaded result after click on Update Filter 2.Campaign Peformance table is not present  3. Populated Expansions data on table is either empty or null when logged in as admin");
	}
	
	@Test(priority=42)
	public void testRD_4_42()
	{
		boolean actual=prepaidGiftCardPage.verifyPurchasesPopulatedInvaliddataOntable(merchantNamesonAdminPage);
		Assert.assertTrue(actual,"Failed Either 1.Not Loaded result after click on Update Filter 2.Campaign Peformance table is not present  3. Populated Purchases data on table is either empty or null when logged in as admin");
	}
	
	@Test(priority=43)
	public void testRD_4_43()
	{
		boolean actual=prepaidGiftCardPage.verifyCommissionPopulatedInvaliddataOntable(merchantNamesonAdminPage);
		Assert.assertTrue(actual,"Failed Either 1.Not Loaded result after click on Update Filter 2.Campaign Peformance table is not present  3. Populated Commission data on table is either empty or null when logged in as admin");
	}
	
	@Test(priority=44)
	public void testRD_4_44()
	{
		prepaidGiftCardPage = getPageFactory().prepaidGiftCardPage();
		prepaidGiftCardPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickPrepaidGiftCardsSubMenu();
		
	    prepaidGiftCardPage.verifytheUpdatebuttonwithSpecificMerchant(td.get("Yearly"));
		boolean actual1=prepaidGiftCardPage.verifytheExtraFiltersLink(td.get("showExtraFilters"),td.get("hideExtraFilters"));
		boolean actual2=prepaidGiftCardPage.verifytheComponentsDisplayingAfterShowHidelinkClick(td.get("showFilterslabel").split(","));
		
		Assert.assertTrue(actual1&&actual2,"Failed 1.Hide Extra Filters /Show Extra Filters not displaying properly 2. Failed to display the Components after clicking Show Extra Filter link 3. Failed to hide Components After clicking Hide Extra Filter Link");
	}
	
	
	/*@Test(priority=44)
	public void testRD_4_44()
	{
		boolean actual=prepaidGiftCardPage.verifyMerchantNamePopulatedInvaliddataOntable(merchantNamesonMerchantPage);
		Assert.assertTrue(actual,"Failed Either 1.Not Loaded result after click on Update Filter 2.Campaign Peformance table is not present  3. Populated merchant name on table is either empty or null when logged in as admin");
	}
	@Test(priority=45)
	public void testRD_4_45()
	{
		boolean actual=prepaidGiftCardPage.verifyCampaignNamePopulatedInvaliddataOntable(merchantNamesonMerchantPage);
		Assert.assertTrue(actual,"Failed Either 1.Not Loaded result after click on Update Filter 2.Campaign Peformance table is not present "
				+ " 3. Populated Campaign name on table is either empty or null when logged in as Merchant");
	}
	
	@Test(priority=46)
	public void testRD_4_46()
	{
		boolean actual=prepaidGiftCardPage.verifyImpressionsPopulatedInvaliddataOntable(merchantNamesonMerchantPage);
		Assert.assertTrue(actual,"Failed Either 1.Not Loaded result after click on Update Filter 2.Campaign Peformance table is not present  3. Populated Impression data on table is either empty or null when logged in as Merchant");
	}
	
	@Test(priority=47)
	public void testRD_4_47()
	{
		boolean actual=prepaidGiftCardPage.verifyExpansionsPopulatedInvaliddataOntable(merchantNamesonMerchantPage);
		Assert.assertTrue(actual,"Failed Either 1.Not Loaded result after click on Update Filter 2.Campaign Peformance table is not present  3. Populated Expansions data on table is either empty or null when logged in as Merchant");
	}
	
	@Test(priority=48)
	public void testRD_4_48()
	{
		boolean actual=prepaidGiftCardPage.verifyClicksPopulatedInvaliddataOntable(merchantNamesonMerchantPage);
		Assert.assertTrue(actual,"Failed Either 1.Not Loaded result after click on Update Filter 2.Campaign Peformance table is not present  3. Populated Expansions data on table is either empty or null when logged in as Merchant");
	}
	
	@Test(priority=49)
	public void testRD_4_49()
	{
		boolean actual=prepaidGiftCardPage.verifyPurchasesPopulatedInvaliddataOntable(merchantNamesonMerchantPage);
		Assert.assertTrue(actual,"Failed Either 1.Not Loaded result after click on Update Filter 2.Campaign Peformance table is not present  3. Populated Purchases data on table is either empty or null when logged in as Merchant");
	}
	
	@Test(priority=50)
	public void testRD_4_50()
	{
		boolean actual=prepaidGiftCardPage.verifyCommissionPopulatedInvaliddataOntable(merchantNamesonMerchantPage);
		Assert.assertTrue(actual,"Failed Either 1.Not Loaded result after click on Update Filter 2.Campaign Peformance table is not present  3. Populated Commission data on table is either empty or null when logged in as Merchant");
	}*/

	
}