package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

import java.io.File;

public class DriverFactory {
    private static WebDriver driver;
    private final static String DRIVER_PATH= "/Users/alex/Desktop/framework/src/";

    public static WebDriver getDriver(Browser browser){
      File file;

        switch(browser){
            case CHROME:
                file = new File(DRIVER_PATH + "chromedriver");
                System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
                driver = new ChromeDriver();
                break;
/*
            case FIREFOX:
                file = new File(DRIVER_PATH + "gecodriver");
                System.setProperty("webdriver.firefox.driver", file.getAbsolutePath());
                driver = new GeckoDriver();
                break;
  */
        }
        return driver;
    }

}
