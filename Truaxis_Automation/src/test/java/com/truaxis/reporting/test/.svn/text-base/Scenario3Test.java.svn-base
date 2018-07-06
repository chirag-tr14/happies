package com.truaxis.reporting.test;

import static com.truaxis.common.GlobalStaticInfo.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.truaxis.common.BaseTest;

import com.truaxis.reporting.pageobjects.StatementCreditPage;
import com.truaxis.reporting.valueobjects.CampaignPerformanceVO;
import com.truaxis.reporting.valueobjects.KeyStatisticsVO;

public class Scenario3Test extends BaseTest {

	private Map<String, String> td = getTestDataProperties();

	private StatementCreditPage statementCreditPage;
	 List<String> adminpdfdata=new ArrayList<String>();
	 List<String> merchantpdfdata=new ArrayList<String>();
	 List<CampaignPerformanceVO> adminList=null;
	 List<CampaignPerformanceVO> merchantList=null;
	 KeyStatisticsVO  adminKeystatisticsVO=new  KeyStatisticsVO();
	 KeyStatisticsVO  merchantKeystatisticsVO=new   KeyStatisticsVO();
	
	 @BeforeClass
	public void setUpOnce1() {
		statementCreditPage =  getPageFactory().statementCreditPage();
		statementCreditPage.openRdLoginpage()
				.goToHomePage(td.get("admin_email"), td.get("admin_password"))
				.clickStatementCreditSubMenu();
	}

	@Test()
	public void testRD_3_1() {
		boolean actual = statementCreditPage.verifyHeaderText(td
				.get("statement_credit_header"));
		Assert.assertEquals(
				actual,
				true,
				"Reporting: Statement Credit page  ,is not displayed on Statement Credit Page");
	}

	@Test()
	public void testRD_3_2() {
		boolean actual = statementCreditPage.verifyExportLabelsAndButtons(
				td.get("common_exports_text"), td.get("common_exports_button"));
		Assert.assertEquals(
				actual,
				true,
				"Export,PDF,Exel,CSV labels,are not displayed on Statement Credit page");
	}

	@Test()
	public void testRD_3_3() {
		boolean actual = statementCreditPage.verifyMerchantFilterBlock(td
				.get("merchant_text"));
		Assert.assertEquals(
				actual,
				true,
				"Merchnat Filter block ,is not displayed on Statement Credit page");
	}

	@Test()
	public void testRD_3_4() {
		boolean actual = statementCreditPage.verifyDurationFilterBlock(td
				.get("duration_text"));
		Assert.assertEquals(
				actual,
				true,
				"verify Duration Filter Block,is not displayed on Statement Credit page");
	}

	@Test()
	public void testRD_3_5() {
		boolean actual = statementCreditPage
				.verifyUpdatedFilterButtonAppearance(td.get("updated_filters"),
						td.get("button_color"));
		Assert.assertEquals(
				actual,
				true,
				"Updated Filter Button ,is not displayed on Statement Credit page");
	}

	@Test()
	public void testRD_3_6() {
		boolean actual = statementCreditPage.verifyShowExtraFiltersLink(td
				.get("show_exta_filters"));
		Assert.assertEquals(
				actual,
				true,
				"Show Extra Filters Link,is not displayed on Statement Credit page");
	}

	@Test()
	public void testRD_3_7() {
		boolean actual = statementCreditPage
				.verifyMerchantFilterDropDownLabels(td.get("merchant_filters"));
		Assert.assertEquals(
				actual,
				true,
				"verify Merchant Filter DropDown Labels,is not displayed on Statement Credit page");
	}
	
	@Test()
	public void testRD_3_8() {
		boolean actual=statementCreditPage
				.selectMerchantdropdown(td.get("merchant_name"));
		Assert.assertEquals(
				actual,
				true,
				"Merchant Filter DropDown  item ,is not Selected on Statement Credit page");
		
	}
	

	@Test()
	public void testRD_3_9()  {
		boolean actual=statementCreditPage
			 .selectMerchantdropdown(td.get("merchant_name"));
		      statementCreditPage.selectDurationDropDownlist(td.get("Yearly"))
		     .clickEmailStatementUpdatefiltesbutton();
		Assert.assertTrue(actual, "Failed After selecting Duration (yearly) dropdown on statement credit Page,  Either becuase of 1.Year Dropdown is not displyed 2.Data on dropdown is not in a proper format");
	}

