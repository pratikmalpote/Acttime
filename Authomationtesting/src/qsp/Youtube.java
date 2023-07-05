package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube
{
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c = new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.youtube.com/");
		c.findElement(By.name("search_query")).sendKeys("john wick bar scene");	
		c.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(5000);
		c.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]")).click();
		
		
	}

}
