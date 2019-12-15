package com.techtorial.tests.TestNGPractice;

import com.techtorial.pages.OrangeHRMPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends testBase {


    @Test
    public void loginTest() throws InterruptedException {

        OrangeHRMPage orange= new OrangeHRMPage(driver);

        driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");

        Thread.sleep(2000);

        orange.username.clear();
        orange.username.click();
        orange.username.sendKeys("admin");

        orange.password.clear();
        orange.password.click();
       orange.password.sendKeys("admin123");
       orange.username.click();

       orange.loginButton.click();

        String actual=orange.pageTitle.getText();
        String expected="Dashboard";
        // expected value is coming from the requirement

        Assert.assertEquals(expected,actual);


    }

}
