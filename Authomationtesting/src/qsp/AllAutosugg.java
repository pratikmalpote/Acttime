package qsp;
// event

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllAutosugg {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver M = new ChromeDriver();
		M.manage().window().maximize();
		M.navigate().to("https://www.flipkart.com/");
		M.findElement(By.xpath("(//button[@class='_2KpZ6l _2doB4z'])[1]")).click();
		M.findElement(By.name("q")).sendKeys("iphone14");
		Thread.sleep(5000);
		List<WebElement> allsugg = M.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
		 int sugg = allsugg.size();
		 System.out.println("total sugg");
		 System.out.println(sugg);
		 for (int i = 0; i <= sugg ; i++) {
			String all = allsugg.get(i).getText();
			System.out.println(all);
			
		}
		 Thread.sleep(5000);
		 M.quit();	
		
	
	}
}
