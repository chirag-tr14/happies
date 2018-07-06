package com.truaxis.reporting.pageobjects;


import static com.truaxis.common.GlobalStaticInfo.*;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.core.reports.TestNGCustomReporter;
import com.truaxis.common.PageFactory;
import com.truaxis.reporting.valueobjects.CampaignPerformanceVO;
import com.truaxis.reporting.valueobjects.KeyPerformanceVO;


public class PrepaidGiftCardPage extends RDHomePage
{ 
	KeyPerformanceVO  KeyPerformanceVO;
	CampaignPerformanceVO campaignPerformanceVO; 
	
	public PrepaidGiftCardPage(WebDriver webDriver,PageFactory pgFactory) 
	{
		super(webDriver,pgFactory);
		KeyPerformanceVO=new KeyPerformanceVO();
	}
	
	public KeyPerformanceVO VerifyKeyPerformancetablevalues()
	{   
		List<String> KeyPerformanceList=new ArrayList<String>();
		List<WebElement> elements=returnWebElements(PREPAIDGIFTCARD_KEYPERFORMANCE_TABLE);
		System.out.println(elements.size());
	    for(int i=0;i<elements.size();i++){
	    	KeyPerformanceList.add(elements.get(i).getText());
			}
	    KeyPerformanceVO.setImpressions(KeyPerformanceList.get(0)); 
	    KeyPerformanceVO.setExpansions(KeyPerformanceList.get(1));
	    KeyPerformanceVO.setClicks(KeyPerformanceList.get(2));
	    KeyPerformanceVO.setPurchase(KeyPerformanceList.get(3));
	    KeyPerformanceVO.setCommission(KeyPerformanceList.get(4));
		 return KeyPerformanceVO;
	}
	
	
	public List<CampaignPerformanceVO> getCampaignPerformancetablevaluesonAdminPage()
	{
		
        List<CampaignPerformanceVO> CampaignPerformanceList = new ArrayList<CampaignPerformanceVO>();
        
        List<WebElement> rowsCount =returnWebElements(CAMPAINGN_PERFORMANCE_TABLE_COUNT_ADMINPAGE);
        System.out.println("Size"+rowsCount.size());
        for(int i = 2; i<=rowsCount.size()-1 ; i++)
        {
        	   CampaignPerformanceVO  rowObject = new CampaignPerformanceVO();
        	   List<WebElement> cell = returnWebElements(rowsCount.get(i),CAMPAINGN_PERFORMANCE_TABLE);
        	   System.out.println("size"+cell.size());
        	   System.out.println("Count "+i);
        	   System.out.println("Merchant Name="+cell.get(0).getText());
		       rowObject.setMerchantName(cell.get(0).getText());
		       rowObject.setCampaignName(cell.get(1).getText());
		       rowObject.setActivations(cell.get(2).getText());
		       rowObject.setImpressions(cell.get(2).getText());
		       rowObject.setExpansions(cell.get(3).getText());
		       rowObject.setClicks(cell.get(4).getText());
		       rowObject.setPurchases(cell.get(5).getText());
		       rowObject.setCommission(cell.get(6).getText());
		       CampaignPerformanceList.add(rowObject);  	
        }
        return CampaignPerformanceList;
        }
	
