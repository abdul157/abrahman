package Util;

import BaseClass.SeleniumBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class UtilClass extends SeleniumBase {

    @BeforeMethod
    public void beforeHooks()
    {
       startFirefoxBrowser("http://google.com");
    }

    @AfterMethod
    public void afterHooks()
    {
      closeFirefoxBrowser();
    }

}
