package com.techtorial.CookiesIntro;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cookies1 {

    @Test
    public void getCookies(){

        Cookie cookie = new Cookie("session", "JJOOOON");

        WebDriver driver = new ChromeDriver();
        driver.manage().addCookie(cookie);
    }
}
