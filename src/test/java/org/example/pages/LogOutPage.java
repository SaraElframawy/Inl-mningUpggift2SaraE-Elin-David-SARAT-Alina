package org.example.pages;

import io.qase.api.annotation.Step;
import org.openqa.selenium.By;
public class LogOutPage extends BasePage {


     private By logOut = By.xpath("//*[@id=\"column-right\"]/div/a[14]");
    //*
   // private By logOut = By.linkText("Logout");
//*[@id="column-right"]/div/a[14]

    @Step("log out from the page after logging in")
     public void clickLogOut(){
         click(logOut);
     }

}
