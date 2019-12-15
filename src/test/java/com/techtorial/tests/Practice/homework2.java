package com.techtorial.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class homework2 {

    @Test
    public void laptop(){

        WebDriverManager.chromedriver().setup();
        WebDriver webDriver=new ChromeDriver();
        webDriver.get("https://www.amazon.com");

        WebElement search = webDriver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("laptop"+ Keys.ENTER);


    }
}
