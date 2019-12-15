package com.techtorial.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ToolsQA {

    @Test
    public void toolsQA() throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.toolsqa.com/automation-practice-form/");
            WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
            firstName.sendKeys("Jan");
            firstName.click();
            WebElement lastName=driver.findElement(By.xpath("//input[@id='lastname']"));
            lastName.sendKeys("Askarov");
            lastName.click();
            WebElement selectSex=driver.findElement(By.xpath("//input[@id=\"sex-0\"]"));
            selectSex.click();
      driver.manage().window().maximize();
            WebElement years=driver.findElement(By.xpath("//input[@id=\"exp-5\"]"));
            years.click();
            WebElement date=driver.findElement(By.xpath("//input[@id=\"datepicker\"]"));
            date.sendKeys("10/01/2019");
            date.click();
            WebElement prof=driver.findElement(By.xpath("//input[@id=\"profession-1\"]"));
            prof.click();
            WebElement tool=driver.findElement(By.xpath("//input[@id=\"tool-2\"]"));
            tool.click();
            WebElement continent=driver.findElement(By.xpath("//select[@id=\"continents\"]"));
            Select optionSelect = new Select(continent);
            optionSelect.selectByIndex(1);
            WebElement multiContinent = driver.findElement(By.xpath("//select[@id=\"continentsmultiple\"]"));
            Select multiSelect=new Select(multiContinent);
            multiSelect.selectByValue("AS");
            multiSelect.selectByValue("EU");
        }


      /*
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.toolsqa.com/automation-practice-form/");


        WebElement firstName = webDriver.findElement(By.xpath("/input[@name='firstname']"));
        firstName.sendKeys("Aitu");
        firstName.click();


        WebElement lastName = webDriver.findElement(By.xpath("/input[@id='lastname']"));
        lastName.sendKeys("Anarbaeva");
        firstName.click();

        WebElement sex = webDriver.findElement(By.xpath("//input[@id='sex-1']"));
        sex.click();

        WebElement experience = webDriver.findElement(By.xpath("//input[@id='exp-2']"));
        experience.click();

        WebElement datePicker = webDriver.findElement(By.xpath("//input[@id='datepicker']"));
        datePicker.sendKeys("10/10/2019");
        datePicker.click();


        WebElement profession = webDriver.findElement(By.xpath("/input[@id='profession-1']"));
        profession.click();

       */


    }

