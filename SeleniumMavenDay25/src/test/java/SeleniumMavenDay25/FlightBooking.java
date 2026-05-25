package SeleniumMavenDay25;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FlightBooking {

    public static void main(String[] args) throws InterruptedException {

        // Launch Browser
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Open Website
        driver.get("https://phptravels.net/");

        System.out.println("Website Opened Successfully");

        // Close Warning Popup
        driver.findElement(By.id("acknowledgeDemoWarning")).click();

        Thread.sleep(2000);

        // Fluent Wait
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(Exception.class);

        // Click Flights Tab
        WebElement flightTab = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("/html/body/div[2]/div[3]/div/nav/button[2]")));

        flightTab.click();

        System.out.println("Flights Tab Opened");

        // Departure City
        WebElement fromCity = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div/div/form/div[1]/div[1]/div/div[1]/input")));

        fromCity.sendKeys("CCU");

        Thread.sleep(2000);

        fromCity.sendKeys(Keys.ARROW_DOWN);
        fromCity.sendKeys(Keys.ENTER);

        System.out.println("Departure City Selected");

        // Arrival City
        WebElement toCity = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//*[@id='arrival_airport_input']")));

        toCity.sendKeys("DEL");

        Thread.sleep(2000);

        toCity.sendKeys(Keys.ARROW_DOWN);
        toCity.sendKeys(Keys.ENTER);

        System.out.println("Arrival City Selected");

        // Departure Date
        LocalDate futureDate = LocalDate.now().plusDays(10);

        String fullDate = futureDate.format(
                DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        WebElement dateField = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//input[@placeholder='Departure Date']")));

        // Clear Existing Date
        dateField.sendKeys(Keys.CONTROL + "a");
        dateField.sendKeys(Keys.DELETE);

        // Enter Future Date
        dateField.sendKeys(fullDate);

        System.out.println("Departure Date Selected : " + fullDate);

        // Close Calendar Popup
        dateField.sendKeys(Keys.ESCAPE);

        Thread.sleep(2000);

        // Search Flights Button
        WebElement searchButton = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//button[contains(.,'Search Flights')]")));

        // Scroll To Search Button
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(true);", searchButton);

        Thread.sleep(2000);

        // JavaScript Click
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", searchButton);

        System.out.println("Flight Search Started");

        /* Wait For Flight Results
        WebElement resultTable = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[contains(@class,'theme-search-results-item')]")));

        // Verification
        if (resultTable.isDisplayed()) {

            System.out.println(
                    "Flight Search Results Displayed Successfully");
        }*/

        // Wait Few Seconds
        Thread.sleep(5000);

        // Close Browser
        driver.quit();

        System.out.println("Browser Closed Successfully");
    }
}