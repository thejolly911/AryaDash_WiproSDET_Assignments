package WiproSeleniumTrainingDay21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchWebsite1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	Thread.sleep(5000);
	
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	Thread.sleep(5000);
	
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(2000);
	
	System.out.println(driver.getTitle());
	
	driver.quit();
}
}
