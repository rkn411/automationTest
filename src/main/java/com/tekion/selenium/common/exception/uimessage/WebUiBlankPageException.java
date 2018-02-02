package com.tekion.selenium.common.exception.uimessage;

import org.openqa.selenium.WebDriver;

import com.tekion.selenium.common.exception.uimessage.WebUiErrorException;

/**
 * 
 * @author rkothapalli@tekiom.com
 */
public class WebUiBlankPageException extends WebUiErrorException {
    
    private static final long serialVersionUID = 1L;

    public WebUiBlankPageException() {
        super("Blank/White Page Detected");
    }
    
    public WebUiBlankPageException(String message) {
        super("Blank/White Page Detected: " + message);
    }
    
    public WebUiBlankPageException(String message, Throwable cause) {
        super("Blank/White Page Detected: " + message, cause);
    }
    
    public WebUiBlankPageException(WebDriver driver) {
        super("Blank/White Page Detected: ", driver);
    }
    
    public WebUiBlankPageException(WebDriver driver, Throwable cause) {
        super("Blank/White Page Detected: ", cause, driver);
    }
    
    public WebUiBlankPageException(String message, WebDriver driver) {
        super("Blank/White Page Detected: " + message, driver);
    }
    
    public WebUiBlankPageException(String message, Throwable cause, WebDriver driver) {
        super("Blank/White Page Detected: " + message, cause, driver);
    }
}
