package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkardLinks {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver M = new ChromeDriver();
		M.manage().window().maximize();
		M.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		List<WebElement> alllinks = M.findElements(By.xpath("//a"));
		   int count = alllinks.size();
		   System.out.println(count);
		for (int i = 0; i < count; i++) {
			String links = alllinks.get(i).getText();
			System.out.println(links);
			
		}
		Thread.sleep(5000);
		M.quit();
		
		
		
		
	}
	

}
