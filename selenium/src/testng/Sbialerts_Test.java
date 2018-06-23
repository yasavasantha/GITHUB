package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Sbialerts_Test {
	WebDriver driver;
  @Test
	  public void browser() {
			System.setProperty("webdriver.chrome.driver", "D://Vasantha//chromedriver.exe");
			driver=new ChromeDriver();
			driver.navigate().to("https://www.onlinesbi.com");
			driver.manage().window().maximize();
		}
  @Test
  public void login() throws Exception{
	    driver.findElement(By.xpath("//span[@class='classicTxt']")).click();
	    driver.findElement(By.xpath("//a[@href='javascript:void(0);'][contains(text(),'CONTINUE TO LOGIN')]")).click();
	    driver.findElement(By.xpath("//a[@tabindex='16']")).click();
	    Thread.sleep(4000);
	    driver.switchTo().alert().accept();
  }
  @BeforeTest
  public void before() {
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Sbi login page launched");
  }

}
