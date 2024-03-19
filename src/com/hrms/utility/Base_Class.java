package com.hrms.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Base_Class {
	//driver
	public    static WebDriver driver;
	//openApplication
	public static void openApplication() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Reporter.log("Application Opened");
	}
	//closeApplication
	public static void closeApplication( ) {
	driver.quit();
	Reporter.log("Application closed ");
	}

}
