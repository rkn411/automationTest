package com.tekion.selenium.common.exception;

import org.openqa.selenium.WebDriver;

import com.tekion.selenium.common.exception.AutomationException;

/**
 * 
 * @author rkothapalli@tekion.com
 */
public class DomNotInteractiveException extends AutomationException {
    
    private static final long serialVersionUID = 1L;

    public DomNotInteractiveException() {
        super("Dom Failed to Complete");
    }
    
    public DomNotInteractiveException(String message) {
        super("Dom Failed to Complete: " + message);
    }
    
    public DomNotInteractiveException(String message, Throwable cause) {
        super("Dom Failed to Complete: " + message, cause);
    }
    
    public DomNotInteractiveException(WebDriver driver) {
        super("Dom Failed to Complete: ", driver);
    }
    
    public DomNotInteractiveException(String message, WebDriver driver) {
        super("Dom Failed to Complete: " + message, driver);
    }
    
    public DomNotInteractiveException(String message, Throwable cause, WebDriver driver) {
        super("Dom Failed to Complete: " + message, cause, driver);
    }
}
