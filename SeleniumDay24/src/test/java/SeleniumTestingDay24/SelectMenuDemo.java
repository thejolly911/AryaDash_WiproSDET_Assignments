package SeleniumTestingDay24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMenuDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/select-menu");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        // Select Value
        driver.findElement(By.className("css-1wy0on6")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("react-select-2-input"))
                .sendKeys("Group 1, option 1");

        driver.findElement(By.id("react-select-2-input"))
                .sendKeys(Keys.ENTER);

        Thread.sleep(2000);

        // Select One
        driver.findElement(By.id("react-select-3-input"))
                .sendKeys("Mr.");

        driver.findElement(By.id("react-select-3-input"))
                .sendKeys(Keys.ENTER);

        Thread.sleep(2000);

        // Old Style Select Menu
        WebElement element = driver.findElement(By.id("oldSelectMenu"));

        Select select = new Select(element);

        select.selectByVisibleText("Blue");

        System.out.println("Blue Selected");

        Thread.sleep(2000);

        // Multiselect Drop Down
        driver.findElement(By.id("react-select-4-input"))
                .sendKeys("Green");

        driver.findElement(By.id("react-select-4-input"))
                .sendKeys(Keys.ENTER);

        Thread.sleep(2000);

        // Standard Multi Select
        driver.findElement(By.id("cars"))
                .sendKeys("Audi");

        System.out.println("All Dropdowns Selected Successfully");

        Thread.sleep(3000);

        driver.quit();
    }
}