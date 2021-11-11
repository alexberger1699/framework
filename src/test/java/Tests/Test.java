package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test extends tests.BaseTest {
   @org.testng.annotations.Test
    public void test(){

        System.out.println("Run");

        WebElement button =  driver.findElement(By.name("q"));



        button.click();
        System.out.println("click");
    }
}