	@Test
	public void testRD_3_10()
	{
		statementCreditPage =  getPageFactory().statementCreditPage();
		statementCreditPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickStatementCreditSubMenu();
		boolean actual=statementCreditPage.verifythedurationDropdownfunctionality(td.get("Yearly"));
		Assert.assertTrue(actual, "Failed After selecting Duration (yearly) dropdown on statement credit Page,  Either becuase of 1.Year Dropdown is not displyed 2.Data on dropdown is not in a proper format");
		
	}
	
	@Test
	public void testRD_3_11()
	{
		statementCreditPage =  getPageFactory().statementCreditPage();
		statementCreditPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickStatementCreditSubMenu();
		boolean actual=statementCreditPage.verifythedurationDropdownfunctionality(td.get("Monthly"));
		Assert.assertTrue(actual, "After selecting Duration (Monthly) dropdown on statement credit Page, Either 1.Monthly dropdown is missing 2.data on dropdown is not in a proper format");
		
		
	}
	
	@Test
	public void testRD_3_12()
	{
		statementCreditPage =  getPageFactory().statementCreditPage();
		statementCreditPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickStatementCreditSubMenu();
		boolean actual=statementCreditPage.verifythedurationDropdownfunctionality(td.get("Weekly"));
		Assert.assertTrue(actual, "After selecting Duration (Weekly) dropdown on statement credit Page, Either 1.Weekly dropdown is missing 2.data on dropdown is not in a proper format");
		
		
	}
	
	@Test
	public void testRD_3_13()
	{
		statementCreditPage =  getPageFactory().statementCreditPage();
		statementCreditPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickStatementCreditSubMenu();
		boolean actual=statementCreditPage.verifythedurationDropdownfunctionality(td.get("Custom"));
		Assert.assertTrue(actual, "After selecting Duration (Custom) dropdown on statement credit Page, Either 1.Custom dropdown is missing 2.Start and End calendar is not visible");
		
		
	}
		
	@Test
	public void testRD_3_14()
	{
		statementCreditPage =  getPageFactory().statementCreditPage();
		statementCreditPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickStatementCreditSubMenu();
		boolean actual1=statementCreditPage.verifythedurationDropdownfunctionality(td.get("Custom"));
		boolean actual2=statementCreditPage.verifytheCalendarFunctionality("apply");
		Assert.assertTrue(actual1&&actual2,"Failed either 1.Calender is not displaying properly 2.Selected date is not higlighting on text field" );
		
	}
	
	@Test
	public void testRD_3_15()
	{
		statementCreditPage =  getPageFactory().statementCreditPage();
		statementCreditPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickStatementCreditSubMenu();
		statementCreditPage.verifythedurationDropdownfunctionality(td.get("Custom"));
		boolean actual=statementCreditPage.verifytheCalendarFunctionality("Cancel");
		Assert.assertTrue(actual,"Failed either 1.Calender is not displaying properly 2.Selected date is higlighting on text field" );
		
	}
	
	@Test
	public void testRD_3_16()
	{
		statementCreditPage =  getPageFactory().statementCreditPage();
		statementCreditPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickStatementCreditSubMenu();
		boolean flag1=statementCreditPage.selectMerchantDropdown(td.get("merchant_name"));
		statementCreditPage.selectDurationDropDownlist(td.get("Yearly")).selectYearDropDownlist(td.get("year_2013")).clickEmailStatementUpdatefiltesbutton();
		boolean flag2 = statementCreditPage.verifyKeyStatisticsTableHeaderlabel(td.get("keystatistics_text"));
		boolean flag3 = statementCreditPage.verifyCampaignPerformanceTableHeaderlabel(td.get("campaignperformance_text"));
		Assert.assertEquals(flag1&flag2&flag3,true,"Failed to load image and table data after clicking on  UpdateFilter 1.Either data is not available 2.Failed to click Update button");
	}
	
	@Test
	public void testRD_3_17()
	{
		statementCreditPage.selectmerchantAndClickUpdatefilters();
		boolean flag1 = statementCreditPage.verifyKeyStatisticsTableHeaderlabel(td.get("keystatistics_text"));
		boolean flag2 = statementCreditPage.verifyCampaignPerformanceTableHeaderlabel(td.get("campaignperformance_text"));
		
		Assert.assertTrue(flag1&&flag2,"Failed either because 1.MerchantName not available 2.Update filter button dint display any result ");
	}
	
