package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver.chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver M = new ChromeDriver();
		M.manage().window().maximize();
		M.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		M.navigate().to("https://demo.actitime.com/login.do");
		WebElement element = M.findElement(By.linkText("actiTIME 2020 Online	"));
		Actions A = new Actions(M);
		Thread.sleep(5000);
		A.contextClick(element).perform();
		Robot B = new Robot();
		Thread.sleep(3000);
		B.keyPress(KeyEvent.VK_T);
		Thread.sleep(3000);
		M.quit();
		
		
	}
}
