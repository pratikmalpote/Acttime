package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathacttime {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver c = new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://demo.actitime.com/login.do");
		c.findElement(By.id("username")).sendKeys("admin");
		c.findElement(By.name("pwd")).sendKeys("manager");
		c.findElement(By.xpath("//div[text()='Login ' ]")).click();
		Thread.sleep(5000);
		c.close();
		
				
	}

}
