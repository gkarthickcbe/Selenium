package com.hdfc_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{
@FindBy(xpath="//a[@id='logoutLink']")
WebElement logout;
public HomePage(WebDriver driver)
{
	super(driver);
	PageFactory.initElements(driver, this);
}
public void clickLoginButton()
{
	logout.click();
}
}
