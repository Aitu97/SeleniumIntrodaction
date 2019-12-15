package com.techtorial.pages;

import com.techtorial.utils.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EtsyHomePage {


    WebDriver driver;
    @BeforeClass
    public void setup() {
        driver = DriverUtil.driverSetup("Chrome");
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@id='global-enhancements-search-query']")
   public WebElement searchField;
    @FindBy(id = "register")
  public   WebElement register;
    @FindBy(xpath = "//a[@href='https://www.etsy.com/cart?ref=hdr-cart']")
  public   WebElement cart;
    @FindBy(id = "catnav-primary-link-10855")
    public WebElement jeweleryAndAccessoriesLink;




    }

