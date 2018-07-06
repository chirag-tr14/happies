package com.truaxis.reporting.pageobjects;

import static com.truaxis.common.GlobalStaticInfo.*;

import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.core.reports.TestNGCustomReporter;
import com.truaxis.common.*;
import com.truaxis.reporting.valueobjects.CampaignPerformanceVO;
import com.truaxis.reporting.valueobjects.KeyStatisticsVO;


public class EmailStatementCreditPage extends RDHomePage {
	
	  KeyStatisticsVO  keystatisticsVO=null;
	  CampaignPerformanceVO campaignPerformanceVO=null;; 
	  List<String> UIData=new ArrayList<String>();
	  BaseTest bt=new BaseTest();
	  private Map<String, String> td = bt.getTestDataProperties();
	public String rdURL;

	public EmailStatementCreditPage(WebDriver webDriver, PageFactory pgFactory) {
		super(webDriver, pgFactory);
		keystatisticsVO=new KeyStatisticsVO(); 
		
	}
	
	
	public KeyStatisticsVO VerifyKeyStatisticstablevalues()
	{   
		//selectmerchantAndClickUpdatefilters();
		List<String> KeystatisticsList=new ArrayList<String>();
		List<WebElement> elements=returnWebElements(EMAILSTATEMENT_KEYSTATISTICS_TABLE);
		if(elements.size()>0)
		{
	    for(int i=0;i<elements.size();i++){
			KeystatisticsList.add(elements.get(i).getText());
			}
	    keystatisticsVO.setImpressions(KeystatisticsList.get(0)); 
	    keystatisticsVO.setActivations(KeystatisticsList.get(1));
	    keystatisticsVO.setRedemptions(KeystatisticsList.get(2));
	    keystatisticsVO.setRedRate(KeystatisticsList.get(3));
	    keystatisticsVO.setTotalSpend(KeystatisticsList.get(4));
	    keystatisticsVO.setAvgSpend(KeystatisticsList.get(5));
	    keystatisticsVO.setTotalCashback(KeystatisticsList.get(6));
	    keystatisticsVO.setCommission(KeystatisticsList.get(7));
	    keystatisticsVO.setROAS(KeystatisticsList.get(8));
	    keystatisticsVO.setConvFactor(KeystatisticsList.get(9));
		}
		else
		{
			TestNGCustomReporter
			.logbr(" key statistics table does not contain any value, 1.page connot be loaded 2.drop down is selected is invalid 3. data is not available");
			return null;
		}
		 return keystatisticsVO;
	}
    public List<CampaignPerformanceVO> getCampaignPerformancetablevalues(){
    	//selectmerchantAndClickUpdatefilters();
    	List<CampaignPerformanceVO> CampaignPerformanceList = new ArrayList<CampaignPerformanceVO>();
		List<WebElement> rowcount = returnWebElements(EMAILCAMPAINGN_PERFORMANCE_TABLE_COUNT);
		for(int row = 2; row <rowcount.size(); row++){
			CampaignPerformanceVO rowObject = new CampaignPerformanceVO();
			List<WebElement> columns=returnWebElements(rowcount.get(row),CAMPAINGN_PERFORMANCE_TABLE);
			rowObject.setMerchantName(columns.get(0).getText());
			rowObject.setCampaignName(columns.get(1).getText());
			rowObject.setImpressions(columns.get(2).getText());
			rowObject.setActivations(columns.get(3).getText());
			rowObject.setRedemptions(columns.get(4).getText());
			rowObject.setRedRate(columns.get(5).getText());
			rowObject.setTotalSpend(columns.get(6).getText());
			rowObject.setAvgSpend(columns.get(7).getText());
			rowObject.setTotalCashback(columns.get(8).getText());
			rowObject.setCommission(columns.get(9).getText());
			rowObject.setROAS(columns.get(10).getText());
			rowObject.setConvFactor(columns.get(11).getText());
			CampaignPerformanceList.add(rowObject);	
			
		   }
	
		return CampaignPerformanceList;
	}
    public void selectmerchantAndClickUpdatefilters()
    {
 	  selectMerchantdropdown(td.get("merchant_allmerchants"));
 	  selectMerchantDropdownlist(td.get("Yearly"));
 	  selectYeardorpdown("2013");
      clickEmailStatementUpdatefiltesbutton();
 	   
    }
	public EmailStatementCreditPage adminloginAndSelectMerchantAndSelectDuarationdropdownClickUpdate()
	{  
		getPageFactory().statementCreditPage();
		openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password")).clickStatementCreditSubMenu();
	    selectMerchantdropdown(td.get("merchant_name"));
	    selectDurationDropDown(td.get("Yearly"));
		selectYeardorpdown(td.get("2013"));
		clickEmailStatementUpdatefiltesbutton();
		return this;	
	}
	public EmailStatementCreditPage MerchantloginAndSelectduarationClickUpdate()
	{
		getPageFactory().statementCreditPage();
	    openRdLoginpage().goToHomePage(td.get("merchant_email"), td.get("merchnat_password")).clickEmailStatementCreditSubMenu();
	     selectDurationDropDown(td.get("Yearly"));
	     selectYeardorpdownmerchantlogin(td.get("2013"));
	     clickEmailStatementUpdatefiltesbutton();
			return this;
	}
	public boolean verifyEmailstatmentCreditSubMenulinkfunctionality() {
		boolean flag=false;
		clickElement(RDHOMEPAGE_EMAILSTATEMENTCREDIT_LINK);
		String title = getWebDriver().getTitle();
		if (title.equalsIgnoreCase("Email Statement Credit")) {
			TestNGCustomReporter
					.logbr(" clicked on  Statement credit menu link, Email statement credit page is opened");
			flag=true;
		} else {
			TestNGCustomReporter
					.logbr(" clicked Email Statement credit menu link,Email statement page is not opened");
			flag=false;
		}
		return flag;
	}
	public boolean verifythetableisdisplayedafterUpdateclick()
    {
    	List<WebElement> headerTexts=returnWebElements(EMAILSTATEMNT_COMPAIGNPERFORMANCE_TABLE_HEADERS);
    	return headerTexts.get(1).getText().equalsIgnoreCase("Key Statistics")&&headerTexts.get(2).getText().equalsIgnoreCase("Campaign Performance");
    }
	 public boolean verifyEmailStatementKeystaticticsTableHeaders(String keystatistics)
	    {
	    	List<WebElement> headerElement=returnWebElements(EMAILSTATEMNT_KEYSTATEANDCOMPAIGN_COLUMN_HEADERS);
	    	
	    	List<String> expected=Arrays.asList(keystatistics.split(","));
	    	for(int i=0;i<10;i++)
	    	{
	    		
	    		if(!headerElement.get(i).getText().equalsIgnoreCase(expected.get(i)))
	    		{
	    			TestNGCustomReporter
					.logbr(" verifying keystatistics table header names on EmailStatement credit page,expected table header's is not available");
	    			return false;
	    		}
	    	}
			return true;
	    	
	    }
	    
	    
	    public boolean verifyEmailStatementCompaignPerformanceTableHeaders(String compaignperformace)
	    {
	    	List<WebElement> headerElement=returnWebElements(EMAILSTATEMNT_KEYSTATEANDCOMPAIGN_COLUMN_HEADERS);
	    	List<String> expected=Arrays.asList(compaignperformace.split(","));
	    	List<String> temp= new ArrayList<String>();
	    	for(int i=10;i<headerElement.size();i++)
	    	{
	    		temp.add(headerElement.get(i).getText());
	    	}
	    	for(int i=0;i<expected.size();i++)
	    	{
	    		if(!temp.get(i).equalsIgnoreCase(expected.get(i)))
	    		{
	    			TestNGCustomReporter
					.logbr(" verifying campaign Performance  table header names EmailStatement credit page,expected table header's is not available");
	    			return false;
	    		}
	    	}
			return true;
	    	
	    }
	    public boolean verifyCompaignPerformanceTableMerchantNamelist()
	    {
	    	boolean flag=false;
	    	List<CampaignPerformanceVO> Campaignperformance=getCampaignPerformancetablevalues();
	    	for(int i=0;i<Campaignperformance.size();i++)
	    	{
	    		if(!Campaignperformance.get(i).getMerchantName().isEmpty())
	    		{
	    			TestNGCustomReporter
					.logbr("verifying  Email Statement credit campaign Performance table Merchant name ,is displayed");
	    			flag=true;
	    		}
	    		else{
	    			TestNGCustomReporter
					.logbr("verifying  Email Statement credit campaign Performance table Merchant name ,is  not displayed");
	    			flag=false;
	    			break;
	    		}
	    		
	    	}
		  return flag;
	    }
	    
