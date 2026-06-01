package CrossBrowserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserTest {

    WebDriver driver;

    @BeforeTest
    @Parameters("browser")

    public void setup(String browser) throws Exception {

        if(browser.equalsIgnoreCase("Chrome")) {

            driver = new ChromeDriver();
            System.out.println("Browser opened in Chrome");

        }
        else if(browser.equalsIgnoreCase("Edge")) {

            driver = new EdgeDriver();
            System.out.println("Browser opened in Edge");
        }

        else {

            throw new Exception("Browser is not correct");
        }

        // Open SauceDemo
        driver.get("https://www.saucedemo.com/");

        // Maximize Window
        driver.manage().window().maximize();
    }

    @Test
    public void loginTest() throws InterruptedException {

        // Enter Username
        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        // Enter Password
        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        // Click Login Button
        driver.findElement(By.id("login-button")).click();

        System.out.println("Login Successful");

        Thread.sleep(3000);
    }

    @AfterTest
    public void closeBrowser() {

        driver.quit();
        System.out.println("Browser Closed");
    }
}