	@Test
	public void testRD_3_18()
	{
		statementCreditPage.selectMerchantDropdownlist(td.get("merchant_name")).selectDurationDropDownlist(td.get("Yearly")).selectYearDropDownlist("year_2012").clickEmailStatementUpdatefiltesbutton();
		boolean flag1 = statementCreditPage.verifyKeyStatisticsTableHeaderlabel(td.get("keystatistics_text"));
		boolean flag2 = statementCreditPage.verifyCampaignPerformanceTableHeaderlabel(td.get("campaignperformance_text"));
		Assert.assertTrue(flag1&&flag2,"Failed either because 1.MerchantName not available 2 Failed to select year and Click Update Filter button 3.Failed give the result aftre update filter button Click");
	}

	@Test
	public void testRD_3_19()
	{
		statementCreditPage =  getPageFactory().statementCreditPage();
		statementCreditPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickStatementCreditSubMenu();
		boolean flag1=statementCreditPage.selectMerchantDropdown(td.get("merchant_name"));
		 statementCreditPage.selectDurationDropDownlist(td.get("Yearly"));
		boolean flag2=statementCreditPage.selectMonthDropdown(td.get("month_june"));
		statementCreditPage.clickEmailStatementUpdatefiltesbutton();
		boolean flag3 = statementCreditPage.verifyKeyStatisticsTableHeaderlabel(td.get("keystatistics_text"));
		boolean flag4 = statementCreditPage.verifyCampaignPerformanceTableHeaderlabel(td.get("campaignperformance_text"));
		Assert.assertTrue(flag1&&flag2&&flag3&flag4,"Failed either 1. Failed to locate Merchant dropdown 2.Failed to locate Month Dropdown 3.Failed to locate month specified in testdata 4.Failed to load result" );
	}
	
	@Test
	public void testRD_3_20()
	{
		statementCreditPage =  getPageFactory().statementCreditPage();
		statementCreditPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickStatementCreditSubMenu();
		boolean flag1=statementCreditPage.selectMerchantDropdown(td.get("merchant_name"));
		boolean flag2=statementCreditPage.selectDurationDropDown(td.get("Yearly"));
		
		boolean flag4=statementCreditPage.verifyTheResultAfterUpdatefilterbuttonClickWithMerchantName();
		Assert.assertTrue(flag1&&flag2,"Failed either 1. Failed to locate Merchant dropdown 2.Failed to locate Month Dropdown 3.Failed to locate month specified in testdata 4.Failed to load result" );
	}

	@Test()
	public void testRD_3_21() {
		statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		boolean actual = statementCreditPage
				.VerifyKeyStatisticstablevalues().getImpressions().isEmpty();
		Assert.assertEquals(
				actual,
				false,
				"Key Statistics table Impression Value is ,not displayed on Statement credit page");
	}

	@Test()
	public void testRD_3_22() {
		statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		boolean actual = statementCreditPage
				.VerifyKeyStatisticstablevalues().getActivations().isEmpty();
		
		Assert.assertEquals(
				actual,
				false,
				"Key Statistics table Activations  Value is ,not displayed on Statement credit page");
	}

	@Test()
	public void testRD_3_23() {
		statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		boolean actual = statementCreditPage
				.VerifyKeyStatisticstablevalues().getRedemptions().isEmpty();
		Assert.assertEquals(
				actual,
				false,
				"Key Statistics table Redemptions  Value is ,not displayed on Statement credit page");
	}
	

	@Test()
	public void testRD_3_24() {
		statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		boolean actual = statementCreditPage
				.VerifyKeyStatisticstablevalues().getRedRate().isEmpty();
		Assert.assertEquals(
				actual,
				false,
				"Key Statistics table Red. Rate  Value is ,not displayed on Statement credit page");
	}
	
	@Test()
	public void testRD_3_25() {
		statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		boolean actual = statementCreditPage
				.VerifyKeyStatisticstablevalues().getTotalSpend().isEmpty();
		Assert.assertEquals(
				actual,
				false,
				" Key Statistics table Total Spend  Value is ,not displayed on Statement credit page");
	}
	
