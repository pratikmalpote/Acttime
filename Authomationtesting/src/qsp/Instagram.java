package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram 
{
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver s = new ChromeDriver();
		s.manage().window().maximize();
		s.get("https://www.facebook.com/login/");
		s.findElement(By.id("email")).click();
		String h = s.getPageSource();
		System.out.println(h);
		Thread.sleep(5000);
		s.close();
		
	}
		


}
