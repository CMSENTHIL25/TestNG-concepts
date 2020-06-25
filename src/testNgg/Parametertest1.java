package testNgg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametertest1 {

	
	
	@Test
	@Parameters({"username","password"})

	public void method1(String uname, String pword) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Student\\eclipse-workspace\\Seleniumconcepts\\src\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//*[@id=\'txtUsername\']"));
		username.sendKeys(uname);

		WebElement password = driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
		password.sendKeys(pword);
		
		WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
		loginbutton.click();
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
