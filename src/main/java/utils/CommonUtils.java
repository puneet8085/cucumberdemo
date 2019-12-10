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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class CommonUtils extends Driver {

    public CommonUtils()
    {

    }

    //click on element
    public void clickElement(WebElement element)
    {
        element.click();
    }

    //enter text in a WebElement
    public void enterText(WebElement element,String text)
    {
        if(element.isEnabled())
        {
            element.click();
            element.sendKeys(Keys.CONTROL + "a");
            element.sendKeys(Keys.DELETE);
            element.sendKeys(text);
        }
    }

    //get current date time with seconds
    public final static String getDateTimeWithSec()
    {
        DateFormat df= new SimpleDateFormat("yyyy-MM-dd_hh_mm_ss_S");
        df.setTimeZone(TimeZone.getTimeZone("GNT"));
        return df.format(new Date());
    }

    //select checkbox
    public void selectCheckbox(WebElement element)
    {
            element.click();
        }



}
