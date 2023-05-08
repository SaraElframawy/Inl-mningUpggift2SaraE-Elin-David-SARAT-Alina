package org.example.pages;

import org.openqa.selenium.By;

public class SonyVAIOPage extends BasePage {

private final By searchButton = By.xpath("//button[@type ='submit' and text()='Search']");
private final By itemLink = By.xpath("//*[@id=\"mz-product-grid-image-46-212469\"]/div/div[1]/img");
private final By buyNowButton = By.xpath("//button[@type ='button' and text() ='Buy now']");
private final By firstNameBuy = By.id("input-payment-firstname");

public void clickTheSearchButton(){
    click(searchButton);


}
public void clickOnTheItemPic(){
    click(itemLink);
}
public void buyNowClick(){
    click(buyNowButton);
}

}
