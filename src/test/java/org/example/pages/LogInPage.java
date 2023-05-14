package org.example.pages;

import io.qase.api.annotation.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class LogInPage extends BasePage{
    private final By emailInput = By.id("input-email");
    private final By password = By.id("input-password");
    private final By loginButton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/form/input");

  private final By MyAccountLink = By.linkText("My account");
  private final By registerLink = By.xpath("//*[@id=\"widget-navbar-217834\"]/ul/li[6]/ul/li[1]/a/div/span");


    @Step("Hoovering to access log in page through My account link")
    public void hoverToLogInLink(){

     //   Actions actions = new Actions(driver);
     //   actions.moveToElement(driver.findElement(By.linkText("My account"))).perform();
        hover(MyAccountLink);
     //   WebElement registerLink = driver.findElement(By.xpath("//*[@id=\"widget-navbar-217834\"]/ul/li[6]/ul/li[1]/a/div/span"));
      click(registerLink);



    }
    @Step("write an email")
    public void writeEmail (){
        sendKeys(emailInput,"sara.elfaramawy.93@gmail.com");
    }
    @Step("write a password")
    public void  writePassword(){
        sendKeys(password,"SaraE");
    }
    @Step("clicking on the log in button")
    public void loginButtonClick(){
        click(loginButton);
    }

}
