package Testngscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Acttimescreenshot {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void Acttime() throws InterruptedException {
	WebDriver M = new ChromeDriver();
	M.manage().window().maximize();
	M.get("https://demo.actitime.com/login.do");
      WebElement element = M.findElement(By.id("username"));
      System.out.println(element);
      Thread.sleep(3000);
      M.navigate().refresh();
      Thread.sleep(5000);
      element.sendKeys("admin");
      M.close();
	
	
	
	
	}
}
