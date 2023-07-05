package Testngscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(xpath = "//div[.='Time-Track']")
	private WebElement timetracktab;
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement tasktab;
	@FindBy(xpath = "//div[.='Reports']")
	
	private WebElement reportstab;
	@FindBy(xpath = "//div[.='User']")
	private WebElement usertab;
	@FindBy(id ="logoutLink" )
	private WebElement logoutlnk;
	
	public Homepage(ChromeDriver M) {
		PageFactory.initElements(M, this);
	}

	public WebElement getTimetracktab() {
		return timetracktab;
	}

	public WebElement getTasktab() {
		return tasktab;
	}

	public WebElement getReportstab() {
		return reportstab;
	}

	public WebElement getUsertab() {
		return usertab;
	}

	public WebElement getLogoutlnk() {
		return logoutlnk;
	}
	
	
	
	
	

}
