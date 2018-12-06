package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class CreateComputerPage extends BaseClass {

    public CreateComputerPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "body > header > h1 > a ")
    @CacheLookup
    public static WebElement header;

    @FindBy(css = "a.btn")
    @CacheLookup
    public static WebElement cancel;

    @FindBy(id = "company")
    @CacheLookup
    public static WebElement company;

    @FindBy(id ="name")
    @CacheLookup
    public static WebElement computerName;

    @FindBy(css = "input.btn.primary")
    @CacheLookup
    public static WebElement createThisComputer;

    @FindBy(id ="discontinued")
    @CacheLookup
    public static WebElement discontinuedDate;

    @FindBy(id = "introduced")
    @CacheLookup
    public static WebElement introducedDate;

    @FindBy(xpath = "//*[@id=\"main\"]/form/fieldset/div[1]")
    @CacheLookup
    public static WebElement computerNameerr;

    @FindBy(xpath = "//*[@id=\"main\"]/form/fieldset/div[2]")
    @CacheLookup
    public static WebElement introducedDateerr;

    @FindBy(xpath = "//*[@id=\"main\"]/form/fieldset/div[3]")
    @CacheLookup
    public static WebElement DisintroducedDateerr;

    @FindBy(xpath = "//*[@id=\"company\"]/option")
    @CacheLookup
    public static List<WebElement> options;



    public static String pageLoadedTest = "Play sample application - Computer database" ;

    public static String pageUrl = "/computers/new" ;



}
