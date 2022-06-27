package tests;

import org.openqa.selenium.chrome.ChromeDriver;

public class webTables {
    public static ChromeDriver getTableTestPage(){
        ChromeDriver driver= WebDriverManager.createChromeDriver();
        driver.get("https://demoqa.com/webtables");
        return driver;
    }
    public static void getCheckBoxDetails(ChromeDriver driver){

    }

}