	@Test()
	public void testRD_3_26() {
		statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		boolean actual = statementCreditPage
				.VerifyKeyStatisticstablevalues().getavgSpend().isEmpty();
		Assert.assertEquals(
				actual,
				false,
				"Key Statistics table Avg. Spend Value is ,not displayed on Statement credit page");
	}
	
	@Test()
	public void testRD_3_27() {
		statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		boolean actual = statementCreditPage
				.VerifyKeyStatisticstablevalues().getTotalCashback().isEmpty();
		Assert.assertEquals(
				actual,
				false,
				" Key Statistics table Total Cashback Value is ,not displayed on Statement credit page");
	}
	@Test()
	public void testRD_3_28() {
		statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		boolean actual = statementCreditPage
				.VerifyKeyStatisticstablevalues().getCommission().isEmpty();
		Assert.assertEquals(
				actual,
				false,
				"Key Statistics table  Commission Value is ,not displayed on Statement credit page");
	}
	@Test()
	public void testRD_3_29() {
		statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		boolean actual = statementCreditPage
				.VerifyKeyStatisticstablevalues().getrOAS().trim().isEmpty();
		Assert.assertEquals(
				actual,
				false,
				"Key Statistics table  ROAS Value is ,not displayed on Statement credit page");
	}
	@Test()
	public void testRD_3_30(){
		statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		boolean actual = statementCreditPage
				.VerifyKeyStatisticstablevalues().getConvFactor().trim().isEmpty();
		Assert.assertEquals(
				actual,
				false,
				" Key Statistics table Conv. Factor Value is ,not displayed on Statement credit page");
	}
	
	@Test()
	public void testRD_3_31(){
		statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		boolean flag1 = statementCreditPage.verifyKeyStatisticsTableHeaderlabel(td.get("keystatistics_text"));
		boolean flag2 = statementCreditPage.verifyCampaignPerformanceTableHeaderlabel(td.get("campaignperformance_text"));
				
		Assert.assertEquals(
				flag1&flag2,
				true,
				"Key Statistics and Campaign Performance table Header label ,not displayed on Statement credit page");
   }
	@Test()
	public void testRD_3_32(){
	statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
	boolean flag = statementCreditPage.verifyMerchantNameHeaderlabel();
		
	Assert.assertEquals(
			flag,
				true,
				"Merchant Name Header label is ,not displayed on Statement credit page on top of the Chart");
  }

	@Test()
	public void testRD_3_33(){
		boolean flag = statementCreditPage.verifyStatementCreditSubMenulinkfunctionality();
		Assert.assertEquals(
				flag,
				true,
				"Statement credit page is not opened ,statement credit page menu link is not working");
   }

	@Test()
	public void testRD_3_34(){
		boolean flag = statementCreditPage.verifylogoutButtonFunctionality();
		Assert.assertEquals(
				flag,
				true,
				" The Logout Operation is not sucessfull in Email Statement Credit Page");
	}
	
	@Test()
	public void testRD_3_35(){
        statementCreditPage =  getPageFactory().statementCreditPage();
		statementCreditPage.openRdLoginpage()
				.goToHomePage(td.get("admin_email"), td.get("admin_password"))
				.clickStatementCreditSubMenu();
		boolean flag = statementCreditPage.verifyHelpButtonFunctionality();
		Assert.assertEquals(
				flag,
				true,
				" The Help Button is not working, it is not displaying any help page");
	}
	

	
	@Test()
	public void testRD_3_36(){
		statementCreditPage =  getPageFactory().statementCreditPage();
		statementCreditPage.openRdLoginpage()
				.goToHomePage(td.get("admin_email"), td.get("admin_password"))
				.clickStatementCreditSubMenu();
		boolean flag1=statementCreditPage.selectMerchantDropdown(td.get("merchant_name"));
		 statementCreditPage.selectDurationDropDownlist(td.get("Yearly"));
		boolean flag2=statementCreditPage.selectMonthDropdown(td.get("month_june"));
		statementCreditPage.clickEmailStatementUpdatefiltesbutton();
		boolean flag3 = statementCreditPage.verifyEmailStatementKeystaticticsTableHeaders( td.get("email_keystatisticstable_headers"));
		Assert.assertEquals(
				flag1&flag2&flag3,
				true,
				" statement credit Key statistics Table headers are  missing");
	}

