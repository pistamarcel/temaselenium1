package tests;

import driver.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableTestPage {
    public static ChromeDriver getTableTestPage(){
        ChromeDriver driver= WebDriverManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/tag/table.html");
        return driver;
    }
    public static void getTableTestDetails(ChromeDriver driver) {
        //caption
        WebElement tablecaption= driver.findElement(By.xpath("//table[@id=\"mytable\"]//caption"));
        System.out.println("Caption: " +tablecaption.getText());
        WebElement table = driver.findElement(By.xpath("//div[@id=\"tablehere\"]//table"));
        System.out.println("ID atribute: " +table.getAttribute("id"));



     //Lista randuri si coloane tabel
        System.out.println("Table data");
        List<WebElement> tableRows= driver.findElements(By.cssSelector("#tablehere table tbody tr"));

        WebElement firstRow=tableRows.get(0);
        List<WebElement> tableFirstRowColums= firstRow.findElements(By.cssSelector("th"));
        System.out.println("Header prima coloana: " + tableFirstRowColums.get(0).getText());
        System.out.println("Header a doua coloana: " + tableFirstRowColums.get(1).getText());

        WebElement secondRow=tableRows.get(1);
        List<WebElement> tableSecondRowColums= secondRow.findElements(By.cssSelector("td"));
        System.out.println("Randul 1 coloana 1: " + tableSecondRowColums.get(0).getText());
        System.out.println("Randul 1 coloana 2: " + tableSecondRowColums.get(1).getText());

        WebElement thirdRow=tableRows.get(2);
        List<WebElement> tableThirdRowColums= thirdRow.findElements(By.cssSelector("td"));
        System.out.println("Randul 2 coloana 1: " + tableThirdRowColums.get(0).getText());
        System.out.println("Randul 2 coloana 2: " + tableThirdRowColums.get(1).getText());

        WebElement forthRow=tableRows.get(3);
        List<WebElement> tableForthRowColums= forthRow.findElements(By.cssSelector("td"));
        System.out.println("Randul 3 coloana 1: " + tableForthRowColums.get(0).getText());
        System.out.println("Randul 3 coloana 2: " + tableForthRowColums.get(1).getText());

        WebElement fifthRow=tableRows.get(4);
        List<WebElement> tableFifthRowColums= fifthRow.findElements(By.cssSelector("td"));
        System.out.println("Randul 4 coloana 1: " + tableFifthRowColums.get(0).getText());
        System.out.println("Randul 4 coloana 2: " + tableFifthRowColums.get(1).getText());
    }
}
