package com.techtorial.tests.TestNGPractice;

import com.techtorial.utils.DriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class testBase {

    public static WebDriver driver;

    @Parameters("driverName")

    @BeforeClass(alwaysRun = true)
    public void SetUpDriver(String driverName) {


        driver = DriverUtil.driverSetup(driverName);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }

   // @AfterClass
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
