package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BaseClass {

    public HomePage(WebDriver driver) {
        super( driver );
    }

    @FindBy(css = "body > header > h1 > a ")
    @CacheLookup
    public static WebElement header;

    @FindBy(id = "add")
    public static WebElement addComputer;

    @FindBy(xpath = "//*[@id=\"pagination\"]/ul/li[3]")
    public static WebElement nextPageBtnState;

    @FindBy(xpath = "//*[@id=\"pagination\"]/ul/li[3]/a")
    public static WebElement nextBtn;

    @FindBy(xpath = "//*[@id=\"pagination\"]/ul/li[1]/a")
    public static WebElement prevBtn;

    @FindBy(xpath = "//*[@id=\"pagination\"]/ul/li[1]")
    public static WebElement prevPageBtnState;

    @FindBy(id = "searchsubmit")
    @CacheLookup
    public static WebElement filterByName;

    @FindBy(xpath = "//*[@id=\"main\"]/div[1]")
    public static WebElement warningmsg;

    @FindBy(id = "searchbox")
    @CacheLookup
    public static WebElement searchbox;

    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/em")
    public static WebElement nothingToDisplaymsg;


    @FindBy(xpath = "//*[@id=\"main\"]/table/tbody/tr[1]/td[1]/a")
    @CacheLookup
    public static WebElement firstElement;
}
