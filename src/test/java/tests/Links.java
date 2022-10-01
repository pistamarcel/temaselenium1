package tests;

import driver.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links  extends Base{

    public  void getCheckBoxDetails(){
        driver.get("https://demoqa.com/links");
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

