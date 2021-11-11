package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogInPage extends BasePage{

    WebElement username = driver.findElement(By.id("Username"));
    WebElement password = driver.findElement(By.id("Password"));
    WebElement logInButton = driver.findElement(By.id("buttonLogIn"));


    public void logInSteps(){
        username.click();
        username.sendKeys("username");;


        password.click();
        password.sendKeys("password!");

        logInButton.click();
        String currentUrl = driver.getCurrentUrl();

    }
}
