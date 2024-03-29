package org.example.test;

import io.qase.api.annotation.QaseTitle;
import io.qase.api.annotation.Step;
import org.example.pages.LogInPage;
import org.example.pages.LogOutPage;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LogOutTest extends BaseTest{
    LogOutPage logOutPage;
    LogInPage logInPage;

    @BeforeMethod
    @Step("Writing an email and password on the field and pressing log in")
    public void setUpLogin(){
        logInPage = landingPage.followLinkToLogIn();
        logInPage.hoverToLogInLink();
        logInPage.writeEmail();
        logInPage.writePassword();
       logInPage.loginButtonClick();

    }
    @Test
    @QaseTitle("log out after logging in with help of method to log in the page")
    public void clickOnTheLogOutButton(){

        logOutPage = new LogOutPage();
        logOutPage.clickLogOut();
    }
}
