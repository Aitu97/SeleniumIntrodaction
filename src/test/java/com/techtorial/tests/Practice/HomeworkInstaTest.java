package com.techtorial.tests.Practice;

import com.techtorial.tests.Practice.homeworkInsta;
import com.techtorial.utils.DriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeworkInstaTest {



    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = DriverUtil.driverSetup("Chrome");
    }


    @Test
    public void testInsta(){

        driver.get("https://www.instagram.com/");

        homeworkInsta insta = new homeworkInsta();

    }
}
