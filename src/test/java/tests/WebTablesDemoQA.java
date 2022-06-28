package tests;
import driver.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTablesDemoQA {
    public static ChromeDriver getDemoqaTablePage(){
        ChromeDriver driver= WebDriverManager.createChromeDriver();
        driver.get("https://demoqa.com/webtables");
        return driver;
    }
    public static void getDemoQADetails(ChromeDriver driver) {
        List<WebElement> headers = driver.findElements(By.cssSelector("div.rt-resizable-header-content"));
        System.out.println("Headers: ");
        System.out.println(headers.get(0).getText());
        System.out.println(headers.get(1).getText());
        System.out.println(headers.get(2).getText());
        System.out.println(headers.get(3).getText());
        System.out.println(headers.get(4).getText());
        System.out.println(headers.get(5).getText());
        System.out.println(headers.get(6).getText());

        List<WebElement> tableRows = driver.findElements(By.cssSelector("div.rt-tbody .rt-tr-group"));

        for (int i = 0; i < 3; i++) {
            WebElement currentRow = tableRows.get(i);
            {
                List<WebElement> currentColumns = currentRow.findElements(By.cssSelector("div.rt-td"));
                System.out.println("Text din randul " + (i + 1) + " , coloana 1  " + currentColumns.get(0).getText());
                System.out.println("Text din randul " + (i + 1) + " , coloana 2 " + currentColumns.get(1).getText());
                System.out.println("Text din randul " + (i + 1) + " , coloana 3  " + currentColumns.get(0).getText());
                System.out.println("Text din randul " + (i + 1) + " , coloana 4 " + currentColumns.get(1).getText());
                System.out.println("Text din randul " + (i + 1) + " , coloana 5  " + currentColumns.get(0).getText());
                System.out.println("Text din randul " + (i + 1) + " , coloana 6 " + currentColumns.get(1).getText());
            }
        }
        WebElement seachBox = driver.findElement(By.id("searchBox"));
        seachBox.sendKeys("Cierra");
        seachBox.clear();
        seachBox.sendKeys("Kierra");

        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        System.out.println(addButton.getText());
        addButton.click();
    }




}
