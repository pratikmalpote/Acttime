package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getrect {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver M = new ChromeDriver();
		M.manage().window().maximize();
		M.navigate().to("https://www.zomato.com/india");
	    int height = M.findElement(By.xpath("(//img[@alt='Zomato logo'])[1]")).getRect().getHeight();
        int width = M.findElement(By.xpath("(//img[@alt='Zomato logo'])[1]")).getRect().getWidth();
	    int y = M.findElement(By.xpath("(//img[@alt='Zomato logo'])[1]")).getRect().getY();
	    int x = M.findElement(By.xpath("(//img[@alt='Zomato logo'])[1]")).getRect().getX();
	    System.out.println(height);
     	System.out.println(width);
		System.out.println(y);
		System.out.println(x);
		M.quit();
				
	}
}
