package qsp;

import java.time.Duration;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.devtools.v111.page.model.JavascriptDialogClosed;

public class Srollmethod {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver M = new ChromeDriver();
		M.manage().window().maximize();
		M.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		M.navigate().to("https://www.bbc.com/");
		JavascriptExecutor j =(JavascriptExecutor) M;
		j.executeScript("window.scrollBy(0,2000)");
		
		Thread.sleep(5000);
		j.executeScript("window.scrollBy(0,-2000)");

		M.quit();
	}
}
