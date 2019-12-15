package com.techtorial.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.Assert;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class PracticePage {

    WebDriver driver = driverSetup();

    @Test
    public void radioButton(){

        driver.get("https://learn.letskodeit.com/p/practice");
        WebElement BMWButton = driver.findElement(By.xpath("//input[@id='bmwradio']"));
        BMWButton.click();


    }

    @Test
    public void selectClassExample(){

        driver.get("https://learn.letskodeit.com/p/practice");
       // WebElement carSelect = driver.findElement(By.xpath("//select[@id='carselect']"));
       // carSelect.click();
       // WebElement carSelect2 = driver.findElement(By.xpath("//option[@value='benz']"));
      //  carSelect2.click();

       Select carSelect3 =  new Select(driver.findElement(By.id("multiple-select-example")));

       carSelect3.selectByVisibleText("Apple");
       carSelect3.selectByVisibleText("Orange");
       carSelect3.selectByVisibleText("Peach");

       carSelect3.deselectByVisibleText("Orange");

    }

    @Test
    public void multipleSelectExample(){

        driver.get("https://learn.letskodeit.com/p/practice");
        WebElement carSelect = driver.findElement(By.xpath("//option[@value='apple']"));
        carSelect.click();
        WebElement carSelect2 = driver.findElement(By.xpath("//option[@value='orange']"));
        carSelect2.click();

    }

    @Test
    public void checkBoxExample(){

        driver.get("https://learn.letskodeit.com/p/practice");
        WebElement checkbox = driver.findElement(By.xpath("//input[@id='bmwcheck']"));
        checkbox.click();

    }

    @Test
    public void newWindow(){
        driver.get("https://learn.letskodeit.com/p/practice");
        WebElement newWindow = driver.findElement(By.xpath("//button[@id='openwindow']"));

        String firstWindowTitle = driver.getTitle();
        System.out.println("first window title is "+ firstWindowTitle);
        String firstWindowHandle = driver.getWindowHandle();

        Set<String > setOfDataHandles = driver.getWindowHandles();

        newWindow.click();
        String secondWindowHandle = "";
        for (String handle : setOfDataHandles){
            if (!handle.equalsIgnoreCase(firstWindowHandle)) {
                secondWindowHandle = handle;
            }

        }
        driver.switchTo().window(secondWindowHandle);
        String secondWindowTitle = driver.getTitle();

        Assert.assertFalse(firstWindowTitle.equalsIgnoreCase(secondWindowTitle));


       // driver.getWindowHandle();
       // driver.getTitle();
        //Assert.assertTrue(newWindow.isSelected());

    }

    @Test
    public void drug (){

        driver.get("http://the-internet.herokuapp.com/horizontal_slider");
     //   WebElement horizontalSlider = driver.findElement(By.xpath("//a[@href='/horizontal_slider']"));
       // horizontalSlider.click();

        WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
        Actions actions = new Actions(driver);

        actions.clickAndHold(slider).moveByOffset(30,0).perform();

    }

    @Test
    public void hover (){

        driver.get("http://the-internet.herokuapp.com/hovers");
        WebElement hoversText = driver.findElement(By.xpath("//h3"));
        Assert.assertEquals("Hovers", hoversText.getText());

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//[@href='users/2]/../..img"))).perform();

        WebElement username = driver.findElement(By.xpath("//a[@href='/users/2']//preceding-sibling::h5"));
        Assert.assertTrue(username.getText().contains("user 2"));

    }

    public static  WebDriver driverSetup(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        return driver;
    }


}
