package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.manage().window().maximize();
		c.get("https://www.facebook.com/");
		String source = c.getPageSource();
		System.out.println(source);
		Thread.sleep(5000);
		c.close();
	}

}
