package com.hdfc_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;


public class InvalidLoginPage extends BasePage
{
@FindBy(xpath="//span[contains(text(),'Username or Password is invalid. Please try again.')]")
WebElement errmsg;
public InvalidLoginPage(WebDriver driver)
{
	super(driver);
	PageFactory.initElements(driver, this);
}
public void verifyErrorMsg()
{
	Assert.assertTrue(errmsg.isDisplayed());
}
}
