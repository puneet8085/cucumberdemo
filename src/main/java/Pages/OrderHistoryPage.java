package Pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonUtils;
import utils.Driver;

public class OrderHistoryPage extends Driver {
private Logger logger;

    public OrderHistoryPage()
    {
        objcommonutils = new CommonUtils();

        logger =Logger.getLogger(this.getClass());
        PageFactory.initElements(driver,this);
    }
    static  int ordercount=0;
    static int Newordercount;


    //get order count on order history table
    public void GetOrderCount() {
        if (ordercount == 0) {
            int row = driver.findElements(By.xpath("//table[@id='order-list']/tbody/tr")).size();
            ordercount = row;
        }
        else{
            int row = driver.findElements(By.xpath("//table[@id='order-list']/tbody/tr")).size();
            Newordercount = row;

        }
    }

    //verify new order
    public void verifyOrder()
    {
       if(Newordercount==(ordercount+1))
       {
           logger.info("Order is placed Successfully");
       }
       else {
           logger.info("Order is not placed Successfully");
           Assert.fail();
       }
    }
}
