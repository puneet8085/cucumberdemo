package Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonUtils;
import utils.Driver;

public class OrderSummaryPage extends Driver {

    private Logger logger;
    public static String Orderid;
    @FindBy(xpath = "//span[contains(text(),'I confirm my order')]")
    WebElement btnconfirmorder;

    @FindBy(xpath = "//div[@class='box order-confirmation']")
    WebElement orderid;


    public OrderSummaryPage()
    {
        objcommonutils = new CommonUtils();

        logger =Logger.getLogger(this.getClass());
        PageFactory.initElements(driver,this);
    }

    //get orderid from text
    public void getOrderID()
    {
        Orderid=orderid.getText();
        Orderid = Orderid.substring(146,(Orderid.length()-214));
        logger.info("order id fetched successfully");
    }
    //click on confirm my order
    public void ClickConfirmOrderBtn()
    {
        new WebDriverWait(driver,15).until(ExpectedConditions.visibilityOf(btnconfirmorder));
        objcommonutils.clickElement(btnconfirmorder);
        logger.info("user clicked on confirm order button");
    }
}
