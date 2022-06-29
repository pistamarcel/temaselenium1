package tests;

import driver.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    public static ChromeDriver getRadioButtonPage(){
        ChromeDriver driver= WebDriverManager.createChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        return driver;
    }
    public static void getRadioButtonDetails(ChromeDriver driver){
//        WebElement yesButton= driver.findElement(By.id("yesRadio"));
//        yesButton.click();
        List<WebElement> labels=driver.findElements(By.cssSelector("label.custom-control-label"));
        WebElement yesLabel= labels.get(0);
        yesLabel.click();
        System.out.println(yesLabel.getText());

//        WebElement impressiveButton= driver.findElement(By.id("impressiveRadio"));
//        impressiveButton.click();
        WebElement impressiveLabel=labels.get(1);
        impressiveLabel.click();
        System.out.println(impressiveLabel.getText());

        WebElement noButton= driver.findElement(By.id("noRadio"));
        if (noButton.isEnabled()) {
            noButton.click();
        }
        WebElement nolabel=labels.get(2);
        System.out.println(nolabel.getText());

    }

}
