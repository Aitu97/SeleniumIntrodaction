package com.techtorial.tests.actionPractice;
import com.techtorial.utils.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWorkHovers {
    static WebDriver driver;


    @BeforeClass
    public void setup() {
        driver = DriverUtil.driverSetup("Chrome");
    }

    @Test
    public void hovers() throws InterruptedException {
        Actions act=new Actions(driver);
        driver.get("https://the-internet.herokuapp.com/hovers");
        WebElement hover1=driver.findElement(By.xpath("//a[@href='/users/1']"));
        WebElement hover2=driver.findElement(By.xpath("//a[@href='/users/2']"));
        WebElement hover3=driver.findElement(By.xpath("//a[@href='/users/3']"));


        WebElement avatar1=driver.findElement(By.xpath("//a[@href='/users/1']/../../img"));
        WebElement avatar2=driver.findElement(By.xpath("//a[@href='/users/2']/../../img"));
        WebElement avatar3=driver.findElement(By.xpath("//a[@href='/users/3']/../../img"));

        Thread.sleep(2000);
        Assert.assertFalse(hover1.isDisplayed());
        Assert.assertFalse(hover2.isDisplayed());
        Assert.assertFalse(hover3.isDisplayed());
        Thread.sleep(2000);

        act.moveToElement(avatar1).build().perform();
        Assert.assertTrue(hover1.isDisplayed());
        Assert.assertFalse(hover2.isDisplayed());
        Assert.assertFalse(hover3.isDisplayed());
        Thread.sleep(2000);

        act.moveToElement(avatar2).build().perform();
        Assert.assertFalse(hover1.isDisplayed());
        Assert.assertTrue(hover2.isDisplayed());
        Assert.assertFalse(hover3.isDisplayed());
        Thread.sleep(2000);

        act.moveToElement(avatar3).build().perform();
        Assert.assertFalse(hover1.isDisplayed());
        Assert.assertFalse(hover2.isDisplayed());
        Assert.assertTrue(hover3.isDisplayed());

    }
}




