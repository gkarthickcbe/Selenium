package com.hdfc_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.junit.Assert;


public class Version extends BasePage
{
@FindBy(xpath="//nobr[contains(text(),'actiTIME 2015.1')]")
WebElement version;
Version(WebDriver driver)
{
	super(driver);
	PageFactory.initElements(driver, this);
	
}
public void verifyVersion(String eVersion)
{
	String aVersion = version.getText();
	Assert.assertEquals(aVersion, eVersion);
}
}