	@Test()
	public void testRD_3_37(){
		boolean flag1=statementCreditPage.selectMerchantDropdown(td.get("merchant_name"));
		 statementCreditPage.selectDurationDropDownlist(td.get("Yearly"));
		boolean flag2=statementCreditPage.selectMonthDropdown(td.get("month_june"));
		statementCreditPage.clickEmailStatementUpdatefiltesbutton();
		boolean flag3 = statementCreditPage.verifyEmailStatementCompaignPerformanceTableHeaders(td.get("email_CampignPerformanceHeaders"));
		Assert.assertEquals(
				flag1&flag2&flag3,
				true,
				" Compaign performance table headers are  missing  on Statement credit page");
	}
	
	

	@Test()
	public void testRD_3_38(){
		boolean flag1=statementCreditPage.selectMerchantDropdown(td.get("merchant_name"));
		 statementCreditPage.selectDurationDropDownlist(td.get("Yearly"));
		boolean flag2=statementCreditPage.selectMonthDropdown(td.get("month_june"));
		statementCreditPage.clickEmailStatementUpdatefiltesbutton();	
    boolean flag3=statementCreditPage.verifyCompaignPerformanceTableMerchantNamelist();
		Assert.assertEquals(
				flag1&flag2&flag3,
				true,
				" Compaign performance table values Merchant name's are  missing  on Statement credit page,due to loading the page or data is not available  merchant");
	}
	
	@Test()
	public void testRD_3_39(){
		statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
    boolean actual=statementCreditPage.verifyCompaignPerformanceTableCampaignNamelist();
		Assert.assertEquals(
				actual,
				true,
				" Compaign performance table CampaignName's list are  missing  on Statement credit page,due to loading the page or data is not available  merchant");
	}
	
	@Test()
	public void testRD_3_40(){
		statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
    boolean actual=statementCreditPage.verifyCompaignPerformanceTableImpressionslist();
		Assert.assertEquals(
				actual,
				true,
				" Compaign performance table Impressions list are  missing  on Statement credit page,due to loading the page or data is not available  merchant");
	}

	@Test()
	public void testRD_3_41(){
		statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
    boolean actual=statementCreditPage.verifyCompaignPerformanceTableActivationslist();
		Assert.assertEquals(
				actual,
				true,
				" Compaign performance table Impressions list are  missing  on Statement credit page,due to loading the page or data is not available  merchant");
	}
	@Test()
	public void testRD_3_42(){
		statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
    boolean actual=statementCreditPage.verifyCompaignPerformanceTableRedemptionslist();
		Assert.assertEquals(
				actual,
				true,
				" Compaign performance table Redemptions column values are  missing  on  Email Statement credit page,due to loading the page or data is not available  merchant");
	}
	
	@Test()
	public void testRD_3_43(){
		statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
    boolean actual=statementCreditPage.verifyCompaignPerformanceTableRedRatelist();
		Assert.assertEquals(
				actual,
				true,
				" Compaign performance table RedRate column values are  missing  on  Email  Statement credit page,due to loading the page or data is not available  merchant");
	}

	@Test()
	public void testRD_3_44(){
		statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
    boolean actual=statementCreditPage.verifyCompaignPerformanceTableTotalSpendlist();
		Assert.assertEquals(
				actual,
				true,
				" Compaign performance table TotalSpend column values  are  missing  on  Email  Statement credit page,due to loading the page or data is not available  merchant");
	}
	@Test()
	public void testRD_3_45(){
		statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
    boolean actual=statementCreditPage.verifyCompaignPerformanceTableAvgSpendlist();
		Assert.assertEquals(
				actual,
				true,
				" Compaign performance table AvgSpend column values are  missing  on  Email Statement credit page,due to loading the page or data is not available  merchant");
	}
	
