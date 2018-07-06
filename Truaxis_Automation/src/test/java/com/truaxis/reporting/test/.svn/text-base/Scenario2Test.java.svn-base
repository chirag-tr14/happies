package com.truaxis.reporting.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.truaxis.common.BaseTest;

import com.truaxis.reporting.pageobjects.EmailStatementCreditPage;
import com.truaxis.reporting.valueobjects.CampaignPerformanceVO;
import com.truaxis.reporting.valueobjects.KeyStatisticsVO;

public class Scenario2Test extends BaseTest {

	private Map<String, String> td = getTestDataProperties();
	List<CampaignPerformanceVO> adminList = null;
	List<CampaignPerformanceVO> merchantList = null;
	EmailStatementCreditPage emailStatementCredit;
	 List<String> adminpdfdata=new ArrayList<String>();
	 List<String> merchantpdfdata=new ArrayList<String>();
	 List<String> UIdata=new ArrayList<String>();
	KeyStatisticsVO adminKeystatisticsVO = new KeyStatisticsVO();
	KeyStatisticsVO merchantKeystatisticsVO = new KeyStatisticsVO();

	@BeforeClass
	public void setUpOnce1() {
		emailStatementCredit = getPageFactory().emailStatemetmentpage();
		emailStatementCredit.openRdLoginpage()
				.goToHomePage(td.get("admin_email"), td.get("admin_password"))
				.clickEmailStatementCreditSubMenu();
		td.get("merchant_name");
	}

	

	@Test()
	public void testRD_2_1() {
		boolean actual = emailStatementCredit.verifyHeaderText(td
				.get("emailcreditpage_header_label"));
		Assert.assertEquals(
				actual,
				true,
				"Reporting: Email  Statement credit page  ,is not displayed on Email  Statement credit page");
	}

	@Test()
	public void testRD_2_2() {
		boolean actual = emailStatementCredit.verifyExportLabelsAndButtons(
				td.get("common_exports_text"), td.get("common_exports_button"));
		Assert.assertEquals(
				actual,
				true,
				"Export,PDF,Exel,CSV labels,are not displayed on Email Statement credit page");
	}

	@Test()
	public void testRD_2_3() {
		boolean actual = emailStatementCredit.verifyMerchantFilterBlock(td
				.get("merchant_text"));
		Assert.assertEquals(
				actual,
				true,
				"Merchnat Filter block ,is not displayed on Email  Statement credit page");
	}

	@Test()
	public void testRD_2_4() {
		boolean actual = emailStatementCredit.verifyDurationFilterBlock(td
				.get("duration_text"));
		Assert.assertEquals(
				actual,
				true,
				"verify Duration Filter Block,is not displayed on Email Statement credit page");
	}

	@Test()
	public void testRD_2_5() {
		boolean actual = emailStatementCredit
				.verifyUpdatedFilterButtonAppearance(td.get("updated_filters"),
						td.get("button_color"));
		Assert.assertEquals(
				actual,
				true,
				"Updated Filter Button ,is not displayed on Email Statement credit page");
	}

	@Test()
	public void testRD_2_6() {
		boolean actual = emailStatementCredit.verifyShowExtraFiltersLink(td
				.get("show_exta_filters"));
		Assert.assertEquals(
				actual,
				true,
				"Show Extra Filters Link,is not displayed on Email Statement credit page");
	}

	@Test()
	public void testRD_2_7() {
		boolean actual = emailStatementCredit
				.verifyMerchantFilterDropDownLabels(td.get("merchant_filters"));
		Assert.assertEquals(
				actual,
				true,
				"verify Merchant Filter DropDown Labels,is not displayed on Email Statement credit page");
	}
	
	@Test()
	public void testRD_2_8() {
		boolean actual=emailStatementCredit
				.selectMerchantdropdown(td.get("merchant_name"));
		Assert.assertEquals(
				actual,
				true,
				"Merchant Filter DropDown  item ,is not Selected on Email Statement credit page");
		
	}
	

	@Test()
	public void testRD_2_9()  {
		boolean actual=emailStatementCredit
			 .selectMerchantdropdown(td.get("merchant_name"));
		      emailStatementCredit.selectDurationDropDownlist(td.get("Yearly"))
		     .clickEmailStatementUpdatefiltesbutton();
		Assert.assertTrue(actual, "Failed After selecting Duration (yearly) dropdown on Email Statement credit page,  Either becuase of 1.Year Dropdown is not displyed 2.Data on dropdown is not in a proper format");
	}

	@Test
	public void testRD_2_10()
	{
		emailStatementCredit = getPageFactory().emailStatemetmentpage();
		emailStatementCredit.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickEmailStatementCreditSubMenu();
		boolean actual=emailStatementCredit.verifythedurationDropdownfunctionality(td.get("Yearly"));
		Assert.assertTrue(actual, "Failed After selecting Duration (yearly) dropdown on Email Statement credit page,  Either becuase of 1.Year Dropdown is not displyed 2.Data on dropdown is not in a proper format");
		
	}

	@Test
	public void testRD_2_11()
	{
		emailStatementCredit = getPageFactory().emailStatemetmentpage();
		emailStatementCredit.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickEmailStatementCreditSubMenu();
		boolean actual=emailStatementCredit.verifythedurationDropdownfunctionality(td.get("Monthly"));
		Assert.assertTrue(actual, "After selecting Duration (Monthly) dropdown on Email Statement credit page, Either 1.Monthly dropdown is missing 2.data on dropdown is not in a proper format");
		
		
	}
	
