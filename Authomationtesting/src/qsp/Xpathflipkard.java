package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v111.css.model.CSSStyleSheetHeader;

public class Xpathflipkard {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("samsunggalaxys23");
		d.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);
	  String price = d.findElement(By.xpath("//span[text()='Samsung Galaxy S23 Ultra 5G (Phantom Black, 12GB, 256GB Storage)']/../../../../../../../div[2]/div/div/div[3]/div[1]/div[1]/div[1]/div[2]/a/span[1]/span[2]")).getText();
		Thread.sleep(5000);
	  System.out.println(price);
		Thread.sleep(5000);
		d.close();
	}

}
