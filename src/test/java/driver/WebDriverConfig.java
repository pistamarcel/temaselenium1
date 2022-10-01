package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConfig {
    public static ChromeDriver createChromeDriver(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe" );
        return new ChromeDriver();
    }


    public static ChromeDriver getChromeDriverByManager(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
   }

}
