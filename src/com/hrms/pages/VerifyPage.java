package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.utility.Base_Class;
import com.hrms.utility.Log;

public class VerifyPage extends Base_Class{

	//Verify fun: VerifyTitle
	public static void verifyTitle(String title) {
	   if(driver.getTitle().equals(title)) {
	       Reporter.log("Title matched ");
	   }
	   else {
	       Reporter.log("Title not matched ");
	       Reporter.log(driver.getTitle());
	       Log.info("Title matched");
	   }
}
}
