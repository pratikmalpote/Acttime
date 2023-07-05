package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsizeandgetheight {
  
	static {
		System.setProperty("driver.chrome.driver", "./driver/chromerdriver.exe");
	}
	public static void main(String[] args) {
		WebDriver M = new ChromeDriver();
		M.manage().window().maximize();
		M.navigate().to("https://www.facebook.com/");
	    int hei = M.findElement(By.xpath("//img[@src='https://static.xx.fbcdn.net/rsrc.php/y8/r/dF5SId3UHWd.svg']")).getSize().getHeight();
        int wid = M.findElement(By.xpath("//img[@alt='Facebook']")).getSize().getWidth();
        System.out.println(hei);
        System.out.println(wid);
        M.quit();
	
		
	}
}
