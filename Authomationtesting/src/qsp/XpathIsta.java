package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathIsta {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver M = new ChromeDriver();
		M.manage().window().maximize();
		M.navigate().to("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		M.findElement(By.xpath("//input[@name ='username']")).sendKeys("pr.atik7241");
		M.findElement(By.xpath("//input[@name ='password']")).sendKeys("8692825473");
		M.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(50000);
		M.close();
	}
}
