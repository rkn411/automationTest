package com.tekion.selenium.common;
/*********************************************************************************************************************** *
 * FileName - Constants.java
 *
 * (c) Tekio. All rights reserved.
 *
 * $Authors: 
 * rkothapalli@tekion.com, 
 * $Date: JAN31st-2017 $
 **********************************************************************************************************************/

import java.io.File;
import java.util.Calendar;
import com.tekion.selenium.common.Constants;

	

/**
* A slight misnomer, this class holds global variables in addition to 
* constants.  Many of these though, would have greatly benefited from being
* defined as an enumeration instead (SAP, IMO).
 */
public class Constants {
	    public static final String SELENIUM_RC_HOST_PROPERTY = "selenium.rc_host";
	    public static final String SELENIUM_RC_PORT_PROPERTY = "selenium.rc_port";
	    public static final String SELENIUM_RC_TYPE_PROPERTY = "selenium.rc_type";
	    public static final String SELENIUM_BASE_URL_PROPERTY = "selenium.base_url";
	    public static final String SELENIUM_GRID_PROPERTY = "selenium.grid";
	    public static final String SELENIUM_PROFILE_PROPERTY = "firefox.profile";
	    public static final String SELENIUM_FIREFOX_FIREBUG_NETEXPORT_PROPERTY = "firefox.firebug.netexport";
	    public static final String SELENIUM_LIGHT_DARK_PROPERTY = "selenium.light";
	    public static final String SELENIUM_ENABLE_DEBUG_MODULE_PROPERTY = "selenium.enable_debug_module";
	    public static final String SELENIUM_XML_FILESET_PROPERTY = "selenium.xmlfileset";
	    public static final String SELENIUM_USER_USED_PROPERTY = "selenium.userUsed";
	    public static final String SELENIUM_TEST_ENVIRONMENT_PROPERTY = "selenium.test_environment";
	    public static final String SELENIUM_CAPTURE_INFO_SCREENSHOTS_PROPERTY = "selenium.capture_info_screenshots";
	    public static final String SELENIUM_DB_USER_PROPERTY = "selenium.retrieve_db_user";
	    /** Not yet used - values should be something like, json, sql, rest */
	    public static final String SELENIUM_RETRIEVE_USER_FROM_PROPERTY = "selenium.retrieve_user_from";
	    public static final String SELENIUM_DEFAULT_TIMEOUT_PROPERTY = "selenium.default_timeout";
	    public static final String SELENIUM_ELEMENT_TIMEOUT_PROPERTY = "selenium.element_timeout";
	    public static final String SELENIUM_PAGE_TIMEOUT_PROPERTY = "selenium.page_timeout";
	    public static final String SELENIUM_IS_INTERNATIONAL_PROPERTY = "selenium.is_international";
	    public static final String SELENIUM_PROD_DAYS_OFFSET_PROPERTY = "selenium.prod_days_offset";
	    public static final String SELENIUM_PROD_MONTH_OFFSET_PROPERTY = "selenium.prod_month_offset";
	    public static final String SELENIUM_JSON_FILE_PATH_PROPERTY = "selenium.json_file_path";
	    
	    public static final String TESTNG_FAILED_XML_FILE = "testng-failed.xml";
	    
	    final static public int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);
	    
	    /** Sure hope this test doesn't span over mid-night where the date will technically be different. */
	    final static public int CURRENT_MONTH = Calendar.getInstance().get(Calendar.MONTH);
	    
	    /** Sure hope this test doesn't span over mid-night where the date will technically be different. */
	    final static public int CURRENT_DAY = Calendar.getInstance().get(Calendar.DATE);
	    
	    /** 
	     * In SL/Prod finding resort-room for "less than 3 days" is problematic, almost impossible,
	     * not to have test fail, we are bumping checkIn-checkOut dates
	     */
	    final static public int prodDaysOffset = Integer.getInteger("SELENIUM_PROD_DAYS_OFFSET_PROPERTY", 150);
	    
	    /** Used to quickly alter check-in-date in production since availability can be difficult. */
	    final static public int prodMonthOffset = Integer.getInteger("SELENIUM_PROD_MONTH_OFFSET_PROPERTY", 3);
	    
	    /** 
	     * true = Light (Default), false = Dark
	     * TODO, FIXME: Fix and be clear about what this is.
	     */
	    final static public String LIGHT_DARK_OVERRIDE = System.getProperty(SELENIUM_LIGHT_DARK_PROPERTY, "");
	    final static public boolean IS_LIGHT_DARK_OVERRIDE = Boolean.getBoolean(SELENIUM_LIGHT_DARK_PROPERTY);
	    
	    /** The base URL we'll be working with, e.g. wdw-stage.disney.go.com, dlr-latest.etc */
	    final static public String BASE_URL = System.getProperty(SELENIUM_BASE_URL_PROPERTY, "");
	    
	    /** A shortcut for lower-cased version of BASE_URL */
	    final static public String BASE_URL_LC = BASE_URL.toLowerCase();
	    
	    /** To better detect the target environment instead of trying to use BASE_URL and LIGHT_DARK_OVERRIDE. */  
	    final static public String TEST_ENVIRONMENT = System.getProperty(SELENIUM_TEST_ENVIRONMENT_PROPERTY, "UNKNOWN");
	    
	    /** Detects if we're running against the test-ng generated file for re-runs/retries. */
	    final public static boolean TESTNG_RETRY_ATTEMPT = System.getProperty(SELENIUM_XML_FILESET_PROPERTY, "").equals(TESTNG_FAILED_XML_FILE);
	    
	    /** True if we're retrying a test or if the application is explicitly told configured so */ 
	    public static boolean ENABLE_DEBUG_MODULE = TESTNG_RETRY_ATTEMPT || Boolean.getBoolean(SELENIUM_ENABLE_DEBUG_MODULE_PROPERTY);
	    
	    /** Suggests if the test should be taking screenshots for informational purposes. */
	    final static public boolean IS_CAPTURE_INFO_SCREENSHOTS = Boolean.getBoolean(SELENIUM_CAPTURE_INFO_SCREENSHOTS_PROPERTY);
	    
	    /** Indicates if we're targeting the grid */
	    public final static boolean SELENIUM_GRID = Boolean.getBoolean(SELENIUM_GRID_PROPERTY);
	    
	    /** The JSON File path the script will retrieve data from */
	    final static public String JSON_FILE_PATH = System.getProperty(SELENIUM_JSON_FILE_PATH_PROPERTY, "");

