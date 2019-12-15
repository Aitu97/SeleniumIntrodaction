package com.techtorial.tests.SelectPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownIntro {

    @Test
    public void dropD() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver=new ChromeDriver();

        webDriver.get("https://www.amazon.com");
        WebElement searchDropDownBox = webDriver.findElement(By.id("searchDropdownBox"));
        Select amazonSelect=new Select(searchDropDownBox) ;

        amazonSelect.selectByVisibleText("Electronics");
        Thread.sleep(3000);
        amazonSelect.deselectByIndex(3);
    }
}
