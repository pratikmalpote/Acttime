package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenable {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
      WebDriver M = new ChromeDriver();
      M.manage().window().maximize();
      M.navigate().to("https://www.facebook.com/login/");
      M.findElement(By.id("email")).sendKeys("pratik");
      M.findElement(By.name("pass")).sendKeys("pratik");
      Thread.sleep(3000);
       boolean submit = M.findElement(By.xpath("//button[@type='submit']")).isEnabled();
       if (submit== true) {
		System.out.println("login button is working");
	}
        else {
        System.out.println("login buuton is not working");
	}
      M.close();
	}

}
