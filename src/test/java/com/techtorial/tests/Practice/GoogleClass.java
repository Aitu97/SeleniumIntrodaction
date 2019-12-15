package com.techtorial.tests.Practice;

import com.techtorial.utils.DriverUtil;
//import org.junit.Before;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleClass {

    WebDriver driver;
    @BeforeClass
    public void setup() {
        driver = DriverUtil.driverSetup("ff");
    }

        @Test
        public void google(){

        driver.get("https://www.google.com/");
      WebElement searchButton= driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        searchButton.click();
        searchButton.sendKeys("iphone");

        WebElement clickSearch = driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']"));
        clickSearch.click();

            Actions actions = new Actions(driver);
            actions.keyDown(Keys.COMMAND).perform();

            WebElement link = driver.findElement(By.xpath("//a[@href='https://www.apple.com/iphone/']"));
            link.click();

    }

    @Test
    public void selectAll(){

        driver.get("https://www.google.com/");
        WebElement searchButton= driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        searchButton.click();
        searchButton.sendKeys("iphone");
        searchButton.click();

        WebElement clickSearch = driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']"));
        clickSearch.click();

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.COMMAND).sendKeys("a").perform();

    }

}
