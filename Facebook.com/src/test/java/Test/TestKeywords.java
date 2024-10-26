package Test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestKeywords {
	
	@BeforeClass
	void beforeClass() {
		System.out.println("Before Class");
	}
	@BeforeMethod
	void beforeMethod() {
	    System.out.println("Before Method");
	}
	@Test(priority =1,dependsOnMethods= {"test_B","test_C"})
	void test_A() {
		System.out.println("Test A");
		
	}
	@Test(priority =-3,timeOut=1000)
	void test_B() {
		System.out.println("Test B");
		Assert.fail();
	}
	@Test(priority =2,invocationCount = 1)
	void test_C() {
		System.out.println("Test C");
	}
	@Test(priority =5,invocationCount = 3,enabled=false)
	void test_D() {
		System.out.println("Test D");
	}
	
	@AfterMethod
	void aftermethod() {
		System.out.println("After Method");
	}
	
	@AfterClass
		void afterclass() {
		System.out.println("After Class");
	}

}



