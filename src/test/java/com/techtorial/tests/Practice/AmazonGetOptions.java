package com.techtorial.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class AmazonGetOptions {

    @Test
    public void getAllOption(){
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver=new ChromeDriver();

        webDriver.get("https://www.amazon.com");
        WebElement dropDown = webDriver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        dropDown.click();
        Select select = new Select(dropDown);
        List<WebElement> webElements=select.getOptions();

        int i = 0;
        for (WebElement dropDownOption:
        webElements){

            System.out.println(++i + "." +dropDownOption.getText());

        }
    }
}
