package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class EditComputerPage extends BaseClass {

    public static String editComputerText;

    public EditComputerPage(WebDriver driver){
        super(driver);}

        public static String retrieve_text(WebDriver driver) throws Exception {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            String editComputerText = ((JavascriptExecutor) driver).executeScript( "return arguments[0].innerHTML;", driver.findElement( By.xpath( "//*[@id='main']/h1" ) ) ).toString();
            System.out.println(editComputerText);
            return editComputerText;

    }

    @FindBy(css = "#main > form.topRight > input")
    @CacheLookup
    public static WebElement deleteComputer;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]")
    @CacheLookup
    public static WebElement deleteComputermsg;
}
