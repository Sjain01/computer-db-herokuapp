package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en_tx.Andyall;
import helpers.DataGenerator;
import modules.CreateComputerAction;
import modules.HomePageAction;
import modules.SearchComputerAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.HomePage;


import java.util.Properties;

public class LandingPage_Steps {

    public WebDriver driver;
    public Properties prop;
    public static String computername;
    public static String firstElementcomputername;

    public LandingPage_Steps()
    {
        driver = Hooks.driver;
        prop = Hooks.prop;
    }

    @Given("^I navigate to computer database herokuapp website$")
    public void open_computer_database_herokuapp() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get(prop.getProperty("url"));

    }

    @Given("^I validate title header and URL$")
    public void verify_title_and_URL() throws Throwable {
        PageFactory.initElements(driver, pageobjects.HomePage.class);
        HomePageAction.verifyTitleUrlHeader(driver);
    }
    //
    @Then("^I verify that Add Computer button is enabled$")
    public void verify_add_computer_btn() throws Throwable {
        PageFactory.initElements(driver, pageobjects.HomePage.class);
        HomePageAction.verifyAddComputerBtn(driver);
    }

    @And("^I verify that Filter By name button is enabled$")
    public void verify_Filter_by_name_btn() throws Throwable {
        PageFactory.initElements(driver, pageobjects.HomePage.class);
        HomePageAction.verifyFilterByNameBtn(driver);
    }

    @Given("^I verify that Previous button is disabled$")
    public void verify_Prev_btn_disabled() throws Throwable {
        PageFactory.initElements(driver, pageobjects.HomePage.class);
        HomePageAction.verifyPrevtBtnDisabled(driver);
    }

    @And("^I verify that Next button is enabled$")
    public void verify_Next_btn() throws Throwable {
        PageFactory.initElements(driver, pageobjects.HomePage.class);
        HomePageAction.verifyNextBtnEnabled(driver);
    }

    @Then("^I scroll to next Page by clicking on Next button$")
    public void goto_next_pg() throws Throwable {
        PageFactory.initElements(driver, pageobjects.HomePage.class);
        HomePageAction.GotoNextPage(driver);
    }

    @Then("^I scroll to the end of the list by clicking Next button$")
    public void scroll_till_end_of_list() throws Throwable {
        PageFactory.initElements(driver, pageobjects.HomePage.class);
        HomePageAction.scroll_till_end_of_list(driver);
    }

    @And("^I verify if Next button becomes disabled$")
    public void verify_Next_btn_disabled() throws Throwable {
        PageFactory.initElements(driver, pageobjects.HomePage.class);
        HomePageAction.verifyNexttBtnDisabled(driver);
    }

    @And("^I verify that Previous button is enabled$")
    public void verify_Prev_btn_enabled() throws Throwable {
        PageFactory.initElements(driver, pageobjects.HomePage.class);
        HomePageAction.verifyPrevtBtnEnabled(driver);
    }

    @And("^I click on Add a new computer button$")
    public void add_a_computer() throws Throwable {
        PageFactory.initElements(driver, pageobjects.HomePage.class);
        HomePageAction.addAComputer(driver);
    }

    @And("^I verify computer has been created statement is displayed$")
    public void verify_alert_msg() throws Throwable {
        PageFactory.initElements(driver, pageobjects.HomePage.class);
        HomePageAction.verifyAlertmessage(computername);
    }

    @Given("^I enter computer name in Filter by name textbox$")
    public void enter_computer_name_to_search() throws Throwable {
        PageFactory.initElements(driver, pageobjects.HomePage.class);
        System.out.println(computername);
        HomePageAction.enter_computer_name_to_search(computername);

    }

    @Given("^I create computer name having (\\d+) characters$")
    public void enter_noOf_characs(int characs) throws Throwable {
        DataGenerator randomdata = new DataGenerator();
        randomdata.setRandomGeneratedString(characs);
        computername = randomdata.getRandomGeneratedString();
    }

    @And("^I click on FilterByName button$")
    public void click_search_btn() throws Throwable {
        PageFactory.initElements(driver, pageobjects.HomePage.class);
        HomePageAction.click_search_btn();
    }

    @And("^I verify message displayed on Home Page$")
    public void verify_nothing_to_display_msg() throws Throwable {
        PageFactory.initElements(driver, pageobjects.HomePage.class);
        HomePageAction.verify_nothing_to_display_msg();

    }

    @Given("^I go to website with valid search results$")
    public void goto_website_with_valid_srch_results() throws Throwable {
        SearchComputerAction.goto_website_with_valid_srch_results(driver);
    }

    @Given("^I retrieve the first element present in the list$")
    public void retrieve_first_element_from_list() throws Throwable {
        computername =(SearchComputerAction.retrieve_first_element_from_list(driver ));

    }

    @Then("^I click on element retrieved$")
    public void click_element_retrieved() throws Throwable {
        SearchComputerAction.click_element_retrieved(driver);


    }

    @And("^I verify if the same computer name entered in filterbox has been displayed$")
    public void verify_computer_name() throws Throwable {
        SearchComputerAction.verify_computer_name(driver);
    }
}