	public List<CampaignPerformanceVO> getCampaignPerformancetablevaluesMerchantPage()
	{
		
        List<CampaignPerformanceVO> CampaignPerformanceList = new ArrayList<CampaignPerformanceVO>();
     
        List<WebElement> rowsCount =returnWebElements(CAMPAINGN_PERFORMANCE_TABLE_COUNT_ADMINPAGE);
        System.out.println("Size"+rowsCount.size());
        for(int i = 2; i<=rowsCount.size()-1 ; i++)
        {
        	   CampaignPerformanceVO  rowObject = new CampaignPerformanceVO();
        	   List<WebElement> cell = returnWebElements(rowsCount.get(i),CAMPAINGN_PERFORMANCE_TABLE);
        	   System.out.println("size"+cell.size());
        	   System.out.println("Count "+i);
        	   System.out.println("Merchant Name="+cell.get(0).getText());
		       rowObject.setMerchantName(cell.get(0).getText());
		       rowObject.setCampaignName(cell.get(1).getText());
		       rowObject.setImpressions(cell.get(2).getText());
		       rowObject.setExpansions(cell.get(3).getText());
		       rowObject.setClicks(cell.get(4).getText());
		       rowObject.setPurchases(cell.get(5).getText());
		       rowObject.setCommission(cell.get(6).getText());
		       CampaignPerformanceList.add(rowObject);  	
        }
        return CampaignPerformanceList;
        }
       
	public boolean CompareMerchantNamedata(List<CampaignPerformanceVO> adminList, List<CampaignPerformanceVO> merchantList)
	{
		boolean flag =true;
		
		for(int i=0;i<adminList.size();i++)
		{
			if(!adminList.get(i).getMerchantName().equalsIgnoreCase(merchantList.get(i).getMerchantName()))
			{
				flag=false;
				TestNGCustomReporter.logbr("data between merchant login and Admin login doesnt match");
			}
		}
		return flag;
		
	}
	
	public boolean CompareCampaignName(List<CampaignPerformanceVO> adminList, List<CampaignPerformanceVO> merchantList)
	{
		boolean flag =true;
		
		for(int i=0;i<adminList.size();i++)
		{
			if(!adminList.get(i).getCampaignName().equalsIgnoreCase(merchantList.get(i).getCampaignName()))
			{
				flag=false;
				TestNGCustomReporter.logbr("data between merchant login and Admin login doesnt match");
			}
		}
		return flag;
		
	}
	
	public boolean CompareImpression(List<CampaignPerformanceVO> adminList, List<CampaignPerformanceVO> merchantList)
	{
		boolean flag =true;
		
		for(int i=0;i<adminList.size();i++)
		{
			if(!adminList.get(i).getImpressions().equalsIgnoreCase(merchantList.get(i).getImpressions()))
			{
				flag=false;
				TestNGCustomReporter.logbr("data between merchant login and Admin login doesnt match");
			}
		}
		return flag;
		
	}
	
	public boolean CompareExpansion(List<CampaignPerformanceVO> adminList, List<CampaignPerformanceVO> merchantList)
	{
		boolean flag =true;
		
		for(int i=0;i<adminList.size();i++)
		{
			if(!adminList.get(i).getExpansions().equalsIgnoreCase(merchantList.get(i).getExpansions()))
			{
				flag=false;
				TestNGCustomReporter.logbr("data between merchant login and Admin login doesnt match");
			}
		}
		return flag;
		
	}
	
	public boolean CompareClicks(List<CampaignPerformanceVO> adminList, List<CampaignPerformanceVO> merchantList)
	{
		boolean flag =true;
		
		for(int i=0;i<adminList.size();i++)
		{
			if(!adminList.get(i).getClicks().equalsIgnoreCase(merchantList.get(i).getClicks()))
			{
				flag=false;
				TestNGCustomReporter.logbr("data between merchant login and Admin login doesnt match");
			}
		}
		return flag;
		
	}
	
	public boolean ComparePurchases(List<CampaignPerformanceVO> adminList, List<CampaignPerformanceVO> merchantList)
	{
		boolean flag =true;
		
		for(int i=0;i<adminList.size();i++)
		{
			if(!adminList.get(i).getPurchases().equalsIgnoreCase(merchantList.get(i).getPurchases()))
			{
				flag=false;
				TestNGCustomReporter.logbr("data between merchant login and Admin login doesnt match");
			}
		}
		return flag;
		
	}
	public boolean CompareCommission(List<CampaignPerformanceVO> adminList, List<CampaignPerformanceVO> merchantList)
	{
		boolean flag =true;
		
		for(int i=0;i<adminList.size();i++)
		{
			if(!adminList.get(i).getCommission().equalsIgnoreCase(merchantList.get(i).getCommission()))
			{
				flag=false;
				TestNGCustomReporter.logbr("data between merchant login and Admin login doesnt match");
			}
		}
		return flag;
		
	}
	
