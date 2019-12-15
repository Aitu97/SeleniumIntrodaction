package com.techtorial.tests.Practice;

import com.techtorial.utils.DriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class homeworkInsta {


    WebDriver driver;
    @BeforeClass
    public void setup() {
        driver = DriverUtil.driverSetup("Chrome");
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//button[@type='button']")
    public WebElement loginWithFacebook;
    @FindBy(id = "full name")
    public WebElement fullname;
    @FindBy(id = "username")
    public WebElement username;
    @FindBy(id = "Password")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement sighUp;
    @FindBy(xpath = "//a[@href='/accounts/login/?source=auth_switcher']")
    public WebElement sighIn;



}
