package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.EditComputerPage;
import pageobjects.HomePage;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class EditComputerAction {

    public static void verify_edit_screen(WebDriver driver) throws Exception{
        assertEquals("Edit computer message must be displayed on the screen",
                EditComputerPage.retrieve_text(driver),"Edit computer");

    }

    public static void click_on_delete_computer_btn(WebDriver driver) throws Exception{
        synchronized (driver) {
            driver.wait(3000);
        }
        EditComputerPage.deleteComputer.click();
    }

    public static void verify_computer_deleted_msg(WebDriver driver) throws Exception {
        assertTrue( "Computer has been deleted message is not displayed",EditComputerPage.deleteComputermsg.isDisplayed() );
    }
}

