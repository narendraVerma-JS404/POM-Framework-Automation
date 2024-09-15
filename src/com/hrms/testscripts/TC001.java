package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.hrms.pages.Login_Page;
import com.hrms.pages.LogoutPage;
import com.hrms.pages.VerifyPage;
import com.hrms.utility.Base_Class;

public class TC001 extends Base_Class{

	@Test
	public static void tc001() throws InterruptedException {
		DOMConfigurator.configure("log4j.xml");
	   //Test Stesp
	Base_Class.openApplication();
	Login_Page.login("nareshit", "nareshit");
	VerifyPage.verifyTitle("HRMS");
	VerifyPage.verifyTitle("OrangeHRM");
	
	LogoutPage.logout();
	Base_Class.closeApplication();
	}
}
