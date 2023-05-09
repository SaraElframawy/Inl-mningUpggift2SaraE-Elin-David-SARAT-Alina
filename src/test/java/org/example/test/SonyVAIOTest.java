package org.example.test;

import io.qase.api.annotation.QaseTitle;
import org.example.pages.SonyVAIOPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class SonyVAIOTest extends BaseTest {

    SonyVAIOPage sonyVAIOPage;


    @Test
    @QaseTitle("login with valid inputs")
    public void searchForSonyVAIO(){
        sonyVAIOPage = landingPage.writeSonyFollowInTheSearchBar();
        sonyVAIOPage.clickTheSearchButton();
        sonyVAIOPage.clickOnTheItemPic();
        sonyVAIOPage.buyNowClick();
       sonyVAIOPage.checkOutGuest();
        sonyVAIOPage.writeFirstNameInBuy();
        sonyVAIOPage.writeLastNameInBuy();
        sonyVAIOPage.phoneNumberField();
        sonyVAIOPage.emailBuy();
        sonyVAIOPage.address1Field();
        sonyVAIOPage.postCodeField();
        sonyVAIOPage.cityField();
        sonyVAIOPage.chooseCountry("Sweden");
        sonyVAIOPage.chooseRegion();
       sonyVAIOPage.agreeTermsAndCondition();
        sonyVAIOPage.clickTheContinueButton();
        sonyVAIOPage.clickConfirmButtonLastButton();





    }



    @AfterMethod
    public void takeScreenshotsForFailure()  {
        TakesScreenshot screenshot =(TakesScreenshot) driver;
        File source =screenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File(System.getProperty("user.dir")+
                "/resources/screenshots/testBuyTheSonyVAIO_failed_again2.png");
        try {
            FileHandler.copy(source,destination);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