	@Test()
	public void testRD_3_46(){
		statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
    boolean actual=statementCreditPage.verifyCompaignPerformanceTableTotalCashbacklist();
		Assert.assertEquals(
				actual,
				true,
				" Compaign performance table TotalCashback column values are  missing  on  Email  Statement credit page,due to loading the page or data is not available  merchant");
	}
	@Test()
	public void testRD_3_47(){
		statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
    boolean actual=statementCreditPage.verifyCompaignPerformanceTableCommissionlist();
		Assert.assertEquals(
				actual,
				true,
				" Compaign performance table Commission column  values are  missing  on  Email  Statement credit page,due to loading the page or data is not available  merchant");
	}
	@Test()
	public void testRD_3_48(){
		statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
    boolean actual=statementCreditPage.verifyCompaignPerformanceTableROASlist();
		Assert.assertEquals(
				actual,
				true,
				" Compaign performance table ROAS column values are  missing  on  Email Statement credit page,due to loading the page or data is not available  merchant");
	}
	
	@Test()
	public void testRD_3_49(){
		statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
    boolean actual=statementCreditPage.verifyCompaignPerformanceTableConvFactorlist();
		Assert.assertEquals(
				actual,
				true,
				" Compaign performance table ConvFactor column  values are  missing  on  Email  Statement credit page,due to loading the page or data is not available  merchant");
	}
	@Test()
	public void testRD_3_50(){
		statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
    boolean actual=statementCreditPage.verifyCompaignPerformanceTableMerchantNamelist();
		Assert.assertEquals(
				actual,
				true,
				" Compaign performance table MerchantName list values are  missing  on  Email  Statement credit page,due to loading the page or data is not available  merchant");
	}
	
	 @Test()
	  	public void testRD_3_51(){
		    statementCreditPage=getPageFactory().statementCreditPage();
		    statementCreditPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickPrepaidGiftCardsSubMenu(); 
		   statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		    adminList=statementCreditPage.getStatementpageCampaignPerformancetablevalues();
		
		    statementCreditPage=getPageFactory().statementCreditPage();
		    statementCreditPage.openRdLoginpage().goToHomePage(td.get("merchant_email"), td.get("merchnat_password")).clickStatementCreditSubMenu();
		    statementCreditPage.selectDurationDropDown(td.get("Yearly"));
		    statementCreditPage.selectYeardorpdownmerchantlogin(td.get("2013"));
		    statementCreditPage.clickEmailStatementUpdatefiltesbutton();
		    merchantList=statementCreditPage.getStatementpageCampaignPerformancetablevalues();
		   
		    boolean actual=statementCreditPage. CompareMerchantName(adminList, merchantList);
			Assert.assertEquals(
					actual,
					true,
					" Compaign performance table MerchantName list values are not matching with Admin User and Merchant Login UI on  Email  Statement credit page,due to loading the page or data is not displayed on Merchant UI");
	   
	     }
	
	 
	 @Test()
	  	public void testRD_3_52(){
		 	statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		    adminList=statementCreditPage.getStatementpageCampaignPerformancetablevalues();
		    statementCreditPage.MerchantloginAndSelectduarationClickUpdate();
		    merchantList=statementCreditPage.getStatementpageCampaignPerformancetablevalues();
		   
		    boolean actual=statementCreditPage. CompareCampaignName(adminList, merchantList);
			Assert.assertEquals(
					actual,
					true,
					" Compaign performance table CampaignName list values are not matching with Admin User and Merchant Login UI on  Email  Statement credit page,due to loading the page or data is not displayed on Merchant UI");
	   
	     }

