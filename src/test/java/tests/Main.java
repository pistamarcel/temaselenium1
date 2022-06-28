package tests;

import org.openqa.selenium.chrome.ChromeDriver;

import static tests.WebTablesDemoQA.getDemoQADetails;
import static tests.WebTablesDemoQA.getDemoqaTablePage;

public class Main {
    public static void main(String[] args) {
        ChromeDriver driver=getDemoqaTablePage();

        getDemoQADetails(driver);
        //
//      getTableDetails(driver);

        driver.quit();
    }
}