	    public boolean verifyCompaignPerformanceTableCampaignNamelist()
	    {
	    	
	    	boolean flag=false;
	    	List<CampaignPerformanceVO> Campaignperformance=getCampaignPerformancetablevalues();
	         for(int i=0;i<Campaignperformance.size();i++)
	    	 { 
	    		if(!Campaignperformance.get(i).getCampaignName().isEmpty())
	    		{
	    			TestNGCustomReporter
					.logbr("verifying  Email Statement credit campaign Performance table compaign name ,is displayed");
	    			flag=true;
	    		}
	    		else{
	    			TestNGCustomReporter
					.logbr("verifying Email Statement credit campaign Performance table compaign name ,is  not displayed");
	    			flag=false;
	    			break;
	    		}
	    		
	    	 }
			return flag;
	    }
	    
	    public boolean verifyCompaignPerformanceTableImpressionslist()
	    {
	    	
	    	boolean flag=false;
	    	List<CampaignPerformanceVO> Campaignperformance=getCampaignPerformancetablevalues();
	    	for(int i=0;i<Campaignperformance.size();i++)
	    	 { 
	    		if(!Campaignperformance.get(i).getImpressions().isEmpty())
	    		{
	    			TestNGCustomReporter
					.logbr("verifying  Email Statement credit campaign Performance table Impressions values ,is displayed");
	    			flag=true;
	    		}
	    		else{
	    			TestNGCustomReporter
					.logbr("verifying Email  Statement credit campaign Performance table Impressions values ,is  not displayed");
	    			flag=false;
	    			break;
	    		}
	    		
	    	 }
			return flag;
	    }
	    public boolean verifyCompaignPerformanceTableActivationslist()
	    {
	    	
	    	
	    	boolean flag=false;
	    	List<CampaignPerformanceVO> Campaignperformance=getCampaignPerformancetablevalues();
	    	for(int i=0;i<Campaignperformance.size();i++)
	    	 { 
	    		if(!Campaignperformance.get(i).getActivations().isEmpty())
	    		{
	    			TestNGCustomReporter
					.logbr("verifying  Email Statement credit campaign Performance table Activations values ,are displayed");
	    			flag=true;
	    		}
	    		else{
	    			TestNGCustomReporter
					.logbr("verifying  Email Statement credit campaign Performance table Activations values ,are  not displayed");
	    			flag=false;
	    			break;
	    		}
	    		
	    	 }
			return flag;
	    }
	    
