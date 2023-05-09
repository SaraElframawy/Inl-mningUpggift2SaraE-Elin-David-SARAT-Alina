package org.example.pages;

import io.qase.api.annotation.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SonyVAIOPage extends BasePage {

private final By searchButton = By.xpath("//button[@type ='submit' and text()='Search']");
private final By itemLink = By.xpath("//*[@id=\"mz-product-grid-image-46-212469\"]/div/div[1]/img");
private final By buyNowButton = By.xpath("//button[@type ='button' and text() ='Buy now']");
private final By guestCheckOutRadioButton = By.xpath("//*[@id=\"form-checkout\"]/div/div[1]/div/div[1]/div/div[3]/label");
//private final By firstNameFieldBuy = By.id("input-payment-firstname");
private final By firstNameFieldBuy = By.xpath("//*[@id=\"input-payment-firstname\"]");

private final By lastName = By.id("input-payment-lastname");

    private final By phoneNumberBuy = By.id("input-payment-telephone");
    private final By emailBuy = By.id("input-payment-email");
    private final By address1Field = By.id("input-payment-address-1");
    private final By postCodeField = By.id("input-payment-postcode");
    private final By city = By.id("input-payment-city");
    private final By country = By.id("input-payment-country");
    private final By region = By.id("input-payment-zone");
    //private final By regionChoices = By.xpath("//*[@id=\"input-payment-zone\"]//option[16]");
    private final By regionChoices = By.xpath("//option[contains(text(),'Stockholm')]");//option[@value='3088']
    private final By termsAndConditions = By.xpath("//label[@for='input-agree']");

    private final By continueButton = By.id("button-save");
    private final By confirmOrderBuyLastbutton = By.id("button-confirm");



@Step("click on the search button after writing the item name")

public void clickTheSearchButton(){
    click(searchButton);


}
public void clickOnTheItemPic(){
    click(itemLink);
}
public void buyNowClick(){
    click(buyNowButton);


}



public void writeFirstNameInBuy(){
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameFieldBuy));
    sendKeys(firstNameFieldBuy,"Sara");
}
    public void writeLastNameInBuy(){

    sendKeys(lastName,"Elframawy");
    }


    public void checkOutGuest() {
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOfElementLocated(guestCheckOutRadioButton));
    click(guestCheckOutRadioButton);
    }

    public void phoneNumberField(){
        sendKeys(phoneNumberBuy, "0764086589");
    }
    public void emailBuy(){
    sendKeys(emailBuy,"sara.elfaramawy.93@gmail.com");
    }

    public void address1Field() {
        sendKeys(address1Field, "Testgatan 14");
    }
    public void postCodeField(){
    sendKeys(postCodeField,"16379");
    }
    public void cityField(){
    sendKeys(city,"Stockholm");
    }
    public void chooseCountry(String country1){

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(country));
        Select select = new Select(find(country));
        select.selectByVisibleText(country1);
    }
    public void chooseRegion(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(regionChoices));


    Select select = new Select(find(region));
   // select.selectByVisibleText(region1);
    select.selectByValue("3088");

    }
  public void agreeTermsAndCondition(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(region));
    click(termsAndConditions);
    }
    public void clickTheContinueButton() {
        click(continueButton);
    }
    public void clickConfirmButtonLastButton(){
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
    wait.until(ExpectedConditions.visibilityOfElementLocated(confirmOrderBuyLastbutton));
    click(confirmOrderBuyLastbutton);

    }


}
