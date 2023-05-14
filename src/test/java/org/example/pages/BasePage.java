package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BasePage {
  public static WebDriver driver;

    public void setDriver(WebDriver driver) {
        BasePage.driver = driver;

    }

    protected WebElement find(By locator) {
        return driver.findElement(locator);

    }

    protected  void click(By locator) {
        find(locator).click();
    }

    protected void sendKeys(By locator, String input) {
        find(locator).sendKeys(input);
    }

    protected String getText(By locator) {
        return find(locator).getText();

    }
    protected void hover(By locator){
        Actions actions = new Actions(driver);
        actions.moveToElement(find(locator)).perform();
        //find is the method to produce web element
    }
}