	    public boolean verifyCompaignPerformanceTableRedemptionslist()
	    {
	    
	    	boolean flag=false;
	    	List<CampaignPerformanceVO> Campaignperformance=getCampaignPerformancetablevalues();
	    	for(int i=0;i<Campaignperformance.size();i++)
	    	 { 
	    		if(!Campaignperformance.get(i).getRedemptions().isEmpty())
	    		{
	    			TestNGCustomReporter
					.logbr("verifying Email Statement credit campaign Performance table Redemptions values ,are displayed");
	    			flag=true;
	    		}
	    		else{
	    			TestNGCustomReporter
					.logbr("verifying  Email Statement credit campaign Performance table Redemptions values ,are  not displayed");
	    			flag=false;
	    			break;
	    		}
	    		
	    	 }
			return flag;
	    }
	    
	    public boolean verifyCompaignPerformanceTableRedRatelist()
	    {
	    	
	    	boolean flag=false;
	    	List<CampaignPerformanceVO> Campaignperformance=getCampaignPerformancetablevalues();
	    	for(int i=0;i<Campaignperformance.size();i++)
	    	 { 
	    		if(!Campaignperformance.get(i).getRedRate().isEmpty())
	    		{
	    			TestNGCustomReporter
					.logbr("verifying Email Statement credit campaign Performance table  Red. Rate values ,are displayed");
	    			flag=true;
	    		}
	    		else{
	    			TestNGCustomReporter
					.logbr("verifying  Email Statement credit campaign Performance table  Red. Rate  values ,are  not displayed");
	    			flag=false;
	    			break;
	    		}
	    		
	    	 }
			return flag;
	    }
	    
