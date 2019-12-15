package com.techtorial.pages;

import com.techtorial.utils.DriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

public class JeweleryAndAccessories {


    WebDriver driver;

    public JeweleryAndAccessories(WebDriver driver) {
        this.driver=driver;
    }

    @BeforeClass
    public void setup() {
        driver = DriverUtil.driverSetup("Chrome");
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@aria-label='Any price']")
   public WebElement anyPrice;

    @FindBy(xpath = "//input[@aria-label='Under $25']")
   public WebElement under25;

    @FindBy(xpath = "//input[@aria-label='$25 to $50']")
   public WebElement moreThan25;

    @FindBy(xpath = "//input[@aria-label='$50 to $100']")
   public WebElement moreThan50;

    @FindBy(xpath = "/a[@href='https://www.etsy.com/c/jewelry_and_accessories?explicit=1&min=100&max=&price_bucket=1']")
   public WebElement over100;

    @FindBy(xpath = "//select[@id='ship_to_select']")
    public WebElement shipTo;
}
