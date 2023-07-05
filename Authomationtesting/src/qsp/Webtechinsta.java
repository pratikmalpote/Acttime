package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtechinsta {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.navigate().to("file:///C:/Users/Omkar/Desktop/web%20tec/file.html");
		w.findElement(By.id("zabba")).click();
		Thread.sleep(5000);
		w.navigate().back();
		Thread.sleep(3000);
		w.navigate().forward();
		Thread.sleep(3000);
		w.navigate().refresh();
		Thread.sleep(3000);
		w.quit();
	}

}
