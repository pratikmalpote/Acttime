package Testngscripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Titlecompare {

	@Test
	public void titlecompare(){
		WebDriver M = new ChromeDriver();
		M.manage().window().maximize();
		M.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		M.get("https://www.google.com/");
	   String expectedresult = "Google";
	   String actualresult = M.getTitle();
	   SoftAssert s = new SoftAssert();
	   s.assertEquals(expectedresult, actualresult);
	   
	   //if (expectedresult.equals(actualresult))
	   //{
		  // Reporter.log("title is matching",true);
		
	//}else {
		//Reporter.log("title is not matching",true);
	//}
	   
	   M.close();
	   s.assertAll();
	   
	   // write script to compare this expected and actual result  hard assert and sait assert 
	}// write script to verified by using soft assert 

	private SoftAssert SoftAssert() {
		// TODO Auto-generated method stub
		return null;
	}
}
