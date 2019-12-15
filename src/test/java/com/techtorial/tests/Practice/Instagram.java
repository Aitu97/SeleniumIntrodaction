package com.techtorial.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Instagram {

    @Test
    public void login(){

        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://www.instagram.com/");

        webDriver.manage().window().maximize();

        WebElement login = webDriver.findElement(By.xpath("//a[@href='/accounts/login/?source=auth_switcher']"));
        login.click();



        WebElement number = webDriver.findElement(By.xpath("//input[@name='username']"));
        number.sendKeys("3235979088");
        number.click();

       WebElement pass = webDriver.findElement(By.xpath("//input[@name='password']"));
       pass.sendKeys("");
       pass.click();

       WebElement enter = webDriver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
       enter.click();


       WebElement like = webDriver.findElement(By.xpath("//span[@aria-label='Like']"));
       like.click();

    }
}
