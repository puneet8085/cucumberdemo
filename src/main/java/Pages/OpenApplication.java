package Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import utils.CommonUtils;
import utils.Driver;
import utils.ReadProperties;

import java.util.concurrent.TimeUnit;

public class OpenApplication extends Driver {

private Logger logger;
    public  OpenApplication()
    {
        objcommonutils= new CommonUtils();
        logger =Logger.getLogger(this.getClass());
        PageFactory.initElements(driver,this);
    }

    public OpenApplication openURL() throws Exception {

        driver.get(ReadProperties.readProperties("URL"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        logger.info("user redirects to application");
        return (new OpenApplication());

    }
}

