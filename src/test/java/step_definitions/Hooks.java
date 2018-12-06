package step_definitions;

import java.net.MalformedURLException;

import helpers.TimeoutUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks{
    public static WebDriver driver;
    public static Properties prop;

    public Hooks(){
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("C:\\Users\\Shweta\\Git Projects\\backbase-qa\\"
                    + "src\\test\\java\\helpers\\config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Before
    /**
     * Delete all cookies at the start of each scenario to avoid
     * shared state between tests
     */

    public static void initialization(){
        String browserName = prop.getProperty("browser");
        System.out.println(browserName);

        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shweta\\Drivers\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browserName.equals("FF")){
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shweta\\Drivers\\GeckoDriver\\geckodriver-v0.23.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TimeoutUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TimeoutUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

    }

    @After
    /**
     * Embed a screenshot in test report if test is marked as failed
     */
    public void embedScreenshot(Scenario scenario) {
       
        if(scenario.isFailed()) {
        try {
        	 scenario.write("Current Page URL is " + driver.getCurrentUrl());
//            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        }
        
        }
        driver.quit();
        
    }
    
}