package org.example.test;

import org.example.pages.LandingPage;
import org.example.pages.MyAccountPage;
import org.testng.annotations.Test;

public class MyaccountTest extends BaseTest {
    MyAccountPage myAccountPage;
    @Test
    public void justReachToRegister(){
       myAccountPage = landingPage.followLinkMyAccount();
        myAccountPage.hoverToRegisterLink();
    }
}
