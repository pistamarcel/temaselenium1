package tests;

import org.openqa.selenium.chrome.ChromeDriver;

import static tests.WebTableTests.createDriverAndGetPage;
import static tests.WebTableTests.updateTable;

public class Main {
    public static void main(String[] args) {
        ChromeDriver driver = null;
        try {
            driver = createDriverAndGetPage();
            updateTable(driver);
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