	   @Test()
	  	public void testRD_3_53(){
		 	statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		    adminList=statementCreditPage.getStatementpageCampaignPerformancetablevalues();
		    statementCreditPage.MerchantloginAndSelectduarationClickUpdate();
		    merchantList=statementCreditPage.getStatementpageCampaignPerformancetablevalues();
		   
		    boolean actual=statementCreditPage. CompareCampaignName(adminList, merchantList);
			Assert.assertEquals(
					actual,
					true,
					" Compaign performance table CampaignName list values are not matching with Admin User and Merchant Login UI on  Email  Statement credit page,due to loading the page or data is not displayed on Merchant UI");
	   
	     }
	 
	   
	   @Test()
	  	public void testRD_3_54(){
		 	statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		    adminList=statementCreditPage.getStatementpageCampaignPerformancetablevalues();
		    statementCreditPage.MerchantloginAndSelectduarationClickUpdate();
		    merchantList=statementCreditPage.getStatementpageCampaignPerformancetablevalues();
		   
		    boolean actual=statementCreditPage. CompareActivations(adminList, merchantList);
			Assert.assertEquals(
					actual,
					true,
					" Compaign performance table Activations list values are not matching with Admin User and Merchant Login UI on  Email  Statement credit page,due to loading the page or data is not displayed on Merchant UI");
	   
	     }
	   @Test()
	  	public void testRD_3_55(){
		 	statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		    adminList=statementCreditPage.getStatementpageCampaignPerformancetablevalues();
		    statementCreditPage.MerchantloginAndSelectduarationClickUpdate();
		    merchantList=statementCreditPage.getStatementpageCampaignPerformancetablevalues();
		   
		    boolean actual=statementCreditPage. CompareImpressions(adminList, merchantList);
			Assert.assertEquals(
					actual,
					true,
					" Compaign performance table Impressions list values are not matching with Admin User and Merchant Login UI on  Email  Statement credit page,due to loading the page or data is not displayed on Merchant UI");
	   
	     }
	   
	   
	   @Test()
	  	public void testRD_3_56(){
		 	statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		    adminList=statementCreditPage.getStatementpageCampaignPerformancetablevalues();
		    statementCreditPage.MerchantloginAndSelectduarationClickUpdate();
		    merchantList=statementCreditPage.getStatementpageCampaignPerformancetablevalues();
		   
		    boolean actual=statementCreditPage. CompareRedemptions(adminList, merchantList);
			Assert.assertEquals(
					actual,
					true,
					" Compaign performance table Redemptions list values are not matching with Admin User and Merchant Login UI on  Email  Statement credit page,due to loading the page or data is not displayed on Merchant UI");
	   }
	 
	   @Test()
	  	public void testRD_3_57(){
		 	statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		    adminList=statementCreditPage.getStatementpageCampaignPerformancetablevalues();
		    statementCreditPage.MerchantloginAndSelectduarationClickUpdate();
		    merchantList=statementCreditPage.getStatementpageCampaignPerformancetablevalues();
		   
		    boolean actual=statementCreditPage. CompareRedRate(adminList, merchantList);
			Assert.assertEquals(
					actual,
					true,
					" Compaign performance table RedRate list values are not matching with Admin User and Merchant Login UI on  Email  Statement credit page,due to loading the page or data is not displayed on Merchant UI");
	   }
	   
	   @Test()
	  	public void testRD_2_58(){
		 	statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		    adminList=statementCreditPage.getStatementpageCampaignPerformancetablevalues();
		    statementCreditPage.MerchantloginAndSelectduarationClickUpdate();
		    merchantList=statementCreditPage.getStatementpageCampaignPerformancetablevalues();
		   
		    boolean actual=statementCreditPage. CompareTotalSpend(adminList, merchantList);
			Assert.assertEquals(
					actual,
					true,
					" Compaign performance table TotalSpend list values are not matching with Admin User and Merchant Login UI on  Email  Statement credit page,due to loading the page or data is not displayed on Merchant UI");
	   }
	   @Test()
	  	public void testRD_3_59(){
		 	statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		    adminList=statementCreditPage.getStatementpageCampaignPerformancetablevalues();
		    statementCreditPage.MerchantloginAndSelectduarationClickUpdate();
		    merchantList=statementCreditPage.getStatementpageCampaignPerformancetablevalues();
		   
		    boolean actual=statementCreditPage. CompareAvgSpend(adminList, merchantList);
			Assert.assertEquals(
					actual,
					true,
					" Compaign performance table Avg Spend list values are not matching with Admin User and Merchant Login UI on  Email  Statement credit page,due to loading the page or data is not displayed on Merchant UI");
	   }
	   
	   
	   @Test()
	  	public void testRD_3_60(){
		 	statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		    adminList=statementCreditPage.getStatementpageCampaignPerformancetablevalues();
		    statementCreditPage.MerchantloginAndSelectduarationClickUpdate();
		    merchantList=statementCreditPage.getStatementpageCampaignPerformancetablevalues();
		   
		    boolean actual=statementCreditPage. CompareTotalCashback(adminList, merchantList);
			Assert.assertEquals(
					actual,
					true,
					" Compaign performance table Total Cashback list values are not matching with Admin User and Merchant Login UI on  Email  Statement credit page,due to loading the page or data is not displayed on Merchant UI");
	   }
	   
	   
	   @Test()
	  	public void testRD_3_61(){
		 	statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		    adminList=statementCreditPage.getStatementpageCampaignPerformancetablevalues();
		    statementCreditPage.MerchantloginAndSelectduarationClickUpdate();
		    merchantList=statementCreditPage.getStatementpageCampaignPerformancetablevalues();
		   
		    boolean actual=statementCreditPage. CompareCommission(adminList, merchantList);
			Assert.assertEquals(
					actual,
					true,
					" Compaign performance table Commission list values are not matching with Admin User and Merchant Login UI on  Email  Statement credit page,due to loading the page or data is not displayed on Merchant UI");
	   }
	 
