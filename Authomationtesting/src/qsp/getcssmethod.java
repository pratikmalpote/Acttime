package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcssmethod {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver M = new ChromeDriver();
		M.manage().window().maximize();
		M.navigate().to("tinder");
		Thread.sleep(3000);
	     String value = M.findElement(By.xpath("")).getCssValue("color");
	     System.out.println(value );
	     Thread.sleep(5000);
	     M.quit();
		
		
	}
}
