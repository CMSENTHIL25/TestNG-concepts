package testNgg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gmail1 {
	
	@Test(groups={"moto"})
	public void method1() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Student\\eclipse-workspace\\Seleniumconcepts\\src\\drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.google.com/intl/en_in/gmail/about/");
	driver.manage().window().maximize();
	
	}
	

	
	@Test(groups={"moto"})
	public void method3() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Student\\eclipse-workspace\\Seleniumconcepts\\src\\drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.cheapair.com/?jsr=()&uid=151&gclid=CjwKCAiA27LvBRB0EiwAPc8XWYNvAdNbSp07PSjftj6zomggVB6yFN4iTfQc6CEU-_-5O9-1gN0W4RoC084QAvD_BwE");
	driver.manage().window().maximize();
	
	/*//String oldwindow = driver.getWindowHandle();
	driver.findElement(By.xpath("//a[(text()=\'Gmail\')]")).click();
	
	Thread.sleep(3000);
	WebElement button2 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[3]/a"));
	button2.click();*/
	
	}
	
}

