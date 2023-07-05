package qsp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver M = new ChromeDriver();
		M.manage().window().maximize();
		M.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		M.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
	  WebElement element = M.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
	  Thread.sleep(5000);
	  Actions A = new Actions(M);
	  A.doubleClick(element).perform();
	  Thread.sleep(3000);
	  Alert  b = M .switchTo().alert();
	  b.dismiss();
	  Thread.sleep(3000);
	  M.quit();
	  M.quit();
	}
}
