package utils;

import org.openqa.selenium.WebDriver;

public class Driver {

    public  static WebDriver driver;
    public static CommonUtils objcommonutils;


    //initialise a instance of required browser
    public void initializeBrowser() throws Exception {
        if(driver==null)
        {
            driver= DriverFactory.getDriver();
            driver.manage().window().maximize();

        }

    }

    //close the driver instance
    public WebDriver closeDriver() throws Exception {
        DriverFactory.closeDriver(driver);
        return driver=null;
    }
}
