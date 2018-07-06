package com.core.config;

public interface BasicConfig {

	/**
     * List of supported operating systems 
     */
    public static enum osList {

        WINDOWS
    }

    ;

    /**
     * List of websites in test scope
     */
    public enum selectSite {

        QA_EURO,QA_US,QA_INDIA
       
    }
    
    ;
    
    /**
     * List of supported browsers
     */
    public enum selectedBrowser {

    	INTERNETEXPLORERREMOTE,GOOGLECHROME, FIREFOX, IE8, IE9,IE10,FIREFOXREMOTE, GOOGLECHROMEREMOTE, REMOTEWEBDRIVER ,SAFARI, SAFARIREMOTE,INTERNETEXPLORER10REMOTE,INTERNETEXPLORER9REMOTE,INTERNETEXPLORER8REMOTE
    };

}
