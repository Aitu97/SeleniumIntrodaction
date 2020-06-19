package com.techtorial.tests.Practice;

import com.techtorial.utils.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;

public class ExpediaProject {


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

        WebElement returningDate = driver.findElement(By.xpath("//input[@id='flight-returning-hp-flight']"));
        returningDate.sendKeys("02/10/20");
        returningDate.click();

        WebElement departingDate = driver.findElement(By.xpath("//input[@id='flight-departing-hp-flight']"));
        departingDate.sendKeys("01/20/20");
        departingDate.click();
        Thread.sleep(3000);


        WebElement button = driver.findElement(By.xpath("//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/button"));
        button.click();

       // WebElement button = driver.findElement(By.xpath("//button[@type='button']"));
       // button.click();

      //  WebElement howManyAdult = driver.findElement(By.xpath("//div[@id=\"traveler-selector-hp-flight\"]/div/ul/li/div/div/div/div[1]/div[4]/button"));
      //  howManyAdult.click();

        WebElement howManyAdult = driver.findElement(By.xpath("//div[@id=\"traveler-selector-hp-flight\"]/div/ul/li/div/div/div/div[1]/div[4]/button"));
        howManyAdult.click();
        Thread.sleep(2000);

        WebElement searchCLick = driver.findElement(By.xpath("//*[@id=\"gcw-flights-form-hp-flight\"]/div[7]/label/button"));
        searchCLick.click();
        Thread.sleep(8000);
        WebElement departureTicket = driver.findElement(By.xpath("(//button[@data-test-id='select-button'])[1]"));
        departureTicket.click();
        Thread.sleep(5000);
        String originalWindowHandle= driver.getWindowHandle();
        WebElement returnTicket=driver.findElement(By.xpath("(//button[@data-test-id='select-button'])[1]"));
        returnTicket.click();
        WebElement selectFare=driver.findElement(By.xpath("//*[@id=\"basic-economy-tray-content-1\"]/div/div/div[1]/button"));
        selectFare.click();
        Thread.sleep(5000);
        WebElement returnTicket2=driver.findElement(By.xpath("(//button[@data-test-id='select-button'])[1]"));
        returnTicket2.click();
        Set<String> setOfWindowHandles = driver.getWindowHandles();
        String secondWindowHandle="";
        for (String dh:
                setOfWindowHandles) {
            if (!dh.equalsIgnoreCase(originalWindowHandle)){
                secondWindowHandle=dh;
            }
        }
        driver.switchTo().window(secondWindowHandle);
        Thread.sleep(10000);
        WebElement booking= driver.findElement(By.xpath("//button[@id=\"bookButton\"]"));
        booking.click();



    }
}
