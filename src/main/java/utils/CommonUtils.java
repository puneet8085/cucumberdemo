package utils;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.ws.wsaddressing.W3CEndpointReference;

public class CommonUtils extends Driver {

    public CommonUtils()
    {

    }

    //click on element
    public void clickElement(WebElement element)
    {
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    //enter text in a WebElement
    public void enterText(WebElement element,String text)
    {
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(element));
        if(element.isEnabled())
        {
            element.click();
            element.sendKeys(Keys.CONTROL + "a");
            element.sendKeys(Keys.DELETE);
            element.sendKeys(text);
        }
    }

    //Wait for page load
    public static void waitForPageLoad(WebDriver driver)
    {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {

            public Boolean apply(@NullableDecl WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document ready state").equals("complete");
            }
        };
        Wait<WebDriver> wait = new WebDriverWait(driver,30);
        try
        {
            wait.until(expectation);
        }
        catch (Throwable error)
        {
            error.printStackTrace();
        }
    }


    //select checkbox
    public void selectCheckbox(WebElement element)
    {
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(element));
            element.click();
        }



}