	    public boolean verifyCompaignPerformanceTableTotalSpendlist()
	    {
	    	
	    	boolean flag=false;
	    	List<CampaignPerformanceVO> Campaignperformance=getCampaignPerformancetablevalues();
	    	for(int i=0;i<Campaignperformance.size();i++)
	    	 { 
	    		if(!Campaignperformance.get(i).getTotalSpend().isEmpty())
	    		{
	    			TestNGCustomReporter
					.logbr("verifying Email Statement credit campaign Performance Total Spend Rate values ,are displayed");
	    			flag=true;
	    		}
	    		else{
	    			TestNGCustomReporter
					.logbr("verifying  Email Statement credit campaign Performance table Total Spend   values ,are  not displayed");
	    			flag=false;
	    			break;
	    		}
	    		
	    	 }
			return flag;
	    }
	    
	    public boolean verifyCompaignPerformanceTableAvgSpendlist()
	    {
	    	
	    	boolean flag=false;
	    	List<CampaignPerformanceVO> Campaignperformance=getCampaignPerformancetablevalues();
	    	for(int i=0;i<Campaignperformance.size();i++)
	    	 { 
	    		if(!Campaignperformance.get(i).getAvgSpend().isEmpty())
	    		{
	    			TestNGCustomReporter
					.logbr("verifying Email Statement credit campaign Performance Avg. Spend Rate values ,are displayed");
	    			flag=true;
	    		}
	    		else{
	    			TestNGCustomReporter
					.logbr("verifying  Email Statement credit campaign Performance table Avg. Spend    values ,are  not displayed");
	    			flag=false;
	    			break;
	    		}
	    		
	    	 }
			return flag;
	    }
	    