	@Test
	public void testRD_2_12()
	{
		emailStatementCredit = getPageFactory().emailStatemetmentpage();
		emailStatementCredit.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickEmailStatementCreditSubMenu();
		boolean actual=emailStatementCredit.verifythedurationDropdownfunctionality(td.get("Weekly"));
		Assert.assertTrue(actual, "After selecting Duration (Weekly) dropdown on Email Statement credit page, Either 1.Weekly dropdown is missing 2.data on dropdown is not in a proper format");
		
		
	}
	
	@Test
	public void testRD_2_13()
	{
		emailStatementCredit = getPageFactory().emailStatemetmentpage();
		emailStatementCredit.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickEmailStatementCreditSubMenu();
		boolean actual=emailStatementCredit.verifythedurationDropdownfunctionality(td.get("Custom"));
		Assert.assertTrue(actual, "After selecting Duration (Custom) dropdown on Email Statement credit page, Either 1.Custom dropdown is missing 2.Start and End calendar is not visible");
		
		
	}
		
	@Test
	public void testRD_2_14()
	{
		emailStatementCredit = getPageFactory().emailStatemetmentpage();
		emailStatementCredit.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickEmailStatementCreditSubMenu();
		boolean actual1=emailStatementCredit.verifythedurationDropdownfunctionality(td.get("Custom"));
		boolean actual2=emailStatementCredit.verifytheCalendarFunctionality("apply");
		Assert.assertTrue(actual1&&actual2,"Failed either 1.Calender is not displaying properly 2.Selected date is not higlighting on text field" );
		
	}
	
	@Test
	public void testRD_2_15()
	{
		emailStatementCredit = getPageFactory().emailStatemetmentpage();
		emailStatementCredit.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickEmailStatementCreditSubMenu();
		emailStatementCredit.verifythedurationDropdownfunctionality(td.get("Custom"));
		boolean actual=emailStatementCredit.verifytheCalendarFunctionality("Cancel");
		Assert.assertTrue(actual,"Failed either 1.Calender is not displaying properly 2.Selected date is higlighting on text field" );
		
	}
	
	@Test
	public void testRD_2_16()
	{
		emailStatementCredit = getPageFactory().emailStatemetmentpage();
		emailStatementCredit.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickEmailStatementCreditSubMenu();
		boolean flag1=emailStatementCredit.selectMerchantDropdown(td.get("merchant_name"));
		emailStatementCredit.selectDurationDropDownlist(td.get("Yearly")).selectYearDropDownlist(td.get("year_2013")).clickEmailStatementUpdatefiltesbutton();
		boolean flag2 = emailStatementCredit.verifyKeyStatisticsTableHeaderlabel(td.get("keystatistics_text"));
		boolean flag3 = emailStatementCredit.verifyCampaignPerformanceTableHeaderlabel(td.get("campaignperformance_text"));
		Assert.assertEquals(flag1&flag2&flag3,true,"Failed to load image and table data after clicking on  UpdateFilter 1.Either data is not available 2.Failed to click Update button");
	}
	
	@Test
	public void testRD_2_17()
	{
		emailStatementCredit.selectmerchantAndClickUpdatefilters();
		boolean flag1 = emailStatementCredit.verifyKeyStatisticsTableHeaderlabel(td.get("keystatistics_text"));
		boolean flag2 = emailStatementCredit.verifyCampaignPerformanceTableHeaderlabel(td.get("campaignperformance_text"));
		
		Assert.assertTrue(flag1&&flag2,"Failed either because 1.MerchantName not available 2.Update filter button dint display any result ");
	}
	
	@Test
	public void testRD_2_18()
	{
		emailStatementCredit.selectMerchantDropdownlist(td.get("merchant_name")).selectDurationDropDownlist(td.get("Yearly")).selectYearDropDownlist("year_2012").clickEmailStatementUpdatefiltesbutton();
		boolean flag1 = emailStatementCredit.verifyKeyStatisticsTableHeaderlabel(td.get("keystatistics_text"));
		boolean flag2 = emailStatementCredit.verifyCampaignPerformanceTableHeaderlabel(td.get("campaignperformance_text"));
		Assert.assertTrue(flag1&&flag2,"Failed either because 1.MerchantName not available 2 Failed to select year and Click Update Filter button 3.Failed give the result aftre update filter button Click");
	}

	@Test
	public void testRD_2_19()
	{
		emailStatementCredit = getPageFactory().emailStatemetmentpage();
		emailStatementCredit.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickEmailStatementCreditSubMenu();
		boolean flag1=emailStatementCredit.selectMerchantDropdown(td.get("merchant_name"));
		 emailStatementCredit.selectDurationDropDownlist(td.get("Yearly"));
		boolean flag2=emailStatementCredit.selectMonthDropdown(td.get("month_june"));
		emailStatementCredit.clickEmailStatementUpdatefiltesbutton();
		boolean flag3 = emailStatementCredit.verifyKeyStatisticsTableHeaderlabel(td.get("keystatistics_text"));
		boolean flag4 = emailStatementCredit.verifyCampaignPerformanceTableHeaderlabel(td.get("campaignperformance_text"));
		Assert.assertTrue(flag1&&flag2&&flag3&flag4,"Failed either 1. Failed to locate Merchant dropdown 2.Failed to locate Month Dropdown 3.Failed to locate month specified in testdata 4.Failed to load result" );
	}
	
