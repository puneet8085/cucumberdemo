package Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonUtils;
import utils.Driver;

import java.util.WeakHashMap;

public class PersonalInfoPage extends Driver {

    private Logger logger;
    public static String fname;
    public static String lname;

    @FindBy(xpath = "//input[@id='firstname']")
    WebElement txtfirstname;

    @FindBy(xpath = "//input[@id='old_passwd']")
    WebElement txtoldpassword;

    @FindBy(xpath ="//input[@id='lastname']")
    WebElement txtlastname;

    @FindBy(xpath = "//button[@name='submitIdentity']")
    WebElement btnsave;

    public PersonalInfoPage()
    {
        objcommonutils= new CommonUtils();

        logger =Logger.getLogger(this.getClass());
        PageFactory.initElements(driver,this);

    }
    //enter details
    public void enterDetails(String fname, String password)
    {
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(txtoldpassword));
        objcommonutils.enterText(txtfirstname,fname);
       fname= txtfirstname.getAttribute("value");
       lname=txtlastname.getAttribute("value");
        objcommonutils.enterText(txtoldpassword,password);
        logger.info("user enter first name and password");

    }

    //click on Save button
    public void clickSave()
    {
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(btnsave));
        objcommonutils.clickElement(btnsave);
        logger.info("User clicked on save button");
    }
}
