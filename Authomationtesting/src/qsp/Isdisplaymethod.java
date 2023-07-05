package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplaymethod {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver M = new ChromeDriver();
		M.manage().window().maximize();
		M.navigate().to("https://www.facebook.com/login/");
		boolean logo = M.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		if (logo==true) {
			System.out.println("display the logo");
		} else {
          System.out.println("not display the logo");
          
		}
		M.close();
	}
	

}
