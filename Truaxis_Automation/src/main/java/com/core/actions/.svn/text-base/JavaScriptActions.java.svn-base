package com.core.actions;

import org.openqa.selenium.WebElement;
/**
 * 
 * Name:JavaScriptActions
 * 
 * Description:It is an interface to be implemented when you want to Handle JavaScript and its Elements
 * 

 * 
 * Version:1.0
 */ 
 
public interface JavaScriptActions {
	
	/**
     * List of javascript events
     */
	public enum jsEvent {
        ONLOAD, ONUNLOAD, ONBLUR, ONCHANGE, ONFOCUS, ONRESET, ONSELECT, ONSUBMIT, ONABORT, ONKEYDOWN, ONKEYPRESS, ONKEYUP, ONCLICK, ONDBLCLICK, ONMOUSEDOWN, ONMOUSEMOVE, ONMOUSEOUT, ONMOUSEOVER, ONMOUSEUP
    }
    
    /** To fire a JavaScript event.
    * 
    * @param event - Type of event you want to fire.
    * @param element - The element on the page to fire the event on.
    */
    public void triggerJavascriptEvent(jsEvent event, WebElement element);

    /** To excecute java script.
     * 
     * @param Script - javascript.
     * @param Object.. - javascript parameters.
     */
    public Object executeScript (String script, Object... args);
    
}
