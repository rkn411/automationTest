package com.tekion.selenium.common.exception;

import org.openqa.selenium.WebDriver;

import com.tekion.selenium.common.exception.AutomationException;

/**
 * 
 * @author rkothapalli@tekion.com
 */
public class DomNotCompleteException extends AutomationException {
    
    private static final long serialVersionUID = 1L;

    public DomNotCompleteException() {
        super("Dom Failed to Complete");
    }
    
    public DomNotCompleteException(String message) {
        super("Dom Failed to Complete: " + message);
    }
    
    public DomNotCompleteException(String message, Throwable cause) {
        super("Dom Failed to Complete: " + message, cause);
    }
    
    public DomNotCompleteException(WebDriver driver) {
        super("Dom Failed to Complete: ", driver);
    }
    
    public DomNotCompleteException(String message, WebDriver driver) {
        super("Dom Failed to Complete: " + message, driver);
    }
    
    public DomNotCompleteException(String message, Throwable cause, WebDriver driver) {
        super("Dom Failed to Complete: " + message, cause, driver);
    }
}
