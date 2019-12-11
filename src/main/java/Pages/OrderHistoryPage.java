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

//verify order in order summary table
    public void verifyOrder() {
        int rowcount= driver.findElements(By.xpath("//table[@id='order-list']/tbody/tr")).size();
        for(int i=1; i<=rowcount;i++)
        {
            String rowtext = driver.findElement(By.xpath("//table[@id='order-list']/tbody/tr["+i+"]/td[1]/a")).getText();
            if(rowtext.equals(OrderSummaryPage.Orderid))
            {
                logger.info("Order is present in order history table");
                break;
            }
            else
            {
                logger.info("order not present in order history table");
            }


        }

    }
}
