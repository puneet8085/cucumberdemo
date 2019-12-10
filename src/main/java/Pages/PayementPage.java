package Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonUtils;
import utils.Driver;

public class PayementPage extends Driver {
    private Logger logger;

    @FindBy(xpath = "//a[@title = 'Pay by check.']")
    WebElement paybycheckbtn;

    public PayementPage()
    {
        objcommonutils= new CommonUtils();

        logger =Logger.getLogger(this.getClass());
        PageFactory.initElements(driver,this);
    }

    //click on pay by check
    public void clickPayByCheck()
    {
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(paybycheckbtn));
        objcommonutils.clickElement(paybycheckbtn);
        logger.info("User clicked pay by check option");
    }
}
