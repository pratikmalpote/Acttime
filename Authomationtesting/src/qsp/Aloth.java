package qsp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aloth {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver M = new ChromeDriver();
		M.manage().window().maximize();
		M.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		M.navigate().to("https://demo.actitime.com/login.do");
		M.findElement(By.id("username")).sendKeys("admin");
		M.findElement(By.name("pwd")).sendKeys("manager");
		M.findElement(By.xpath("//div[.='Login ']")).click();
		M.findElement(By.xpath("//div[.='Tasks']")).click();
		M.findElement(By.xpath("//div[.='Add New']")).click();
		M.findElement(By.xpath("//div[.='+ New Product']")).click();
		M.findElement(By.xpath("(//input[@placeholder='Enter Product Name'])[2]")).sendKeys("pra");
		M.findElement(By.xpath("//div[@class='greyButton cancelBtn']")).click();
		Thread.sleep(5000);
	    	Alert a = M.switchTo().alert();
	    	String consol = a.getText();
	    	System.out.println(consol);
	    	Thread.sleep(5000);
	    	M.quit();
		
	}
}
