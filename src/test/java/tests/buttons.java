package tests;

import driver.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttons {
    public static ChromeDriver getTableTestPage(){
        ChromeDriver driver= WebDriverManager.createChromeDriver();
        driver.get("https://demoqa.com/buttons");
        return driver;
    }
    public static void getCheckBoxDetails(ChromeDriver driver){

    }
}