	@Test
	public void testRD_2_20()
	{
		emailStatementCredit = getPageFactory().emailStatemetmentpage();
		emailStatementCredit.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickEmailStatementCreditSubMenu();
		boolean flag1=emailStatementCredit.selectMerchantDropdown(td.get("merchant_name"));
		boolean flag2=emailStatementCredit.selectDurationDropDown(td.get("Yearly"));
		
		boolean flag4=emailStatementCredit.verifyTheResultAfterUpdatefilterbuttonClickWithMerchantName();
		Assert.assertTrue(flag1&&flag2,"Failed either 1. Failed to locate Merchant dropdown 2.Failed to locate Month Dropdown 3.Failed to locate month specified in testdata 4.Failed to load result" );
	}

	@Test()
	public void testRD_2_21() {
		emailStatementCredit.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		boolean actual = emailStatementCredit
				.VerifyKeyStatisticstablevalues().getImpressions().isEmpty();
		Assert.assertEquals(
				actual,
				false,
				"Key Statistics table Impression Value is ,not displayed on Email Email Email Email Statement credit page");
	}

	@Test()
	public void testRD_2_22() {
		emailStatementCredit.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		boolean actual = emailStatementCredit
				.VerifyKeyStatisticstablevalues().getActivations().isEmpty();
		
		Assert.assertEquals(
				actual,
				false,
				"Key Statistics table Activations  Value is ,not displayed on Email Statement credit page");
	}

	@Test()
	public void testRD_2_23() {
		emailStatementCredit.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		boolean actual = emailStatementCredit
				.VerifyKeyStatisticstablevalues().getRedemptions().isEmpty();
		Assert.assertEquals(
				actual,
				false,
				"Key Statistics table Redemptions  Value is ,not displayed on Email Statement credit page");
	}
	

	@Test()
	public void testRD_2_24() {
		emailStatementCredit.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		boolean actual = emailStatementCredit
				.VerifyKeyStatisticstablevalues().getRedRate().isEmpty();
		Assert.assertEquals(
				actual,
				false,
				"Key Statistics table Red. Rate  Value is ,not displayed on Email Statement credit page");
	}
	
	@Test()
	public void testRD_2_25() {
		emailStatementCredit.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		boolean actual = emailStatementCredit
				.VerifyKeyStatisticstablevalues().getTotalSpend().isEmpty();
		Assert.assertEquals(
				actual,
				false,
				" Key Statistics table Total Spend  Value is ,not displayed on Statement credit page");
	}
	
	@Test()
	public void testRD_2_26() {
		emailStatementCredit.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		boolean actual = emailStatementCredit
				.VerifyKeyStatisticstablevalues().getavgSpend().isEmpty();
		Assert.assertEquals(
				actual,
				false,
				"Key Statistics table Avg. Spend Value is ,not displayed on Email Statement credit page");
	}
	
	@Test()
	public void testRD_2_27() {
		emailStatementCredit.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		boolean actual = emailStatementCredit
				.VerifyKeyStatisticstablevalues().getTotalCashback().isEmpty();
		Assert.assertEquals(
				actual,
				false,
				" Key Statistics table Total Cashback Value is ,not displayed on Email Statement credit page");
	}
	@Test()
	public void testRD_2_28() {
		emailStatementCredit.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		boolean actual = emailStatementCredit
				.VerifyKeyStatisticstablevalues().getCommission().isEmpty();
		Assert.assertEquals(
				actual,
				false,
				"Key Statistics table  Commission Value is ,not displayed on Email Statement credit page");
	}
	@Test()
	public void testRD_2_29() {
		emailStatementCredit.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		boolean actual = emailStatementCredit
				.VerifyKeyStatisticstablevalues().getrOAS().trim().isEmpty();
		Assert.assertEquals(
				actual,
				false,
				"Key Statistics table  ROAS Value is ,not displayed on Email Statement credit page");
	}
	@Test()
	public void testRD_2_30(){
		emailStatementCredit.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		boolean actual = emailStatementCredit
				.VerifyKeyStatisticstablevalues().getConvFactor().trim().isEmpty();
		Assert.assertEquals(
				actual,
				false,
				" Key Statistics table Conv. Factor Value is ,not displayed on Email Statement credit page");
	}
	
	@Test()
	public void testRD_2_31(){
		emailStatementCredit.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		boolean flag1 = emailStatementCredit.verifyKeyStatisticsTableHeaderlabel(td.get("keystatistics_text"));
		boolean flag2 = emailStatementCredit.verifyCampaignPerformanceTableHeaderlabel(td.get("campaignperformance_text"));
				
		Assert.assertEquals(
				flag1&flag2,
				true,
				"Key Statistics and Campaign Performance table Header label ,not displayed on Email Statement credit page");
   }
	@Test()
	public void testRD_2_32(){
	emailStatementCredit.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
	boolean flag = emailStatementCredit.verifyMerchantNameHeaderlabel();
		
	Assert.assertEquals(
			flag,
				true,
				"Merchant Name Header label is ,not displayed on Email Statement credit page on top of the Chart");
  }

	@Test()
	public void testRD_2_33(){
		boolean flag = emailStatementCredit.verifyEmailstatmentCreditSubMenulinkfunctionality();
		Assert.assertEquals(
				flag,
				true,
				"Email Email Email Email Statement credit page is not opened ,Email Statement credit page menu link is not working");
   }

