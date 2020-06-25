package testNgg;

import org.testng.annotations.Test;

public class Para {
	
	
	
	@Test
	public void bu() {
		System.out.println(" running");
	}
	@Test(priority=0)
	public void ca() {
		System.out.println(" is ");
	}
	@Test(priority=1)
	public void din() {
		System.out.println(" ready ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	@BeforeSuite
	public void trees0() {
		System.out.println("0 Green evolution");
	}
	
	@BeforeTest
	public void trees1() {
		System.out.println("1 Green evolution");
	}
	
	@BeforeClass
	public void trees2() {
		System.out.println("2 Green evolution");
	}
	@BeforeMethod
	public void trees3() {
		System.out.println("3 Green evolution");
	}
	
	@Test
	public void trees4() {
		System.out.println("4 Green evolution");
	}
	@BeforeMethod
	public void trees5() {
		System.out.println("5 Green evolution");
	}
	@Test
	public void trees6() {
		System.out.println("6 Green evolution");
	}
	*/
}

