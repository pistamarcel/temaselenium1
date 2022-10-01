package tests;

import driver.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TableTestPage extends Base{
    private static boolean tableRows;

    @Test
    public  void getTableTestDetails() {
        driver.get("https://testpages.herokuapp.com/styled/tag/table.html");
        //caption
        WebElement tablecaption = driver.findElement(By.xpath("//div[@class=\"centered\"]//div[@id=\"tablehere\"]//table[@id=\"mytable\"]//caption"));
        System.out.println("Caption: " + tablecaption.getText());
        WebElement table = driver.findElement(By.xpath("//div[@class=\"centered\"]//div[@id=\"tablehere\"]//table"));
        System.out.println("ID atribute: " + table.getAttribute("id"));


        //Lista randuri si coloane tabel
        System.out.println("Table data");
        List<WebElement> tableRows = driver.findElements(By.cssSelector("#tablehere table tbody tr"));
        for (int i = 0; i < tableRows.size(); i++) {

            WebElement currentRows = tableRows.get(i);
            if (i == 0) {
                List<WebElement> tableHeaderColumn = currentRows.findElements(By.cssSelector("th"));
                System.out.println("Header prima coloana: " + tableHeaderColumn.get(0).getText());
                System.out.println("Header a doua coloana: " + tableHeaderColumn.get(1).getText());
            } else {

                List<WebElement> tableRowColumns = currentRows.findElements(By.cssSelector("td"));
                System.out.println("Randul " +(i)+ " coloana 1: " + tableRowColumns.get(0).getText());
                System.out.println("Randul " +(i)+ " coloana 2: " + tableRowColumns.get(1).getText());

            }

        }

    }

}
