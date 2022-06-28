package tests;

import driver.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
    public static ChromeDriver getLinksPage(){
        ChromeDriver driver= WebDriverManager.createChromeDriver();
        driver.get("https://demoqa.com/links");
        return driver;
    }
    public static void getCheckBoxDetails(ChromeDriver driver){
        WebElement created= driver.findElement(By.linkText("Created"));
        created.click();
        WebElement badRequest= driver.findElement(By.linkText("Bad Request"));
        badRequest.click();
        WebElement notFound= driver.findElement(By.linkText("Not Found"));
        notFound.click();
        WebElement home= driver.findElement(By.linkText("Home"));
        home.click();



    }

}

