package tests;

import driver.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Buttons extends Base {
    @Test
    public static void getButtonsDetails(ChromeDriver driver){
        driver.get("https://demoqa.com/buttons");
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








