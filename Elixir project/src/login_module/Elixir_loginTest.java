package login_module;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Elixir_loginTest {
	WebDriver driver;
  @Test
  public void login() {
	  driver.findElement(By.xpath("//input[@id='UserLogin_username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='UserLogin_password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal btn-block']")).click();
	  }
  @BeforeTest
  public void url() {
	  System.setProperty("webdriver.chrome.driver","D://Vasantha//chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.navigate().to(" http://demo.elixiraid.com/index.php");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("loginpage was open");
  }

}
