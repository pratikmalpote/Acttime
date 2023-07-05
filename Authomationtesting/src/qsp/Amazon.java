package qsp;
//xpath 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	static {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver c =new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_96612yg6jw_e&adgrpid=60571832564&hvpone=&hvptwo=&hvadid=610644605478&hvpos=&hvnetw=g&hvrand=3346714686758236536&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302184&hvtargid=kwd-296458795081&hydadcr=14452_2316413");
		c.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone14");
		c.findElement(By.id("nav-search-submit-button")).click();
	String text = c.findElement(By.xpath("//span[text()='Apple iPhone 14 Pro (128 GB) - Space Black']")).getText();
	System.out.println(text);
	Thread.sleep(5000);
	c.close();
		
	}

}
