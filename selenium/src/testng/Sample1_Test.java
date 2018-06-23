package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Sample1_Test {
  @Test
  public void b() {
	  System.out.println("This is vasantha");
  }
  @BeforeTest
  public void a() {
	  System.out.println("Hai");
  }

  @AfterTest
  public void c() {
	  System.out.println("Bye");
  }

}
