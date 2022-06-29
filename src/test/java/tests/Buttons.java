package tests;

import driver.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Buttons {
    public static ChromeDriver getButtonsPage(){
        ChromeDriver driver= WebDriverManager.createChromeDriver();
        driver.get("https://demoqa.com/buttons");
        return driver;
    }
    public static void getButtonsDetails(ChromeDriver driver){
        WebElement doubleClick=driver.findElement(By.id("doubleClickBtn"));
        Actions act = new Actions(driver);
        act.doubleClick(doubleClick).perform();
        System.out.println(doubleClick.getText());
        System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());

        WebElement rightClick=driver.findElement(By.id("rightClickBtn"));
        act.contextClick(rightClick).perform();
        System.out.println(rightClick.getText());
        System.out.println(driver.findElement(By.id("rightClickMessage")).getText());

        WebElement clickbtn = getButtonByText(driver, "Click Me");
        clickbtn.click();
        System.out.println(clickbtn.getText());
        System.out.println(driver.findElement(By.id("dynamicClickMessage")).getText());
    }

    private static WebElement getButtonByText(ChromeDriver driver, String text) {
        List<WebElement> buttons = driver.findElements(By.cssSelector("button.btn.btn-primary"));
        for (WebElement button : buttons) {
            if (text.equals(button.getText())) {
                return button;
            }
        }
        return buttons.get(0);
    }
}








