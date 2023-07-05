package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathacttimelogin {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.actitime.com/administration/btlist.do");
		//d.findElement(By.id("username")).sendKeys("admin");
		//d.findElement(By.name("pwd")).sendKeys("manager");
		//d.findElement(By.xpath("//div[text()='Login ' ]")).click();
		//d.findElement(by.)
	    String rate = d.findElement(By.xpath("//a[.='engineering']/../../td[4]/span")).getText();
	    Thread.sleep(5000);
	    d.close();
	}

}