	   @Test()
	  	public void testRD_3_62(){
		 	statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		    adminList=statementCreditPage.getStatementpageCampaignPerformancetablevalues();
		    statementCreditPage.MerchantloginAndSelectduarationClickUpdate();
		    merchantList=statementCreditPage.getStatementpageCampaignPerformancetablevalues();
		   
		    boolean actual=statementCreditPage.CompareROAS(adminList, merchantList);
			Assert.assertEquals(
					actual,
					true,
					" Compaign performance table ROAS list values are not matching with Admin User and Merchant Login UI on  Email  Statement credit page,due to loading the page or data is not displayed on Merchant UI");
	   }
	 
	   @Test()
	  	public void testRD_3_63(){
		 	statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		    adminList=statementCreditPage.getStatementpageCampaignPerformancetablevalues();
		    statementCreditPage.MerchantloginAndSelectduarationClickUpdate();
		    merchantList=statementCreditPage.getStatementpageCampaignPerformancetablevalues();
		   
		    boolean actual=statementCreditPage. CompareConvFactor(adminList, merchantList);
			Assert.assertEquals(
					actual,
					true,
					" Compaign performance table ConvFactor list values are not matching with Admin User and Merchant Login UI on  Email  Statement credit page,due to loading the page or data is not displayed on Merchant UI");
	   }
	
	   @Test()
	  	public void testRD_3_64(){
		   	statementCreditPage=getPageFactory().statementCreditPage();
			statementCreditPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickPrepaidGiftCardsSubMenu(); 
		 	statementCreditPage.adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate();
		 	adminKeystatisticsVO=statementCreditPage.VerifyKeyStatisticstablevalues();
		 	
		 	statementCreditPage=getPageFactory().statementCreditPage();
		 	statementCreditPage.openRdLoginpage().goToHomePage(td.get("merchant_email"), td.get("merchnat_password")).clickStatementCreditSubMenu();
		    statementCreditPage.MerchantloginAndSelectduarationClickUpdate();
		    merchantKeystatisticsVO=statementCreditPage.VerifyKeyStatisticstablevalues();
		    boolean actual=statementCreditPage.CompareKeyStatisticsTableValues(adminKeystatisticsVO,merchantKeystatisticsVO);
			Assert.assertEquals(
					actual,
					true,
					" key Stattistics  table  values are not matching with Admin User and Merchant Login UI on  Email  Statement credit page,due to loading the page or data is not displayed on Merchant UI");
	   }
	   
	   
	

	//PDF Comparision
	@Test()
	public void testRD_3_65(){
		statementCreditPage.selectMerchantDropdownlist(td.get("merchant_name"))
							.selectDurationDropDownlist(td.get("Yearly"))
							.selectYearDropDownlist(td.get("2013"))
							.clickEmailStatementUpdatefiltesbutton();
		
		adminpdfdata=statementCreditPage.ReadPDFdata();
		  
	    statementCreditPage=getPageFactory().statementCreditPage();
	    statementCreditPage .openRdLoginpage().goToHomePage(td.get("merchant_email"), td.get("merchnat_password")).clickStatementCreditSubMenu();
      
	    statementCreditPage  .selectDurationDropDownlist(td.get("Yearly"));
	    statementCreditPage.selectYearDropDownlistMerchantlogin(td.get("2013"));
	    statementCreditPage	.clickEmailStatementUpdatefiltesbutton();
	    
	    merchantpdfdata=statementCreditPage.ReadPDFdata();
	   
		 boolean actual=adminpdfdata.equals(merchantpdfdata);
			Assert.assertEquals(
					actual,
					true,
					" PDF Data are not matching with Admin User and Merchant Login UI on  Email Statement credit page,due to loading the page or data is not displayed on Merchant UI");
      }
	
	
}