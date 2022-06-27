package tests;

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