	    public boolean verifyCompaignPerformanceTableTotalCashbacklist()
	    {
	    	
	    	boolean flag=false;
	    	List<CampaignPerformanceVO> Campaignperformance=getCampaignPerformancetablevalues();
	    	for(int i=0;i<Campaignperformance.size();i++)
	    	 { 
	    		if(!Campaignperformance.get(i).getTotalCashback().isEmpty())
	    		{
	    			TestNGCustomReporter
					.logbr("verifying Email Statement credit campaign Performance  Total Cashback values ,are displayed");
	    			flag=true;
	    		}
	    		else{
	    			TestNGCustomReporter
					.logbr("verifying  Email Statement credit campaign Performance table  Total Cashback  values ,are  not displayed");
	    			flag=false;
	    			break;
	    		}
	    		
	    	 }
			return flag;
	    }
	    public boolean verifyCompaignPerformanceTableCommissionlist(){
	    	
	    	boolean flag=false;
	    	List<CampaignPerformanceVO> Campaignperformance=getCampaignPerformancetablevalues();
	    	for(int i=0;i<Campaignperformance.size();i++) { 
	    		if(!Campaignperformance.get(i).getCommission().isEmpty()){
	    			TestNGCustomReporter
					.logbr("verifying Email Statement credit campaign Performance  Commission  values ,are displayed");
	    			flag=true;
	    			}else{
	    			TestNGCustomReporter
					.logbr("verifying  Email Statement credit campaign Performance table Commission  values ,are  not displayed");
	    			flag=false;
	    			break;}
	    	}
			return flag;
	    }  
	    public boolean verifyCompaignPerformanceTableROASlist(){
	    	
	    	boolean flag=false;
	    	List<CampaignPerformanceVO> Campaignperformance=getCampaignPerformancetablevalues();
	    	for(int i=0;i<Campaignperformance.size();i++) { 
	    		if(!Campaignperformance.get(i).getrOAS().isEmpty()){
	    			TestNGCustomReporter
					.logbr("verifying Email Statement credit campaign Performance  ROAS  values ,are displayed");
	    			flag=true;
	    			}else{
	    			TestNGCustomReporter
					.logbr("verifying  Email Statement credit campaign Performance table ROAS values ,are  not displayed");
	    			flag=false;
	    			break;}
	    	}
			return flag;
	    }  
	    
	    
	    public boolean verifyCompaignPerformanceTableConvFactorlist(){
	    	
	    	boolean flag=false;
	    	List<CampaignPerformanceVO> Campaignperformance=getCampaignPerformancetablevalues();
	    	for(int i=0;i<Campaignperformance.size();i++) { 
	    		if(!Campaignperformance.get(i).getConvFactor().isEmpty()){
	    			TestNGCustomReporter
					.logbr("verifying Email Statement credit campaign Performance   Conv. Factor  values ,are displayed");
	    			flag=true;
	    			}else{
	    			TestNGCustomReporter
					.logbr("verifying  Email Statement credit campaign Performance table Conv. Factor values ,are  not displayed");
	    			flag=false;
	    			break;}
	    	}
			return flag;
	    }  
	    
	  
	   /* public boolean CompareCampaignName(List<CampaignPerformanceVO> adminList, List<CampaignPerformanceVO> merchantList)
	       {
	    	
		      boolean flag=true;
	            for(int i=0;i<adminList.size();i++) {
	            	System.out.println(""+adminList.get(i).getCampaignName()+"   compartion "+merchantList.get(i).getCampaignName());
	                if(adminList.get(i).getCampaignName().equalsIgnoreCase(merchantList.get(i).getCampaignName()))
                    { 
                    	 flag=false;
	                    	 TestNGCustomReporter.logbr(" Compaign performance table CampaignName Coulumn data between Admin login and merchant login doesnt match");
	                        break;
	                    }
	                   
	                 }
	       
	         return flag;
         }*/
	   
	    public boolean CompareCampaignName(List<CampaignPerformanceVO> adminList, List<CampaignPerformanceVO> merchantList)
	       {
	    	
		      boolean flag=true;
	            for(int i=0;i<adminList.size();i++) {
	            	
	                if(adminList.get(i).getCampaignName().equalsIgnoreCase(merchantList.get(i).getCampaignName()))
                     { 
	                		flag=false;
	                    	 TestNGCustomReporter.logbr(" Compaign performance table CampaignName Coulumn data between Admin login and merchant login doesnt match");
	                        break;
	                    }
	                   
	                 }
	       
	         return flag;
      }
	    public boolean CompareMerchantName(List<CampaignPerformanceVO> adminList, List<CampaignPerformanceVO> merchantList)
	       {
		      boolean flag=true;
	            for(int i=0;i<adminList.size();i++) {
	            	
	                if(!adminList.get(i).getMerchantName().equalsIgnoreCase(merchantList.get(i).getMerchantName()))
	                     { 
	                    	 flag=false;
	                    	 TestNGCustomReporter.logbr(" Compaign performance table Merchant Name Coulumn data between Admin login and merchant login doesnt match");
	                         break;
	                    }
	                   
	                 }
	       
	         return flag;
        }
	    
