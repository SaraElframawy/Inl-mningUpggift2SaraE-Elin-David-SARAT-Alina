package org.example.pages;

import org.openqa.selenium.By;

public class LogOutPage extends BasePage {
     private By logOut = By.xpath("//*[@id=\"column-right\"]/div/a[14]");
    //*
   // private By logOut = By.linkText("Logout");
//*[@id="column-right"]/div/a[14]
     public void clickLogOut(){
         click(logOut);
     }

}
