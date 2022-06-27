package tests;

import driver.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {
    public static ChromeDriver getLinksPage(){
        ChromeDriver driver= WebDriverManager.createChromeDriver();
        driver.get("https://demoqa.com/links");
        return driver;
    }
    public static void getCheckBoxDetails(ChromeDriver driver){



    }

}
