package tests;

import driver.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {
    public static ChromeDriver getButtonsPage(){
        ChromeDriver driver= WebDriverManager.createChromeDriver();
        driver.get("https://demoqa.com/buttons");
        return driver;
    }
    public static void getButtonsDetails(ChromeDriver driver){
        WebElement doubleClick=driver.findElement(By.id("#doubleClickBtn"));
        Actions act = new Actions(driver);
        act.doubleClick(doubleClick).perform();
        doubleClick.getText();
        WebElement rightClick=driver.findElement(By.id("rightClickBtn"));
        act.contextClick(rightClick).perform();
        rightClick.getText();
        WebElement clickbtn=driver.findElement(By.id("rightClickBtn"));
        clickbtn.click();
        clickbtn.getText();


    }
}








