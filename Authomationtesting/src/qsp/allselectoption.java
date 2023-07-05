package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class allselectoption {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver M = new ChromeDriver();
		M.manage().window().maximize();
		M.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		M.get("file:///C:/Users/Omkar/Desktop/web%20tec/rolex.html");
		WebElement elements = M.findElement(By.id("Doremon"));
		
		Select s = new Select(elements);
	     List<WebElement> element = s.getOptions();
	        int count = element.size();
	        for (int i = 0; i < count; i++) {
				 String option = element.get(i).getText();
				 System.out.println(option);
				
			}
	        M.quit();
	}

}
