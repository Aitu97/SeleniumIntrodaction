package com.techtorial.tests.WindowHandle;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.Set;

public class MultiWindow {
 WebDriver driver = driverSetup();



    @Test
            public void windowIntro() throws InterruptedException {
      // WebDriverManager.chromedriver().setup();
       // WebDriver webDriver = new ChromeDriver();

        //navigate to web page
        driver.get("http://the-internet.herokuapp.com");
        String originalWindowHandler = driver.getWindowHandle();
        //click on the window link
        WebElement windowLink = driver.findElement(By.xpath("//a[@href='/windows']"));
        windowLink.click();

        //click on the new page link
        WebElement newWindow = driver.findElement(By.xpath("//a[@href='/windows/new']"));
        newWindow.click();

        Set<String> setOfWindowHandle = driver.getWindowHandles();

        String secondWindowHandle="";
        for (String dh:
           setOfWindowHandle  ) {
            if (!dh.equalsIgnoreCase(originalWindowHandler)){
                secondWindowHandle =dh;
            }
        }
       driver.switchTo().window(secondWindowHandle);

        //
        WebElement newWindowText = driver.findElement(By.xpath("//div[@class='example']"));
        System.out.println(newWindowText.getText());
        driver.getWindowHandle();



        driver.switchTo().window(originalWindowHandler);
        newWindow.click();

        Thread.sleep(3000);


        Set<String> threeWindowsHandles= driver.getWindowHandles();


        String thirdDataHandle="";
        for (String datahandle: threeWindowsHandles){
        if (!datahandle.equalsIgnoreCase(originalWindowHandler)&& !datahandle.equalsIgnoreCase(secondWindowHandle)){
       thirdDataHandle=datahandle;
    }
}

       driver.switchTo().window(thirdDataHandle);

    }

    @AfterTest
    public void tearDown(){


        driver.quit();
    }


    public static  WebDriver driverSetup(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        return driver;
    }

}
