package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

    public static WebDriver getDriver() throws Exception {
      String Browser=  ReadProperties.readProperties("Browser");

        if ("IE".equals(Browser)) {
            System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
            return new InternetExplorerDriver();
        } else if ("Chrome".equals(Browser)) {
            System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
            return new ChromeDriver();
        }
        System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
        return new FirefoxDriver();
    }

    public static void closeDriver(WebDriver driver) throws Exception {
        driver.quit();
    }
        }