/**
* * Checkout selenium.retrieve_db_user, true means use DB.  
* The default should be the data-base though... this needs to be cleaned up.
*  */
 final static public boolean USE_DB_USER = Boolean.getBoolean(SELENIUM_DB_USER_PROPERTY);
	    
	    // DB connect info - tekion
	    final static public String nap7_dbServer = "jdbc:mysql://qn7prmydb03/";
	    final static public String nap7_dbName = "WDPROQA";
	    final static public String nap7_dbUsername = "wdproqa_user";
	    final static public String nap7_dbPassword = "wdproqa_password";
	    
	    /** The global system property line.separator */
	    final static public String LINE_SEPARATOR = System.getProperty("line.separator", "\n");
	    
	    /** An alias for the global system property line.separator */
	    final static public String NEW_LINE = LINE_SEPARATOR;
	    
	    /** The OS name as returned by the system property os.name */
	    final static public String OS_NAME = System.getProperty("os.name", "ERROR").toLowerCase();
	    
	    /** The architecture type of JRE, this does not mean that the physical machine matches */
	    final static public String OS_ARCH_TYPE = System.getProperty("os.arch", "ERROR");
	    
	    /** The architecture type of JRE, this does not mean that the physical machine matches */
	    final static public String ARCH_TYPE = System.getProperty("sun.arch.data.model", "ERROR");
	    
	    /** An alias for File.separator */
	    final static public String DIR_SEPARATOR = File.separator;
	    
	    /** The current path of the project */ 
	    final static public String CURRENT_DIR = determineCurrentPath();
	    
	    /** For International behavior */
	    static public boolean IS_INTERNATIONAL = Boolean.getBoolean(SELENIUM_IS_INTERNATIONAL_PROPERTY);
	    
	    /** The default timeout in seconds, should be a generous default time */
	    final static public long GLOBAL_DRIVER_TIMEOUT = Integer.getInteger(SELENIUM_DEFAULT_TIMEOUT_PROPERTY, 60);
	    
	    /** The timeout (seconds) for finding web elements on a page, shouldn't be too long */
	    final static public long ELEMENT_TIMEOUT = Integer.getInteger(SELENIUM_ELEMENT_TIMEOUT_PROPERTY, 10);
	    
	    /** The timeout (seconds) for page/DOM/transitions, should also be a generous */
	    final static public long PAGE_TIMEOUT = Integer.getInteger(SELENIUM_PAGE_TIMEOUT_PROPERTY, 60);
	    
	    /** This guest will be used for all the assembly services which don't need an email to be executed, instead this general guest will be used */
	    final static public String TOKEN_GUEST = "guest.23083101182016@ngetestmail.com";
	    /**
	     * For general debugging. Constructs a string of values that are set via
	     * properties (e.g. JVM's -D args).
	     * @return str 
	     */
public static String toStr() {
	        String str = "Static variables" +
	                "\n\tBASE_URL [" + BASE_URL + "]" +
	                "\n\tTEST_ENVIRONMENT [" + TEST_ENVIRONMENT + "]" +
	                "\n\tSELENIUM_GRID [" + SELENIUM_GRID + "]" +
	                "\n\tLIGHT_DARK_OVERRIDE [" + LIGHT_DARK_OVERRIDE + "]" +
	                "\n\tIS_LIGHT_DARK_OVERRIDE [" + IS_LIGHT_DARK_OVERRIDE + "]" +
	                "\n\tGLOBAL_DRIVER_TIMEOUT [" + GLOBAL_DRIVER_TIMEOUT + "]" +
	                "\n\tELEMENT_TIMEOUT [" + ELEMENT_TIMEOUT + "]" +
	                "\n\tPAGE_TIMEOUT [" + PAGE_TIMEOUT + "]" +
	                "";
	        return str;
	}
	    
	    // Locator Strategy
	    final public static int CSS_SELECTOR = 0;
	    final public static int XPATH = 1;
	    final public static int ID = 2;
	    final public static int CLASS_NAME = 3;
	    final public static int LINK_TEXT = 4;
	    final public static int PARTIAL_LINK_TEXT = 5;
	    final public static int NAME = 6;
	    final public static int TAG_NAME = 7;
/**
* * Defaults to "./" if there's an exception of any sort.
* * @warning Exceptions are swallowed.
* @return Constants.DIR_SEPARATOR
*  */
 final private static String determineCurrentPath() {
	        try {
	            return (new File(".").getCanonicalPath()) + Constants.DIR_SEPARATOR; 
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	        return "." + Constants.DIR_SEPARATOR;
	    }
}