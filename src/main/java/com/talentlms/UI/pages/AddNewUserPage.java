package com.talentlms.UI.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewUserPage extends BasePage {

    @FindBy(xpath = "//input[@name='name']")
    WebElement firsNameInputField;
    @FindBy(xpath = "//input[@name='surname']")
    WebElement lastNameInputField;
    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailInputField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInputField;




    public AddNewUserPage inputFirstName (String firstname){
        helper.sendKeys(firsNameInputField, firstname);
        return this;
    }

    public AddNewUserPage inputLastName (String lastName){
        helper.sendKeys(lastNameInputField, lastName);
        return this;
    }

    public AddNewUserPage inputEmailAddress (String email){
        helper.sendKeys(emailInputField, email);
        return this;
    }

    public AddNewUserPage inputPassword (String userPassword){
        helper.sendKeys(passwordInputField, userPassword);
        return this;
    }

}
