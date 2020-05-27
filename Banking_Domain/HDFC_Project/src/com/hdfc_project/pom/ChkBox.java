package com.hdfc_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

public class ChkBox extends BasePage
{
@FindBy(id="keepLoggedInCheckBoxContainer")
WebElement chkBox;
public ChkBox(WebDriver driver)
{
	super(driver);
	PageFactory.initElements(driver, this);
}
public void verifyChkBox()
{
	chkBox.click();
	Assert.assertTrue(chkBox.isSelected());
}
}
