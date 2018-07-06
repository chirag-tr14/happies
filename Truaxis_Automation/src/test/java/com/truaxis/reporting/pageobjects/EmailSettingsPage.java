package com.truaxis.reporting.pageobjects;

import static com.truaxis.common.GlobalStaticInfo.*;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import sun.org.mozilla.javascript.internal.regexp.SubString;
import com.core.reports.TestNGCustomReporter;
import com.core.util.Utility;
import com.truaxis.common.GlobalStaticInfo;
import com.truaxis.common.PageFactory;

public class EmailSettingsPage extends RDHomePage
{ 
	public EmailSettingsPage(WebDriver webDriver,PageFactory pgFactory) 
	{
		super(webDriver,pgFactory);
	}
	
	public boolean verifyEmailSettingsHeaderText(String expected) {
		boolean flag = verifyExpectedText(EMAILSETTINGSPAGE_EMAIL_SETTINGS_HEADER_LABEL, expected);
		return flag;
	}

	public boolean verifyLabelAndDropDown(String expected) {
		boolean flag1 = verifyExpectedText(EMAILSETTINGSPAGE_EMAIL_SETTINGS_LABEL, expected);
		boolean flag2 = verifyDropDown(EMAILSETTINGSPAGE_EMAIL_SETTINGS_DROPDOWN);
		return (flag1 && flag2);
	}
	
	public boolean verifyTextFieldAndButton(String expected) {
		clickElement(EMAILSETTINGSPAGE_EMAIL_SETTINGS_DROPDOWN_ICON);
		clickElement(EMAILSETTINGSPAGE_EMAIL_SETTINGS_DROPDOWN_LIST);
		boolean flag1 = verifyWebElement(EMAILSETTINGSPAGE_EMAIL_SETTINGS_NAME_TEXTBOX);
		boolean flag2 = verifyWebElement(EMAILSETTINGSPAGE_EMAIL_SETTINGS_EMAIL_TEXTBOX);
		boolean flag3 = verifyWebElement(EMAILSETTINGSPAGE_EMAIL_SETTINGS_ADD_BUTTON);
		boolean flag4 = verifyExpectedText(EMAILSETTINGSPAGE_EMAIL_SETTINGS_REPORT_LABEL, expected);
		return (flag1 && flag2 && flag3 && flag4);
	}
	
	public boolean verifyNameErrorMessage(String expected) {
		String name = null;
		String email = Utility.getRandomAlphabet(3)+"@"+Utility.getRandomAlphabet(3)+"."+Utility.getRandomAlphabet(3);
		clickElement(EMAILSETTINGSPAGE_EMAIL_SETTINGS_DROPDOWN_ICON);
		clickElement(EMAILSETTINGSPAGE_EMAIL_SETTINGS_DROPDOWN_LIST);
		enterValue(EMAILSETTINGSPAGE_EMAIL_SETTINGS_NAME_TEXTBOX, name);
		enterValue(EMAILSETTINGSPAGE_EMAIL_SETTINGS_EMAIL_TEXTBOX, email);
		clickElement(EMAILSETTINGSPAGE_EMAIL_SETTINGS_ADD_BUTTON);
		boolean flag = verifyExpectedText(EMAILSETTINGSPAGE_EMAIL_SETTINGS_ERROR_MESSAGE_LABEL, expected);
		return flag;
	}

	public boolean verifyEmailErrorMessage(String expected) {
		String name = Utility.getRandomAlphabet(3);
		String email = null;
		clickElement(EMAILSETTINGSPAGE_EMAIL_SETTINGS_DROPDOWN_ICON);
		clickElement(EMAILSETTINGSPAGE_EMAIL_SETTINGS_DROPDOWN_LIST);
		enterValue(EMAILSETTINGSPAGE_EMAIL_SETTINGS_NAME_TEXTBOX, name);
		enterValue(EMAILSETTINGSPAGE_EMAIL_SETTINGS_EMAIL_TEXTBOX, email);
		clickElement(EMAILSETTINGSPAGE_EMAIL_SETTINGS_ADD_BUTTON);
		boolean flag = verifyExpectedText(EMAILSETTINGSPAGE_EMAIL_SETTINGS_ERROR_MESSAGE_LABEL, expected);
		return flag;
	}

