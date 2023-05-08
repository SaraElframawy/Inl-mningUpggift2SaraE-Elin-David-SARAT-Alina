package org.example.test;

import org.example.pages.LogInPage;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest{
    LogInPage logInPage ;
@Test
    public void test_login(){
    logInPage = landingPage.followLinkToLogIn();
    logInPage.hoverToLogInLink();
    logInPage.writeEmail();
    logInPage.writePassword();
}

}
