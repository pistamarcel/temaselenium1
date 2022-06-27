package tests;

import driver.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {
    public static ChromeDriver getRadioButtonPage(){
        ChromeDriver driver= WebDriverManager.createChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        return driver;
    }
    public static void getCheckBoxDetails(ChromeDriver driver){

    }

}
