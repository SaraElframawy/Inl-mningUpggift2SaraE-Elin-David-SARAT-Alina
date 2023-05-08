package org.example.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class MyAccountPage extends BasePage {

private final By registerOnTheHover = By.xpath("//*[@id=\"widget-navbar-217834\"]/ul/li[6]/a/div/span");

public void hoverToRegisterLink(){
    Actions actions = new Actions(driver);
    actions.moveToElement(driver.findElement(registerOnTheHover)).perform();
    WebElement registerLink = driver.findElement(By.xpath("//a[contains(text(), 'Register')]"));
    registerLink.click();



}


}
