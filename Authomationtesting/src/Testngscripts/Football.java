package Testngscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import bsh.BshClassManager.Listener;
@Listeners(ListenerImplementetion.class)

public class Football extends Baseclass {

	@Test 
	public void messi () {
		Reporter.log("best football player",true);
		Assert.fail();	
	}
	@Test 
	public void ronaldo() {
		//re
	} 
	
}
