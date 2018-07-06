package com.core.actionhandlers;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ResourceBundle;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.core.actions.MouseActions;


public class NativeMouseActionsHandler implements MouseActions{

	private Robot robot ;
	private int offset = Integer.parseInt(ResourceBundle.getBundle("config").getString("appScreenOffset"));
	private static final Logger logger = LogManager.getLogger(NativeMouseActionsHandler.class);

	public NativeMouseActionsHandler(){
		try {
			robot = new Robot();
		} catch (AWTException e) {
			logger.info("Robot intialization error -- while doing native browser actions");
		}
	}

	public void mouseMove(WebElement element){

		int x = element.getLocation().x;
		int y = element.getLocation().y;
		y = y+offset;
		robot.mouseMove(x, y);
	}
	
	public void mouseMove(WebElement element, int xOffset, int yOffset){

		int x = element.getLocation().x+xOffset;
		int y = element.getLocation().y+yOffset;
		y = y+offset;
		robot.mouseMove(x, y);
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
