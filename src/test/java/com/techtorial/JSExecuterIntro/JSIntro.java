package com.techtorial.JSExecuterIntro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JSIntro {

    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void jsTest() throws InterruptedException {

        /*
       driver.get("https://www.google.com/");
        // javaScriptExecutor

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location='https://www.google.com/'");

        //  driver.getTitle();

        String title = js.executeScript("return document.title").toString();

        System.out.println("my page's title is " + title);

      //  driver.getCurrentUrl();

        String url = js.executeScript("return document.URL").toString();

        System.out.println("my page's url is " + url);




        //generate a custom alert
        js.executeScript("alert(My custom alert)");

      //

         */


        // 1 way
     //   driver.get("https://www.google.com/");
        // 2 way
        //JavascriptExecutor
        JavascriptExecutor js=(JavascriptExecutor) driver;
      //  js.executeScript("window.location='https://www.google.com/'");
        String title = js.executeScript("return document.title").toString();
       System.out.println("My page's title is: "+ title);
       String url=js.executeScript("return document.URL").toString();
        System.out.println("My page's URL is:"+url);
       // js.executeScript("window.scrollBy(0,500)");
      //  js.executeScript("alert('My custom alert')");

     //   WebElement button = driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@value='Google Search']"));
       //  js.executeScript("arguments[0].click()",button);


        driver.navigate().to("https://www.amazon.com/");
         //sendKeys alternative
    js.executeScript("document.getElementById('twotabsearchtextbox').value='iphone';");


        //scroll down/up
      //    driver.navigate().to("https://www.expedia.com/");
       // js.executeScript("window.scrollBy(0.1500)");
       //  Thread.sleep(4000);
      //  js.executeScript("window.scrollBy(0.-1500)");

    }
}
