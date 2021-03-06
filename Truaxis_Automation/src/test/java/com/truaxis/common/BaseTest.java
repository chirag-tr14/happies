package com.truaxis.common;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.core.config.BrowserConfig;
import com.core.config.PropTestdataConfig;
import com.core.maindriver.DriverScript;
import com.core.reports.TestNGCustomReporter;
import com.core.settings.GlobalSettings;

public class BaseTest 
{

	private WebDriver driver;
	private DriverScript driverScript;
	private GlobalSettings globalSettings = new GlobalSettings();
	private HashMap<String, String> testDataProperties =new HashMap<String, String>();
	
	
	@BeforeClass
	public void beforeClass() {
		initWebDriver();
		TestNGCustomReporter.logbr("Browser launched successfully");
	}

	@AfterClass(alwaysRun = true)
	public void afterClass(){
		closeBrowser();
		TestNGCustomReporter.logbr("Closed all the browsers opened by webdriver.");
	}

	public HashMap<String, String> getTestDataProperties() {
		if(testDataProperties.size()<=0){
			setTestDataProperties();
		}
		return testDataProperties;
	}

	private void setTestDataProperties() {
		try {
			testDataProperties = new PropTestdataConfig()
			.getWebElementMapping();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	protected WebDriver initWebDriver() {
		try {
			driverScript = new DriverScript(new BrowserConfig(globalSettings.getBrowser()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver = driverScript.getDriverObject();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	public PageFactory getPageFactory() {
		return new PageFactory(driver);
	}


	private void closeBrowser(){
		driverScript.stopSelenium(driver);
	}

}
