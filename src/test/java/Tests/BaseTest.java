package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.io.File;

public abstract class BaseTest {


    public WebDriver driver;



    @BeforeClass
    public void setUp(){
        File file = new File("src/resources/chromedriver");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");


    }

    @AfterClass
    public void tearDown(){
      //  driver.close();
    }

    @AfterMethod
    public void goBack(){
       // driver.navigate().back();
    }

    @DataProvider(name ="dataProvider")
    public Object [][] dataProvider(){
        return new Object[][] {{"selenium java"}, {"selenium javascript"}};
    }
}
