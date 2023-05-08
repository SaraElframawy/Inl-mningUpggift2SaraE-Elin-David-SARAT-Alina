package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class LogInPage extends BasePage{
    private By emailInput = By.id("input-email");
    private By password = By.id("input-password");
    private By loginButton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/form/input");
    public void hoverToLogInLink(){

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.linkText("My account"))).perform();
        WebElement registerLink = driver.findElement(By.xpath("//*[@id=\"widget-navbar-217834\"]/ul/li[6]/ul/li[1]/a/div/span"));
        registerLink.click();



    }
    public void writeEmail (){
        sendKeys(emailInput,"sara.elfaramawy.93@gmail.com");
    }
    public void  writePassword(){
        sendKeys(password,"SaraE");
    }
    public void loginButtonClick(){
        click(loginButton);
    }

}
