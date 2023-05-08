package org.example.test;

import io.qase.api.annotation.QaseTitle;
import org.example.pages.LogInPage;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest{
    LogInPage logInPage ;
@Test
@QaseTitle("log in after register an account manually or by register page")
    public void test_login(){
    logInPage = landingPage.followLinkToLogIn();
    logInPage.hoverToLogInLink();
    logInPage.writeEmail();
    logInPage.writePassword();

}

}
