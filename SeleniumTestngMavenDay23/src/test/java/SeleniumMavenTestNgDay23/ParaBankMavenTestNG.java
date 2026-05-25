package SeleniumMavenTestNgDay23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParaBankMavenTestNG {

    WebDriver driver;

    String username = "Shaurya" + System.currentTimeMillis();

    String password = "2909";

    @BeforeMethod
    public void setup() throws InterruptedException {

        driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        driver.manage().window().maximize();

        Thread.sleep(3000);
    }

    @Test(priority = 1)
    public void openRegisterPage() throws InterruptedException {

        driver.findElement(By.linkText("Register")).click();

        Thread.sleep(3000);

        System.out.println("Register Page Opened Successfully");
    }

    @Test(priority = 2)
    public void registerUser() throws InterruptedException {

        driver.findElement(By.linkText("Register")).click();

        Thread.sleep(3000);

        driver.findElement(By.id("customer.firstName")).sendKeys("Shaurya");

        driver.findElement(By.id("customer.lastName")).sendKeys("Chatterjee");

        driver.findElement(By.id("customer.address.street")).sendKeys("ABC Street");

        driver.findElement(By.id("customer.address.city")).sendKeys("Kolkata");

        driver.findElement(By.id("customer.address.state")).sendKeys("West Bengal");

        driver.findElement(By.id("customer.address.zipCode")).sendKeys("123456");

        driver.findElement(By.id("customer.phoneNumber")).sendKeys("0987654321");

        driver.findElement(By.id("customer.ssn")).sendKeys("2345678");

        driver.findElement(By.id("customer.username")).sendKeys(username);

        driver.findElement(By.id("customer.password")).sendKeys(password);

        driver.findElement(By.id("repeatedPassword")).sendKeys(password);

        driver.findElement(By.xpath("//input[@value='Register']")).click();

        Thread.sleep(5000);

        System.out.println("Registration Successful");

        System.out.println("Username : " + username);
    }

    @Test(priority = 3)
    public void loginUser() throws InterruptedException {

        driver.findElement(By.name("username")).sendKeys(username);

        Thread.sleep(2000);

        driver.findElement(By.name("password")).sendKeys(password);

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='Log In']")).click();

        Thread.sleep(5000);

        System.out.println("Login Successful");
    }

    @Test(priority = 4)
    public void transferFunds() throws InterruptedException {

        driver.findElement(By.name("username")).sendKeys(username);

        Thread.sleep(2000);

        driver.findElement(By.name("password")).sendKeys(password);

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='Log In']")).click();

        Thread.sleep(5000);

        driver.findElement(By.linkText("Transfer Funds")).click();

        Thread.sleep(3000);

        driver.findElement(By.id("amount")).sendKeys("100");

        Thread.sleep(2000);

        // Automatically selects available accounts
        driver.findElement(By.id("fromAccountId")).click();

        driver.findElement(By.id("toAccountId")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='Transfer']")).click();

        Thread.sleep(5000);

        String successText = driver.findElement(
                By.xpath("//h1[contains(text(),'Transfer Complete!')]"))
                .getText();

        Assert.assertTrue(successText.contains("Transfer Complete!"));

        System.out.println("Fund Transfer Successful");
    }

    @AfterMethod
    public void teardown() throws InterruptedException {

        Thread.sleep(3000);

        driver.quit();
    }
}