package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c = new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.instagram.com/");
		c.findElement(By.className("_aa4b _add6 _ac4d")).sendKeys("pr.atik7241");
		c.findElement(By.className("_aa4b _add6 _ac4d")).sendKeys("Shree$123");
		c.findElement(By.className("x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1")).click();
		Thread.sleep(50000);
		c.close();
		
		
	}  


}
