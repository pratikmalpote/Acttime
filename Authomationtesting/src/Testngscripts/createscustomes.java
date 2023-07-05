package Testngscripts;

import org.testng.annotations.Test;

public class createscustomes extends baseclass {

	@Test
	public void createcustomer() {
		Homepage hp = new Homepage(M);
		hp.getTasktab().click();
	}
}
