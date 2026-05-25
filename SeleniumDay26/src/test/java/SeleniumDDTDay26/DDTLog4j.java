package SeleniumDDTDay26;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDTLog4j {

    // Create Logger Object
    static Logger log = LogManager.getLogger(DDTLog4j.class);

    public static void main(String[] args)
            throws EncryptedDocumentException, IOException {

        // Excel File Path
        FileInputStream fis = new FileInputStream(
                "E:\\Wipro Selenium Training\\DDT Sheet.xlsx");

        log.info("Excel File Opened Successfully");

        // Open Workbook
        Workbook wb = WorkbookFactory.create(fis);
        log.info("Workbook Opened Successfully");

        // Open Sheet
        Sheet sh = wb.getSheet("Sheet1");
        log.info("Sheet Opened Successfully");

        // Get Total Rows
        int rows = sh.getLastRowNum();
        log.info("Total Rows Found : " + rows);

        // Data Formatter
        DataFormatter formatter = new DataFormatter();

        // Loop Through Rows
        for (int i = 1; i <= rows; i++) {

            Row row = sh.getRow(i);

            // Check Row is not Empty
            if (row != null) {

                // Read Username and Password
                String Username =
                        formatter.formatCellValue(row.getCell(0));

                String Password =
                        formatter.formatCellValue(row.getCell(1));

                log.info("Reading Data From Row : " + i);

                // Launch Browser
                WebDriver driver = new ChromeDriver();
                log.info("Browser Launched Successfully");

                // Open Website
                driver.get("https://www.saucedemo.com");
                driver.manage().window().maximize();

                log.info("Website Opened Successfully");

                // Enter Username
                driver.findElement(By.id("user-name"))
                        .sendKeys(Username);

                log.info("Username Entered Successfully");
                log.info("Username is : " + Username);

                // Enter Password
                driver.findElement(By.id("password"))
                        .sendKeys(Password);

                log.info("Password Entered Successfully");

                // Click Login Button
                driver.findElement(By.id("login-button"))
                        .click();

                log.info("Login Button Clicked Successfully");

                // Login Completed
                log.info("Login Test Completed Successfully");

                // Close Browser
                driver.quit();

                log.info("Browser Closed Successfully");

                log.info("--------------------------------------");
            }
        }

        // Close Workbook and File
        wb.close();
        fis.close();

        log.info("Workbook Closed Successfully");
        log.info("File Closed Successfully");

        log.info("All DDT Test Cases Executed Successfully");
    }
}