package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectindex {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver M = new ChromeDriver();
		M.manage().window().maximize();
		M.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//M.navigate().to("file:///C:/Users/Omkar/Desktop/web%20tec/rolex.html");
		M.get("file:///C:/Users/Omkar/Desktop/web%20tec/rolex.html");
		    WebElement element = M.findElement(By.id("Doremon"));
		    Select s = new Select(element);
		    s.selectByValue("Br");
		    Thread.sleep(3000);
		    s.selectByVisibleText("paneer tikka ");
		    Thread.sleep(3000);
		    s.selectByIndex(7);
		    Thread.sleep(3000);
		    s.deselectAll();
		    Thread.sleep(5000);
		    //Select N = new Select(element);
		    //N.deselectByValue("br");
		    //Thread.sleep(2000);
		    //N.deselectByIndex(7);
		    //N.deselectByVisibleText("paneer tikka ");
		    M.quit();
		    
	}
}
