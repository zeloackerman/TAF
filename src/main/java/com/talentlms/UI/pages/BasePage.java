package com.talentlms.UI.pages;

import com.talentlms.UI.helpers.Helper;
import com.talentlms.UI.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

   protected Helper helper = new Helper();
   protected WebDriver driver = Driver.getDriver();
   protected BasePage(){
         PageFactory.initElements(Driver.getDriver(), this);
   }




}
