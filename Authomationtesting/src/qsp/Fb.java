package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb
{
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c = new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.facebook.com/login/");
		c.findElement(By.id("email")).sendKeys("8898217723");
		c.findElement(By.id("pass")).sendKeys("Shree@123");
		c.findElement(By.id("loginbutton")).click();
		
	Thread.sleep(50000);
		c.close();
		
		
	}  

}
