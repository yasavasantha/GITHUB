package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.steadystate.css.dom.Property;

public class Fb_login {
	WebDriver driver;
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver", "D://Vasantha//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fb_login s=new Fb_login();
		s.browser();

	}

}
