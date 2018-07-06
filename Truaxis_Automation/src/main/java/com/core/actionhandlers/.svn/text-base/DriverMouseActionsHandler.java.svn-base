package com.core.actionhandlers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.core.actions.MouseActions;

public class DriverMouseActionsHandler implements MouseActions{

	private WebDriver driver ;
	
	public DriverMouseActionsHandler(WebDriver driver){
		this.driver = driver;
	}
	
	@Override
	public void mouseMove(WebElement element) {
		Actions builder = new Actions(driver);
		Action mouseAction = builder.moveToElement(element).build();
        mouseAction.perform();
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
