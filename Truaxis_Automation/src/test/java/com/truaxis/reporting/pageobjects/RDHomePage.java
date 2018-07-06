package com.truaxis.reporting.pageobjects;
import com.truaxis.common.BaseTest;

import static com.truaxis.common.GlobalStaticInfo.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.core.reports.TestNGCustomReporter;
import com.core.util.Utility;
import com.truaxis.common.GlobalStaticInfo;
import com.truaxis.common.PageFactory;
import com.truaxis.reporting.valueobjects.CampaignPerformanceVO;

public class RDHomePage extends RDLoginPage {
	BaseTest bt=new BaseTest();
    public String merchant_Name;
    List<String> pdfData=new ArrayList<String>();
	private Map<String, String> td = bt.getTestDataProperties();
	public RDHomePage(WebDriver webDriver, PageFactory pgFactory) {
		super(webDriver, pgFactory);
	}

	public boolean verifyLogOutAndHelpButtons() {
		boolean flag1 = verifyWebElement(EMAILSTATEMENT_LOGOUT_BUTTON);
		if (flag1) {
			TestNGCustomReporter
					.logbr("logout button is displayed on Home page");
		} else {
			TestNGCustomReporter
					.logbr("logout button is not displayed on Home page");
		}
		boolean flag2 = verifyWebElement(EMAILSTATEMENT_HELP_BUTTON);
		if (flag2) {
			TestNGCustomReporter.logbr("help button is displayed on Home page");
		} else {
			TestNGCustomReporter
					.logbr("help button is not displayed on Home page");
		}
		return (flag1 && flag2);

	}

	public EmailStatementCreditPage clickEmailStatementCreditSubMenu() {
		clickElement(RDHOMEPAGE_EMAILSTATEMENTCREDIT_LINK);
		String title = getWebDriver().getTitle();
		if (title.equalsIgnoreCase("Email Statement Credit")) {
			TestNGCustomReporter
					.logbr(" clicked on Email Statement credit menu link,Email statement credit page is opened");
		} else {
			TestNGCustomReporter
					.logbr(" clicked Email Statement credit menu link,Email statement page is not opened");
		}
		return getPageFactory().emailStatemetmentpage();
	}

	public StatementCreditPage clickStatementCreditSubMenu() {
		clickElement(RDHOMEPAGE_STATEMENTCREDIT_LINK);
		String title = getWebDriver().getTitle();
		if (title.equalsIgnoreCase("Statement Credit")) {
			TestNGCustomReporter
					.logbr(" clicked on  Statement credit menu link, statement credit page is opened");
		} else {
			TestNGCustomReporter
					.logbr(" clicked Email Statement credit menu link,Email statement page is not opened");
		}
		return getPageFactory().statementCreditPage();
	}

	public PrepaidGiftCardPage clickPrepaidGiftCardsSubMenu() {
		clickElement(RDHOMEPAGE_PREPAIDGIFTCARDS_LINK);
		String title = getWebDriver().getTitle();

		if (title.equalsIgnoreCase("Prepaid Gift Cards")) {
			TestNGCustomReporter
					.logbr(" clicked on  Prepaid Gift Cards menu link, Prepaid Gift Cards page is opened");
		} else {
			TestNGCustomReporter
					.logbr(" clicked Prepaid Gift Cards menu link,Email Prepaid Gift Cards is not opened");
		}
		return getPageFactory().prepaidGiftCardPage();
	}

	public CouponRewardsPage clickCouponRewardssSubMenu() {
		clickElement(RDHOMEPAGE_COUPONREWARDS_LINK);
		String title = getWebDriver().getTitle();
		if (title.equalsIgnoreCase("Coupon Rewards")) {
			TestNGCustomReporter
					.logbr(" clicked on  Coupon Rewards menu link, Coupon Rewards  page is opened");
		} else {
			TestNGCustomReporter
					.logbr("clicked Prepaid Gift Cards menu link,Email Prepaid Gift Cards is not opened");
		}
		return getPageFactory().couponRewardsPage();
	}

	public WeeklyStatementCreditPerformancePage clickWeeklyStatementCreditPerformanceSubMenu() {
		clickElement(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_MENU_LINK);
		String title = getWebDriver().getTitle();
		if (title.equalsIgnoreCase("Weekly Statement Credit Performance")) {
			TestNGCustomReporter
					.logbr(" clicked on Weekly Statement Credit Performance menu link, Weekly Statement Credit Performance  page is opened");

		} else {
			TestNGCustomReporter
					.logbr(" clicked  Weekly Statement Credit Performance menu link, Weekly Statement Credit Performance page is not opened");
		}
		return getPageFactory().weeklyStatementCreditPerformancePage();

	}

	public EmailSettingsPage clickEmailSettingsPageSubMenu() {
		clickElement(EMAIL_SETTINGS_LINK);
		String title = getWebDriver().getTitle();
		if (title.equalsIgnoreCase(" Email Recepients")) {
			TestNGCustomReporter
					.logbr(" clicked on  Email Settings Page menu link, Settings: Email Recepients  page is opened");

		} else {
			TestNGCustomReporter
					.logbr(" clicked on Email Settings Page  menu link, Settings: Email Recepients is not opened");
		}
		return getPageFactory().emailSettingsPage();

	}
	