	@Test()
	public void testRD_2_34(){
		boolean flag = emailStatementCredit.verifylogoutButtonFunctionality();
		Assert.assertEquals(
				flag,
				true,
				" The Logout Operation is not sucessfull in Email Email Statement credit page");
	}
	
	@Test()
	public void testRD_2_35(){
		emailStatementCredit = getPageFactory().emailStatemetmentpage();
		emailStatementCredit.openRdLoginpage()
				.goToHomePage(td.get("admin_email"), td.get("admin_password"))
				.clickEmailStatementCreditSubMenu();
		boolean flag = emailStatementCredit.verifyHelpButtonFunctionality();
		Assert.assertEquals(
				flag,
				true,
				" The Help Button is not working, it is not displaying any help page");
	}
	

	
	@Test()
	public void testRD_2_36(){
		emailStatementCredit = getPageFactory().emailStatemetmentpage();
		emailStatementCredit.openRdLoginpage()
				.goToHomePage(td.get("admin_email"), td.get("admin_password"))
				.clickEmailStatementCreditSubMenu();
		boolean flag1=emailStatementCredit.selectMerchantDropdown(td.get("merchant_name"));
		 emailStatementCredit.selectDurationDropDownlist(td.get("Yearly"));
		boolean flag2=emailStatementCredit.selectMonthDropdown(td.get("month_june"));
		emailStatementCredit.clickEmailStatementUpdatefiltesbutton();
		boolean flag3 = emailStatementCredit.verifyEmailStatementKeystaticticsTableHeaders( td.get("email_keystatisticstable_headers"));
		Assert.assertEquals(
				flag1&flag2&flag3,
				true,
				" statement credit Key statistics Table headers are  missing");
	}

	@Test()
	public void testRD_2_37(){
		boolean flag1=emailStatementCredit.selectMerchantDropdown(td.get("merchant_name"));
		 emailStatementCredit.selectDurationDropDownlist(td.get("Yearly"));
		boolean flag2=emailStatementCredit.selectMonthDropdown(td.get("month_june"));
		emailStatementCredit.clickEmailStatementUpdatefiltesbutton();
		boolean flag3 = emailStatementCredit.verifyEmailStatementCompaignPerformanceTableHeaders(td.get("email_CampignPerformanceHeaders"));
		Assert.assertEquals(
				flag1&flag2&flag3,
				true,
				" Compaign performance table headers are  missing  on Email Email Email Email Statement credit page");
	}
	
	

	@Test()
	public void testRD_2_38(){
		boolean flag1=emailStatementCredit.selectMerchantDropdown(td.get("merchant_name"));
		 emailStatementCredit.selectDurationDropDownlist(td.get("Yearly"));
		boolean flag2=emailStatementCredit.selectMonthDropdown(td.get("month_june"));
		emailStatementCredit.clickEmailStatementUpdatefiltesbutton();	
    boolean flag3=emailStatementCredit.verifyCompaignPerformanceTableMerchantNamelist();
		Assert.assertEquals(
				flag1&flag2&flag3,
				true,
				" Compaign performance table values Merchant name's are  missing  on Email Email Email Email Email Statement credit page,due to loading the page or data is not available  merchant");
	}
	
	@Test()
	public void testRD_2_39(){
		emailStatementCredit.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
    boolean actual=emailStatementCredit.verifyCompaignPerformanceTableCampaignNamelist();
		Assert.assertEquals(
				actual,
				true,
				" Compaign performance table CampaignName's list are  missing  on Email Email Email Email Statement credit page,due to loading the page or data is not available  merchant");
	}
	
	@Test()
	public void testRD_2_40(){
		emailStatementCredit.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
    boolean actual=emailStatementCredit.verifyCompaignPerformanceTableImpressionslist();
		Assert.assertEquals(
				actual,
				true,
				" Compaign performance table Impressions list are  missing  on Email Email Email Email Statement credit page,due to loading the page or data is not available  merchant");
	}

	@Test()
	public void testRD_2_41(){
		emailStatementCredit.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
    boolean actual=emailStatementCredit.verifyCompaignPerformanceTableActivationslist();
		Assert.assertEquals(
				actual,
				true,
				" Compaign performance table Impressions list are  missing  on Email Email Email Email Statement credit page,due to loading the page or data is not available  merchant");
	}
	@Test()
	public void testRD_2_42(){
		emailStatementCredit.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
    boolean actual=emailStatementCredit.verifyCompaignPerformanceTableRedemptionslist();
		Assert.assertEquals(
				actual,
				true,
				" Compaign performance table Redemptions column values are  missing  on  Email Email Email Email Email Statement credit page,due to loading the page or data is not available  merchant");
	}
	
	@Test()
	public void testRD_2_43(){
		emailStatementCredit.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
    boolean actual=emailStatementCredit.verifyCompaignPerformanceTableRedRatelist();
		Assert.assertEquals(
				actual,
				true,
				" Compaign performance table RedRate column values are  missing  on  Email Statement credit page,due to loading the page or data is not available  merchant");
	}

	@Test()
	public void testRD_2_44(){
		emailStatementCredit.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
    boolean actual=emailStatementCredit.verifyCompaignPerformanceTableTotalSpendlist();
		Assert.assertEquals(
				actual,
				true,
				" Compaign performance table TotalSpend column values  are  missing  on  Email Statement credit page,due to loading the page or data is not available  merchant");
	}
	
