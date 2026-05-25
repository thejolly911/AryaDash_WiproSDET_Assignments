package SeleniumTestingDay24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {
public static void main(String[] arg) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/text-box");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.id("userName")).sendKeys("Shaurya Chattopadhyay");
	Thread.sleep(2000);
	driver.findElement(By.id("userEmail")).sendKeys("shauryachattopadhyay80@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("currentAddress")).sendKeys("Rabindrapally Suri Birbhum");
	Thread.sleep(2000);
	driver.findElement(By.id("permanentAddress")).sendKeys("Rabindrapally Suri Birbhum");
	Thread.sleep(2000);
	driver.findElement(By.id("submit")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("userName")).clear();
    driver.findElement(By.id("userEmail")).clear();
    driver.findElement(By.id("currentAddress")).clear();
    driver.findElement(By.id("permanentAddress")).clear();
    System.out.println("All Fields Cleared Successfully");
    Thread.sleep(2000);
}
}
