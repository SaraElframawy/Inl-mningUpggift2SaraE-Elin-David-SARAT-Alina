package org.example.test;

import io.qase.api.annotation.QaseTitle;

import org.example.pages.RegisterGuestPage;
import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class RegisterTest extends BaseTest{
private RegisterGuestPage registerGuestPage;


@Test
    @QaseTitle("try to register a new member")
    public void registerNewGuest(){
     registerGuestPage = landingPage.followLinkRegister();
     registerGuestPage.writeFirstName();
     registerGuestPage.writeLastName();
     registerGuestPage.writeEmail();
     registerGuestPage.writeTelephone();
     registerGuestPage.writePassword();
     registerGuestPage.writeConfirmPassword();
     registerGuestPage.checkPrivatePolicyRadioButton();
     registerGuestPage.clickOnTheSubmittButton();

}

}
