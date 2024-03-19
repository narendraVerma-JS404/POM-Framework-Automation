package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.Base_Class;

public class LogoutPage extends Base_Class{

	//Objects/elements
	static By link_logout = By.linkText("Logout");
	//Fun:
	public static void logout() {
	driver.findElement(link_logout).click();
	Reporter.log("Logout completed ");
	}
}
