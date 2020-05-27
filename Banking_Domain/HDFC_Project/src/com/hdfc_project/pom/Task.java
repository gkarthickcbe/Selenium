package com.hdfc_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task extends BasePage
{
@FindBy(xpath="//a[contains(@class,'content tasks_selected selected')]//div//img")
WebElement task;
@FindBy(name="visiableFilterString")
WebElement sendFilterName;
public Task(WebDriver driver)
{
	super(driver);
	PageFactory.initElements(driver, this);
}
public void ClickTask()
{
	task.click();
	
}
public void SendKeyFilterName(String Skey)
{
	sendFilterName.sendKeys(Skey);
}
}