	@Test()
	public void testRD_2_45(){
		emailStatementCredit.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
    boolean actual=emailStatementCredit.verifyCompaignPerformanceTableAvgSpendlist();
		Assert.assertEquals(
				actual,
				true,
				" Compaign performance table AvgSpend column values are  missing  on  Email Email Email Email Email Statement credit page,due to loading the page or data is not available  merchant");
	}
	
	@Test()
	public void testRD_2_46(){
		emailStatementCredit.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
    boolean actual=emailStatementCredit.verifyCompaignPerformanceTableTotalCashbacklist();
		Assert.assertEquals(
				actual,
				true,
				" Compaign performance table TotalCashback column values are  missing  on  Email Statement credit page,due to loading the page or data is not available  merchant");
	}
	@Test()
	public void testRD_2_47(){
		emailStatementCredit.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
    boolean actual=emailStatementCredit.verifyCompaignPerformanceTableCommissionlist();
		Assert.assertEquals(
				actual,
				true,
				" Compaign performance table Commission column  values are  missing  on  Email Statement credit page,due to loading the page or data is not available  merchant");
	}
	@Test()
	public void testRD_2_48(){
		emailStatementCredit.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
    boolean actual=emailStatementCredit.verifyCompaignPerformanceTableROASlist();
		Assert.assertEquals(
				actual,
				true,
				" Compaign performance table ROAS column values are  missing  on  Email Email Email Email Email Statement credit page,due to loading the page or data is not available  merchant");
	}
	
	@Test()
	public void testRD_2_49(){
		emailStatementCredit.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
    boolean actual=emailStatementCredit.verifyCompaignPerformanceTableConvFactorlist();
		Assert.assertEquals(
				actual,
				true,
				" Compaign performance table ConvFactor column  values are  missing  on  Email Statement credit page,due to loading the page or data is not available  merchant");
	}
	@Test()
	public void testRD_2_50(){
		emailStatementCredit.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
    boolean actual=emailStatementCredit.verifyCompaignPerformanceTableMerchantNamelist();
		Assert.assertEquals(
				actual,
				true,
				" Compaign performance table MerchantName list values are  missing  on  Email Statement credit page,due to loading the page or data is not available  merchant");
	}
	
	  
	@Test()
	public void testRD_2_51() {

		emailStatementCredit.selectMerchantDropdownlist(td.get("merchant_name"))
				.selectDurationDropDownlist(td.get("Yearly"))
				.selectYearDropDownlist(td.get("year_2013"))
				.clickEmailStatementUpdatefiltesbutton();
		adminList = emailStatementCredit.getCampaignPerformancetablevalues();
		emailStatementCredit = getPageFactory().emailStatemetmentpage();
		emailStatementCredit.openRdLoginpage()
				.goToHomePage(td.get("merchant_email"),td.get("merchnat_password"))
				.clickEmailStatementCreditSubMenu()
				.selectDurationDropDownlist(td.get("Yearly"))
				.selectYeardorpdownmerchantlogin(td.get("year_2013"))
				.clickEmailStatementUpdatefiltesbutton();
		merchantList = emailStatementCredit.getCampaignPerformancetablevalues();
		boolean actual = emailStatementCredit.CompareMerchantName(adminList, merchantList);
		Assert.assertEquals(actual,true," Compaign performance table MerchantName  list values are not matching with Admin User and Merchant Login UI on  Email Statement credit page,due to loading the page or data is not displayed on Merchant UI");

	}
	 @Test(dependsOnMethods="testRD_2_51")
	public void testRD_2_52() {

		emailStatementCredit.selectMerchantDropdownlist(td.get("merchant_name"))
				.selectDurationDropDownlist(td.get("Yearly"))
				.selectYearDropDownlist(td.get("year_2013"))
				.clickEmailStatementUpdatefiltesbutton();
		adminList = emailStatementCredit.getCampaignPerformancetablevalues();
		emailStatementCredit = getPageFactory().emailStatemetmentpage();
		emailStatementCredit.openRdLoginpage()
				.goToHomePage(td.get("merchant_email"),td.get("merchnat_password"))
				.clickEmailStatementCreditSubMenu()
				.selectDurationDropDownlist(td.get("Yearly"))
				.selectYeardorpdownmerchantlogin(td.get("year_2013"))
			.clickEmailStatementUpdatefiltesbutton();
		merchantList = emailStatementCredit.getCampaignPerformancetablevalues();
		boolean actual = emailStatementCredit.CompareCampaignName(adminList, merchantList);
		Assert.assertEquals(actual,true," Compaign performance table CampaignName list values are not matching with Admin User and Merchant Login UI on  Email Statement credit page,due to loading the page or data is not displayed on Merchant UI");

	}
	  
	@Test()
	public void testRD_2_53() {

		emailStatementCredit.selectMerchantDropdownlist(td.get("merchant_name"))
				.selectDurationDropDownlist(td.get("Yearly"))
				.selectYearDropDownlist(td.get("year_2013"))
				.clickEmailStatementUpdatefiltesbutton();
		adminList = emailStatementCredit.getCampaignPerformancetablevalues();
		emailStatementCredit = getPageFactory().emailStatemetmentpage();
		emailStatementCredit.openRdLoginpage()
				.goToHomePage(td.get("merchant_email"),td.get("merchnat_password"))
				.clickEmailStatementCreditSubMenu()
				.selectDurationDropDownlist(td.get("Yearly"))
				.selectYeardorpdownmerchantlogin(td.get("year_2013"))
				.clickEmailStatementUpdatefiltesbutton();
		merchantList = emailStatementCredit.getCampaignPerformancetablevalues();
		boolean actual = emailStatementCredit.CompareImpressions(adminList, merchantList);
		Assert.assertEquals(actual,true," Compaign performance table Impressions list values are not matching with Admin User and Merchant Login UI on  Email Statement credit page,due to loading the page or data is not displayed on Merchant UI");

	}
	  
