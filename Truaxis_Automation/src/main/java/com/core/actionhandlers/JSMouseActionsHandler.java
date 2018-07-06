package com.core.actionhandlers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.core.actions.MouseActions;

public class JSMouseActionsHandler implements MouseActions{

	private WebDriver driver;
	
	public JSMouseActionsHandler(WebDriver driver){
		this.driver = driver;
	}
	
	public void mouseMove(WebElement element) {
		String javaScript = "var evObj = document.createEvent('MouseEvents');" +
				"evObj.initMouseEvent(\"mouseover\",true, false, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);" +
				"arguments[0].dispatchEvent(evObj);";
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript(javaScript, element);	
	}

	@Override
	public void mousePress() {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseRelease() {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseWheel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPress() {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyRelease() {
		// TODO Auto-generated method stub

	}

}
