package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragonDropdownmouse {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver M = new ChromeDriver();
		M.manage().window().maximize();
		M.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		M.navigate().to("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement element = M.findElement(By.xpath("//h1[.='Block 1']"));
	       WebElement ele = M.findElement(By.xpath("//h1[.='Block 4']"));
	       Actions S = new Actions(M);
	       Thread.sleep(3000);
	       S.dragAndDrop(element, ele).perform();
	       Thread.sleep(4000);
	       M.quit();
	}
}
