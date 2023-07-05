package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtubes {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver c = new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.youtube.com/");
		c.findElement(By.name("search_query")).sendKeys("john wick bar scene");
		c.findElement(By.id("search-icon-legacy")).click();
		c.findElement(By.xpath("//yt-formatted-string[text()='John Wick - Baba Yaga (Getting warmed up)']")).click();
		
	}

}
