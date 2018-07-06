package com.truaxis.reporting.pageobjects;


import static com.truaxis.common.GlobalStaticInfo.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.core.reports.TestNGCustomReporter;
import com.truaxis.common.PageFactory;
import com.truaxis.reporting.valueobjects.CampaignPerformanceVO;
import com.truaxis.reporting.valueobjects.KeyStatisticsVO;

public class WeeklyStatementCreditPerformancePage extends RDHomePage
{
	public WeeklyStatementCreditPerformancePage(WebDriver webDriver,PageFactory pgFactory) 
	{
		super(webDriver,pgFactory);
	}
	
	public boolean verifyWeeklyStatementCreditPerformancePageHeaderText(String expected) {
		boolean flag = verifyExpectedText(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_HEADER_LABEL, expected);
		return flag;
	}
	
	public boolean verifyWeeklyStatementTableHeaders(String name, String expected)
    {
		String merchantName = name+" "+expected;
		selectmerchantAndClickUpdatefilters();
		boolean flag = verifyExpectedText(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_MERCHANT_NAME_LABEL, merchantName);
		if(flag) {
			TestNGCustomReporter.logbr(" Credit statement found for merchant name:"+name);
			return true;
		} else
		{
			TestNGCustomReporter.logbr(" Credit statement not found for merchant name:"+name);
			return false;
		}
    }
	
