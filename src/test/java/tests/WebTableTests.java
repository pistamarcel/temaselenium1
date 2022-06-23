package tests;

import driver.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import static tests.basicWebPage.getPageBasic;

public class WebTableTests {
    public static void main(String[] args) {
        ChromeDriver driver= CreateDriverAndGetPage();

        updateTable(driver);
        getTableDetails(driver);

     driver.quit();
    }


    public static ChromeDriver CreateDriverAndGetPage(){
        ChromeDriver driver= WebDriverManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");
        return driver;
    }



    public static void getTableDetails(ChromeDriver driver){
        WebElement tablecaption= driver.findElement(By.cssSelector("#tablehere table caption"));
        System.out.println("Caption: " +tablecaption.getText());
        WebElement table = driver.findElement(By.cssSelector("#tablehere table"));
        System.out.println("ID atribute: " +table.getAttribute("id"));


        // select table rows and columns
        List<WebElement> tableRows= driver.findElements(By.cssSelector("#tablehere table tr"));

        for(int i=0; i<tableRows.size();i++){
            WebElement currentRow = tableRows.get(i);
            if(i==0) {
                List<WebElement> firstRowColums= currentRow.findElements(By.cssSelector("th"));
                System.out.println("Header din prima coloana: " + firstRowColums.get(0).getText());
                System.out.println("Header din a doua coloana: " + firstRowColums.get(1).getText());
                System.out.println("");
            }else {
                List<WebElement> currentColumns = currentRow.findElements(By.cssSelector("td"));
                System.out.println("Text din randul "  +(i+1)+ " , coloana 1  " + currentColumns.get(0).getText());
                System.out.println("Text din randul "  +(i+1)+ " , coloana 2 " + currentColumns.get(1).getText());
            }
        }

    }



   public static void updateTable(ChromeDriver driver){

       WebElement summary = driver.findElement(By.cssSelector("details summary"));
       summary.click();

       //UPDATE CAPTION
       WebElement caption = driver.findElement(By.id("caption"));
       caption.clear();
       caption.sendKeys("text introdus la lectie");
       //UPDATE TABLE ID
       WebElement tableId = driver.findElement(By.id("tableid"));
       tableId.clear();
       tableId.sendKeys("customId");

      // update Table Content
       WebElement jsonData =driver.findElement(By.cssSelector("textarea#jsondata"));
       jsonData.clear();
       jsonData.sendKeys("[{\"name\" : \"Bob\", \"age\" : 20}, {\"name\": \"George\", \"age\" : 42},{\"name\": \"Alina\", \"age\" : 50},{\"name\": \"Grigore\", \"age\" : 20},{\"name\": \"Mada\", \"age\" : 31}]");
       System.out.println(jsonData.getAttribute("value"));

       //Press Refresh Button
       WebElement RefreshTableButton= driver.findElement(By.id("refreshtable"));
       RefreshTableButton.click();


   }



}




