package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tryandcatch {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver M = new ChromeDriver();
		M.navigate().to("acttime");
		M.findElement(By.id("")).sendKeys();
		M.findElement(By.name("")).sendKeys();
		M.findElement(By.xpath("")).click();
		int i =0;
		while (i<500) {
			try {
				M.findElement(By.id("logout")).click();
			} catch (Exception e) {
				i++;
			}
		}
		
		M.quit();
	}

}
