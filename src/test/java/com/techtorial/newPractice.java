package com.techtorial;

import com.techtorial.utils.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class newPractice {

    WebDriver driver;
    @BeforeClass
    public void setup() {
        driver = DriverUtil.driverSetup("Chrome");
    }

    @Test
    public void Expedia() throws InterruptedException {

        driver.get("https://www.expedia.com/");

        WebElement flight = driver.findElement(By.xpath("//button[@id='tab-flight-tab-hp']"));
        flight.click();

        WebElement selectCity = driver.findElement(By.xpath("//input[@id='flight-origin-hp-flight']"));
        selectCity.click();
        selectCity.sendKeys("Chicago");
        selectCity.click();

        WebElement whereToFly = driver.findElement(By.xpath("//input[@id='flight-destination-hp-flight']"));
        whereToFly.click();
        whereToFly.sendKeys("San Francisco");
        whereToFly.click();

        WebElement departingDate = driver.findElement(By.xpath("//input[@id='flight-departing-hp-flight']"));
        departingDate.sendKeys(Keys.chord(Keys.COMMAND, "a"),"01/20/20");
        departingDate.click();
        Thread.sleep(3000);
        
        WebElement returningDate = driver.findElement(By.xpath("//input[@id='flight-returning-hp-flight']"));
        returningDate.sendKeys("02/10/20");
        returningDate.click();



        WebElement button = driver.findElement(By.xpath("//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/button"));
        button.click();

    }
}
