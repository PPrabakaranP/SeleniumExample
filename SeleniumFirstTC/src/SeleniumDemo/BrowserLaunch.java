package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webDriver.chrome.driver","C:\\Selenium Download\\driver\\chromedriver.exe");
     WebDriver driver =  new ChromeDriver();
     driver.get("https://www.google.com");
     driver.quit();
	}

}
