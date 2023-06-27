package org.example.pages;

import org.openqa.selenium.By;

public class RegisterGuestPage  extends BasePage{

  private final By firstName = By.id("input-firstname");
  private final  By lastName = By.id("input-lastname");
  private final By email = By.id("input-email");
  private final By telephone = By.id("input-telephone");
  private final By password = By.id("input-password");
  private final By confirmPassword = By.id("input-confirm");
  private final By privatePolicyCheck = By.xpath("//*[@id=\"content\"]" +
          "/form/div/div/div/label");
  private final By submitButton = By.xpath("//input [@type ='submit']");

public void writeFirstName (){
sendKeys(firstName,"Sara");


}
public void writeLastName(){
  sendKeys(lastName,"Elframawy");
}
public void writeEmail(){
  sendKeys(email,"sara.elfaramawy.93@gmail.com");
}
public void writeTelephone(){
  sendKeys(telephone,"0764086589");
}
public void writePassword(){
  sendKeys(password,"SaraE");
}
public void writeConfirmPassword(){
  sendKeys(confirmPassword,"SaraE");
}
public void checkPrivatePolicyRadioButton(){
  click(privatePolicyCheck);
}
public void clickOnTheSubmittButton(){
  click(submitButton);
}




}
