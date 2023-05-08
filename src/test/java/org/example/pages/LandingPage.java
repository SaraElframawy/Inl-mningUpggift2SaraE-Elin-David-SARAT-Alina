package org.example.pages;

import io.qase.api.annotation.Step;
import org.openqa.selenium.By;

public class LandingPage extends BasePage{
    private final By myAccount = By.xpath("//*[@id=\"widget-navbar-217834\"]/ul/li[6]/a/div/span");

    private final  By registerLink = By.xpath("//*[@id=\"column-right\"]/div/a[2]");
    private final By logOutLink = By.xpath("//*[@id=\"widget-navbar-217834\"]/ul/li[6]/ul/li[6]/a/div/span");
    private final  By logInLink = By.linkText(" Login");
    private String productName = "sony VAIO";
    private final By searchBar = By.xpath("//input [@name ='search']");



public MyAccountPage followLinkMyAccount(){
    click(myAccount);
    return  new MyAccountPage();

}
    @Step("Register someone account test")
    public RegisterGuestPage followLinkRegister(){

click(registerLink);
return new RegisterGuestPage();

    }

    @Step("log in with the register info")

    public  logInPage followLinkToLogIn (){
        click(logInLink);
        return new logInPage();


    }
    @Step("click on the link to log out fro the page")
    public LogOutPage followLinkToLogOut(){
        click(logOutLink);
        return new LogOutPage();
    }

    public SonyVaioPage writeSonyFollowInTheSearchBar(){
        sendKeys(searchBar,productName);
        return new SonyVaioPage();


    }
}
