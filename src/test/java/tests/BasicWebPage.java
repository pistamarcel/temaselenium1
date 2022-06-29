package tests;

import driver.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebPage {



    public static ChromeDriver getPageBasic(){
        ChromeDriver driver= WebDriverManager.createChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/basic-web-page-test.html");
        return driver;
    }
    public static void getBasicPageDetails(ChromeDriver driver){
        // .explanation em:first-child is also enough
        WebElement firstem= driver.findElement(By.cssSelector("div.explanation p em:first-child"));
        System.out.println("First em is : " +firstem.getText());
        WebElement lastem= driver.findElement(By.cssSelector("div.explanation p em:last-child"));
        System.out.println("Last em is : " +lastem.getText());
        WebElement firstem2=driver.findElement(By.cssSelector("div.explanation p em:nth-child(1)"));
        System.out.println("First em2  is : " +firstem2.getText());

        // id should be unique on a page, seelcting only by id should've been enough
        // but for practice, nice x-path selector
        WebElement para1=driver.findElement(By.xpath("//div[@class=\"centered\"]//p[@class=\"main\" and @id=\"para1\"]"));
        System.out.println(para1.getText());
        WebElement para2=driver.findElement(By.xpath("//div[@class=\"centered\"]//p[@class=\"sub\" and @id=\"para2\"]"));
        System.out.println(para2.getText());

        WebElement footerlink=driver.findElement(By.cssSelector("div.page-footer p a[href*=\"com\"]"));
        System.out.println(footerlink.getText());
        footerlink.click();
    }



}
