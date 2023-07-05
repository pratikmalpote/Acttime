package Testngscripts;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {

	@BeforeSuite
	public void databaseconnection() {
	Reporter.log("datadaseconnected",true);	
	}
	@BeforeTest
	public void lauchthebrower() {
		Reporter.log("lauch the browser",true);
		
	}
	@BeforeMethod
	public void logintheapplication() {
		Reporter.log("login is successfully",true);
	}
	@Test
	public void createdcustomer() {
		Reporter.log("created customer successfull",true);
		
	}
	@AfterMethod
	public void logoutapplicationg() {
		Reporter.log("logout successfull",true);
	}
	@AfterClass
	public void closebrower() {
		Reporter.log("close the browser",true);
	}
	@AfterSuite
	public void databasedisconneted() {
		Reporter.log("disconnect database",true);	
		}
	
	
	
	
}
