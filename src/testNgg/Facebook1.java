package testNgg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook1 {
	
	@Test
	public void method1()  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Student\\eclipse-workspace\\Seleniumconcepts\\src\\drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	  
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	}

	@Test
	public void method2()  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Student\\eclipse-workspace\\Seleniumconcepts\\src\\drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	}
}