	@Test()
	public void testRD_2_54() {

		emailStatementCredit.selectMerchantDropdownlist(td.get("merchant_name"))
				.selectDurationDropDownlist(td.get("Yearly"))
				.selectYearDropDownlist(td.get("year_2013"))
				.clickEmailStatementUpdatefiltesbutton();
		adminList = emailStatementCredit.getCampaignPerformancetablevalues();
		emailStatementCredit = getPageFactory().emailStatemetmentpage();
		emailStatementCredit.openRdLoginpage()
				.goToHomePage(td.get("merchant_email"),td.get("merchnat_password"))
				.clickEmailStatementCreditSubMenu()
				.selectDurationDropDownlist(td.get("Yearly"))
				.selectYeardorpdownmerchantlogin(td.get("year_2013"))
				.clickEmailStatementUpdatefiltesbutton();
		merchantList = emailStatementCredit.getCampaignPerformancetablevalues();
		boolean actual = emailStatementCredit.CompareActivations(adminList, merchantList);
		Assert.assertEquals(actual,true," Compaign performance table Activations list values are not matching with Admin User and Merchant Login UI on  Email Statement credit page,due to loading the page or data is not displayed on Merchant UI");

	}
	@Test()
	public void testRD_2_55() {

		emailStatementCredit.selectMerchantDropdownlist(td.get("merchant_name"))
				.selectDurationDropDownlist(td.get("Yearly"))
				.selectYearDropDownlist(td.get("year_2013"))
				.clickEmailStatementUpdatefiltesbutton();
		adminList = emailStatementCredit.getCampaignPerformancetablevalues();
		emailStatementCredit = getPageFactory().emailStatemetmentpage();
		emailStatementCredit.openRdLoginpage()
				.goToHomePage(td.get("merchant_email"),td.get("merchnat_password"))
				.clickEmailStatementCreditSubMenu()
				.selectDurationDropDownlist(td.get("Yearly"))
				.selectYeardorpdownmerchantlogin(td.get("year_2013"))
				.clickEmailStatementUpdatefiltesbutton();
		merchantList = emailStatementCredit.getCampaignPerformancetablevalues();
		boolean actual = emailStatementCredit.CompareRedemptions(adminList, merchantList);
		Assert.assertEquals(actual,true," Compaign performance table Redemptions list values are not matching with Admin User and Merchant Login UI on  Email Statement credit page,due to loading the page or data is not displayed on Merchant UI");

	}
	@Test()
	public void testRD_2_56() {

		emailStatementCredit.selectMerchantDropdownlist(td.get("merchant_name"))
				.selectDurationDropDownlist(td.get("Yearly"))
				.selectYearDropDownlist(td.get("year_2013"))
				.clickEmailStatementUpdatefiltesbutton();
		adminList = emailStatementCredit.getCampaignPerformancetablevalues();
		emailStatementCredit = getPageFactory().emailStatemetmentpage();
		emailStatementCredit.openRdLoginpage()
				.goToHomePage(td.get("merchant_email"),td.get("merchnat_password"))
				.clickEmailStatementCreditSubMenu()
				.selectDurationDropDownlist(td.get("Yearly"))
				.selectYeardorpdownmerchantlogin(td.get("year_2013"))
				.clickEmailStatementUpdatefiltesbutton();
		merchantList = emailStatementCredit.getCampaignPerformancetablevalues();
		boolean actual = emailStatementCredit.CompareRedRate(adminList, merchantList);
		Assert.assertEquals(actual,true," Compaign performance table RedRate list values are not matching with Admin User and Merchant Login UI on  Email Statement credit page,due to loading the page or data is not displayed on Merchant UI");

	}
	@Test()
	public void testRD_2_57() {

		emailStatementCredit.selectMerchantDropdownlist(td.get("merchant_name"))
				.selectDurationDropDownlist(td.get("Yearly"))
				.selectYearDropDownlist(td.get("year_2013"))
				.clickEmailStatementUpdatefiltesbutton();
		adminList = emailStatementCredit.getCampaignPerformancetablevalues();
		emailStatementCredit = getPageFactory().emailStatemetmentpage();
		emailStatementCredit.openRdLoginpage()
				.goToHomePage(td.get("merchant_email"),td.get("merchnat_password"))
				.clickEmailStatementCreditSubMenu()
				.selectDurationDropDownlist(td.get("Yearly"))
				.selectYeardorpdownmerchantlogin(td.get("year_2013"))
				.clickEmailStatementUpdatefiltesbutton();
		merchantList = emailStatementCredit.getCampaignPerformancetablevalues();
		boolean actual = emailStatementCredit.CompareTotalSpend(adminList, merchantList);
		Assert.assertEquals(actual,true," Compaign performance table TotalSpend list values are not matching with Admin User and Merchant Login UI on  Email Statement credit page,due to loading the page or data is not displayed on Merchant UI");

	}
	  
