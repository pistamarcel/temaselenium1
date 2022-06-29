package tests;

import driver.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsFindByPlayGround {

    public static ChromeDriver getFindByPlayGroundPage() {
        ChromeDriver driver = WebDriverManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/find-by-playground-test.html#pName24");
        return driver;
    }

    public static void getFindByPlayGroundDetails(ChromeDriver driver) {
        WebElement paragraph = driver.findElement(By.cssSelector("div.specialDiv p#p9 a#a9"));
        System.out.println("Paragraful 9 este: " + paragraph.getText());

        // div div div div div p#p29 is not ok, one should avoid writing CSS selectors replicating DOM structure,
        // because they are very unstable
        WebElement nested = driver.findElement(By.cssSelector("#div5 #p29"));
        System.out.println("Al patrulea nested element este: " + nested.getText());

        //Randuri de link-uri spre paragrafe
        List<WebElement> linkRows= driver.findElements(By.cssSelector("div.linkDiv ul#ul1 li"));

        for(int i=0; i<linkRows.size();i++){
            WebElement currentRow = linkRows.get(i);
            if(i==0) {
                System.out.println("Broken link: " + currentRow.getText());
                System.out.println("");
            }else {
                System.out.println("Link pentru al "  + (i+1) +" paragraf: " + currentRow.getText());
                System.out.println("");

            }


        }

    }



}