	public TagCampaignMappingPage clickTagCampaignMappingPageMenuLink()  {
		
		clickElement(TAGCOMPAIGNMAPPINGPAGE_TAG_CAMPAIGN_MAPPING_MENU_LINK);
		String title = getWebDriver().getTitle();
		if (title.equalsIgnoreCase("Tags and Campaign Mapping")) {
			TestNGCustomReporter
					.logbr(" clicked on Tag Campaign Mapping Page Menu link, Reporting: Tags and Campaign Mapping  page is opened");

		} else {
			TestNGCustomReporter
					.logbr(" clicked on Tag Campaign Mapping Page Menu link, Reporting: Tags and Campaign Mapping is not opened");
		}
		return getPageFactory().tagCampaignMappingPage();

	}

	public boolean verifylogoutButtonFunctionality() {
       boolean flag=false;
		clickElement(EMAILSTATEMENT_LOGOUT_BUTTON);
		String title = getWebDriver().getTitle();

		if (title.equalsIgnoreCase("The new repoting dashboard")) {
			flag=true;
			TestNGCustomReporter
					.logbr(" logout sucessfull and Application bring back to login page");
		} else {
			flag=false;
			TestNGCustomReporter.logbr(" logout is Unsuccessfull");
		}
		return flag;
	}

	public boolean verifyHelpButtonFunctionality(){
		boolean flag=false;
		clickElement(EMAILSTATEMENT_HELP_BUTTON);
		String fidashboardtitle = getWebDriver().getTitle();
		if (fidashboardtitle.equalsIgnoreCase(fidashboardtitle)) {
			flag=true;
			TestNGCustomReporter
					.logbr(" Truaxis StatementRewards FI Dashboard Manual.pdf  document is opened");
			
		} else {
			TestNGCustomReporter.logbr(" help button is not working");
			flag=false;
		}
      return flag;
	}
	
	public RDHomePage selectMerchantdropdownitem()  {
		clickElement(COMMON_MERCHANT_FILTER_DROPDOWN);
		WebElement element = returnWebElement(COMMON_MERCHNAT_FILTER_BODYSHOP_DROPDOWN);
		clickElement(element);
		return this;
	}


	public RDHomePage selectEmailStatementCreditDurationdropdown(String value) 
	{
	
		WebElement element = returnWebElement(EMAILSTATEMENT_DURATION_DROPDOWN);
		element.click();
		clickElement("EmailStatementpage."+value.toLowerCase()+"dropdown.list");
		
		return this;
	}

	public boolean selectMerchantdropdown(String option)  {
		boolean flag=false;
		clickElement(COMMON_MERCHANT_FILTER_DROPDOWN);
	
		List<WebElement> elements = returnWebElements(COMMON_MERCHNAT_FILTER_DROPDOWN_LIST);
		 for(WebElement el:elements)
         {
			 if(el.getText().equalsIgnoreCase(option))
			 {
				 el.click();
				 flag=true;
				 this.merchant_Name=el.getText();
				 break;
			 }
            
             else{
                 flag=false;
             }
         }
     return flag;
		
	}

	public RDHomePage selectEmailStatementCrediYearlydropdwon(String value) {
		WebElement element = returnWebElement(EMAILSTATEMENT_YEARS_LIST);
		Select select = new Select(element);
		select.selectByVisibleText(value);
		return this;
	}

