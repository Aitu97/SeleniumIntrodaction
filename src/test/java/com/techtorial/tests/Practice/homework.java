package com.techtorial.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class homework {

    @Test
    public void  iphoneSearchTest(){


        WebDriverManager.chromedriver().setup();
            WebDriver webDriver=new ChromeDriver();

            webDriver.get("https://www.amazon.com");

            WebElement searchTab = webDriver.findElement(By.id("twotabsearchtextbox"));
            //searchTab.click();
            searchTab.sendKeys("iphone" + Keys.ENTER);

           WebElement searchButton = webDriver.findElement(By.xpath("//input[@value='go'"));
           searchButton.click();

            WebElement iphone = webDriver.findElement(By.xpath("//span[.='Simple Mobile Prepaid - Apple iPhone 6s (32GB) - Space Gray"));

            String productName =iphone.getText();
            //iphone.getText();

       // System.out.println(productName.toLowerCase().contains("iphone"));


        //Assert is comparing
        Assert.assertTrue(productName.toLowerCase().contains("iphone"));

        }

        @Test
        public void getPrice(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com");
        WebElement getPrice = driver.findElement(By.xpath("//span[@ class='a-price-whole']"));
       String price=getPrice.getText();
       Assert.assertTrue(price.toLowerCase().contains("199"));

        }
    }

