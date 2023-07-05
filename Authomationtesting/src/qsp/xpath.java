package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	
	static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver c = new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://demo.actitime.com/login.do");
		c.findElement(By.xpath("//input[@name ='username']")).sendKeys("admin");
		c.findElement(By.xpath("//input[@name ='pwd']")).sendKeys("manager");
		c.findElement(By.xpath("//input[@value='on']")).click();
		c.findElement(By.xpath("//a[@id ='loginButton']")).click();
		Thread.sleep(5000);
		c.close();
		
	}

}
