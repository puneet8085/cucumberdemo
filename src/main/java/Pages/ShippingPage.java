package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonUtils;
import utils.Driver;

public class ShippingPage extends Driver {

    @FindBy(xpath = "//button[@class='button btn btn-default standard-checkout button-medium']/span[1]")
    WebElement btnproceedtocheckout;

    @FindBy(xpath = "//input[@id='cgv']")
    WebElement termschk;

    public ShippingPage()
    {
        objcommonutils= new CommonUtils();
        PageFactory.initElements(driver,this);
        objcommonutils.waitForPageLoad(driver);
    }

    //select checkbox
    public void selectCheckbox() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", termschk);
    }

    //click on proceed to checkout
    public void clickProceedBtn()
    {
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(btnproceedtocheckout));
        objcommonutils.clickElement(btnproceedtocheckout);
    }
}
