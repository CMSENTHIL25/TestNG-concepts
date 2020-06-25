package testNgg;

import org.testng.annotations.Test;

public class Sample2 {
	@Test
	public void bus() {
		System.out.println("bus is running");
	}
	@Test(enabled=false)
	public void car() {
		System.out.println("car is running ");
	}
	
	@Test
    public void plane() {
	System.out.println("plane");
}
	
		@Test(enabled=true)
	public void dinner() {
		System.out.println("dinner ready ");
	}
	
		
		@Test(dependsOnMethods="dinner")
        public void bike() {
		System.out.println("bike");
	}
	
	

}
