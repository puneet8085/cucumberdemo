package Resource;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.Driver;

public class Hooks {

    Driver d= new Driver();

    @Before
    public void LaunchBrowser() throws Exception {
        d.initializeBrowser();

    }

    @After
    public void teardown() throws Exception {
        d.closeDriver();
    }
}
