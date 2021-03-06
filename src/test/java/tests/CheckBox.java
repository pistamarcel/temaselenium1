package tests;

import driver.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBox {
    public static ChromeDriver getCheckBoxPage(){
        ChromeDriver driver= WebDriverManager.createChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        return driver;
    }

    public static void getCheckBoxDetails(ChromeDriver driver){
        WebElement home=driver.findElement(By.xpath("//div[@id=\"tree-node\"]//label[@for=\"tree-node-home\"]//span[@class=\"rct-title\"]"));
        System.out.println(home.getText());
        WebElement homeButton=driver.findElement(By.cssSelector("div#tree-node span button"));
        homeButton.click();

         //lista butoane dupa primul click
        List<WebElement>homeButtons1=driver.findElements(By.cssSelector("div#tree-node span button"));
        WebElement desktopButton = homeButtons1.get(1);
        WebElement documentsButton = homeButtons1.get(2);



         //Elemente Desktop
        WebElement desktop=driver.findElement(By.xpath("//div[@id=\"tree-node\"]//label[@for=\"tree-node-desktop\"]//span[@class=\"rct-title\"]"));
        System.out.println(desktop.getText());
        desktopButton.click();
        WebElement notes=driver.findElement(By.cssSelector("label[for=\"tree-node-notes\"] span.rct-title"));
        WebElement commands= driver.findElement(By.cssSelector("label[for=\"tree-node-commands\"] span.rct-title"));
        WebElement commandsCheckBox= driver.findElement(By.cssSelector("label[for=\"tree-node-commands\"] span.rct-checkbox"));
        System.out.println(notes.getText());
        commands.getText();
        commandsCheckBox.click();

        //Elemente documents
        WebElement documents=driver.findElement(By.xpath("//div[@id=\"tree-node\"]//label[@for=\"tree-node-documents\"]//span[@class=\"rct-title\"]"));
        System.out.println(documents.getText());
        documentsButton.click();
          //lista butoane dupa al treilea click
        List<WebElement>documentsButtons2=driver.findElements(By.cssSelector("div#tree-node span button"));
        WebElement workspaceButton=documentsButtons2.get(3);
        workspaceButton.click();
        WebElement react=driver.findElement(By.cssSelector("label[for=\"tree-node-react\"] span.rct-title"));
        System.out.println(react.getText());
        WebElement angular= driver.findElement(By.cssSelector("label[for=\"tree-node-angular\"] span.rct-title"));
        System.out.println(angular.getText());
        WebElement veu= driver.findElement(By.cssSelector("label[for=\"tree-node-veu\"] span.rct-title"));
        System.out.println(veu.getText());
        WebElement veuCheckBox=driver.findElement(By.cssSelector("label[for=\"tree-node-veu\"] span.rct-checkbox"));
        veuCheckBox.click();

        WebElement officeButton=documentsButtons2.get(4);
        officeButton.click();
        WebElement pub =driver.findElement(By.cssSelector("label[for=\"tree-node-public\"] span.rct-title"));
        System.out.println(pub.getText());
        WebElement priv = driver.findElement(By.cssSelector("label[for=\"tree-node-private\"] span.rct-title"));
        System.out.println(priv.getText());
        WebElement classified= driver.findElement(By.cssSelector("label[for=\"tree-node-classified\"] span.rct-title"));
        System.out.println(classified.getText());
        WebElement general= driver.findElement(By.cssSelector("label[for=\"tree-node-general\"] span.rct-title"));
        System.out.println(general.getText());
        WebElement generalCheckBox=driver.findElement(By.cssSelector("label[for=\"tree-node-general\"] span.rct-checkbox"));
        generalCheckBox.click();




        // Elemente downloads
        WebElement downloads=driver.findElement(By.xpath("//div[@id=\"tree-node\"]//label[@for=\"tree-node-downloads\"]//span[@class=\"rct-title\"]"));
        System.out.println(downloads.getText());
        WebElement downloadsButton=documentsButtons2.get(5);
        downloadsButton.click();
        WebElement wordFile=driver.findElement(By.cssSelector("label[for=\"tree-node-wordFile\"] span.rct-title"));
        System.out.println(wordFile.getText());
        WebElement excelFile=driver.findElement(By.cssSelector("label[for=\"tree-node-excelFile\"] span.rct-title"));
        System.out.println(excelFile.getText());
        WebElement excelFileCheckBox=driver.findElement(By.cssSelector("label[for=\"tree-node-excelFile\"] span.rct-checkbox"));
        excelFileCheckBox.click();
        System.out.println("Done. Let's start over!");
        WebElement collapseAll=driver.findElement(By.cssSelector("button[title=\"Collapse all\"]"));
        collapseAll.click();

    }
}
