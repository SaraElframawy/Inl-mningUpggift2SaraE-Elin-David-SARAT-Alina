package org.example.test;

import io.qase.api.annotation.QaseTitle;
import org.example.pages.LandingPage;
import org.example.pages.MyAccountPage;
import org.testng.annotations.Test;

public class MyaccountTest extends BaseTest {
    MyAccountPage myAccountPage;
    @Test
    @QaseTitle("Register the account we are planing to login or logout")
    public void justReachToRegister(){
       myAccountPage = landingPage.followLinkMyAccount();
        myAccountPage.hoverToRegisterLink();
    }
}
