package com.hdfc_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage
{
 @FindBy(id="username")
 WebElement user;
 @FindBy(name="pwd")
 WebElement password;
 @FindBy(id="loginButton")
 WebElement login;
 public LoginPage(WebDriver driver)
 {
	 super(driver);
	 PageFactory.initElements(driver, this);
 }
 public void setusername(String un)
 {
	 user.sendKeys(un);
 }
 public void setpswd(String pd)
 {
	 password.sendKeys(pd);
 }
 public void login()
 {
	 login.click();
 }
}
