package tests;

import driver.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttributes {
    public static ChromeDriver getElementAttributesPage(){
        ChromeDriver driver= WebDriverManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/attributes-test.html");
        return driver;
    }
    public static void getElementAttributesDetails(ChromeDriver driver){
        WebElement atributesparagraph= driver.findElement(By.xpath("//div[@class=\"centered\"]//p[@custom-attrib=\"attrib in source at load\" and @title=\"a paragraph to test attributes on\"]"));
        System.out.println("Primul paragraf cu custom atributes: " +atributesparagraph.getText());
        System.out.println(atributesparagraph.getAttribute("original-title"));

        // selecting by id is enough, we should avoid too complicated locators
        WebElement dynamicAtributes=driver.findElement(By.xpath("//div[@class=\"centered\"]//p[@id=\"jsattributes\"]"));
        System.out.println(dynamicAtributes.getText());
        String nextId = dynamicAtributes.getAttribute("nextid");
        System.out.println("nextid initial: " + nextId);
        WebElement button=driver.findElement(By.xpath("//div[@class=\"centered\"]//button[@onclick=\"setNewAttrib()\"]"));

        // random for, just to see how we could extract all custom generated attributes of the paragraph
        for (int i = 0; i < 5; i++) {
            button.click();
            System.out.println("Custom attribute value: " + dynamicAtributes.getAttribute("custom-" + nextId));
            nextId = dynamicAtributes.getAttribute("nextid");
            System.out.println("nextid current: " + nextId);
        }
    }
}