	    public boolean CompareImpressions(List<CampaignPerformanceVO> adminList, List<CampaignPerformanceVO> merchantList)
	       {
		      boolean flag=true;
	            for(int i=0;i<adminList.size();i++) {
	                if(!adminList.get(i).getImpressions().equalsIgnoreCase(merchantList.get(i).getImpressions()))
	                     { 
	                    	 flag=false;
	                    	 TestNGCustomReporter.logbr(" Compaign performance table Impressions Coulumn data between Admin login and merchant login doesnt match");
	                         break;
	                    }
	                   
	                 }
	       
	         return flag;
         }   
	    
	    public boolean CompareActivations(List<CampaignPerformanceVO> adminList, List<CampaignPerformanceVO> merchantList)
	       {
		      boolean flag=true;
	            for(int i=0;i<adminList.size();i++) {
	            	System.out.println(""+adminList.get(i).getActivations()+"   compartion with    "+merchantList.get(i).getActivations());
	            	
	                if(!adminList.get(i).getActivations().equalsIgnoreCase(merchantList.get(i).getActivations()))
	                     { 
	                    	 flag=false;
	                    	 TestNGCustomReporter.logbr(" Compaign performance table Activations Coulumn data between Admin login and merchant login doesnt match");
	                         break;
	                    }
	                   
	                 }
	       
	         return flag;
      }    
	    public boolean CompareRedemptions(List<CampaignPerformanceVO> adminList, List<CampaignPerformanceVO> merchantList)
	       {
		      boolean flag=true;
	            for(int i=0;i<adminList.size();i++) {
	                if(!adminList.get(i).getRedemptions().equalsIgnoreCase(merchantList.get(i).getRedemptions()))
	                     { 
	                    	 flag=false;
	                    	 TestNGCustomReporter.logbr(" Compaign performance table Redemptions Coulumn data between Admin login and merchant login doesnt match");
	                         break;
	                    }
	                   
	                 }
	       
	         return flag;
        }    
	    
	    public boolean CompareRedRate(List<CampaignPerformanceVO> adminList, List<CampaignPerformanceVO> merchantList)
	       {
		      boolean flag=true;
	            for(int i=0;i<adminList.size();i++) {
	                if(!adminList.get(i).getRedRate().equalsIgnoreCase(merchantList.get(i).getRedRate()))
	                     { 
	                    	 flag=false;
	                    	 TestNGCustomReporter.logbr(" Compaign performance table RedRate Coulumn data between Admin login and merchant login doesnt match");
	                         break;
	                    }
	                   
	                 }
	       
	         return flag;
       } 
	    
	    public boolean CompareTotalSpend(List<CampaignPerformanceVO> adminList, List<CampaignPerformanceVO> merchantList)
	       {
		      boolean flag=true;
	            for(int i=0;i<adminList.size();i++) {
	                if(!adminList.get(i).getTotalSpend().equalsIgnoreCase(merchantList.get(i).getTotalSpend()))
	                     { 
	                    	 flag=false;
	                    	 TestNGCustomReporter.logbr(" Compaign performance table Total Spend Coulumn data between Admin login and merchant login doesnt match");
	                         break;
	                    }
	                   
	                 }
	       
	         return flag;
         }   
	    
	    
	    
	    public boolean CompareAvgSpend(List<CampaignPerformanceVO> adminList, List<CampaignPerformanceVO> merchantList)
	       {
		      boolean flag=true;
	            for(int i=0;i<adminList.size();i++) {
	                if(!adminList.get(i).getAvgSpend().equalsIgnoreCase(merchantList.get(i).getAvgSpend()))
	                     { 
	                    	 flag=false;
	                    	 TestNGCustomReporter.logbr(" Compaign performance table Avg. Spend Coulumn data between Admin login and merchant login doesnt match");
	                         break;
	                    }
	                   
	                 }
	       
	         return flag;
         }    
	    
