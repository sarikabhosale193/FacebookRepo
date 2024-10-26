package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass_1 {

	@BeforeClass
	void beforeClass() {
		System.out.println("Luanch Browser");
	}
	@BeforeMethod
	void beforeMethod() {
		System.out.println("application open");
		System.out.println("Login");
	}
	@Test
	void test_A() {
		System.out.println("Verify Order");
	}
	@Test
	void test_B() {
		System.out.println("Verify Account");
    }
	@Test
	void test_C() {
		System.out.println("Verify cart");
    }
	@AfterMethod
	void afteraMethod() {
		System.out.println("Logout");
	}
	@AfterClass
	void afterClass() {
		System.out.println("Close Browser");
	}
}