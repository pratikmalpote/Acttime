package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheet {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		WebDriver M = new ChromeDriver();
		M.manage().window().maximize();
		M.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FileInputStream fis = new FileInputStream("./Test/commanData.property");
		Properties P = new Properties();
		P.load(fis);
		String URL = P.getProperty("url");
		M.get(URL);
		String un = P.getProperty("username");
		M.findElement(By.id("username")).sendKeys(un);
		String pw = P.getProperty("password");
		M.findElement(By.name("pwd")).sendKeys(pw);
		M.findElement(By.xpath("//div[.='Login ']")).click();
		M.findElement(By.xpath("//div[.='Tasks']")).click();
		M.findElement(By.xpath("//div[.='Add New']")).click();
		M.findElement(By.xpath("//div[.='+ New Customer']")).click();
		FileInputStream fiels = new FileInputStream("./Testdata/AutomationTestdata.xIsx");
		
		
		

		
		
		
	}

}
