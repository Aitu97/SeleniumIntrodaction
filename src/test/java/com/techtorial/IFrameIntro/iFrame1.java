package com.techtorial.IFrameIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class iFrame1 {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void amazon() {

          driver.navigate().to("https://www.amazon.com/");
          driver.findElement(By.id("ape_Gateway_desktop-ad-center-1_desktop_iframe")).click();

        //  JavascriptExecutor js=(JavascriptExecutor) driver;
        //   driver.manage().window().maximize();
        //  js.executeScript("window.scrollBy(0.1500)");
        // js.executeScript("//img[@alt='Amazon Gift Cards']");

        // WebElement iframe = driver.findElement(By.xpath("//img[@alt='Amazon Gift Cards']"));
        // iframe.click();


    }
        @Test
        public void iFrame(){


        driver.navigate().to("http://the-internet.herokuapp.com/iframe");

        // switch to frame using
       driver.switchTo().frame("mce_0_ifr");

        // switch to frame by using index
      //  driver.switchTo().frame(0);


            //switch to frame using WebElement
        WebElement element = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(element);

        WebElement textField = driver.findElement(By.id("tinymce"));
        driver.switchTo().frame(textField);

      //  WebElement text = driver.findElement(By.xpath("//*[@id=\"tinymce\"]"));
        textField.clear();
        textField.sendKeys("hello from techtorial class!");
        textField.getText();

        //going out of the iFrame (only 1 step out)
        driver.switchTo().parentFrame();

        // this will bring to the very first iFrame
        driver.switchTo().defaultContent();




    }

}
