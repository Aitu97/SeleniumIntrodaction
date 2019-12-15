package com.techtorial.tests.Practice;

import com.techtorial.pages.EtsyHomePage;
import com.techtorial.pages.JeweleryAndAccessories;
import com.techtorial.utils.DriverUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.function.Function;

public class JeweleryAndAccessoriesTest {


    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = DriverUtil.driverSetup("Chrome");
    }


    @Test
    public void test() throws InterruptedException, MalformedURLException {

        // 1. navigate to www.etsy.com home page
        driver.get("https://www.etsy.com");


        URL url = new URL("https://www.google.com");

        driver.navigate().to(url);
        driver.navigate().to("https://www.google.com");
        driver.navigate().refresh(); // refresh the page
        driver.navigate().back(); // go back
        driver.navigate().forward(); // go forward



        // 2. verify you are on etsy home page
        String expectedHomePageTitle= "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualHomePage= driver.getTitle();
        Assert.assertEquals(expectedHomePageTitle,actualHomePage);
        Thread.sleep(3000);



        EtsyHomePage etsyHomePage = new EtsyHomePage();
        etsyHomePage.jeweleryAndAccessoriesLink.click();
        //3. navigate to jewelery and accessories page

        WebDriverWait wait = new WebDriverWait(driver, 4);
        wait.until(ExpectedConditions.elementToBeClickable(etsyHomePage.jeweleryAndAccessoriesLink));
        System.out.println(ExpectedConditions.elementToBeClickable(etsyHomePage.jeweleryAndAccessoriesLink).toString());

        etsyHomePage.jeweleryAndAccessoriesLink.click();


        JeweleryAndAccessories page= new JeweleryAndAccessories(driver);
        page.over100.click();

        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30)) // max wait time
                .pollingEvery(Duration.ofSeconds(2)) // frequency
                .ignoring(NoSuchElementException.class); // which exception to ignore

        fluentWait.until(new Function<WebDriver, Object>() {
            public WebElement apply(WebDriver driver){
                return driver.findElement(By.xpath(""));
            }
        });

    }


    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        if( result.getStatus() == ITestResult.FAILURE){

            long timestamp = System.currentTimeMillis();

            //(TakesScreenshot)driver is casting, it is coming from selenium
            //
            //.getScreenshotAs is taking screenshot
            //
            File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFile, new File("src/test/java/screenshots/" + timestamp + ".jpg"));
        }

        driver.close();
    }
}
