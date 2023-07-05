package Testngscripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver M = new ChromeDriver();
		M.manage().window().maximize();
		M.get("https://www.facebook.com/");
		TakesScreenshot T =(TakesScreenshot) M;
		File SRC = T.getScreenshotAs(OutputType.FILE);
		File best = new File("./Screenshot/dhono.png");
		Files.copy(SRC, best);
		M.close();
	} 
}
