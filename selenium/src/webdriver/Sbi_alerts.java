package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sbi_alerts {
	WebDriver driver;
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "D://Vasantha//chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.onlinesbi.com");
		driver.manage().window().maximize();
	}
    public void login() throws Exception{
    driver.findElement(By.xpath("//span[@class='classicTxt']")).click();
    driver.findElement(By.xpath("//a[@href='javascript:void(0);'][contains(text(),'CONTINUE TO LOGIN')]")).click();
    driver.findElement(By.xpath("//a[@tabindex='16']")).click();
    Thread.sleep(4000);
    driver.switchTo().alert().accept();
   
    //driver.switchTo().alert().dismiss();
     
    }
	public static void main(String[] args) throws Exception {
		Sbi_alerts s=new Sbi_alerts();
		s.browser();
		s.login();

	}

}
