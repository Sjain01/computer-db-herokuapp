package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.ThreadLocalRandom;

public class SearchPage extends BaseClass{

    public SearchPage(WebDriver driver) {
        super( driver );
    }

    //String urlGeneratedWithValidPageNr;

    JavascriptExecutor js = (JavascriptExecutor)driver;
    public static String sText = ((JavascriptExecutor) driver).executeScript("return arguments[0].innerHTML;",driver.findElement( By.xpath("//*[@id=\"main\"]/h1"))).toString();

    //Retrieve no of computers
    public static String result[] = sText.split(" ");
    public static String returnValue = result[result.length - 3];
    public static int resultn = Integer.parseInt(returnValue);

    //Number of Pages
    public static int NoOfPages = resultn / 10 ;

    // Generate a random number with in range
    public static int randnMumber = ThreadLocalRandom.current().nextInt(0, NoOfPages);

    // Selecting random value
    public static String currentURL = driver.getCurrentUrl() ;
    public static String urlGeneratedWithValidPageNr =  currentURL + "?p" + randnMumber;


}