	 @Test()
	public void testRD_2_58() {

		emailStatementCredit.selectMerchantDropdownlist(td.get("merchant_name"))
				.selectDurationDropDownlist(td.get("Yearly"))
				.selectYearDropDownlist(td.get("year_2013"))
				.clickEmailStatementUpdatefiltesbutton();
		adminList = emailStatementCredit.getCampaignPerformancetablevalues();
		emailStatementCredit = getPageFactory().emailStatemetmentpage();
		emailStatementCredit.openRdLoginpage()
				.goToHomePage(td.get("merchant_email"),td.get("merchnat_password"))
				.clickEmailStatementCreditSubMenu()
				.selectDurationDropDownlist(td.get("Yearly"))
				.selectYeardorpdownmerchantlogin(td.get("year_2013"))
				.clickEmailStatementUpdatefiltesbutton();
		merchantList = emailStatementCredit.getCampaignPerformancetablevalues();
		boolean actual = emailStatementCredit.CompareAvgSpend(adminList, merchantList);
		Assert.assertEquals(actual,true," Compaign performance table AvgSpend list values are not matching with Admin User and Merchant Login UI on  Email Statement credit page,due to loading the page or data is not displayed on Merchant UI");

	  }
	  
	@Test()
	public void testRD_2_59() {

		emailStatementCredit.selectMerchantDropdownlist(td.get("merchant_name"))
				.selectDurationDropDownlist(td.get("Yearly"))
				.selectYearDropDownlist(td.get("year_2013"))
				.clickEmailStatementUpdatefiltesbutton();
		adminList = emailStatementCredit.getCampaignPerformancetablevalues();
		emailStatementCredit = getPageFactory().emailStatemetmentpage();
		emailStatementCredit.openRdLoginpage()
				.goToHomePage(td.get("merchant_email"),td.get("merchnat_password"))
				.clickEmailStatementCreditSubMenu()
				.selectDurationDropDownlist(td.get("Yearly"))
				.selectYeardorpdownmerchantlogin(td.get("year_2013"))
				.clickEmailStatementUpdatefiltesbutton();
		merchantList = emailStatementCredit.getCampaignPerformancetablevalues();
		boolean actual = emailStatementCredit.CompareTotalCashback(adminList, merchantList);
		Assert.assertEquals(actual,true," Compaign performance table TotalCashback list values are not matching with Admin User and Merchant Login UI on  Email Statement credit page,due to loading the page or data is not displayed on Merchant UI");

	}
	 
 
	@Test() public void testRD_2_60(){
    emailStatementCredit.selectMerchantDropdownlist(td.get("merchant_name"))
			.selectDurationDropDownlist(td.get("Yearly"))
			.selectYearDropDownlist(td.get("year_2013"))
			.clickEmailStatementUpdatefiltesbutton();
	adminList = emailStatementCredit.getCampaignPerformancetablevalues();
	emailStatementCredit = getPageFactory().emailStatemetmentpage();
	emailStatementCredit.openRdLoginpage()
			.goToHomePage(td.get("merchant_email"),td.get("merchnat_password"))
			.clickEmailStatementCreditSubMenu()
			.selectDurationDropDownlist(td.get("Yearly"))
			.selectYeardorpdownmerchantlogin(td.get("year_2013"))
			.clickEmailStatementUpdatefiltesbutton();
	merchantList = emailStatementCredit.getCampaignPerformancetablevalues();
	boolean actual = emailStatementCredit.CompareCommission(adminList, merchantList); 
	Assert.assertEquals( actual, true, " Compaign performance table Commission list values are not matching with Admin User and Merchant Login UI on  Email Statement credit page,due to loading the page or data is not displayed on Merchant UI");
	 }
	 
	@Test()
	public void testRD_2_61() {

		emailStatementCredit.selectMerchantDropdownlist(td.get("merchant_name"))
				.selectDurationDropDownlist(td.get("Yearly"))
				.selectYearDropDownlist(td.get("year_2013"))
				.clickEmailStatementUpdatefiltesbutton();
		adminList = emailStatementCredit.getCampaignPerformancetablevalues();
		emailStatementCredit = getPageFactory().emailStatemetmentpage();
		emailStatementCredit.openRdLoginpage()
				.goToHomePage(td.get("merchant_email"),td.get("merchnat_password"))
				.clickEmailStatementCreditSubMenu()
				.selectDurationDropDownlist(td.get("Yearly"))
				.selectYeardorpdownmerchantlogin(td.get("year_2013"))
				.clickEmailStatementUpdatefiltesbutton();
		merchantList = emailStatementCredit.getCampaignPerformancetablevalues();
		boolean actual = emailStatementCredit.CompareROAS(adminList, merchantList);
		Assert.assertEquals(actual,true," Compaign performance table ROAS list values are not matching with Admin User and Merchant Login UI on  Email Statement credit page,due to loading the page or data is not displayed on Merchant UI");

	}
	
