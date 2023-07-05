package Testngscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Taskpage {
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addnew;
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newcustomer;
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entercustomername;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement desr;
	@FindBy(xpath = "//div[@class='greyButton cancelBtn']")
	private WebElement cancle;

}
