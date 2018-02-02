package com.Utilties;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tekion.selenium.common.Log;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.ios.IOSDriver;

public class BaseClass {
	public static final Logger LOGGER = Log.getDefaultLogger();
	public static WebElement element;
	public static AppiumDriver driver;
	public static WebDriver webDriver;
    public static DesiredCapabilities capabilities;
	public static String versionString;
	public static final String    CHARLES_PROXY_ENABLE              = "CHARLES_PROXY_ENABLE"; //environment variable constant
	// Set the Desired Capabilities for iOS Native App
	public static void iOSMobileNativeAppCapabilities(String ipaFilePath, String deviceUDID, String deviceName, Boolean	autoDismissAlertsStatus) throws Exception {
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", deviceName);
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("automationName", "XCUITest");
		capabilities.setCapability("platformVersion", "");
		capabilities.setCapability("udid",deviceUDID);
		capabilities.setCapability("app",ipaFilePath);
		capabilities.setCapability("bundleid","");
		capabilities.setCapability("autoDismissAlerts", autoDismissAlertsStatus);
		driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
	// Explicit wait method
	public static WebElement waitForExpectedElement(WebDriver driver, final By locator, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	// Explicit wait
	public static WebElement waitForExpectedElement(WebDriver driver, final By locator) {
	  WebDriverWait wait = new WebDriverWait(driver, 30);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}
// Explicit wait method for element clickable
public static WebElement waitForExpectedElement(AppiumDriver driver, final By locator) {
	WebDriverWait wait = new WebDriverWait(driver, 60);
	return wait.until(ExpectedConditions.elementToBeClickable(locator));
}
// Explicit wait method for presence of element
public static WebElement waitForExpectedElement(AppiumDriver driver, final By locator, int time) {
	WebDriverWait wait = new WebDriverWait(driver, time);
	return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
}
public static void waitForPageToLoad() {
	(new WebDriverWait(driver, 60)).until(new ExpectedCondition<Boolean>() {
		public Boolean apply1(AppiumDriver driver) {
			return (((org.openqa.selenium.JavascriptExecutor) driver).executeScript("return document.readyState")
					.equals("complete"));
		}
		public Boolean apply(AppiumDriver arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		public Boolean apply(WebDriver arg0) {
			// TODO Auto-generated method stub
			return null;
		}
	});
}
public static void ajaxDroDownSelect(AppiumDriver driver, By locator, String name) {
	Select se = new Select((WebElement) locator);
	se.selectByVisibleText(name);
}
public static void ajaxdropDownSelect(AppiumDriver driver, By locator, int index) {
	Select se = new Select((WebElement) locator);
	se.selectByIndex(index);
}
public static void hideKeyBoard(AppiumDriver driver)
{
	try
	{
		driver.hideKeyboard();
	}
	catch(Exception e)
	{
		e.getMessage();
	}
}
public static String toCamelCaseLowerCaseFirst(String str) {
    String[] parts = str.split("_");
    String camelCaseString = "";
    for (String part : parts) {
      camelCaseString = camelCaseString + toProperCase(part);
    }
    camelCaseString = camelCaseString.substring(0, 1).toLowerCase()
        + camelCaseString.substring(1);
    return camelCaseString;
  }

  public static String toProperCase(String str) {
    return str.substring(0, 1).toUpperCase()
        + str.substring(1).toLowerCase();
  }
}


	