	public RDHomePage clickEmailStatementUpdatefiltesbutton() {
		clickElement(EMAILSTATEMENT_UPDATEFILTERS_BUTTON);
		//waitforPageTolaod(4);
		return this;
	}

	
	public boolean verifyExportLabelsAndButtons(String expected1,
			String expected2) {
		boolean flag1 = false;
		boolean flag2 = false;
		boolean flag3 = false;
		boolean flag4 = false;
	List<String> actual = Arrays.asList(expected2.split(","));
	   try {
		Thread.sleep(1500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		flag1 = verifyExpectedText(COMMON_PDF_BUTTON,actual.get(0));
		flag2 = verifyExpectedText(COMMON_EXCEL_BUTTON,actual.get(1));
		flag3 = verifyExpectedText(COMMON_CSV_BUTTON,actual.get(2));
		flag4 = verifyExpectedText(COMMON_EXPORT_LABEL, expected1);

		return (flag1 &&flag2 && flag3 && flag4);
	}

	public boolean verifyHeaderText(String expected) {
		boolean flag = verifyExpectedText(COMMON_HEADER_LABEL, expected);
		return flag;
	}

	public boolean verifyMerchantFilterBlock(String expected) {
		boolean flag1 = verifyExpectedText(COMMON_MERCHANT_FILTER_LABEL, expected);
		return flag1;
	}
	
	public boolean verifyDurationFilterBlock(String expected) {
		boolean flag1 = verifyExpectedText(COMMON_DURATION_FILTER_LABEL, expected);
		boolean flag2 = returnWebElement(COMMON_DURATION_FILTER_DROPDOWN).getTagName().equalsIgnoreCase("select");
		boolean flag3 = returnWebElement(COMMON_MONTHLY_FILTER_DROPDOWN).getTagName().equalsIgnoreCase("select");
		return (flag1 && flag2 && flag3);
	}
	
	public boolean verifyUpdatedFilterButtonAppearance(String expected,String color) {
		boolean flag1 = verifyExpectedText(COMMON_UPDATED_FILTERS_BUTTON, expected);
		return flag1;
	}
	
	public boolean verifyShowExtraFiltersLink(String expected) {
		boolean flag=verifyExpectedText(COMMON_SHOW_EXTRA_FILTERS_LINK, expected);
		return flag;
	}
	
	public boolean verifyMerchantFilterDropDownLabels(String labels) {
		List<String> actual = new ArrayList<String>();
		//List<String> expected=Arrays.asList(labels.split(","));
		clickElement(COMMON_MERCHANT_FILTER_DROPDOWN);
		List<WebElement> elements=returnWebElements(COMMON_MERCHANT_FILTER_DROPDOWN_LABELS);
		for(WebElement element:elements){
			actual.add(element.getText().trim());
		}
		return actual.contains(labels);
	}

	public boolean  verifyDurationFilterDropDownLabels(String labels)
	{
		List<String> actual=new ArrayList<String>();
		List<String> expected=Arrays.asList(labels.split(","));
		clickElement(COMMON_DURATION_FILTER_DROPDOWN);
		List<WebElement> elements=returnWebElements(COMMON_DURATION_FILTER_DROPDOWN_LABELS);
		for(WebElement element:elements){
			actual.add(element.getText().trim());
		}
		return actual.equals(expected);
	}

	public boolean  verifyYearlyFilterDropDownLabels(String labels)
	{
		List<String> actual=new ArrayList<String>();
		List<String> expected=Arrays.asList(labels.split(","));
		
		List<WebElement> elements=returnWebElements(COMMON_YEARLY_FILTER_DROPDOWN_LABELS);
		for(WebElement element:elements){
			actual.add(element.getText().trim());
		}
		return actual.equals(expected);
	}
	
	   
    public boolean verifyKeyStatisticsTableHeaderlabel(String label)
	{
     
	 String actual=getText(GlobalStaticInfo.KEYSTATISTICS_TABLE_HEADER_LABEL);
	 if(actual.equalsIgnoreCase(label)){
    	return true;
	 }else{return false; }
	}
    
    public boolean verifyCampaignPerformanceTableHeaderlabel(String label)
	{
	 String actual=getText(GlobalStaticInfo.CAMPAINGNPERFOR_TABLE_HEADER_LABEL);
	 
	 if(actual.equalsIgnoreCase(label)){
    	return true;
	 }else{return false; }
	}
    
    public boolean verifyMerchantNameHeaderlabel()
	{
     selectmerchantAndClickUpdatefilters();
	 String actual=getText(GlobalStaticInfo.MERCHANTNAME_HEADER_LABEL);
	
	 if(actual.contains(merchant_Name)){
    	return true;
	 }else{
		 return false;
	 }
    }
    
    public void clickPDFlink()
    {
    	clickElement(GlobalStaticInfo.COMMON_PDF_LINK);
    	String title = getWebDriver().getTitle();
  
        String url=getWebDriver().getCurrentUrl();
     
    }
    
    public boolean verifythedurationDropdownfunctionality(String duration)
  	{
  	    boolean flag=false;
  		selectEmailStatementCreditDurationdropdown(duration);
  		if(duration.equalsIgnoreCase("Yearly"))
  		{
  			TestNGCustomReporter.logbr("Clicked on Duration dropdown and selected Yearly dropdown and verifying default data");
  			List<WebElement> yearelem=returnWebElements(EMAILSTATEMENT_PAGE_YEAR_DROPDOWN);
  			flag=yearelem.get(0).getText().equals(Utility.getTodaysDate("YYYY"));
  		}
  		else if(duration.equalsIgnoreCase("weekly"))
  		{
  			TestNGCustomReporter.logbr("Clicked on Duration dropdown and selected Yearly dropdown and verifying the Weekly default data ");
  			WebElement weeklyelm=returnWebElement(EMAILSTATEMENTPAGE_WEEKLY_DROPDOWN);
  			flag=weeklyelm.getText().split("-").length==3;
  		}
  		else if(duration.equalsIgnoreCase("monthly"))
  		{
  			TestNGCustomReporter.logbr("Clicked on Duration dropdown and selected monthly dropdown and verifying the Monthly default data ");
  			WebElement weeklyelm=returnWebElement(EMAILSTATEMENTPAGE_MONTHLY_DROPDOWN);
  		    flag=weeklyelm.getText().split("-").length==2;
  	    }
  		else
  		{
  			TestNGCustomReporter.logbr("Clicked on Duration dropdown and selected Custom dropdown and verifying the Custom default data ");
  			
  			clickElement(EMAILSTATEMENTPAGE_STARTDATEANDENDDATE_TXT);
  			flag=returnWebElements(EMAILSTATEMENTPAGE_CALENDER_TABLE).size()==2;
  			
  		}
  		return flag;
  	}
  	
  	
  	public boolean verifytheCalendarFunctionality(String btnName)
  	{
  		
  		int vardate = 0;
  		boolean flag=false;
  		vardate=Integer.parseInt(getText(EMAILSTATEMENTPAGE_CALENDERSELECTEDSTARTDATE_TXT));
  		if(vardate >= 28)
  		{
  			TestNGCustomReporter.logbr("verifying the calendar functionality");
  			clickElement(EMAILSTATEMENTPAGE_CALENDERSTARTDATEENDDATE_LINK);
  			clickElement(EMAILSTATEMENTPAGE_CALENDER_AVAILABLEDATES_TXT);
  			vardate = Integer.parseInt(getText(EMAILSTATEMENTPAGE_CALENDER_AVAILABLEDATES_TXT));
  		}
  		else
  		{
  			vardate++;
  			List<WebElement> calendaravailabledates=returnWebElements(EMAILSTATEMENTPAGE_CALENDER_AVAILABLEDATES_TXT);
  			for(WebElement el:calendaravailabledates)
  			{
  				if(Integer.parseInt(el.getText())== vardate)
  				{   
  					el.click();
  					break;
  				
  				}
  			}
  		}
  		if(btnName.equalsIgnoreCase("apply"))
  		{
  		
  			clickElement(EMAILSTATEMENTPAGE_CALENDERAPPLY_BTN);
  		
  		}else clickElement(EMAILSTATEMENTPAGE_CALENDERCANCEL_BTN);
  		 String strDate = returnWebElement(EMAILSTATEMENTPAGE_CALENDER_AVAILABLEDATES_TEXT).getAttribute("value");
  		if(strDate.equals("")&&btnName.equalsIgnoreCase("cancel")){flag=true;}
  		else{ flag=Integer.parseInt((strDate.split("-")[0]).split("\\/")[0])==vardate;}
  		return flag;
  	}
      public boolean verifytheUpdatebutton(String duration)
      {
      	verifythedurationDropdownfunctionality(duration);
      	clickEmailStatementUpdatefiltesbutton();
      	return verifytheimageDisplayedonTableafterUpdateClick()&&verifythetableisdisplayedafterUpdateclick();
      	
      }
      
      public boolean verifytheUpdatebuttonwithoutSpecificMerchant(String duration)
      {
      	TestNGCustomReporter.logbr("Clicking on update button without selevcting any merchant name and verifying the data on table");
      	
      	verifythedurationDropdownfunctionality(duration);
      	clickEmailStatementUpdatefiltesbutton();
      	return verifytheimageDisplayedonTableafterUpdateClick()&&verifytheColumHeaderWithoutSpecificMerchant();
      	
      }
      public boolean verifytheUpdatebuttonwithSpecificMerchant(String duration)
      {
      	TestNGCustomReporter.logbr("Clicking on update button selecting "+duration+"  merchant name and verifying the data on table");
      	verifythedurationDropdownfunctionality(duration);
      	clickEmailStatementUpdatefiltesbutton();
      	try {
  			Thread.sleep(20000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
      	return verifytheimageDisplayedonTableafterUpdateClick()&&verifytheColumHeaderWithSpecificMerchant();
      	
      }
      public boolean verifytheimageDisplayedonTableafterUpdateClick()
      {
      	TestNGCustomReporter.logbr("Verifying the image is displayed after clicking on Update Filter Button");
      	return returnWebElement(EMAILSTATEMENT_CUSTOMERTABLE_IMAGE).isDisplayed();
      }
      public boolean verifythetableisdisplayedafterUpdateclick()
      {
      	List<WebElement> headerTexts=returnWebElements(EMAILSTATEMENT_CAMPIGN_HEADER);
      	return headerTexts.get(1).getText().equalsIgnoreCase("Key Performance")&&headerTexts.get(2).getText().equalsIgnoreCase("Campaign Performance");
      }
      public boolean verifytheColumHeaderWithSpecificMerchant()
      {
      	TestNGCustomReporter.logbr("Verifying the Specific merchant name and tables are displayed after Update Filter button click");
      	List<WebElement> headerTexts=returnWebElements(EMAILSTATEMENT_CAMPIGN_HEADER);
      	return headerTexts.get(1).getText().equalsIgnoreCase("Key Performance")&&headerTexts.get(2).getText().equalsIgnoreCase("Campaign Performance");
      }
      
      public boolean verifytheColumHeaderWithoutSpecificMerchant()
      {
      	TestNGCustomReporter.logbr("Verifying the column names after clicking Update filter button");
      	List<WebElement> headerTexts=returnWebElements(EMAILSTATEMENT_CAMPIGN_HEADER);
      	return headerTexts.get(0).getText().equalsIgnoreCase("Key Performance")&&headerTexts.get(1).getText().equalsIgnoreCase("Campaign Performance");
      }
      public boolean selectMerchantDropdown(String merchantName)
      {
      	boolean flag=false;
      	clickElement("EmailStatement.MerchantName.dropdown");
      	
      	List<WebElement> merchantselm=returnWebElements("EmailStatement.MerchantName.dropdownlist");
      	for(WebElement el:merchantselm)
      	{
      		if(el.getText().equalsIgnoreCase(merchantName))
      		{
      			TestNGCustomReporter.logbr("Selected merchant "+el.getText());
      		 el.click();
      		 flag=true;
      		 break;
      		}
      	}
  		return flag;
      	
      }
      
      public boolean selectDurationDropDown(String duration)
      {
      	boolean flag=false;
      	clickElement(EMAILSTATEMENT_DURATION_DROPDOWN);
      	List<WebElement> durationElm=returnWebElements(COMMON_DURATION_FILTER_DROPDOWN_LABELS);
      	for(WebElement elm:durationElm)
      	{
      		
      		if(elm.getText().equalsIgnoreCase(duration)){ TestNGCustomReporter.logbr("Selected duration "+elm.getText()+"in Duration dropdown");elm.click(); flag=true; break;}
      	}
  		return flag;
      	
      }
      public boolean  selectYeardorpdown(String year)
      {
      	boolean flag=false;
      
      	clickElement(EMAILSTATEMENT_PAGE_YEAR_DROPDOWN);
      	List<WebElement> yearsElm=returnWebElements(EMAILSTATEMENT_YEARS_LIST);
      	for(WebElement elm: yearsElm)
      	{
      		TestNGCustomReporter.logbr("Selected Year "+elm.getText() +"in year dropdown");
      		if(elm.getText().equalsIgnoreCase(year)){ elm.click(); flag=true;break;}
      	}
  		return flag;
      	
      }
      public boolean selectMonthDropdown(String month)
      {
      	boolean flag=false;
          
      	clickElement(EMAILSTATEMENT_MONTH_DROPDOWN);
      	List<WebElement> yearsElm=returnWebElements(EMAILSTATEMENT_MONTHDROPDOWN_LIST);
      	for(WebElement elm: yearsElm)
      	{
      		if(elm.getText().equalsIgnoreCase(month)){ TestNGCustomReporter.logbr("Selected Month  "+elm.getText() +"in Month dropdown");elm.click(); flag=true;break;}
      	}
  		return flag;
      }
      
      public boolean  verifyTheResultAfterUpdatefilterbuttonClickWithMerchantName()
      {
      	clickEmailStatementUpdatefiltesbutton();
      	TestNGCustomReporter.logbr("Verifying the Image And Column names after clicking Update filter button");
      	try {
  			Thread.sleep(30000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
      	return verifytheimageDisplayedonTableafterUpdateClick()&&verifytheColumHeaderWithSpecificMerchant();
      }
      
      public boolean verifytheMerchantHeaderAfterUpdatefilterClick(String merchantName)
      {
      	TestNGCustomReporter.logbr("Verifying the Merchant Header and Column name after Update Filter button click");
      	clickEmailStatementUpdatefiltesbutton();
      	try {Thread.sleep(30000);} catch (InterruptedException e) {e.printStackTrace();}
      	return  getText(EMAILSTATEMENT_MERCHANTHEADER_LABEL).contains(merchantName);
      	
      }
      
      public boolean selectWeekDropdown(String week)
      {
      	boolean flag=false;
      	clickElement(EMAILSTATEMENT_WEEK_DROPDOWN);
      	List<WebElement> weeksElm=returnWebElements(EMAILSTATEMENT_WEEKDROPDOWN_LIST);
      	for(WebElement elm: weeksElm)
      	{
      		if(elm.getText().equalsIgnoreCase(week)){ elm.click(); flag=true;break;}
      	}
  		return flag;
  		
      	
      }
      
      public boolean selectCalenderDate()
      {
      	int vardate = 0;
      	clickElement(EMAILSTATEMENTPAGE_STARTDATEANDENDDATE_TXT);
  		vardate=Integer.parseInt(getText(EMAILSTATEMENTPAGE_CALENDERSELECTEDSTARTDATE_TXT));
  		if(vardate >= 28)
  		{
  			clickElement(EMAILSTATEMENTPAGE_CALENDERSTARTDATEENDDATE_LINK);
  			clickElement(EMAILSTATEMENTPAGE_CALENDER_AVAILABLEDATES_TXT);
  			vardate = Integer.parseInt(getText(EMAILSTATEMENTPAGE_CALENDER_AVAILABLEDATES_TXT));
  		}
  		else
  		{
  			vardate++;
  			List<WebElement> calendaravailabledates=returnWebElements(EMAILSTATEMENTPAGE_CALENDER_AVAILABLEDATES_TXT);
  			for(WebElement el:calendaravailabledates)
  			{
  				if(Integer.parseInt(el.getText())== vardate)
  				{   
  					el.click();
  					break;
  				
  				}
  			}
  		}
  		clickElement(EMAILSTATEMENTPAGE_CALENDERAPPLY_BTN);
  		return true;
      	
      }
      public boolean getPageHeader(String expected)
      {
       return getText(EMAILSTATEMENT_PAGEHEADER_LABEL).split(":")[1].trim().equalsIgnoreCase(expected);
      }
      
      public boolean verifyKeyperformanceHeaders(String[] keyPerformanceHeaders)
      {
      	List<WebElement> headerElm=returnWebElements(EMAILSTATEMENT_PAGEHEADER_HEADER);
      	for(int i=0;i<keyPerformanceHeaders.length;i++)
      	{
      		if(!headerElm.get(i).getText().equalsIgnoreCase(keyPerformanceHeaders[i]))
      		{
      			TestNGCustomReporter.logbr("Key Performance Header is not displayed After Update Filter Button Click");
      			return false;
      		}
      	}
  		return true;
      	
      }
      
      public boolean verifyCampaignPerformanceHeaders(String[] campaignPerformanceHeaders)
      {
      	List<WebElement> headerElm=returnWebElements(EMAILSTATEMENT_PAGEHEADER_HEADER);
      	for(int i=0;i<campaignPerformanceHeaders.length;i++)
      	{
      		if(!headerElm.get(i+5).getText().equalsIgnoreCase(campaignPerformanceHeaders[i]))
      		{
      			TestNGCustomReporter.logbr("Campaign Performance headers is not displayed After Update Filter Button Click");
      			return false;
      		}
      	}
  		return true;
      }
      
     public void selectmerchantAndClickUpdatefilters()
     {
  	 selectMerchantdropdown(td.get("merchant_bodyshop"));
  	 selectEmailStatementCreditDurationdropdown(td.get("Yearly"));
       clickEmailStatementUpdatefiltesbutton();
  	   
     }
     
     public boolean verifyHideExtraFiltersLink(String expected) {
 		boolean flag=verifyExpectedText(COMMON_HIDE_EXTRA_FILTERS_LINK, expected);
 		return flag;
 	}
     
     public boolean verifytheComponentsDisplayingAfterShowHidelinkClick(String[] strlabels)
     {
  	   boolean flag1=true,flag2=true;
  	   clickElement(PREPAIDGIFTCARDPAGE_SHOWHIDEEXTRAFILTERS_LNK);
  	   List<WebElement> label=returnWebElements(PREPAIDGIFTCARDPAGE_SHOWHIDEEXTRAFILTER_LABEL);
  	   List<WebElement> dropdowns=returnWebElements(COMMON_FILTERS_ELEMENT);
  	   
  	   for(int i=0;i<label.size();i++)
  	   {
  		   System.out.println(label.get(i).getText());
  		   if(!((label.get(i).getText().equalsIgnoreCase(strlabels[i]))&&(dropdowns.get(i+5).isDisplayed())))
  		   {
  			   flag1=false;
  			   TestNGCustomReporter.logbr("After clicking show extrafilters text /label on compoenents not displayed properly");
  		   }
  	   }
  	  
  	   clickElement(PREPAIDGIFTCARDPAGE_SHOWHIDEEXTRAFILTERS_LNK);
  	   
  	   label=returnWebElements(PREPAIDGIFTCARDPAGE_SHOWHIDEEXTRAFILTER_LABEL);
  	   dropdowns=returnWebElements(COMMON_FILTERS_ELEMENT);
  	   for(int i=0;i<label.size();i++)
  	   {
  		   if((label.get(i).isDisplayed() &&(!(dropdowns.get(i+5).isDisplayed()))))
  		   {
  			   flag2=false;
  			   TestNGCustomReporter.logbr("After clicking hide extrafilters Components are not hiddden");
  		   }
  	   }
  	   
  	   
  	   
  	return flag1&&flag2;
  	   
     }
     
     public boolean verifytheExtraFiltersLink(String showfiltertext,String hidefiltertext)
     {
  	   boolean flag=true;
  	   String showFilterText=getText(PREPAIDGIFTCARDPAGE_SHOWHIDEEXTRAFILTERS_LNK);
  	   clickElement(PREPAIDGIFTCARDPAGE_SHOWHIDEEXTRAFILTERS_LNK);
  	   String hideFilterText=getText(PREPAIDGIFTCARDPAGE_SHOWHIDEEXTRAFILTERS_LNK);
  	   clickElement(PREPAIDGIFTCARDPAGE_SHOWHIDEEXTRAFILTERS_LNK);
  	   if(!(showFilterText.trim().equalsIgnoreCase(showFilterText.trim())&&hideFilterText.trim().equalsIgnoreCase(hidefiltertext.trim())))
  	   {
  		   TestNGCustomReporter.logbr("Hide/Show filter link is not working as expected");
  		   flag=false;
  	   }
  	
  	   return flag;

  	   
     }
   
     
     public RDHomePage selectMerchantDropdownlist(String merchantName)
     {
     	
     	clickElement("EmailStatement.MerchantName.dropdown");
     	
     	List<WebElement> merchantselm=returnWebElements("EmailStatement.MerchantName.dropdownlist");
     	for(WebElement el:merchantselm)
     	{
     		if(el.getText().equalsIgnoreCase(merchantName))
     		{
     		 el.click();
     		 
     		 }
       	}
  		return this;
     	
     }
     public RDHomePage selectDurationDropDownlist(String duration)
     {
     	clickElement(EMAILSTATEMENT_DURATION_DROPDOWN);
     	List<WebElement> durationElm=returnWebElements(COMMON_DURATION_FILTER_DROPDOWN_LABELS);
     	for(WebElement elm:durationElm)
     	{
     		if(elm.getText().equalsIgnoreCase(duration)){
     			elm.click();
     		}
     	}
  		return this;
     	
     }
     public RDHomePage  selectYearDropDownlist(String year)
     {
     	clickElement(EMAILSTATEMENT_PAGE_YEAR_DROPDOWN);
     	List<WebElement> yearsElm=returnWebElements(EMAILSTATEMENT_YEARS_LIST);
     	for(WebElement elm: yearsElm)
     	{
     		if(elm.getText().equalsIgnoreCase(year)){ 
     			elm.click();
     		 }
       	}
  	return this;
     }
     
   
     public RDHomePage selectMonthDropdownlist(String month)
     {
     	clickElement(EMAILSTATEMENT_MONTH_DROPDOWN);
     	List<WebElement> yearsElm=returnWebElements(EMAILSTATEMENT_MONTHDROPDOWN_LIST);
     	for(WebElement elm: yearsElm)
     	{
     		if(elm.getText().equalsIgnoreCase(month)){
     			elm.click();
     			break;
     		}
     	}
  		return this;
     }
     public RDHomePage selectWeekDropdownlist(String week)
     {
     	clickElement(EMAILSTATEMENT_WEEK_DROPDOWN);
     	List<WebElement> weeksElm=returnWebElements(EMAILSTATEMENT_WEEKDROPDOWN_LIST);
     	for(WebElement elm: weeksElm)
     	{
     		if(elm.getText().equalsIgnoreCase(week)){ elm.click();break;}
     	}
  		return this;
  		
     	
     }
     public RDHomePage selectYearDropDownlistMerchantlogin(String year)
     {
     	
     	clickElement("merchantlogin.yearly_filter.dropdown");
     	List<WebElement> yearsElm=returnWebElements("merchantlogin.yearly_filter.dropdownlist");
     	for(WebElement elm: yearsElm)
     	{
     		if(elm.getText().equalsIgnoreCase(year)){
     			elm.click(); 
     		}
     	}
  		return this;
     	
     }
     
     public RDHomePage selectMonthDropdownlistWithMerchantlogin(String month)
     {
     	clickElement(MERCHANTEMAILSTATEMENT_MONTH_DROPDOWN);
     	List<WebElement> yearsElm=returnWebElements(MERCHANTEMAILSTATEMENT_MONTHDROPDOWN_LIST);
     	for(WebElement elm: yearsElm)
     	{
     		if(elm.getText().equalsIgnoreCase(month)){ elm.click(); break;}
     	}
  		return this;
     }
     
     public RDHomePage selectYeardorpdownmerchantlogin(String year)
     {
     	
     	clickElement("merchantlogin.yearly_filter.dropdown");
     	List<WebElement> yearsElm=returnWebElements("merchantlogin.yearly_filter.dropdownlist");
     	for(WebElement elm: yearsElm)
     	{
     		if(elm.getText().equalsIgnoreCase(year)){
     			elm.click(); 
     		}
     	}
 		return this;
     	
     }
     
     public boolean selectYearDropdownForMerchant(String year)
     {
     	boolean flag=false;
         
     	clickElement(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_YEARLY_DROPDOWN);
     	List<WebElement> yearsElm=returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_YEARLY_LIST);
     	for(WebElement elm: yearsElm)
     	{
     		if(elm.getText().equalsIgnoreCase(year)){ elm.click(); flag=true;break;}
     	}
 		return flag;
     }
     
     public boolean selectMonthDropdownForMerchant(String month)
     {
     	boolean flag=false;
         
     	clickElement(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_MONTHLY_DROPDOWN);
     	List<WebElement> yearsElm=returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_MONTHLY_LIST);
     	for(WebElement elm: yearsElm)
     	{
     		if(elm.getText().equalsIgnoreCase(month)){ elm.click(); flag=true;break;}
     	}
 		return flag;
     }
     
     public boolean selectWeekDropdownForMerchant(String week)
     {
     	boolean flag=false;
         
     	clickElement(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_WEEKLY_DROPDOWN);
     	List<WebElement> yearsElm=returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_WEEKLY_LIST);
     	for(WebElement elm: yearsElm)
     	{
     		if(elm.getText().equalsIgnoreCase(week)){ elm.click(); flag=true;break;}
     	}
 		return flag;
     }

 public void selectmerchantAndClickUpdatefiltersForMonthly(String duration, String month)
    {
 	 selectMerchantdropdown(td.get("merchant_bodyshop"));
 	 selectEmailStatementCreditDurationdropdown(duration);
 	 selectMonthDropdown(month);
      clickEmailStatementUpdatefiltesbutton();  
    }
    
    public void selectmerchantAndClickUpdatefiltersForWeekly(String duration, String week)
    {
 	 selectMerchantdropdown(td.get("merchant_bodyshop"));
 	 selectEmailStatementCreditDurationdropdown(duration);
 	 selectWeekDropdown(week);
      clickEmailStatementUpdatefiltesbutton();  
    }
    
    public void selectmerchantAndClickUpdatefiltersForCustom(String duration, String date)
    {
 	   selectMerchantdropdown(td.get("merchant_bodyshop"));
 	   selectEmailStatementCreditDurationdropdown(duration);
 	   enterValue(EMAILSTATEMENTPAGE_STARTDATEANDENDDATE_TXT, date);
 	   clickElement(EMAILSTATEMENTPAGE_CALENDERAPPLY_BTN);
 	   clickEmailStatementUpdatefiltesbutton();  
    }
    
   public boolean verifyShowMoreFiltersLabels(String platform, String financialInstitute, String show) {
 		boolean flag1=false;
 		boolean flag2=false;
 		ArrayList<String> labels = new ArrayList<String>();
 		String str = null;
 		clickElement(COMMON_SHOW_EXTRA_FILTERS_LINK);
 		flag1 = verifyHideExtraFiltersLink(td.get("hide_extra_filters"));
 		if(flag1) {
 			List<WebElement> filterLabels = returnWebElements(WEEKLY_STATEMENT_CREDIT_PERFORMANCE_PAGE_EXTRA_FILTER_LABEL);
 			for(WebElement filters: filterLabels)
 		    {
 				str = filters.getText().toString();
 				labels.add(str);
 		    }
 			if(labels.get(0).equalsIgnoreCase(platform) && labels.get(1).equalsIgnoreCase(financialInstitute)
 					&& labels.get(2).equalsIgnoreCase(show)) {
 				TestNGCustomReporter.logbr("Filters labels found successfully");
 				flag2=true;
 			}else
 			{
 				TestNGCustomReporter.logbr("Filters labels not found successfully");
 				flag2=false;
 			}
 			return flag2;
 		} else
 		{
 			TestNGCustomReporter.logbr("Platform, FI and Show filters are not present");
 			return flag1;
 		}
    }
    
    public boolean verifyPlatformFilterDropdown(String platform) throws InterruptedException {
 		boolean flag1 = false;
 		List<String> platformList = new ArrayList<String>();
    		clickElement(COMMON_SHOW_EXTRA_FILTERS_LINK);
 		boolean flag2 = verifyExpectedText(COMMON_PLATFORM_FILTER_DEFAULT_LABEL, platform);
 		if(flag2) {
 			clickElement(COMMON_PLATFORM_FILTER_DROPDOWN);
 			Thread.sleep(2000);
 			List<WebElement> platformValues = returnWebElements(COMMON_PLATFORM_FILTER_DROPDOWN_LIST);
 			for(WebElement elements:platformValues) {
 				platformList.add(elements.getText());
 			}
 			System.out.println(platformList);
 			clickElement(COMMON_HIDE_EXTRA_FILTERS_LINK);
 			flag1=true;
 		} else
 		{
 			clickElement(COMMON_HIDE_EXTRA_FILTERS_LINK);
 			flag1=false;
 		}
 		return flag1;
    }
    
    public boolean verifyFinancialInstituteFilterDropdown(String financial_institute) {
 		boolean flag1 = false;
 		List<String> fIList = new ArrayList<String>();
   		clickElement(COMMON_SHOW_EXTRA_FILTERS_LINK);
 		boolean flag2 = verifyExpectedText(COMMON_FINANCIAL_INSTITUTE_FILTER_DEFAULT_LABEL, financial_institute);
 		if(flag2) {
 			clickElement(COMMON_FINANCIAL_INSTITUTE_FILTER_DROPDOWN);
 			List<WebElement> fIValues = returnWebElements(COMMON_FINANCIAL_INSTITUTE_FILTER_DROPDOWN_LIST);
 			for(WebElement elements:fIValues) {
 				fIList.add(elements.getText());
 			}
 			System.out.println(fIList);
 			clickElement(COMMON_HIDE_EXTRA_FILTERS_LINK);
 			flag1=true;	
 		} else
 		{
 			clickElement(COMMON_HIDE_EXTRA_FILTERS_LINK);
 			flag1=false;
 		}
 		return flag1;
    }
    
    public boolean verifyShowFilterDropdown(String show) {
 		boolean flag1 = false;
 		List<String> showList = new ArrayList<String>();
  		clickElement(COMMON_SHOW_EXTRA_FILTERS_LINK);
 		boolean flag2 = verifyExpectedText(COMMON_SHOW_FILTER_DEFAULT_LABEL, show);
 		if(flag2) {
 			clickElement(COMMON_SHOW_FILTER_DROPDOWN);
 			List<WebElement> showValues = returnWebElements(COMMON_SHOW_FILTER_DROPDOWN_LIST);
 			for(WebElement elements:showValues) {
 				showList.add(elements.getText());
 			}
 			System.out.println(showList);
 			clickElement(COMMON_HIDE_EXTRA_FILTERS_LINK);
 			flag1=true;	
 		} else
 		{
 			clickElement(COMMON_HIDE_EXTRA_FILTERS_LINK);
 			flag1=false;
 		}
 		return flag1;
    }
    
    public boolean verifyHideExtraFilters(String expected) throws InterruptedException {
 	   boolean flag= false;
 	   clickElement(COMMON_SHOW_EXTRA_FILTERS_LINK);
 	   Thread.sleep(2000);
 	   clickElement(COMMON_HIDE_EXTRA_FILTERS_LINK);
 	   Thread.sleep(2000);
 	   if(verifyExpectedText(COMMON_SHOW_EXTRA_FILTERS_LINK, expected)) {
 		   flag = true;
 	   }else
 	   {
 		   flag = false;
 	   }
 	   return flag;
    }
    
    public boolean selectPlatformDropdown(String platform) {
 	   boolean flag=false;
 	   clickElement(COMMON_PLATFORM_FILTER_DROPDOWN);
 	   List<WebElement> platformlist=returnWebElements(COMMON_PLATFORM_FILTER_DROPDOWN_LIST);
 	   for(WebElement el:platformlist) {
 		   if(el.getText().equalsIgnoreCase(platform)) {
 			   el.click();
 			   flag=true;
 			   break;
 		   }
 	   }
 	   return flag;
    }
    
    public boolean selectFinancialInstituteDropDown(String financialInstitute) {
 	   boolean flag=false;
 	   clickElement(COMMON_FINANCIAL_INSTITUTE_FILTER_DROPDOWN);
 	   List<WebElement> fIList=returnWebElements(COMMON_FINANCIAL_INSTITUTE_FILTER_DROPDOWN_LIST);
 	   for(WebElement elm:fIList) {
 		   if(elm.getText().equalsIgnoreCase(financialInstitute)) {
 			   elm.click();
 			   flag=true;
 			   break;
 		   }
 	   }
 	   return flag;
    }
      
    public boolean  selectShowdropdown(String show) {
 	   boolean flag=false;
 	   clickElement(COMMON_SHOW_FILTER_DROPDOWN);
 	   List<WebElement> yearsElm=returnWebElements(COMMON_SHOW_FILTER_DROPDOWN_LIST);
 	   for(WebElement elm: yearsElm) {
 		   if(elm.getText().equalsIgnoreCase(show)) {
 			   elm.click();
 			   flag=true;
 			   break;
 		   }
 	   }
 	   return flag;
    }
    
    public void closeBrowserOfAdmin() {
 	   driver.close();
    }
    
     public List<String> ReadPDFdata()
     {
     	String winHandleBefore = driver.getWindowHandle();
     	clickElement(COMMON_PDF_BUTTON);
          try {
  			Thread.sleep(8000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
         Set<String> windows=driver.getWindowHandles();
         Iterator ite=windows.iterator();
         String window1=(String) ite.next();
         String window2=(String) ite.next();
         driver.switchTo().window(window2);
        List<WebElement> data=returnWebElements(EMAILSTATEMNT_PDF_DATA);
     	for(WebElement ele:data)
     	{
     		pdfData.add(ele.getText());
     	}
         driver.close();
     	driver.switchTo().window(winHandleBefore);
     	return pdfData;
      }

    
}
