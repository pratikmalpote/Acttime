package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v113.css.model.SelectorList;
import org.openqa.selenium.support.ui.Select;

public class Selectmethod {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver M = new ChromeDriver();
		M.manage().window().maximize();
		M.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		M.navigate().to("https://www.facebook.com/login/");
		M.findElement(By.linkText("Sign up for Facebook")).click();
		WebElement element = M.findElement(By.id("day"));
		Select s = new Select(element);
		s.selectByIndex(10);
		Thread.sleep(5000);
	    WebElement months = M.findElement(By.id("month"));
	    Select m = new Select(months);
	    m.selectByIndex(9);
	    Thread.sleep(3000);
	    WebElement year = M.findElement(By.id("year"));
	    Select y = new Select(year);
	    y.selectByIndex(23);
	    Thread.sleep(5000);
	    M.quit();
	    
	    }
}
