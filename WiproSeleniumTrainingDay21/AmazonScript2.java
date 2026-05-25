package WiproSeleniumTrainingDay21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonScript2 {
	private static final String sAddToCart = "(//input[contains(@value,'Add to Cart')])[1]";

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

        Thread.sleep(5000);

        driver.get("https://amzn.in/d/08UK18ED");
        //searchBox.sendKeys("iPhone 15");

        //driver.findElement(By.id("nav-search-submit-button")).click();

        //Thread.sleep(4000);

        //driver.findElement(By.cssSelector("div[data-component-type='s-search-result'] h2 a"))
                //.click();

        //Thread.sleep(5000);

        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
        }

        Thread.sleep(7000);

        //driver.findElement(By.xpath(sAddToCart)).click();
        /*WebElement buyNowBtn = driver.findElement(By.id("add-to-cart-button"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", buyNowBtn);*/
        
        driver.findElement(By.id("add-to-cart-button")).click();
        //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        //WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-button")));
        //addToCart.click();
        

        //driver.findElement(By.name("proceedToRetailCheckout")).click();

        //Thread.sleep(5000);

        //driver.quit();
    }
}