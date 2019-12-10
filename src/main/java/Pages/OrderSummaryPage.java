package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonUtils;
import utils.Driver;

public class OrderSummaryPage extends Driver {

    @FindBy(xpath = "//span[contains(text(),'I confirm my order')]")
    WebElement btnconfirmorder;


    public OrderSummaryPage()
    {
        objcommonutils = new CommonUtils();
        PageFactory.initElements(driver,this);
    }

    //click on confirm my order
    public void ClickConfirmOrderBtn()
    {
        new WebDriverWait(driver,15).until(ExpectedConditions.visibilityOf(btnconfirmorder));
        objcommonutils.clickElement(btnconfirmorder);
    }
}
