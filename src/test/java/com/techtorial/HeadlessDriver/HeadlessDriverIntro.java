package com.techtorial.HeadlessDriver;

import io.github.bonigarcia.wdm.PhantomJsDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class HeadlessDriverIntro {


    @Test
    public void setHtmlUnitDriver(){

        WebDriver driver = new HtmlUnitDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
    }

    @Test
    public void setPhantomJSDriver(){
        WebDriverManager.phantomjs().setup();
        WebDriver driver = new PhantomJSDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
    }


    @Test
    public void headless(){

        // it is setup class
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(CapabilityType.BROWSER_NAME, "mySpecialBrowser");
        desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME, Platform.MAC);
        desiredCapabilities.setCapability(CapabilityType.VERSION, "5.7");

        WebDriver driver = new ChromeDriver(desiredCapabilities);

        ChromeOptions chromeOptions = new ChromeOptions();



    }
}