	public boolean verifyRecipientAdded(String expected) {
		String name = Utility.getRandomAlphabet(3);
		String email = Utility.getRandomAlphabet(3)+"@"+Utility.getRandomAlphabet(3)+"."+Utility.getRandomAlphabet(3);
		
		String recipientNameAdd, recipientEmailAdd = null;
		
		String [] reportRecipientNameAdd = null,reportRecipientEmailAdd = null;
		
		ArrayList<String> addName = new ArrayList<String>();
		ArrayList<String> addEmail = new ArrayList<String>();
		
		clickElement(EMAILSETTINGSPAGE_EMAIL_SETTINGS_DROPDOWN_ICON);
		clickElement(EMAILSETTINGSPAGE_EMAIL_SETTINGS_DROPDOWN_LIST);
		enterValue(EMAILSETTINGSPAGE_EMAIL_SETTINGS_NAME_TEXTBOX, name);
		enterValue(EMAILSETTINGSPAGE_EMAIL_SETTINGS_EMAIL_TEXTBOX, email);
		clickElement(EMAILSETTINGSPAGE_EMAIL_SETTINGS_ADD_BUTTON);
		
		List<WebElement> nameColumn = returnWebElements(EMAILSETTINGSPAGE_EMAIL_SETTINGS_ADDED_RECIPIENT_NAME_TEXT);
		for(WebElement nameAdd: nameColumn)
	    {
			recipientNameAdd=nameAdd.getText().toString();
			addName.add(recipientNameAdd);
			reportRecipientNameAdd = (String[])addName.toArray(new String[addName.size()]);
		}
				
		List<WebElement> emailColumn = returnWebElements(EMAILSETTINGSPAGE_EMAIL_SETTINGS_ADDED_RECIPIENT_EMAIL_TEXT);
		for(WebElement emailAdd: emailColumn)
	    {
			recipientEmailAdd=emailAdd.getText().toString();
			addEmail.add(recipientEmailAdd);
			reportRecipientEmailAdd = (String[])addEmail.toArray(new String[addEmail.size()]);
		}
		
		boolean flag1 = reportRecipientNameAdd[addName.size()-1].equalsIgnoreCase(name);		
		boolean flag2 = reportRecipientEmailAdd[addEmail.size()-1].equalsIgnoreCase(email);
		return (flag1 && flag2);
	}
	
	public boolean verifyRecipientRemove(String expected) {
		boolean flag=false;
		int listSize,deletedSize;
		String initialRecipient = null, deletedRecipient = null;
		ArrayList<String> initialName = new ArrayList<String>();
		ArrayList<String> deletedName = new ArrayList<String>();
		
		clickElement(EMAILSETTINGSPAGE_EMAIL_SETTINGS_DROPDOWN_ICON);
		clickElement(EMAILSETTINGSPAGE_EMAIL_SETTINGS_DROPDOWN_LIST);
		
		boolean flag1 = verifyExpectedText(EMAILSETTINGSPAGE_EMAIL_SETTINGS_REPORT_HEADER_LABEL,expected);
		if(flag1) {
			List<WebElement> nameColumn = returnWebElements(EMAILSETTINGSPAGE_EMAIL_SETTINGS_ADDED_RECIPIENT_NAME_TEXT);
			for(WebElement nameCol: nameColumn)
				{
				initialRecipient=nameCol.getText().toString();
				initialName.add(initialRecipient);
				}
			listSize = initialName.size();
			clickElement(EMAILSETTINGSPAGE_EMAIL_SETTINGS_RECIPIENT_REMOVE_ICON);
			clickElement(EMAILSETTINGSPAGE_EMAIL_SETTINGS_RECIPIENT_REMOVE_BUTTON);
			if(listSize == 1) {
				boolean flag2 = verifyWebElement(EMAILSETTINGSPAGE_EMAIL_SETTINGS_REPORT_LABEL);
				TestNGCustomReporter.logbr("Recipient is deleted successfully");
				return flag2;
			}else
			{
				List<WebElement> deletedColumn = returnWebElements(EMAILSETTINGSPAGE_EMAIL_SETTINGS_ADDED_RECIPIENT_NAME_TEXT);
				for(WebElement delCol: deletedColumn)
					{
					deletedRecipient=delCol.getText().toString();
					deletedName.add(deletedRecipient);
					}
				deletedSize = deletedName.size();
				if(listSize-1 == deletedSize) {
					TestNGCustomReporter.logbr("Recipient is deleted successfully");
					flag = true;
				}else
				{
					TestNGCustomReporter.logbr("Recipient is not deleted successfully");
					flag = false;
				}
			}
		}else
			{
			TestNGCustomReporter.logbr("No recipients present to delete");
			return flag;
			}
		return flag;
	}
}

  
	



	




