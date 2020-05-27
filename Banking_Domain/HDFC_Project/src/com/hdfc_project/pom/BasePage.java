package com.hdfc_project.pom;

import org.openqa.selenium.WebDriver;
import org.junit.Assert;


public abstract class BasePage
{
 public WebDriver driver;
 public BasePage(WebDriver driver)
 {
	 this.driver=driver;
 }

 public void VerifyTitle(String eTitle)
 {
	 String aTitle = driver.getTitle();
	 Assert.assertEquals(aTitle,eTitle);
	 System.out.println(aTitle);
 }
 
}
