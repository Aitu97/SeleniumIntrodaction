package com.techtorial.tests.actionPractice;

import com.techtorial.utils.DriverUtil;
//import org.junit.Before;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MouseActions {

    WebDriver driver;

    @BeforeClass
    public void setup(){
        driver = DriverUtil.driverSetup("CHROME");
        // driver is first time initialized in this line

    }

    @Test
    public void test1(){
        driver = DriverUtil.driverSetup("chrome");
        //since we initialized driver before, it will not initialize this line cuz singleton pattern.
        driver = DriverUtil.driverSetup("ff");;
    }


    @Test
    public void mouseActionsIntro(){
        Actions actions = new Actions(driver);

        WebElement webElement =  driver.findElement(By.id(""));
        actions.click();
        actions.contextClick();

        //for double click
        actions.doubleClick();

        //right click
        actions.contextClick(webElement).perform();

        //hover over
        actions.moveToElement(webElement).perform();

        WebElement sourceElement = driver.findElement(By.xpath(""));
        WebElement targetElement = driver.findElement(By.xpath(""));

        //drag and drop
        actions.dragAndDrop(sourceElement, targetElement);

    }


}
