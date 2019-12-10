package Pages;

import cucumber.runtime.io.DelegatingResourceIteratorFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonUtils;
import utils.Driver;

public class CartSummaryPage extends Driver {

    @FindBy(xpath = "//p[@class='cart_navigation clearfix']/a[1]")
    WebElement btnproceedtocheckout;

    public  CartSummaryPage()
    {
        objcommonutils= new CommonUtils();
        PageFactory.initElements(driver,this);
    }

    //click on proceed to checkout
    public void clickProceedBtn()
    {
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(btnproceedtocheckout));
        objcommonutils.clickElement(btnproceedtocheckout);
    }
}
