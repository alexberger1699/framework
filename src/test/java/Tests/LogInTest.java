package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

public class LogInTest extends tests.BaseTest {

    WebDriver  driver ;
    @Test
    public void logIn() throws InterruptedException {

        System.out.println("running");
        Thread.sleep(2000);

        driver.findElement(By.name("q")).click();
        System.out.println("clicked");

        driver.findElement(By.id("Username")).sendKeys("username/email");


    driver.findElement(By.id("Password")).click();
    driver.findElement(By.id("Password")).sendKeys("password");

    driver.findElement(By.id("buttonLogIn")).click();
    String currentUrl = driver.getCurrentUrl();
    Assert.assertEquals(currentUrl, "https://");

    System.out.println("Successeful test");
    driver.quit();
    }
}
