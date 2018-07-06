package com.core.config;

/**
 * Name : ExcelLocatorConfig
 * 
 * Description : This class is an implementer class of Locator config, for excel file.
 * 
 * 
 * 
 * Version : 1.0
 * 
 **/
import java.io.File;
import java.util.HashMap;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.core.util.ExcelHandler;

public class ExcelLocatorConfig implements LocatorConfig{
	
	private final File fileName;
	private final ExcelHandler testLocators;
	private HashMap<String,String> webElementMapping;
	public static final Logger logger = LogManager.getLogger(ExcelLocatorConfig.class);
	
	public ExcelLocatorConfig() throws Exception {
		fileName = new File(this.getClass().getResource(locators).toURI());
		testLocators = new ExcelHandler(fileName);
		testLocators.selectSheet("Locators");
		webElementMapping = testLocators.mapTwoColumns(1, 2, true);
	}

	public HashMap<String, String> getWebElementMapping() {
		return webElementMapping;
	}


}

