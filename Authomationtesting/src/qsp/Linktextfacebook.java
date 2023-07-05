package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumNetworkConditions;

public class Linktextfacebook {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver c = new ChromeDriver();
		c.get("https://www.facebook.com/login/");
		c.manage().window().maximize();
		c.findElement(By.className("_97w5")).click();
		c.findElement(By.name("firstname")).sendKeys("pratik");
		c.findElement(By.name("lastname")).sendKeys("malpote");
		c.findElement(By.name("reg_email__")).sendKeys("8692825473");
		c.findElement(By.name("reg_passwd__")).sendKeys("pratik@123");
		Thread.sleep(5000);
		c.close();	
	}

}
