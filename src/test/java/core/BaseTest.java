package core;

import pages.adminarea.Browser;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
public class BaseTest {

    @BeforeMethod
    public void setup() {
        Browser.setup();
    }


    @AfterMethod
    public void quit() {
        Browser.quit();
    }

}
