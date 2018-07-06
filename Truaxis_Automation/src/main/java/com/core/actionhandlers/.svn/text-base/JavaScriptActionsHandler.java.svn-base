package com.core.actionhandlers;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.seleniumemulation.JavascriptLibrary;

import com.core.actions.JavaScriptActions;

/**
 * Name : JavaScriptActionsHandler
 * 
 * Description : This class is an implementer for JavaScriptActions.
 * 
 * 
 * 
 * Version : 1.0
 * 
 **/
public class JavaScriptActionsHandler implements JavaScriptActions {
	
	private JavascriptLibrary jsLib = new JavascriptLibrary();
	private WebDriver driver;
	public static final Logger logger = LogManager.getLogger(JavaScriptActionsHandler.class);
	
	public JavaScriptActionsHandler(WebDriver driver, int passedTimeout){
		this.driver=driver;
	}

	public void triggerJavascriptEvent(jsEvent event, WebElement element) {
		jsLib.callEmbeddedSelenium(driver, "triggerEvent", element, event.toString().toLowerCase());
	}

	public Object executeScript(String script, Object... args) {
		return ((JavascriptExecutor) driver).executeScript(script, args);
	}

}