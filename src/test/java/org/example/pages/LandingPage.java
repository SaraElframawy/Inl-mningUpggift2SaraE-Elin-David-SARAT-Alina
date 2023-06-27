package org.example.pages;

import io.qase.api.annotation.Step;
import org.openqa.selenium.By;

public class LandingPage extends BasePage{
    private final By myAccount = By.linkText("My account");

    private final  By registerLink = By.xpath("//*[@id=\"column-right\"]/div/a[2]");
    private final By logOutLink = By.xpath("//*[@id=\"column-right\"]/div/a[14]");
    private final  By logInLink = By.linkText("Login");
    private String productName = "sony VAIO";
    private final By searchBar = By.xpath("//input [@name ='search']");



public MyAccountPage followLinkMyAccount(){
    click(myAccount);
    return  new MyAccountPage();

}
    @Step("Register someone account test")
    public RegisterGuestPage followLinkRegister(){
    followLinkMyAccount();
    click(registerLink);
    return new RegisterGuestPage();

    }

    @Step("log in with the register info")

    public LogInPage followLinkToLogIn (){
    followLinkMyAccount();
        click(logInLink);
        return new LogInPage();


    }
    @Step("click on the link to log out fro the page")
    public LogOutPage followLinkToLogOut(){


        click(logOutLink);
        return new LogOutPage();
    }
    @Step("Writing an item called sony VIO on the searching field" +
            "")

    public SonyVAIOPage writeSonyFollowInTheSearchBar(){
        sendKeys(searchBar,productName);
        return new SonyVAIOPage();


    }
}
