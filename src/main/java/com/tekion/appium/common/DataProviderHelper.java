package com.tekion.appium.common;


	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.IOException;

	import org.json.JSONException;
	import org.json.JSONObject;

	import com.tekion.selenium.common.Constants;

	public class DataProviderHelper {

	  public static final String DATA_FOLDER      = "src/test/resources";     // root
	                                                                           // data
	                                                                           // folder
	  public static final String JSON_DATA_FOLDER = "src/test/resources/json";

	  public static String getDataFilePath(final String fileName) {

	    String filePath = DATA_FOLDER + "/" + fileName;

	    final boolean existsInRoot = new File(filePath).exists();
	    if (existsInRoot) {
	      System.out.println("Using data file from root data folder: " + filePath);
	      // Use data file from the root
	    } else {
	      System.out
	          .println("Data file does not exist neither in environment nor in root folder");
	      filePath = null;
	    }

	    return filePath;
	  }

	  public static String getJsonDataFilePath(final String fileName) {

	    String filePath = JSON_DATA_FOLDER + "/" + fileName;

	    final boolean existsInRoot = new File(filePath).exists();
	    if (existsInRoot) {
	      System.out
	      .println("Using data file from root data folder: " + filePath);
	      // Use data file from the root
	    } else {
	      System.out
	          .println("Data file does not exist neither in environment nor in root folder");
	      filePath = null;
	    }

	    return filePath;
	  }
	  
	  /**
	   * Reads file and converts to String.
	   * 
	   * @param filePath
	   *            the name of the file to open. Not sure if it can accept URLs
	   *            or just filenames. Path handling could be better, and buffer
	   *            sizes are hardcoded.
	   * 
	   * @throws IOException
	   */
	  public static String readFileAsString(String filePath) throws IOException {
	    System.out.println(filePath);
	    StringBuffer fileData = new StringBuffer(1000);
	    BufferedReader reader = new BufferedReader(new FileReader(filePath));
	    char[] buf = new char[1024];
	    int numRead = 0;
	    while ((numRead = reader.read(buf)) != -1) {
	      String readData = String.valueOf(buf, 0, numRead);
	      fileData.append(readData);
	      buf = new char[1024];
	    }
	    reader.close();
	    return fileData.toString();
	  }
	  
	  public static JSONObject readCapabilities() throws JSONException{
	    String jsonpath = DataProviderHelper.getJsonDataFilePath("capabilities.json");
	    jsonpath = jsonpath.replace("/", Constants.DIR_SEPARATOR);
	    jsonpath = System.getProperty("user.dir") + Constants.DIR_SEPARATOR + jsonpath;
	    String jsonString = null;
	    try {
	      jsonString = DataProviderHelper.readFileAsString(jsonpath);
	    } catch (IOException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	    return new JSONObject(jsonString);
	  }

}
