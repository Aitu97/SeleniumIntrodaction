package com.techtorial.pages;

import com.techtorial.utils.DriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OrangeHRMPage {

    // without PageFactory.initElements method, your elements will not be initialized.
    // it means, you can not use your elements
    public OrangeHRMPage(WebDriver driver){

        PageFactory.initElements(driver, this);
    }

    // i want to store my elements
    @FindBy(id = "txtUsername")
  public   WebElement username;

    @FindBy(id = "txtPassword")
   public WebElement password;

    @FindBy(id = "btnLogin")
   public WebElement loginButton;

    @FindBy(className = "page-title")
    public WebElement pageTitle;

    @FindBy(id = "user-dropdown")
    public WebElement userDropdownButton;

    @FindBy(id = "logoutLink")
    public WebElement logOutButton;

    @FindBy(className = "dashboardCard-title-for-card")
    public WebElement retryText;


}
