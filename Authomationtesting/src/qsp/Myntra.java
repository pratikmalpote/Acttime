package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	
     static {
    	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    	 
     }
     public static void main(String[] args) throws InterruptedException {
		ChromeDriver c = new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.myntra.com/");
		c.findElement(By.className("de")).click();
		Thread.sleep(5000);
		c.close();
		

     }
}
