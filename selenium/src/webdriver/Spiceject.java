package webdriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Spiceject {
	WebDriver driver;
	Actions a = new Actions(driver);
	public void browser() {
		System.setProperty("webdriver.chrome.driver","D://Vasantha//chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("http://www.spicejet.com");
		driver.manage().window().maximize();	
	}
	public void actions()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		a.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
	}
	public void keyboard() throws InterruptedException {
		driver.findElement(By.linkText("Hot Meals")).click();
		a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		Thread.sleep(3000);
	}
	public static void main(String[] args) throws InterruptedException {
		Spiceject s=new Spiceject();
		s.browser();
		s.actions();
		s.keyboard();
	}

}
