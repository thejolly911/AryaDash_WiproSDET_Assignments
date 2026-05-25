package SeleniumTestingDay24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/checkbox");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement element = driver.findElement(By.className("rc-tree-checkbox"));
	element.click();
	System.out.println("Checkbox selected");
	Thread.sleep(2000);
	element.click();
	System.out.println("Checkbox unselected");
	Thread.sleep(2000);
}
}
