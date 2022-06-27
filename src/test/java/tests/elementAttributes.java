package tests;

import driver.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class elementAttributes {
    public static ChromeDriver getElementAttributesPage(){
        ChromeDriver driver= WebDriverManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/attributes-test.html");
        return driver;
    }
    public static void getElementAttributesDetails(ChromeDriver driver){
        WebElement atributesparagraph= driver.findElement(By.xpath("//div[@class=\"centered\"]//p[@custom-attrib=\"attrib in source at load\" and @title=\"a paragraph to test attributes on\"]"));
        System.out.println("Primul paragraf cu custom atributes: " +atributesparagraph.getText());
        atributesparagraph.getAttribute("original-title");

        WebElement dynamicAtributes=driver.findElement(By.xpath("//div[@class=\"centered\"]//p[@id=\"jsattributes\"]"));
        System.out.println(dynamicAtributes.getText());
        System.out.println("nextid initial:"+dynamicAtributes.getAttribute("nextid"));


        WebElement button=driver.findElement(By.xpath("//div[@class=\"centered\"]//button[@onclick=\"setNewAttrib()\"]"));
        button.click();
        button.click();
        System.out.println("nextid current: " +dynamicAtributes.getAttribute("nextid"));


    }



}
