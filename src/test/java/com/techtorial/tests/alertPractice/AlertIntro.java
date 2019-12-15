package com.techtorial.tests.alertPractice;

import io.github.bonigarcia.wdm.WebDriverManager;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AlertIntro {

    @Test
    public void alertIntro() {

        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://the-internet.herokuapp.com");

        WebElement alertLink = webDriver.findElement(By.xpath("//a[@href='/javascript_alerts']"));
        alertLink.click();

        WebElement alertButtonLink = webDriver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        alertButtonLink.click();

        webDriver.switchTo().alert().accept();


    }
    @Test
            public void alertDismiss() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://the-internet.herokuapp.com");

        WebElement alertLink = webDriver.findElement(By.xpath("//a[@href='/javascript_alerts']"));
        alertLink.click();


        WebElement okButton = webDriver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
       okButton.click();

       Thread.sleep(1000);
       webDriver.switchTo().alert().dismiss();

    }
    @Test
    public void third() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://the-internet.herokuapp.com");

        WebElement alertLink = webDriver.findElement(By.xpath("//a[@href='/javascript_alerts']"));
        alertLink.click();

        WebElement thirdButton = webDriver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        thirdButton.click();

        Thread.sleep(100);
        webDriver.switchTo().alert().sendKeys("hello");
        webDriver.switchTo().alert().accept();
    }
    @AfterTest
    public void tearDown(){
    }
}
