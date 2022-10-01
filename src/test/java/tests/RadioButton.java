package tests;

import driver.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.util.List;

public class RadioButton extends Base {

    public  void getRadioButtonDetails(){
        driver.get("https://demoqa.com/radio-button");
        WebElement yesButton= driver.findElement(By.id("yesRadio"));
        yesButton.click();
        List<WebElement> labels=driver.findElements(By.cssSelector("label.custom-control-label"));
        WebElement yesLabel= labels.get(0);
        yesLabel.getText();

        WebElement impressiveButton= driver.findElement(By.id(" impressiveRadio"));
        impressiveButton.click();
        WebElement impressiveLabel=labels.get(1);
        System.out.println("impressiveLabel.getText()");
        WebElement noButton= driver.findElement(By.id("noRadio"));
        noButton.click();
        WebElement nolabel=labels.get(2);
        nolabel.getText();

    }

}
