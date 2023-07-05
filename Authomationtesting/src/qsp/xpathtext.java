package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v111.css.model.CSSStyleSheetHeader;

public class xpathtext {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver c = new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.flipkart.com/");
		c.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		c.findElement(By.name("q")).sendKeys("hp laptop");
		c.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		c.findElement(By.xpath("//div[contains(text(),'HP 14s Intel Core i3 11th Gen ')]")).click();
		Thread.sleep(5000);
		c.close();
	}
}
