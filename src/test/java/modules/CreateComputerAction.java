package modules;

import java.util.concurrent.ThreadLocalRandom;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.CreateComputerPage;
import pageobjects.HomePage;
import step_definitions.CreateComputer_Steps;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;
import java.util.concurrent.TimeUnit;
import java.util.List;


public class CreateComputerAction {

    public static String computerNameValue;
//    public static int computerNameLength;
//    public static int finalComputerNameLength;

    //Verify header, title and URL
    public static void verifyTitleUrlHeader(WebDriver driver) throws Exception{
        synchronized (driver) {
            driver.wait(3000);
        }
        assertEquals("Computers database",driver.getTitle());
        assertEquals("http://computer-database.herokuapp.com/computers/new",driver.getCurrentUrl());
        assertEquals("Play sample application — Computer database", CreateComputerPage.header.getText());
    }

    //Verify state of UI buttons
    public static void verifyUIBtns(WebDriver driver) throws Exception{
        assertTrue("Cancel Btn Not Enabled",CreateComputerPage.cancel.isEnabled());
        assertTrue("Create this Computer Btn not enabled",CreateComputerPage.createThisComputer.isEnabled());
    }

    //create Computer
    public static void createComputer(WebDriver driver) throws Exception{

        CreateComputerPage.createThisComputer.click();
    }

    public static void verifyerrormsg(WebDriver driver) throws Exception{
        assertEquals( "Error messge is not marked with red color","rgba(250, 229, 227, 1)",CreateComputerPage.computerNameerr.getCssValue( "background-color" ));
    }

    public static void setComputerNameTextField(String computerNameValue)
    {

        CreateComputerPage.computerName.clear();
        CreateComputerPage.computerName.sendKeys(computerNameValue);
    }

    public static void setIntroducedDateField(String dateField)
    {

        CreateComputerPage.introducedDate.clear();
        CreateComputerPage.introducedDate.sendKeys(dateField);

    }

    public static void setDiscontinuedDateField(String dateField)
    {

        CreateComputerPage.discontinuedDate.clear();
        CreateComputerPage.discontinuedDate.sendKeys(dateField);

    }


    public static void verify_date_errmsg_introducedDate()
    {

        assertEquals( "Error messge is not marked with red color","rgba(250, 229, 227, 1)",CreateComputerPage.introducedDateerr.getCssValue( "background-color" ));
    }

    public static void verify_date_errmsg_disIntroducedDate()
    {

        assertEquals( "Error messge is not marked with red color","rgba(250, 229, 227, 1)",CreateComputerPage.DisintroducedDateerr.getCssValue( "background-color" ));
    }


    public static void select_random_company()
    {

        List<WebElement> Options = CreateComputerPage.options;
        int noOfOptions = Options.size();

        // Getting size of options available
        System.out.println("size" + noOfOptions);

        // Generate a random number with in range
        int randnMumber = ThreadLocalRandom.current().nextInt(0, noOfOptions);


        // Selecting random value
        Options.get(randnMumber).click();




    }


}
