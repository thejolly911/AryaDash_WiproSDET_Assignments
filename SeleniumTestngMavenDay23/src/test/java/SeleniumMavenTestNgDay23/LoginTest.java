package SeleniumMavenTestNgDay23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        System.out.println("Launching Browser");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");
    }

    @Test(priority = 1)
    public void loginTest() throws InterruptedException {

        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        Thread.sleep(2000);

        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        Thread.sleep(2000);

        driver.findElement(By.id("login-button"))
              .click();

        Thread.sleep(3000);

        System.out.println("Login Successful");
    }

    @Test(priority = 2)
    public void verifyLogin() throws InterruptedException {

        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        Thread.sleep(2000);

        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        Thread.sleep(2000);

        driver.findElement(By.id("login-button"))
              .click();

        Thread.sleep(3000);

        String title = driver.getTitle();

        System.out.println("Page Title : " + title);

        Assert.assertEquals(title, "Swag Labs");

        System.out.println("Login Verified Successfully");
    }

    @Test(priority = 3)
    public void addToCart() throws InterruptedException {

        // Login
        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        Thread.sleep(2000);

        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        Thread.sleep(2000);

        driver.findElement(By.id("login-button"))
              .click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"))
              .click();

        Thread.sleep(3000);

        driver.findElement(By.id("add-to-cart"))
              .click();

        Thread.sleep(3000);

        System.out.println("Product Added To Cart Successfully");
    }

    @Test(priority = 4)
    public void checkoutTest() throws InterruptedException {

        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        Thread.sleep(2000);

        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        Thread.sleep(2000);

        driver.findElement(By.id("login-button"))
              .click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"))
              .click();

        Thread.sleep(3000);

        driver.findElement(By.id("add-to-cart"))
              .click();

        Thread.sleep(3000);

        driver.findElement(By.id("back-to-products"))
              .click();

        Thread.sleep(3000);

        driver.findElement(By.className("shopping_cart_link"))
              .click();

        Thread.sleep(3000);

        driver.findElement(By.id("checkout"))
              .click();

        Thread.sleep(3000);

        driver.findElement(By.id("first-name"))
              .sendKeys("Shaurya");

        Thread.sleep(2000);

        driver.findElement(By.id("last-name"))
              .sendKeys("Chatterjee");

        Thread.sleep(2000);

        driver.findElement(By.id("postal-code"))
              .sendKeys("123456");

        Thread.sleep(2000);

        driver.findElement(By.id("continue"))
              .click();

        Thread.sleep(3000);

        driver.findElement(By.id("finish"))
              .click();

        Thread.sleep(3000);

        System.out.println("Order Placed Successfully");
    }

    @AfterMethod
    public void tearDown() {

        System.out.println("Closing Browser");

        driver.quit();
    }
}