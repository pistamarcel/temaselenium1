package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverConfig {
    public static ChromeDriver createChromeDriver(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe" );
        return new ChromeDriver();
    }


    public static  RemoteWebDriver getRemoteChromeDriver() throws MalformedURLException {
        return new RemoteWebDriver(new URL("http://localhost:4444/"), new ChromeOptions());
   }

    public static ChromeDriver getChromeDriverByManager(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
