package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Act {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver M = new ChromeDriver();
		M.manage().window().maximize();
		M.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		M.navigate().to("https://demo.actitime.com/");
		M.findElement(By.id("username")).sendKeys("admin");
		M.findElement(By.name("pwd")).sendKeys("manager");
		M.findElement(By.xpath("//div[.='Login ']")).click();
		M.findElement(By.id("logoutLink")).click();
		M.quit();
		
	}

}
