package utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Driver {

    public  static WebDriver driver;
    public static CommonUtils objcommonutils;
    private Logger logger =Logger.getLogger(this.getClass());


    //initialise a instance of required browser
    public void initializeBrowser() throws Exception {
        if(driver==null)
        {
            driver= DriverFactory.getDriver();
            driver.manage().window().maximize();
            logger.info("Browser Opened Successfully");

        }

    }

    //close the driver instance
    public WebDriver closeDriver() throws Exception {
        ScreenshotLib.screenShot();
        DriverFactory.closeDriver(driver);
        return driver=null;
    }
}
