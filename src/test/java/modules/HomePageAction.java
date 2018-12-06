package modules;


import helpers.Log;
import org.openqa.selenium.WebDriver;
import pageobjects.CreateComputerPage;
import pageobjects.HomePage;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class HomePageAction {

    public static String alertMessage;

    //Verify header, title and URL
    public static void verifyTitleUrlHeader(WebDriver driver) throws Exception{
        assertEquals("Computers database",driver.getTitle());
        assertEquals("http://computer-database.herokuapp.com/computers",driver.getCurrentUrl());
        assertEquals("Play sample application — Computer database", HomePage.header.getText());
    }

    //Verify state of UI buttons
    public static void verifyNextBtnEnabled(WebDriver driver) throws Exception{
        assertFalse("nextPageBtn Not Enabled",HomePage.nextPageBtnState.getAttribute( "class" ).contains("disabled"  ));
    }

    public static void verifyNexttBtnDisabled(WebDriver driver) throws Exception{
        assertTrue("nextPageBtn is not disabled",HomePage.nextPageBtnState.getAttribute( "class" ).contains( "disabled" ));
    }

    public static void verifyPrevtBtnDisabled(WebDriver driver) throws Exception{
        assertTrue("prevPageBtn is not disabled",HomePage.prevPageBtnState.getAttribute( "class" ).contains( "disabled" ));
    }

    public static void verifyAddComputerBtn(WebDriver driver) throws Exception{
        assertTrue("Add a computer button is not Enabled",HomePage.addComputer.isEnabled());

    }

    public static void verifyFilterByNameBtn(WebDriver driver) throws Exception{
        assertTrue("Filter button is not enabled",HomePage.filterByName.isEnabled());
    }

    public static void GotoNextPage(WebDriver driver) throws Exception {
        HomePage.nextBtn.click();
    }

    public static void verifyPrevtBtnEnabled(WebDriver driver) throws Exception{
        assertFalse("prevPageBtn is enabled ",HomePage.prevPageBtnState.getAttribute( "class" ).contains( "disabled" ));
    }

    public static void  addAComputer(WebDriver driver) throws Exception{
        HomePage.addComputer.click();
    }

    public static void verifyAlertmessage(String computername){

        System.out.println("computername" + computername);
        alertMessage = HomePage.warningmsg.getText();
        assertTrue(alertMessage.contains(computername));
        assertTrue("Computer has been created message is not displayed", HomePage.warningmsg.isDisplayed());
        alertMessage = HomePage.warningmsg.getText();

    }

    public static void  scroll_till_end_of_list(WebDriver driver){

        do {
            HomePage.nextBtn.click();
        } while (HomePage.nextPageBtnState.getAttribute( "class" ).endsWith( "next" ));

    }

    public static void enter_computer_name_to_search(String computername)
    {
        HomePage.searchbox.sendKeys(computername);
    }

    public static void click_search_btn()
    {
        HomePage.filterByName.click();
    }

    public static void verify_nothing_to_display_msg()
    {
        assertEquals("On searching non-existing computer name,nothing to display message is not displayed",
                HomePage.nothingToDisplaymsg.getText(),"Nothing to display");
    }

}
