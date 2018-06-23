package junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Sample4 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("hi");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("bye");
	}
    @Test
	public void test1() {
		System.out.println("this is vasantha");
	}
    @Test
   	public void test2() {
   		System.out.println("this is junit");
   	}


}
