package com.techtorial.tests.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class AmazonPrices {

    @Test
    public void amazonPrices(){

        WebDriverManager.chromedriver().setup();
        WebDriver webDriver=new ChromeDriver();
        webDriver.get("https://www.amazon.com");

        WebElement search = webDriver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("laptop"+ Keys.ENTER);

        List<WebElement> prices = webDriver.findElements(By.xpath("//span[@class='a-price']"));

        double totalPrice = 0;

        for (int i=0; i<prices.size(); i++){
            try{
                String priceStr=prices.get(i).getText().substring(1).replace("\n", ".");
                System.out.println(priceStr);
                totalPrice = totalPrice+Double.parseDouble(priceStr);

            }catch (StringIndexOutOfBoundsException | NumberFormatException e){
                System.out.println("Some exception was thrown");
                // throw new run time exception ==> this will stop the execution of application
            }
        }
        System.out.println("total price of products on the page is "+totalPrice);
    }
}
