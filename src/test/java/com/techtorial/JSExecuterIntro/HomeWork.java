package com.techtorial.JSExecuterIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWork {


    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void homework() {

        driver.get("https://www.naturerepublicusa.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;


    }


        @FindBy(xpath = "//*[@id=\"site-navigation\"]/div/div/nav/ul/li[3]")
                public WebElement cleanseButton;





}
