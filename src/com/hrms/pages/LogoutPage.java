package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.Base_Class;
import com.hrms.utility.Log;

public class LogoutPage extends Base_Class{

	//Objects/elements
	static By link_logout = By.linkText("Logout");
	//Fun:
	public static void logout() throws InterruptedException {
		
		driver.navigate().refresh();
		Thread.sleep(3000);
	driver.findElement(link_logout).click();
		//driver.findElement(By.linkText("Logout")).click();
	Reporter.log("Logout completed ");
	Log.info("Logout completed");
	}
}
