package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test123 {
	
	@BeforeClass
	void beforeclass() {
		System.out.println("Before Class Test123");
	}
	
	@BeforeMethod
	void beforemethod() {
		System.out.println("Before Method Test123");
	}
	
	@Test
	void test_A() {
		System.out.println("Test_A Test 123");
	}
	@Test
	void test_B() {
		System.out.println("Test_B Test123");
	}
	@Test
	void test_C() {
		System.out.println("Test_C Test123");
	}
	
	@AfterMethod
	void aftermethod() {
		System.out.println("After Method Test123");
	}
	
	@AfterClass
		void afterclass() {
		System.out.println("After Class Test123");
	}

}
