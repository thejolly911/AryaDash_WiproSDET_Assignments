package WiproSeleniumTrainingDay21;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonScript {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in");
 
        driver.manage().window().maximize();

        Thread.sleep(3000);
        
        driver.findElement(By.id("nav-link-accountList")).click();
       
        driver.findElement(By.id("ap_email_login"))
                .sendKeys("7872183370");
        
        driver.findElement(By.id("continue")).click();

        Thread.sleep(2000);
       
        driver.findElement(By.id("ap_password"))
                .sendKeys("Shaurya@29092002");

        
        driver.findElement(By.id("signInSubmit")).click();

        Thread.sleep(3000);
         
        driver.quit();
    }
}