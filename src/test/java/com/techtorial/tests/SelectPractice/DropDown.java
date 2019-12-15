package com.techtorial.tests.SelectPractice;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DropDown {

    @Test
    public void dropDown() {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://the-internet.herokuapp.com");

        WebElement searchDropdown = webDriver.findElement(By.xpath("/a[@href='/dropdown']"));
        searchDropdown.click();
        WebElement optionDropdown = webDriver.findElement(By.id("dropdown"));
        Select optionSelect = new Select(optionDropdown);
        // optionSelect.selectByIndex(2);
        optionSelect.deselectByValue("2");
        // optionSelect.deselectByVisibleText("Option 2");
        // optionSelect.getOptions();

    }
        @Test
        public void checkBox(){
            WebDriverManager.chromedriver().setup();
            WebDriver webDriver = new ChromeDriver();
            webDriver.get("http://the-internet.herokuapp.com");
            WebElement checkBox = webDriver.findElement(By.xpath("//a[@href='/checkboxes']"));
            checkBox.click();
            WebElement checkBox1 = webDriver.findElement(By.xpath("//input[@type='checkbox'][1]"));
            checkBox1.click();
          //  Select optionSelect = new Select(optionDropdown);
            Assert.assertTrue(checkBox1.isSelected());

            List<WebElement> listOfElements = webDriver.findElements(By.xpath("//input[@type='checkbox']"));
          for (WebElement checkbox: listOfElements){
              if (!checkBox.isSelected()){
                  checkbox.click();
              }
          }
        }
    }

