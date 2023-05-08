package org.example.test;

import org.example.pages.MyAccountPage;
import org.testng.annotations.Test;

public class MyaccountTest {
    MyAccountPage myAccountPage;
    @Test
    public void justReachToRegister(){
        myAccountPage.hoverToRegisterLink();
    }
}
