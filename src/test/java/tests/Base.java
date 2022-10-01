package tests;

import driver.WebDriverConfig;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

import static driver.WebDriverConfig.getRemoteChromeDriver;

public class Base {
    protected static RemoteWebDriver driver = null;


    @BeforeMethod()
    public void beforeMethodWithLogin() throws MalformedURLException {
        driver = WebDriverConfig.getRemoteChromeDriver();

    }



    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        if (driver != null) {
            driver.quit();
        }
    }


}