	public boolean verifyMerchantNamePopulatedInvaliddataOntable(List<CampaignPerformanceVO> tableDataList)
	{
		boolean flag=true;
		for(int i=0;i<tableDataList.size();i++)
		{
			if(tableDataList.get(i).getMerchantName().isEmpty()||tableDataList.get(i).getMerchantName().equals(""))
			{
				flag =false;
				TestNGCustomReporter.logbr("Table data for merchantname populated null value");
				
			}
				
		}
		return flag;
		
	}

	public boolean verifyCampaignNamePopulatedInvaliddataOntable(List<CampaignPerformanceVO> tableDataList)
	{
		boolean flag=true;
		for(int i=0;i<tableDataList.size();i++)
		{
			if(tableDataList.get(i).getCampaignName().isEmpty()||tableDataList.get(i).getCampaignName().equals(""))
			{
				flag =false;
				TestNGCustomReporter.logbr("Table data for Campaign name populated null/Empty value");
				
			}
				
		}
		return flag;
		
	}

	public boolean verifyImpressionsPopulatedInvaliddataOntable(List<CampaignPerformanceVO> tableDataList)
	{
		boolean flag=true;
		for(int i=0;i<tableDataList.size();i++)
		{
			if(tableDataList.get(i).getImpressions().isEmpty()||tableDataList.get(i).getImpressions().equals(""))
			{
				flag =false;
				TestNGCustomReporter.logbr("Table data for Impressions populated null/Empty value");
				
			}
				
		}
		return flag;
		
	}
	
	public boolean verifyExpansionsPopulatedInvaliddataOntable(List<CampaignPerformanceVO> tableDataList)
	{
		boolean flag=true;
		for(int i=0;i<tableDataList.size();i++)
		{
			if(tableDataList.get(i).getExpansions().isEmpty()||tableDataList.get(i).getExpansions().equals(""))
			{
				flag =false;
				TestNGCustomReporter.logbr("Table data for Expansions populated null/Empty value");
				
			}
				
		}
		return flag;
		
	}
	
	
	public boolean verifyClicksPopulatedInvaliddataOntable(List<CampaignPerformanceVO> tableDataList)
	{
		boolean flag=true;
		for(int i=0;i<tableDataList.size();i++)
		{
			if(tableDataList.get(i).getClicks().isEmpty()||tableDataList.get(i).getClicks().equals(""))
			{
				flag =false;
				TestNGCustomReporter.logbr("Table data for Clicks populated Empty/null value");
				
			}
				
		}
		return flag;
		
	}
	
	public boolean verifyPurchasesPopulatedInvaliddataOntable(List<CampaignPerformanceVO> tableDataList)
	{
		boolean flag=true;
		for(int i=0;i<tableDataList.size();i++)
		{
			if(tableDataList.get(i).getPurchases().isEmpty()||tableDataList.get(i).getPurchases().equals(""))
			{
				flag =false;
				TestNGCustomReporter.logbr("Table data for Purchases populated null/empty value");
				
			}
				
		}
		return flag;
		
	}
	
	public boolean verifyCommissionPopulatedInvaliddataOntable(List<CampaignPerformanceVO> tableDataList)
	{
		boolean flag=true;
		for(int i=0;i<tableDataList.size();i++)
		{
			if(tableDataList.get(i).getCommission().isEmpty()||tableDataList.get(i).getCommission().equals(""))
			{
				flag =false;
				TestNGCustomReporter.logbr("Table data for Commission populated null/empty value");
				
			}
				
		}
		return flag;
		
	}


 }
	  
 
  
  
	



	




