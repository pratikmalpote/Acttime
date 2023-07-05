package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagramlogin {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		ChromeDriver c = new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.instagram.com/accounts/login/");
		c.findElement(By.className("_aa4b _add6 _ac4d")).sendKeys("pratik");
		
	}
}
