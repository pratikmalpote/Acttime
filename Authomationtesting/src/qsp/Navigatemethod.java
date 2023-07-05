package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatemethod {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.navigate().to("https://www.amazon.in/");
		w.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone14");
		w.findElement(By.id("nav-search-submit-button")).click();
		w.findElement(By.xpath("(//span[.='Apple iPhone 14 (128 GB) - Blue'])[1]")).click();
		Thread.sleep(5000);
		w.quit();
		
		
	}
}
