package Pages;

import org.apache.commons.math3.analysis.function.Exp;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonUtils;
import utils.Driver;

public class HomePage extends Driver {

    @FindBy(xpath = "//a[@class='login'][contains(text(),'Sign in')]")
    WebElement linksignin;

    @FindBy(xpath = "//div[@id='block_top_menu']/ul[1]/li[3]")
    WebElement menutshirt;

    @FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
    WebElement tshirtimage;

    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement btnaddcart;

    @FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
    WebElement btnproceedtocheckout;

    @FindBy(xpath = "//a[@title='My orders']")
    WebElement linkmyorders;
    @FindBy(xpath = "//a[@title= 'Manage my personal information']")
    WebElement linkmypersonalinfo;

    @FindBy(xpath = "//a[@title= 'View my customer account']/span[1]")
    WebElement username;


    public  HomePage()
    {
        objcommonutils= new CommonUtils();
        PageFactory.initElements(driver,this);
    }
//click on my personal info link
    public void clickMyPersonalInfo()

    {
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(linkmypersonalinfo));
        objcommonutils.clickElement(linkmypersonalinfo);
    }

    //verify updated first name
    public void verifyFirstName()
    {
        if(username.getText().contains("Tester"))
        {
            System.out.println("First Name Updated Successfully");
        }
        else
        {
            Assert.fail();
        }
    }

    //click on proceed to checkout
    public void clickProceedToCheckout()
    {
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(btnproceedtocheckout));
        objcommonutils.clickElement(btnproceedtocheckout);
    }
    //click on Sign in Link from Header Menu
    public  void clickSignInFromMenu()
    {
        objcommonutils.clickElement(linksignin);
    }

    //click on T-shirt option
    public void clickTshirtMenu()
    {
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(menutshirt));
        objcommonutils.clickElement(menutshirt);
    }

    //click on add to cart
    public  void clickAddToCart()
    {
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(tshirtimage));
        Actions ac= new Actions(driver);
        ac.moveToElement(tshirtimage).perform();
        ac.click(btnaddcart).perform();
    }

    //click on my order link
    public void clickMyOrder()
    {
        new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOf(linkmyorders));
        objcommonutils.clickElement(linkmyorders);
    }

}
