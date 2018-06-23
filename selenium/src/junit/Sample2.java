package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Sample2 {

	@Before
	public void setUp() throws Exception {
		System.out.println("hi");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("bye");
	}

	@Test
	public void test1() {
		System.out.println("this is vasantha");
	}
	//@Ignore
	@Test
	public void test2() {
		System.out.println("this is junit");
	}

}
