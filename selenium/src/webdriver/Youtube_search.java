package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_search {
WebDriver driver;
public void browser() {
	System.setProperty("webdriver.chrome.driver","D://Vasantha//chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
	driver.manage().window().maximize();

}
public void search() {
driver.findElement(By.name("search_query")).sendKeys("MEPMA");
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
	Youtube_search s= new Youtube_search();
	s.browser();
	s.search();

	}

}
