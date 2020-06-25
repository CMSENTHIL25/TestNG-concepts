package testNgg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google1 {
	
	
	

	//@Test(invocationCount=3)
	@Test
	public void method1()  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Student\\eclipse-workspace\\Seleniumconcepts\\src\\drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.co.in");
	driver.manage().window().maximize();
	}
	
}