	@Test()
	public void testRD_2_62() {

		emailStatementCredit.selectMerchantDropdownlist(td.get("merchant_name"))
				.selectDurationDropDownlist(td.get("Yearly"))
				.selectYearDropDownlist(td.get("year_2013"))
				.clickEmailStatementUpdatefiltesbutton();
		adminList = emailStatementCredit.getCampaignPerformancetablevalues();
		emailStatementCredit = getPageFactory().emailStatemetmentpage();
		emailStatementCredit.openRdLoginpage()
				.goToHomePage(td.get("merchant_email"),td.get("merchnat_password"))
				.clickEmailStatementCreditSubMenu()
				.selectDurationDropDownlist(td.get("Yearly"))
				.selectYeardorpdownmerchantlogin(td.get("year_2013"))
				.clickEmailStatementUpdatefiltesbutton();
		merchantList = emailStatementCredit.getCampaignPerformancetablevalues();
		boolean actual = emailStatementCredit.CompareConvFactor(adminList, merchantList);
		Assert.assertEquals(actual,true," Compaign performance table Conv Factor list values are not matching with Admin User and Merchant Login UI on  Email Statement credit page,due to loading the page or data is not displayed on Merchant UI");

	}
	
	  @Test() 
	  public void testRD_2_63(){
	 
		  emailStatementCredit .adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
	  
		  adminKeystatisticsVO=emailStatementCredit.VerifyKeyStatisticstablevalues() ;
		  emailStatementCredit.MerchantloginAndSelectduarationClickUpdate();
	  
		  merchantKeystatisticsVO=emailStatementCredit.VerifyKeyStatisticstablevalues();
	  
		  boolean actual=emailStatementCredit.CompareKeyStatisticsTableValues(adminKeystatisticsVO,merchantKeystatisticsVO); 
		  Assert.assertEquals(actual, true," key Stattistics  table  values are not matching with Admin User and Merchant Login UI on  Email Statement credit page,due to loading the page or data is not displayed on Merchant UI"); 
	  }
  
	  @Test() 
	  public void testRD_2_64(){
	
		  emailStatementCredit.selectMerchantDropdownlist(td.get("merchant_name"))
	  				.selectDurationDropDownlist(td.get("Monthly"))
	  				.selectMonthDropdownlist(td.get("month_may"))
	        		.clickEmailStatementUpdatefiltesbutton();
		  adminKeystatisticsVO=emailStatementCredit.VerifyKeyStatisticstablevalues();
		  emailStatementCredit = getPageFactory().emailStatemetmentpage();
		  emailStatementCredit.openRdLoginpage()
				.goToHomePage(td.get("merchant_email"),td.get("merchnat_password"))
				.clickEmailStatementCreditSubMenu()
				.selectDurationDropDownlist(td.get("Monthly"))
	            .selectMonthDropdownlistWithMerchantlogin(td.get("month_may"))
	            .clickEmailStatementUpdatefiltesbutton();
		  merchantKeystatisticsVO=emailStatementCredit.VerifyKeyStatisticstablevalues();
	  
		  boolean actual=emailStatementCredit.CompareKeyStatisticsTableValues(adminKeystatisticsVO,merchantKeystatisticsVO); 
		  Assert.assertEquals( actual, true," key Stattistics  table  values are not matching with Admin User and Merchant Login UI on  Email Statement credit page,due to loading the page or data is not displayed on Merchant UI");
	  
	    }
	
	     @Test()
		public void testRD_3_65(){
	    	 
	    	  emailStatementCredit.selectMerchantDropdownlist(td.get("merchant_name"))
				.selectDurationDropDownlist(td.get("Yearly"))
	            .selectMonthDropdownlistWithMerchantlogin(td.get("2013"))
	            .clickEmailStatementUpdatefiltesbutton();
			adminpdfdata=emailStatementCredit.ReadPDFdata();
			  
			emailStatementCredit=getPageFactory().emailStatemetmentpage();
			emailStatementCredit .openRdLoginpage().goToHomePage(td.get("merchant_email"), td.get("merchnat_password")).clickEmailStatementCreditSubMenu();
	      
			emailStatementCredit .selectDurationDropDownlist(td.get("Yearly"));
			emailStatementCredit.selectYearDropDownlistMerchantlogin(td.get("2013"));
			emailStatementCredit.clickEmailStatementUpdatefiltesbutton();
		    
		    merchantpdfdata=emailStatementCredit.ReadPDFdata();
		  
		    boolean actual=adminpdfdata.equals(merchantpdfdata);
				Assert.assertEquals(
						actual,
						true,
						" PDF Data are not matching with Admin User and Merchant Login UI on  Email Email Email Email Email Statement credit page,due to loading the page or data is not displayed on Merchant UI");
	      }
		
	     
	     @Test()
			public void testRD_3_66(){
		    	 
		    	emailStatementCredit.selectMerchantDropdownlist(td.get("merchant_name"))
					.selectDurationDropDownlist(td.get("Yearly"))
		            .selectMonthDropdownlistWithMerchantlogin(td.get("2013"))
		            .clickEmailStatementUpdatefiltesbutton();
		      	UIdata=emailStatementCredit.ReadUIdata();
				  
		      	emailStatementCredit = getPageFactory().emailStatemetmentpage();
				emailStatementCredit.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickEmailStatementCreditSubMenu();
				emailStatementCredit.selectMerchantDropdownlist(td.get("merchant_name"))
				.selectDurationDropDownlist(td.get("Yearly"))
	            .selectMonthDropdownlistWithMerchantlogin(td.get("2013"))
	            .clickEmailStatementUpdatefiltesbutton();
				
			    adminpdfdata=emailStatementCredit.ReadPDFdata();
			  	 boolean actual=adminpdfdata.equals(UIdata);
			  
					Assert.assertEquals(
							actual,
							true,
							" PDF Data are not matching with Admin User and Merchant Login UI on  Email Email Email Email Email Statement credit page,due to loading the page or data is not displayed on Merchant UI");
		      }
	     
	     
			
}