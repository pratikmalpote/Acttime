package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktextzomto {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver c = new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.zomato.com/india");
		c.findElement(By.tagName("a")).click();
	}

}
