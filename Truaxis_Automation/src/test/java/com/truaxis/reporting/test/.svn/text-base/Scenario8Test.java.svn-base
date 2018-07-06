package com.truaxis.reporting.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.truaxis.common.BaseTest;

import com.truaxis.reporting.pageobjects.TagCampaignMappingPage;

public class Scenario8Test extends BaseTest {

	private Map<String, String> td = getTestDataProperties();

	private TagCampaignMappingPage tagCampaignMappingPage;

	@BeforeClass
	public void setUpOnce1() {
		 tagCampaignMappingPage =getPageFactory().tagCampaignMappingPage();
		 tagCampaignMappingPage.openRdLoginpage().goToHomePage(td.get("admin_email"), td.get("admin_password"))
		 .clickTagCampaignMappingPageMenuLink();
	}

	@Test()
	public void testRD_8_1() {
		boolean actual = tagCampaignMappingPage.verifyTagCampaignMappingPageHeaderText(td.get("tag_campaign_mapping_page_header"));
		Assert.assertEquals(actual,true,"Reporting: Tags Campaign Mapping,is not displayed on Tags and Campaign Mapping page");
	}
	
	@Test()
	public void testRD_8_2() throws InterruptedException {
		boolean actual = tagCampaignMappingPage.verifyTagCampaignMappingPageContents(td.get("tag_campaign_mapping_page_export_label"));
		Assert.assertEquals(actual,true,"Reporting: Tags Campaign Mapping contents,is not displayed on Tags and Campaign Mapping page");
	}
	
	@Test()
	public void testRD_8_3() {
		boolean actual = tagCampaignMappingPage.verifyTableWithCampaignAndTagNames();
		Assert.assertEquals(actual,true,"Reporting: Tags Campaign Mapping page is not displayed table with Campaign and Tag names");
	}
}
