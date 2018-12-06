package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import modules.CreateComputerAction;
import modules.EditComputerAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EditComputer_Steps {

    public WebDriver driver;

    public EditComputer_Steps() {
        driver = Hooks.driver;

    }

    @And("^Edit computer text is displayed on the screen$")
    public void verify_edit_screen() throws Throwable {
        PageFactory.initElements( driver, pageobjects.EditComputerPage.class );
        EditComputerAction.verify_edit_screen( driver );
    }

    @And("^I click Delete this computer button$")
    public void click_on_delete_computer_btn() throws Throwable{
        PageFactory.initElements( driver, pageobjects.EditComputerPage.class );
        EditComputerAction.click_on_delete_computer_btn( driver );
    }

    @And("^I verify computer has been deleted statement is displayed$")
    public void verify_computer_deleted_msg() throws Throwable{
        PageFactory.initElements( driver, pageobjects.EditComputerPage.class );
        EditComputerAction.verify_computer_deleted_msg( driver );
    }
}
