package WiproSeleniumTrainingDay21;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonLoginInfoSave {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.amazon.in");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.id("nav-link-accountList"))
		      .click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ap_email_login")).sendKeys("7872183370");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("continue")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("ap_password")).sendKeys("Shaurya@29092002");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("signInSubmit")).click();
		
		Thread.sleep(10000);
		
		Set<Cookie> cookies = driver.manage().getCookies();
		
		FileOutputStream file = new FileOutputStream("amazonCookies.data");
		
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		out.writeObject(cookies);
		
		out.close();
		file.close();
		
		System.out.println("Cookies Saved");

        driver.quit();
		
	}
	
	
	

}