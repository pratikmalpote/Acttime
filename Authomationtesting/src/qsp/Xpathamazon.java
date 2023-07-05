package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathamazon {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver c = new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.amazon.in/");
		c.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone14");
		c.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);
		c.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")).click();
		Thread.sleep(10000);
		c.close();
		
	}

}
																																									