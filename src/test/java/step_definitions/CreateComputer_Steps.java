package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import helpers.DateGenerator;
import modules.CreateComputerAction;
import modules.HomePageAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.CreateComputerPage;

import java.util.Properties;

import static org.testng.AssertJUnit.assertEquals;

public class CreateComputer_Steps {

    public WebDriver driver;
    public Properties prop;
    public CreateComputer_Steps characs;
    public CreateComputer_Steps date;


    public CreateComputer_Steps() {
        driver = Hooks.driver;
        prop = Hooks.prop;
    }

    @Given("^I validate title header and URL on Create Computer Page$")
    public void verify_title_and_URL() throws Throwable {
        PageFactory.initElements( driver, pageobjects.CreateComputerPage.class );
        CreateComputerAction.verifyTitleUrlHeader( driver );
    }
    //
    @Then("^I verify the state of all UI Buttons on Create Computer Page$")
    public void srch_computer_details() throws Throwable {
        PageFactory.initElements( driver, pageobjects.CreateComputerPage.class );
        CreateComputerAction.verifyUIBtns( driver );
    }
    //
    @Given("^I click on \"([^\"]*)\" this computer button$")
    public void click_computer_btn(String btnname) throws Throwable {
        PageFactory.initElements( driver, pageobjects.CreateComputerPage.class );
        CreateComputerAction.createComputer( driver );
    }
    //
    @And("^I verify computer has been created statement is displayed in red color$")
    public void verify_error_msg() throws Throwable {
        PageFactory.initElements( driver, pageobjects.CreateComputerPage.class );
        CreateComputerAction.verifyerrormsg( driver );
    }

    @And("^I enter into computer name textbox on \"([^\"]*)\" computer Page$")
    public void set_computer_name(String screenname) throws Throwable {
        PageFactory.initElements( driver, pageobjects.CreateComputerPage.class );
        CreateComputerAction.setComputerNameTextField(LandingPage_Steps.computername);
    }

    @And("^I enter invalid ([^\"]*) entries in Introduced date field$")
    public void enter_date_Introduced(String date) throws Throwable {
        PageFactory.initElements( driver, pageobjects.CreateComputerPage.class );
        CreateComputerAction.setIntroducedDateField(date);
    }

    @And("^I enter invalid ([^\"]*) entries in Discontinued date field$")
    public void enter_date_Discontinued(String date) throws Throwable {
        PageFactory.initElements( driver, pageobjects.CreateComputerPage.class );
        CreateComputerAction.setDiscontinuedDateField(date);
    }

    @And("^I verify error message is displayed in red color for Introduced Date$")
    public void verify_date_errmsg_introduceddate() throws Throwable {
        PageFactory.initElements( driver, pageobjects.CreateComputerPage.class );
        CreateComputerAction.verify_date_errmsg_introducedDate();
    }

    @And("^I verify error message is displayed in red color for DisIntroduced Date$")
    public void verify_date_errmsg_disintroduceddate() throws Throwable {
        PageFactory.initElements( driver, pageobjects.CreateComputerPage.class );
        CreateComputerAction.verify_date_errmsg_disIntroducedDate();
    }

    @And("^I enter randomly generated valid date in Introduced date field$")
    public void enter_introduced_date() throws Throwable {
        PageFactory.initElements( driver, pageobjects.CreateComputerPage.class );
        DateGenerator date = new DateGenerator();
        System.out.println("Date in Stps:" + date.getRandomGeneratedDate());
        CreateComputerAction.setIntroducedDateField(date.getRandomGeneratedDate());
    }

    @And("^I enter randomly generated valid date in Discontinued date field$")
    public void enter_disintroduced_date() throws Throwable {
        PageFactory.initElements( driver, pageobjects.CreateComputerPage.class );
        DateGenerator date = new DateGenerator();
        System.out.println("Date in Stps:" + date.getRandomGeneratedDate());
        CreateComputerAction.setDiscontinuedDateField(date.getRandomGeneratedDate());
    }

    @And("^I select random Company$")
    public void select_random_company() throws Throwable {
        PageFactory.initElements( driver, pageobjects.CreateComputerPage.class );
        CreateComputerAction.select_random_company();
    }



}
