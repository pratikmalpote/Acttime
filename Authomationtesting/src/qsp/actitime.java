package qsp;
// Xpath by Atrtibute 

import javax.management.openmbean.OpenMBeanAttributeInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver c = new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.youtube.com/");
		c.findElement(By.xpath("//input[@id = 'search']")).sendKeys("mumbaiindians");
		c.findElement(By.xpath("//button[@id = 'search-icon-legacy']")).click();
		c.findElement(By.xpath(""));
		
		
	}
            
}
