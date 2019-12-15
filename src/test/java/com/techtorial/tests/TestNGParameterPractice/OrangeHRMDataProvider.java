package com.techtorial.tests.TestNGParameterPractice;

import com.techtorial.pages.OrangeHRMPage;
import com.techtorial.tests.TestNGPractice.testBase;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OrangeHRMDataProvider extends testBase {

    @DataProvider(name="Credentials")
    public static Object [][] credential(){
        return new Object[][] {{"admin", "admin123"}, {"testUserName", "testPassword"},
                {"admin", "testPassword"},{"testUserName", "admin123"}};
    }

    @Test(dataProvider = "Credentials")
    public void loginPageTest(String orangeUsername, String orangePassword){

        OrangeHRMPage orange = new OrangeHRMPage(driver);

        driver.get("https://orangehrm-demo-6x.orangehrmlive.com/auth/login");

        orange.username.clear();
        orange.username.sendKeys(orangeUsername);

        orange.password.clear();
        orange.password.sendKeys(orangePassword);

        orange.loginButton.click();

        if (orangeUsername.equals("admin")& orangePassword.equals("admin123")){
            String actual =orange.pageTitle.getText();
            String expected = "Dashboard";
            // expected value is coming from the requirements
            Assert.assertEquals(expected, actual);

            orange.userDropdownButton.click();
            orange.logOutButton.click();
        }else{

            String actual = orange.retryText.getText();
            String expected = "Retry Login";
            Assert.assertEquals(expected, actual);

            driver.navigate().back();
        }



    }


}
