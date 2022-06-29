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
    public static void getLinkDetails(ChromeDriver driver){
        WebElement created= driver.findElement(By.linkText("Created"));
        created.click();
        System.out.println(driver.findElement(By.id("linkResponse")).getText());
        WebElement badRequest= driver.findElement(By.linkText("Bad Request"));
        badRequest.click();
        WebElement notFound= driver.findElement(By.linkText("Not Found"));
        notFound.click();
        WebElement home= driver.findElement(By.linkText("Home"));
        home.click();
    }
}

