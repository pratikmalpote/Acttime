package Testngscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateCustomer {

	@Test(invocationCount = 5,priority = 2)
	public void Createcustomer()
	{
		Assert.fail();
		Reporter.log("customer created",true);
		
	}
	@Test(priority = 3,enabled = false)
	public void delectedcustomer() {
		Reporter.log("customer delected",true);
	}
	@Test(priority = 4)
	public void editcustomer() {
		Reporter.log("customer editer",true);
	}
	@Test(priority = 1)
	public void modified() {
		Reporter.log("customermodified",true);
	}
	@Test(enabled = false)
	public void delectedscustomer() {
		Reporter.log("delectedcustomer",true);
	}
	
	
}
