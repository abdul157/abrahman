package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBase {
    protected WebDriver driver;
    public void startFirefoxBrowser(String url) {
        System.setProperty("webdriver.gecko.driver", "/home/cicd/abd/projects/geckodriver-v0.27.0-linux64/geckodriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
         driver = new FirefoxDriver(options);
        driver.get(url);
    }
    public void closeFirefoxBrowser()
    {
        driver.close();
    }
}
