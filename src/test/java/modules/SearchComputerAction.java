package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pageobjects.HomePage;
import pageobjects.SearchPage;

import java.util.concurrent.ThreadLocalRandom;

import static org.testng.AssertJUnit.assertEquals;

public class SearchComputerAction {

    public static String firstElementText;

    public static void goto_website_with_valid_srch_results(WebDriver driver) throws Exception{

        //String urlGeneratedWithValidPageNr;

        JavascriptExecutor js = (JavascriptExecutor)driver;
        String sText = ((JavascriptExecutor) driver).executeScript("return arguments[0].innerHTML;",driver.findElement( By.xpath("//*[@id=\"main\"]/h1"))).toString();

        //Retrieve no of computers
        String result[] = sText.split(" ");
        String returnValue = result[result.length - 3];
        int resultn = Integer.parseInt(returnValue);

        //Number of Pages
        int NoOfPages = resultn / 10 ;

        // Generate a random number with in range
        int randnMumber = ThreadLocalRandom.current().nextInt(0, NoOfPages);

        // Selecting random value
        String currentURL = driver.getCurrentUrl() ;
        String urlGeneratedWithValidPageNr =  currentURL + "?p" + randnMumber;


        driver.get(urlGeneratedWithValidPageNr);
    }

    public static String retrieve_first_element_from_list(WebDriver driver) throws Exception {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String firstElementText = ((JavascriptExecutor) driver).executeScript( "return arguments[0].innerHTML;", driver.findElement( By.xpath( "//*[@id=\"main\"]/table/tbody/tr[1]/td[1]/a" ) ) ).toString();
        return firstElementText;
    }

    public static void click_element_retrieved(WebDriver driver) throws Exception {
        HomePage.firstElement.click();
    }

    public static void verify_computer_name(WebDriver driver) throws Exception {
        assertEquals("Not the same computer name as searched",CreateComputerAction.computerNameValue,firstElementText);
    }
}
