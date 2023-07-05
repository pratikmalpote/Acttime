package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getlocators {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver M = new ChromeDriver();
		M.manage().window().maximize();
		M.get("https://www.zomato.com");
		int y = M.findElement(By.xpath("(//img[@alt='Zomato logo'])[1]")).getLocation().getY();
	    int x = M.findElement(By.xpath("(//img[@alt='Zomato logo'])[1]")).getLocation().getX();
	    System.out.println(y);
	    System.out.println(x);
	    M.quit();
		
	}
}
