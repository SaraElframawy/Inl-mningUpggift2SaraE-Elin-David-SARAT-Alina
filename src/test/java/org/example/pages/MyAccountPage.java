package org.example.pages;


import io.qase.api.annotation.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class MyAccountPage extends BasePage {


@Step("Hovering over My account link to be able to choose register")
public void hoverToRegisterLink(){

    Actions actions = new Actions(driver);
    actions.moveToElement(driver.findElement(By.linkText("My account"))).perform();
    WebElement registerLink = driver.findElement(By.xpath("//*[@id=\"widget-navbar-217834\"]/ul/li[6]/ul/li[2]/a/div/span"));
    registerLink.click();



}


}
