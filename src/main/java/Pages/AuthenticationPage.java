package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtils;
import utils.Driver;

public class AuthenticationPage extends Driver {
    @FindBy(xpath = "//input[@id='email']")
    WebElement txtemailadd;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement txtpassword;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    WebElement btnsignin;


    public AuthenticationPage()
    {
        objcommonutils = new CommonUtils();
        PageFactory.initElements(driver,this);
    }

    //enter email address
    public void enterEmailAdd(String email)
    {
        objcommonutils.enterText(txtemailadd,email);
    }

    //enter Password
    public void enterPassword(String password)
    {
        objcommonutils.enterText(txtpassword,password);

    }

    //click on Sign In Button
    public void clickSignInBtn()
    {
        objcommonutils.clickElement(btnsignin);

    }
}