	    public boolean CompareTotalCashback(List<CampaignPerformanceVO> adminList, List<CampaignPerformanceVO> merchantList)
	       {
		      boolean flag=true;
	            for(int i=0;i<adminList.size();i++) {
	                if(!adminList.get(i).getTotalCashback().equalsIgnoreCase(merchantList.get(i).getTotalCashback()))
	                     { 
	                    	 flag=false;
	                    	 TestNGCustomReporter.logbr(" Compaign performance table Total Cashback Coulumn data between Admin login and merchant login doesnt match");
	                         break;
	                    }
	                   
	                 }
	       
	         return flag;
          }  
	    
	    
	    public boolean CompareCommission(List<CampaignPerformanceVO> adminList, List<CampaignPerformanceVO> merchantList)
	       {
		      boolean flag=true;
	            for(int i=0;i<adminList.size();i++) {
	            	System.out.println(adminList.get(i).getCommission()+"   "+merchantList.get(i).getCommission());
	                if(!adminList.get(i).getCommission().equalsIgnoreCase(merchantList.get(i).getCommission()))
	                     { 
	                    	 flag=false;
	                    	 TestNGCustomReporter.logbr(" Compaign performance table Commission Coulumn data between Admin login and merchant login doesnt match");
	                         break;
	                    }
	                   
	                 }
	       
	         return flag;
       } 
	    
	    public boolean CompareROAS(List<CampaignPerformanceVO> adminList, List<CampaignPerformanceVO> merchantList)
	       {
		      boolean flag=true;
	            for(int i=0;i<adminList.size();i++) {
	            	System.out.println(adminList.get(i).getrOAS()+"   "+merchantList.get(i).getrOAS());
	                if(!adminList.get(i).getrOAS().equalsIgnoreCase(merchantList.get(i).getrOAS()))
	                     { 
	                    	 flag=false;
	                    	 TestNGCustomReporter.logbr(" Compaign performance table ROAS Coulumn data between Admin login and merchant login doesnt match");
	                         break;
	                    }
	                   
	                 }
	       
	         return flag;
       }
	    
	    public boolean CompareConvFactor(List<CampaignPerformanceVO> adminList, List<CampaignPerformanceVO> merchantList)
	       {
		      boolean flag=true;
	            for(int i=0;i<adminList.size();i++) {
	                if(!adminList.get(i).getConvFactor().equalsIgnoreCase(merchantList.get(i).getConvFactor()))
	                     { 
	                    	 flag=false;
	                    	 TestNGCustomReporter.logbr(" Compaign performance table Conv. Factor Coulumn data between Admin login and merchant login doesnt match");
	                         break;
	                    }
	                   
	                 }
	       
	         return flag;
    }   
	    
	    public boolean CompareKeyStatisticsTableValues(KeyStatisticsVO adminListVO, KeyStatisticsVO merchantListVO)
	       {
		         boolean flag=false;
		  
	              if(adminListVO.equals(merchantListVO))
	                     { 
	                	     flag=true;
	                    	 TestNGCustomReporter.logbr("Key Statistics table data in Email  Statement credit page  Admin login and merchant login is matching");
	                        
	                     } else{
	                	 flag=true;
	                	 	TestNGCustomReporter.logbr("Key Statistics table data in  Email Statement credit page  Admin login and merchant login doesnot match");
	                    }
	       
	              return flag;
	        }    
	    
	    
	    
	    
	   
	    public List ReadUIdata()
	    {
	    	List<WebElement> data=returnWebElements(EMAILSTATEMENT_UI_DATA);
	    	for(WebElement ele:data)
	    	{
	    		UIData.add(ele.getText());
	    	}
	    	return UIData;
	    }
	        
	    
	    
  }
	
	
	
	
	
	