	public boolean verifyColumnNames(String column_names) {
		List<String> impressionsColumnList = new ArrayList<String>();
		selectmerchantAndClickUpdatefilters();
		List<WebElement> impressionsColumn= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_COLUMN_NAMES);
		for(WebElement impressionsList: impressionsColumn) {
			impressionsColumnList.add(impressionsList.getText());
		}
		String columnNames = impressionsColumnList.toString();
		String names = columnNames.substring(1, columnNames.length()-1);
		boolean flag = names.equalsIgnoreCase(column_names);
		return flag;
	}
	
	public List<String> adminTableElementsForYearly(String merchant, String duration,String year) {
		List<String> adminValueList = new ArrayList<String>();
		List<String> adminPageElementsList = new ArrayList<String>();
		selectMerchantdropdown(merchant);
		selectEmailStatementCreditDurationdropdown(duration);
		selectYeardorpdown(year);
		clickEmailStatementUpdatefiltesbutton();
		List<WebElement> adminValues= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_TABLE_VALUES);
		for(WebElement adminElements: adminValues){
			adminValueList.add(adminElements.getText());
		}
		List<WebElement> adminCampaignNames= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_CAMPAIGN_NAMES);
		for(WebElement campaignNames:adminCampaignNames) {
			adminPageElementsList.add(campaignNames.getText());
		}
		adminPageElementsList.addAll(adminValueList);
		return adminPageElementsList;
	}
	
	public List<String> merchantTableElementsForYearly(String duration, String year) {
		List<String> merchantValueList = new ArrayList<String>();
		List<String> merchantPageElementsList = new ArrayList<String>();
		selectEmailStatementCreditDurationdropdown(duration);
		selectYearDropdownForMerchant(year);
		clickEmailStatementUpdatefiltesbutton();
		List<WebElement> merchantValues= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_TABLE_VALUES);
		for(WebElement merchantElements: merchantValues){
			merchantValueList.add(merchantElements.getText());
		}
		List<WebElement> merchantCampaignNames= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_CAMPAIGN_NAMES);
		for(WebElement campaignNames:merchantCampaignNames) {
			merchantPageElementsList.add(campaignNames.getText());
		}
		merchantPageElementsList.addAll(merchantValueList);
		return merchantPageElementsList;
	}
	
	public boolean verifyAdminAndMerchantValues(List<String> adminTable, List<String> merchantTable) {
		boolean flag=false;
		if(adminTable.equals(merchantTable)) {
			flag = false;
			TestNGCustomReporter.logbr("Admin and Merchant values are equals");
		} else
		{
			TestNGCustomReporter.logbr("Admin and Merchant values are equals");
			flag=true;
		}
		return flag;
	}
	
	public List<String> adminTableElementsForMonthly(String merchant, String duration, String month) {
		List<String> adminValueList = new ArrayList<String>();
		List<String> adminPageElementsList = new ArrayList<String>();
		selectMerchantdropdown(merchant);
		selectEmailStatementCreditDurationdropdown(duration);
		selectMonthDropdown(month);
		clickEmailStatementUpdatefiltesbutton();
		List<WebElement> adminElementNames= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_TABLE_VALUES);
		for(WebElement adminNames: adminElementNames){
			adminValueList.add(adminNames.getText());
		}
		List<WebElement> adminCampaignNames= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_CAMPAIGN_NAMES);
		for(WebElement campaignNames:adminCampaignNames) {
			adminPageElementsList.add(campaignNames.getText());
		}
		adminPageElementsList.addAll(adminValueList);
		return adminPageElementsList;
	}
	
	public List<String> merchantTableElementsForMonthly(String duration, String month) {
		List<String> merchantValueList = new ArrayList<String>();
		List<String> merchantPageElementsList = new ArrayList<String>();
		selectEmailStatementCreditDurationdropdown(duration);
		selectMonthDropdownForMerchant(month);
		clickEmailStatementUpdatefiltesbutton();
		List<WebElement> merchantElementNames= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_TABLE_VALUES);
		for(WebElement merchantNames: merchantElementNames){
			merchantValueList.add(merchantNames.getText());
		}
		List<WebElement> merchantCampaignNames= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_CAMPAIGN_NAMES);
		for(WebElement campaignNames:merchantCampaignNames) {
			merchantPageElementsList.add(campaignNames.getText());
		}
		merchantPageElementsList.addAll(merchantValueList);
		return merchantPageElementsList;
	}
	
	public List<String> adminTableElementsForWeekly(String merchant, String duration, String week) {
		List<String> adminValueList = new ArrayList<String>();
		List<String> adminPageElementsList = new ArrayList<String>();
		selectMerchantdropdown(merchant);
		selectEmailStatementCreditDurationdropdown(duration);
		selectWeekDropdown(week);
		clickEmailStatementUpdatefiltesbutton();
		List<WebElement> adminElementNames= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_TABLE_VALUES);
		for(WebElement adminNames: adminElementNames){
			adminValueList.add(adminNames.getText());
		}
		List<WebElement> adminCampaignNames= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_CAMPAIGN_NAMES);
		for(WebElement campaignNames:adminCampaignNames) {
			adminPageElementsList.add(campaignNames.getText());
		}
		adminPageElementsList.addAll(adminValueList);
		return adminPageElementsList;
	}
	
	public List<String> merchantTableElementsForWeekly(String duration, String week) {
		List<String> merchantValueList = new ArrayList<String>();
		List<String> merchantPageElementsList = new ArrayList<String>();
		selectEmailStatementCreditDurationdropdown(duration);
		selectWeekDropdownForMerchant(week);
		clickEmailStatementUpdatefiltesbutton();
		List<WebElement> merchantElementNames= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_TABLE_VALUES);
		for(WebElement merchantNames: merchantElementNames){
			merchantValueList.add(merchantNames.getText());
		}
		List<WebElement> merchantCampaignNames= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_CAMPAIGN_NAMES);
		for(WebElement campaignNames:merchantCampaignNames) {
			merchantPageElementsList.add(campaignNames.getText());
		}
		merchantPageElementsList.addAll(merchantValueList);
		return merchantPageElementsList;
	}
	
	public List<String> adminTableElementsForCustom(String merchant, String duration, String date) {
		List<String> adminValueList = new ArrayList<String>();
		List<String> adminPageElementsList = new ArrayList<String>();
		selectMerchantdropdown(merchant);
		selectEmailStatementCreditDurationdropdown(duration);
		enterValue(EMAILSTATEMENTPAGE_STARTDATEANDENDDATE_TXT, date);
		clickElement(EMAILSTATEMENTPAGE_CALENDERAPPLY_BTN);
		clickEmailStatementUpdatefiltesbutton();  
		List<WebElement> adminElementNames= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_TABLE_VALUES);
		for(WebElement adminNames: adminElementNames){
			adminValueList.add(adminNames.getText());
		}
		List<WebElement> adminCampaignNames= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_CAMPAIGN_NAMES);
		for(WebElement campaignNames:adminCampaignNames) {
			adminPageElementsList.add(campaignNames.getText());
		}
		adminPageElementsList.addAll(adminValueList);
		return adminPageElementsList;
	}
	
	public List<String> merchantTableElementsForCustom(String duration, String date) {
		List<String> merchantValueList = new ArrayList<String>();
		List<String> merchantPageElementsList = new ArrayList<String>();
		selectEmailStatementCreditDurationdropdown(duration);
		enterValue(EMAILSTATEMENTPAGE_STARTDATEANDENDDATE_TXT, date);
		clickElement(EMAILSTATEMENTPAGE_CALENDERAPPLY_BTN);
		clickEmailStatementUpdatefiltesbutton();
		List<WebElement> merchantElementNames= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_TABLE_VALUES);
		for(WebElement merchantNames: merchantElementNames){
			merchantValueList.add(merchantNames.getText());
		}
		List<WebElement> merchantCampaignNames= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_CAMPAIGN_NAMES);
		for(WebElement campaignNames:merchantCampaignNames) {
			merchantPageElementsList.add(campaignNames.getText());
		}
		merchantPageElementsList.addAll(merchantValueList);
		return merchantPageElementsList;
	}
		
	public boolean verifyWeekendColumnForEmpty() {
		boolean flag=false;
		List<String> weekendColumnList = new ArrayList<String>();
		selectmerchantAndClickUpdatefilters();
		List<WebElement> weekendColumn= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_WEEKEND_LIST);
		for(WebElement weekendList: weekendColumn){
			weekendColumnList.add(weekendList.getText());
		}
		for(int i=0;i<weekendColumnList.size();i++) {
			flag = !(weekendColumnList.get(i).isEmpty());
			if(flag) {
				TestNGCustomReporter.logbr("Weekend value is not empty");
				flag = true;			
			} else
			{
				TestNGCustomReporter.logbr("Weekend value is empty");
				flag= false;
				break;
			}
		}
		return flag;
	}
	
	public boolean verifyImpressionsColumnForEmpty() {
		boolean flag=false;
		List<String> impressionsColumnList = new ArrayList<String>();
		selectmerchantAndClickUpdatefilters();
		List<WebElement> impressionsColumn= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_IMPRESSIONS_LIST);
		for(WebElement impressionsList: impressionsColumn){
			impressionsColumnList.add(impressionsList.getText());
		}
		for(int i=0;i<impressionsColumnList.size();i++) {
			flag = !(impressionsColumnList.get(i).isEmpty());
			if(flag) {
				TestNGCustomReporter.logbr("Impressions value is not empty");
				flag = true;			
			} else
			{
				TestNGCustomReporter.logbr("Impressions value is empty");
				flag= false;
				break;
			}
		}
		return flag;
	}
	
	public boolean verifyActivationsColumnForEmpty() {
		boolean flag=false;
		List<String> activationsColumnList = new ArrayList<String>();
		selectmerchantAndClickUpdatefilters();
		List<WebElement> activationColumn= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_ACTIVATIONS_LIST);
		for(WebElement activationsList: activationColumn){
			activationsColumnList.add(activationsList.getText());
		}
		for(int i=0;i<activationsColumnList.size();i++) {
			flag = !(activationsColumnList.get(i).isEmpty());
			if(flag) {
				TestNGCustomReporter.logbr("Activations value is not empty");
				flag = true;			
			} else
			{
				TestNGCustomReporter.logbr("Activations value is empty");
				flag= false;
				break;
			}
		}
		return flag;
	}
	
	public boolean verifyRedemptionsColumnForEmpty() {
		boolean flag=false;
		List<String> redemptionsColumnList = new ArrayList<String>();
		selectmerchantAndClickUpdatefilters();
		List<WebElement> redemptionsColumn= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_REDEMPTIONS_LIST);
		for(WebElement redemptionsList: redemptionsColumn){
			redemptionsColumnList.add(redemptionsList.getText());
		}
		for(int i=0;i<redemptionsColumnList.size();i++) {
			flag = !(redemptionsColumnList.get(i).isEmpty());
			if(flag) {
				TestNGCustomReporter.logbr("Redemptions value is not empty");
				flag = true;			
			} else
			{
				TestNGCustomReporter.logbr("Redemptions value is empty");
				flag= false;
				break;
			}
		}
		return flag;
	}
	
	public boolean verifyTotalSpendColumnForEmpty() {
		boolean flag=false;
		List<String> totalSpendColumnList = new ArrayList<String>();
		selectmerchantAndClickUpdatefilters();
		List<WebElement> totalSpendColumn= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_TOTAL_SPEND_LIST);
		for(WebElement totalSpendList: totalSpendColumn){
			totalSpendColumnList.add(totalSpendList.getText());
		}
		for(int i=0;i<totalSpendColumnList.size();i++) {
			flag = !(totalSpendColumnList.get(i).isEmpty());
			if(flag) {
				TestNGCustomReporter.logbr("Total Spend value is not empty");
				flag = true;			
			} else
			{
				TestNGCustomReporter.logbr("Total Spend value is empty");
				flag= false;
				break;
			}
		}
		return flag;
	}
	
	public boolean verifyTotalCashbackColumnForEmpty() {
		boolean flag=false;
		List<String> totalCashbackColumnList = new ArrayList<String>();
		selectmerchantAndClickUpdatefilters();
		List<WebElement> totalCashbackColumn= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_TOTAL_CASHBACK_LIST);
		for(WebElement totalCashbackList: totalCashbackColumn){
			totalCashbackColumnList.add(totalCashbackList.getText());
		}
		for(int i=0;i<totalCashbackColumnList.size();i++) {
			flag = !(totalCashbackColumnList.get(i).isEmpty());
			if(flag) {
				TestNGCustomReporter.logbr("Total Cashback value is not empty");
				flag = true;			
			} else
			{
				TestNGCustomReporter.logbr("Total Cashback value is empty");
				flag= false;
				break;
			}
		}
		return flag;
	}
	
	public boolean verifyRedemptionRateColumnForEmpty() {
		boolean flag=false;
		List<String> redemptionRateColumnList = new ArrayList<String>();
		selectmerchantAndClickUpdatefilters();
		List<WebElement> redemptionRateColumn= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_REDEMPTION_RATE_LIST);
		for(WebElement redemptionRateList: redemptionRateColumn){
			redemptionRateColumnList.add(redemptionRateList.getText());
		}
		for(int i=0;i<redemptionRateColumnList.size();i++) {
			flag = !(redemptionRateColumnList.get(i).isEmpty());
			if(flag) {
				TestNGCustomReporter.logbr("Redemption Rate value is not empty");
				flag = true;			
			} else
			{
				TestNGCustomReporter.logbr("Redemption Rate value is empty");
				flag= false;
				break;
			}
		}
		return flag;
	}
	
	public boolean verifyAvgSpendColumnForEmpty() {
		boolean flag=false;
		List<String> avgSpendColumnList = new ArrayList<String>();
		selectmerchantAndClickUpdatefilters();
		List<WebElement> avgSpendColumn= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_AVG_SPEND_LIST);
		for(WebElement avgSpendList: avgSpendColumn){
			avgSpendColumnList.add(avgSpendList.getText());
		}
		for(int i=0;i<avgSpendColumnList.size();i++) {
			flag = !(avgSpendColumnList.get(i).isEmpty());
			if(flag) {
				TestNGCustomReporter.logbr("Avg Spend value is not empty");
				flag = true;			
			} else
			{
				TestNGCustomReporter.logbr("Avg Spend value is empty");
				flag= false;
				break;
			}
		}
		return flag;
	}
	
	public boolean verifyCommissionColumnForEmpty() {
		boolean flag=false;
		List<String> commissionColumnList = new ArrayList<String>();
		selectmerchantAndClickUpdatefilters();
		List<WebElement> commissionColumn= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_COMMISSION_LIST);
		for(WebElement commissionList: commissionColumn){
			commissionColumnList.add(commissionList.getText());
		}
		for(int i=0;i<commissionColumnList.size();i++) {
			flag = !(commissionColumnList.get(i).isEmpty());
			if(flag) {
				TestNGCustomReporter.logbr("Commission value is not empty");
				flag = true;			
			} else
			{
				TestNGCustomReporter.logbr("Commission value is empty");
				flag= false;
				break;
			}
		}
		return flag;
	}
	
	public boolean verifyRoasColumnForEmpty() {
		boolean flag=false;
		List<String> roasColumnList = new ArrayList<String>();
		selectmerchantAndClickUpdatefilters();
		List<WebElement> roasColumn= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_ROAS_LIST);
		for(WebElement roasList: roasColumn){
			roasColumnList.add(roasList.getText());
		}
		for(int i=0;i<roasColumnList.size();i++) {
			flag = !(roasColumnList.get(i).isEmpty());
			if(flag) {
				TestNGCustomReporter.logbr("Roas value is not empty");
				flag = true;			
			} else
			{
				TestNGCustomReporter.logbr("Roas value is empty");
				flag= false;
				break;
			}
		}
		return flag;
	}
	
	public List<String> displayCampaignNamesWithValuesForYearly() {
		List<String> elementList = new ArrayList<String>();
		selectmerchantAndClickUpdatefilters();
		List<WebElement> elements = returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_CONTENTS_VALUES);
		for(WebElement pageElement:elements) {
			elementList.add(pageElement.getText());
		}
		System.out.println(elementList);
		return elementList;
	}
	
	public List<String> displayCampaignNamesWithValuesForMonthly(String duration, String month) {
		List<String> elementList = new ArrayList<String>();
		selectmerchantAndClickUpdatefiltersForMonthly(duration, month);
		List<WebElement> elements = returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_CONTENTS_VALUES);
		for(WebElement pageElement:elements) {
			elementList.add(pageElement.getText());
		}
		System.out.println(elementList);
		return elementList;
	}
	
	public List<String> displayCampaignNamesWithValuesForWeekly(String duration, String month) {
		List<String> elementList = new ArrayList<String>();
		selectmerchantAndClickUpdatefiltersForWeekly(duration, month);
		List<WebElement> elements = returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_CONTENTS_VALUES);
		for(WebElement pageElement:elements) {
			elementList.add(pageElement.getText());
		}
		System.out.println(elementList);
		return elementList;
	}
	
	public List<String> adminTableColumnNames() {
		List<String> adminElements = new ArrayList<String>();
		selectmerchantAndClickUpdatefilters();
		List<WebElement> adminElementNames= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_COLUMN_NAMES);
		for(WebElement adminNames: adminElementNames){
			adminElements.add(adminNames.getText());
		}
		System.out.println("Admin Column Names:"+adminElements);
		return adminElements;
	}
	
	public List<String> merchantTableColumnNames(String duration) {
		List<String> merchantElements = new ArrayList<String>();
		selectEmailStatementCreditDurationdropdown(duration);
		clickEmailStatementUpdatefiltesbutton();
		List<WebElement> merchantElementNames= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_COLUMN_NAMES);
		for(WebElement merchantNames: merchantElementNames){
			merchantElements.add(merchantNames.getText());
		}
		System.out.println("Merchant Column Names:"+merchantElements);
		return merchantElements;
	}
	
	public boolean verifyDataNotDisplayedForCustomDuration(String duration) {
		boolean flag = false;
		verifythedurationDropdownfunctionality(duration);
		clickEmailStatementUpdatefiltesbutton();
		String data = getText(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_ELEMENTS_EMPTY);
		if(data.equalsIgnoreCase(" ")) {
			TestNGCustomReporter.logbr("No data displayed for not selecting custom date");
			flag = true;
		} else
		{
			TestNGCustomReporter.logbr("Data displayed for not selecting custom date");
			flag = false;
		}
		return flag;
	}

	public boolean verifyDataDisplayedForCustomDuration(String duration, String date) {
		boolean flag = false;
		List<String> valueList = new ArrayList<String>();
		List<String> elementsList = new ArrayList<String>();
		verifythedurationDropdownfunctionality(duration);
		enterValue(EMAILSTATEMENTPAGE_STARTDATEANDENDDATE_TXT, date);
		clickElement(EMAILSTATEMENTPAGE_CALENDERAPPLY_BTN);
		clickEmailStatementUpdatefiltesbutton();
		String data = getText(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_COLUMN_NAMES);
		if(data.equalsIgnoreCase(" ")) {
			TestNGCustomReporter.logbr("No data displayed for custom date");
			flag = false;
		} else
		{
			List<WebElement> values= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_TABLE_VALUES);
			for(WebElement elements: values){
				valueList.add(elements.getText());
			}
			List<WebElement> campaignNames= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_CAMPAIGN_NAMES);
			for(WebElement names:campaignNames) {
				elementsList.add(names.getText());
			}
			elementsList.addAll(valueList);
			System.out.println(elementsList);
			flag=true;
		}
		return flag;
	}
	
	public List<String> displayDataForShowMoreFilters(String merchant, String duration, String year, String month, 
			String week, String date, String platform, String fI, String show) {
		List<String> elementList = new ArrayList<String>();
		selectMerchantdropdown(merchant);
		selectEmailStatementCreditDurationdropdown(duration);
		if(duration.equalsIgnoreCase("Yearly")) {
			selectYeardorpdown(year);
		}else if(duration.equalsIgnoreCase("Monthly")) {
			selectMonthDropdown(month);
		} else if(duration.equalsIgnoreCase("Weekly")) {
			selectWeekDropdown(week);
		} else {
			enterValue(EMAILSTATEMENTPAGE_STARTDATEANDENDDATE_TXT, date);
			clickElement(EMAILSTATEMENTPAGE_CALENDERAPPLY_BTN);
		}
		clickElement(COMMON_SHOW_EXTRA_FILTERS_LINK);
		selectPlatformDropdown(platform);
		selectFinancialInstituteDropDown(fI);
		selectShowdropdown(show);
		clickEmailStatementUpdatefiltesbutton();
		List<WebElement> elements = returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_CONTENTS_VALUES);
		for(WebElement pageElement:elements) {
			elementList.add(pageElement.getText());
		}
		System.out.println(elementList);
		return elementList;
	}
	
	public boolean displayNoTagsDataForShowMoreFilters(String merchant, String duration, String year, String month, 
			String week, String date, String platform, String fI, String show) {
		boolean flag=true;
		List<String> adminValueList = new ArrayList<String>();
		List<String> adminPageElementsList = new ArrayList<String>();
		selectMerchantdropdown(merchant);
		selectEmailStatementCreditDurationdropdown(duration);
		if(duration.equalsIgnoreCase("Yearly")) {
			selectYeardorpdown(year);
		}else if(duration.equalsIgnoreCase("Monthly")) {
			selectMonthDropdown(month);
		} else if(duration.equalsIgnoreCase("Weekly")) {
			selectWeekDropdown(week);
		} else {
			enterValue(EMAILSTATEMENTPAGE_STARTDATEANDENDDATE_TXT, date);
			clickElement(EMAILSTATEMENTPAGE_CALENDERAPPLY_BTN);
		}
		clickElement(COMMON_SHOW_EXTRA_FILTERS_LINK);
		selectPlatformDropdown(platform);
		selectFinancialInstituteDropDown(fI);
		selectShowdropdown(show);
		clickEmailStatementUpdatefiltesbutton();
		
		List<WebElement> adminElementNames= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_TABLE_VALUES);
		for(WebElement adminNames: adminElementNames){
			adminValueList.add(adminNames.getText());
		}
		System.out.println(adminValueList);
		List<WebElement> adminCampaignNames= returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_CAMPAIGN_NAMES);
		for(WebElement campaignNames:adminCampaignNames) {
			adminPageElementsList.add(campaignNames.getText());
		}
		System.out.println(adminPageElementsList);
		for(int i=0;i<adminPageElementsList.size();i++) {
			System.out.println(adminPageElementsList.get(i));
			if(adminPageElementsList.get(i).contains("tags")) {
				TestNGCustomReporter.logbr("Filter by Show for Campaigns is not working");
				flag=false;
				break;
			}
		}
		adminPageElementsList.addAll(adminValueList);
		System.out.println(adminPageElementsList);
		return flag;
	}
}