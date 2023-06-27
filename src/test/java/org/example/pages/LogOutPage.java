package org.example.pages;

import io.qase.api.annotation.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogOutPage extends BasePage {


     private By logOut = By.xpath("//*[@id=\"column-right\"]/div/a[14]");
    //*
   // private By logOut = By.linkText("Logout");
//*[@id="column-right"]/div/a[14]

    @Step("log out from the page after logging in")
     public void clickLogOut(){
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(logOut));
        click(logOut);
     }

}
