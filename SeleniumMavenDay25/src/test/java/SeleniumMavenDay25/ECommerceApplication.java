package SeleniumMavenDay25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ECommerceApplication {

    public static void main(String[] args) throws InterruptedException {

        // Launch Browser
        WebDriver driver = new ChromeDriver();

        // Maximize Browser
        driver.manage().window().maximize();

        // Open Website
        driver.get("https://www.saucedemo.com/");

        System.out.println("E-Commerce Website Opened");

        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(10));

        // Username
        WebElement username = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("user-name")));

        username.sendKeys("standard_user");

        System.out.println("Username Entered");

        Thread.sleep(2000);

        // Password
        WebElement password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("password")));

        password.sendKeys("secret_sauce");

        System.out.println("Password Entered");

        Thread.sleep(2000);

        // Login Button
        WebElement loginButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("login-button")));

        loginButton.click();

        System.out.println("Login Successful");

        Thread.sleep(3000);

        // Open Product
        WebElement product = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("item_4_title_link")));

        product.click();

        System.out.println("Product Page Opened");

        Thread.sleep(3000);

        // Wait For Add To Cart Button
        WebElement addToCartButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("add-to-cart-sauce-labs-backpack")));

        addToCartButton.click();

        System.out.println("Product Added To Cart Successfully");

        Thread.sleep(5000);

        // Close Browser
        driver.quit();

        System.out.println("Browser Closed Successfully");
    }
}