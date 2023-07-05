package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattribute {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver M = new ChromeDriver();
		M.manage().window().maximize();
		M.navigate().to("https://tinder.com/");
		Thread.sleep(3000);
		 String Attribute = M.findElement(By.xpath("//h1[.='Start something epic.']")).getAttribute("class");
		 System.out.println(Attribute);
		 Thread.sleep(5000);
		 M.quit();
	}

}
