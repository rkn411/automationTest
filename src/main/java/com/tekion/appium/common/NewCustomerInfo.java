package com.tekion.appium.common;

public class NewCustomerInfo {
	public int    age;
	  public String birthMonth;
	  public int birthDay;
	  public int birthYear;
	  public String fName;
	  public String lName;
	  public String userEmail;
	  public String country;
	  public String address1;
	  public String city;
	  public String state;
	  public String zipcode;
	  public String password;
	  public String confirmPassword;
	  public boolean setmarketchkbox;
	  public boolean setparkconditionschkbox;
	  
	  public String getBirthMonth(int month)
	  {
	      this.birthMonth = birthMonth;
	      
	      return birthMonth;
	  }
	  
	  public int getBirthDay(int day)
	  {
	      this.birthDay = birthDay;
	      
	      return birthDay;
	  }
	  
	  public int getBirthYear(int year)
	  {
	      this.birthYear = birthYear;
	      
	      return birthYear;
	  }
	  
	  public void setAge(int age) {
	    this.age = age;
	  }

	  public void setfName(String fName) {
	    this.fName = fName;
	  }

	  public void setlName(String lName) {
	    this.lName = lName;
	  }

	  public void setUserEmail(String userEmail) {
	    this.userEmail = userEmail;
	  }

	  public void setCountry(String country) {
	    this.country = country;
	  }

	  public void setAddress1(String address1) {
	    this.address1 = address1;
	  }

	  public void setCity(String city) {
	    this.city = city;
	  }

	  public void setState(String state) {
	    this.state = state;
	  }

	  public void setZipcode(String zipcode) {
	    this.zipcode = zipcode;
	  }

	  public void setPassword(String password) {
	    this.password = password;
	  }

	  public void setconfirmPassword(String password) {
	    this.confirmPassword = password;
	  }

	  public void setSetmarketchkbox(boolean setmarketchkbox) {
	    this.setmarketchkbox = setmarketchkbox;
	  }

	  public void setSetparkconditionschkbox(boolean setparkconditionschkbox) {
	    this.setparkconditionschkbox = setparkconditionschkbox;
	  }

	  /*
	   * Constructor
	   */
	  public NewCustomerInfo() 
	  {
	    //Default user information
	    this.birthMonth = "October";
	    this.birthDay = 1;
	    this.birthYear = 1971;
	    this.fName = "Gern";
	    this.lName = "Blandman";
	    String userEmail = "Redditekion" + System.currentTimeMillis() / 1000L + "@mailinator.com";
	    this.userEmail = userEmail;
	    this.country = "United States";
	    this.address1 = "1934 High Street";
	    this.city = "Auburn";
	    this.state = "Alabama";
	    this.zipcode = "36831";
	    this.password = "secret01";
	    this.confirmPassword = "secret01";
	    this.setmarketchkbox = true;
	    this.setparkconditionschkbox = true;
	  }

	  
}



