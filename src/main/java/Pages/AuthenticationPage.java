package Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtils;
import utils.Driver;

public class AuthenticationPage extends Driver {
    private Logger logger;
    @FindBy(xpath = "//input[@id='email']")
    WebElement txtemailadd;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement txtpassword;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    WebElement btnsignin;


    public AuthenticationPage()
    {
        objcommonutils = new CommonUtils();

        logger =Logger.getLogger(this.getClass());
        PageFactory.initElements(driver,this);
    }

    //enter email address
    public void enterEmailAdd(String email)
    {
        objcommonutils.enterText(txtemailadd,email);
        logger.info("user entered email id");
    }

    //enter Password
    public void enterPassword(String password)
    {
        objcommonutils.enterText(txtpassword,password);
        logger.info("user entered password");
    }

    //click on Sign In Button
    public void clickSignInBtn()
    {
        objcommonutils.clickElement(btnsignin);
        logger.info("user clicked on signIn button");
    }
}
