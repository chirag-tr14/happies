package com.truaxis.reporting.pageobjects;

import static com.truaxis.common.GlobalStaticInfo.*;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.core.reports.TestNGCustomReporter;
import com.truaxis.common.PageFactory;

public class TagCampaignMappingPage extends RDHomePage
{ 
	public TagCampaignMappingPage(WebDriver webDriver,PageFactory pgFactory) 
	{
		super(webDriver,pgFactory);
	}
	
	public boolean verifyTagCampaignMappingPageHeaderText(String expected) {
		boolean flag = verifyExpectedText(TAGCOMPAIGNMAPPINGPAGE_TAG_CAMPAIGN_MAPPING_HEADER_LABEL, expected);
		return flag;
	}

	public boolean verifyTagCampaignMappingPageContents(String expected) throws InterruptedException {
		Thread.sleep(1000);
		boolean flag1 = verifyExpectedText(TAGCOMPAIGNMAPPINGPAGE_TAG_CAMPAIGN_MAPPING_EXPORT_LABEL, expected);
		boolean flag2 = verifyWebElement(TAGCOMPAIGNMAPPINGPAGE_TAG_CAMPAIGN_MAPPING_PDF_LINK);
		boolean flag3 = verifyWebElement(TAGCOMPAIGNMAPPINGPAGE_TAG_CAMPAIGN_MAPPING_EXCEL_LINK);
		boolean flag4 = verifyWebElement(TAGCOMPAIGNMAPPINGPAGE_TAG_CAMPAIGN_MAPPING_CSV_LINK);
		boolean flag5 = verifyWebElement(TAGCOMPAIGNMAPPINGPAGE_TAG_CAMPAIGN_MAPPING_BROWSE_BUTTON);
		boolean flag6 = verifyWebElement(TAGCOMPAIGNMAPPINGPAGE_TAG_CAMPAIGN_MAPPING_UPLOAD_BUTTON);
		return (flag1 && flag2 && flag3 && flag4 && flag5 && flag6);
	}
	
	public boolean verifyTableWithCampaignAndTagNames() {
		boolean flag=false;
		List<String> tableContentsList = new ArrayList<String>();
		flag = verifyWebElement(TAGCOMPAIGNMAPPINGPAGE_TAG_CAMPAIGN_MAPPING_TABLE_VALUES);
		if(flag) {
			TestNGCustomReporter.logbr("Table with Campaign and Tag name is present in the Tag Campaign Page");
			List<WebElement> tableContents = returnWebElements(TAGCOMPAIGNMAPPINGPAGE_TAG_CAMPAIGN_MAPPING_TABLE_CONTENTS);
			for(WebElement elements:tableContents) {
				tableContentsList.add(elements.getText());
			}
			for(int i=0;i<tableContentsList.size();i++) {
				System.out.print(tableContentsList.get(i)+"		");
				i++;
				System.out.print(tableContentsList.get(i)+"						");
				i++;
				System.out.println(tableContentsList.get(i));
			}
		} else
		{
			TestNGCustomReporter.logbr("Table with Campaign and Tag name is not present in the Tag Campaign Page");
			flag=false;
		}
		return flag;
	}
}