package Pages;

import org.apache.poi.ss.usermodel.Table;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonUtils;
import utils.Driver;

import java.util.WeakHashMap;

public class PersonalInfoPage extends Driver {

    @FindBy(xpath = "//input[@id='firstname']")
    WebElement txtfirstname;

    @FindBy(xpath = "//input[@id='old_passwd']")
    WebElement txtoldpassword;

@FindBy(xpath = "//button[@name='submitIdentity']")
WebElement btnsave;

    public PersonalInfoPage()
    {
        objcommonutils= new CommonUtils();
        PageFactory.initElements(driver,this);
       // objcommonutils.waitForPageLoad(driver);
    }
public static String fname;
    //enter details
    public void enterDetails(String fname, String password)
    {
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(txtoldpassword));
        objcommonutils.enterText(txtfirstname,fname);
       fname= txtfirstname.getAttribute("value");

        objcommonutils.enterText(txtoldpassword,password);

    }

    //click on Save button
    public void clickSave()
    {
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(btnsave));
        objcommonutils.clickElement(btnsave);
    }
}
