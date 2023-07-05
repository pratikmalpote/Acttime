package POMobjectrposetory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class Loginpage {

	//decleration
	@FindBy(id="username")
	private WebElement unbox;
	@FindBy(name = "pwd")
	private WebElement pwbox;
	@FindBy(xpath ="//div[.='Login ']")
	private WebElement login;
	
	//
}
