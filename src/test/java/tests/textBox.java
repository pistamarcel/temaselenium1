package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textBox {


    public static ChromeDriver getTextBoxPage(){
        ChromeDriver driver= WebDriverManager.createChromeDriver();
        driver.get("https://demoqa.com/text-box");
        return driver;
    }
    public static void getFindByPlayGroundDetails(ChromeDriver driver){
        WebElement name=driver.findElement(By.cssSelector("div.text-field-container form div input#userName"));
        name.sendKeys("Pista Marcel Cosmin");

        WebElement email=driver.findElement(By.cssSelector("div.text-field-container form div#userEmail-wrapper div input#userEmail"));
        email.sendKeys("marcel.pista96@e-uvt.ro");

        WebElement address=driver.findElement(By.xpath("//div[@class=\"text-field-container\"]//form//div[@id=\"currentAddress-wrapper\"]//textarea[@id=\"currentAddress\"]"));
        address.sendKeys("Alea Ripensia, Bl:12, Ap:9, Timisoara");

        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Strada Muzicantilor, Nr:24, Orastie");

        WebElement button=driver.findElement(By.cssSelector("div div.text-right button#submit"));
        button.click();



    }


}
