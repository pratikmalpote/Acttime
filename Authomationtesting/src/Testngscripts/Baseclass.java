package Testngscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Baseclass {

	public static WebDriver M;
	@BeforeSuite
	public void databaseconnection() {
	Reporter.log("datadaseconnected",true);	
	}
	@BeforeTest
	public void lauchthebrower() {
	    M = new ChromeDriver();
		M.manage().window().maximize();
	    M.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
		Reporter.log("lauch the browser",true);
		
	}
	@BeforeMethod
	public void logintheapplication()
	{
		M.get("https://demo.actitime.com/login.do");
		M.findElement(By.id("username")).sendKeys("admin");
		M.findElement(By.name("pwd")).sendKeys("manager");
		M.findElement(By.xpath("//div[.='Login ']")).click();
		Reporter.log("login is successfully",true);
	}
	@Test
	public void createdcustomer() {
		Reporter.log("created customer successfull",true);
	}
	@AfterMethod
	public void logoutapplicationg() {
		M.findElement(By.id("logoutLink")).click();
		Reporter.log("logout successfull",true);
	}
	@AfterClass
	public void closebrower() {
		M.close();
		Reporter.log("close the browser",true);
	}
	@AfterSuite
	public void databasedisconneted() {
		Reporter.log("disconnect database",true);	
		}
}
