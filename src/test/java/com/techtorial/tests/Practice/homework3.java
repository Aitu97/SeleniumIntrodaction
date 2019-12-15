package com.techtorial.tests.Practice;

import com.techtorial.utils.DriverUtil;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Set;

public class homework3 {


WebDriver driver;
@BeforeClass
public void setup(){
    driver= DriverUtil.driverSetup("chrome");
}
    @Test
    public void openWindow() throws InterruptedException {

        driver.get("https://learn.letskodeit.com/p/practice");
        String originalWindow= driver.getWindowHandle();
        String originalWindowTitle = driver.getTitle();
        System.out.println("First window title is :"+ originalWindow);
        driver.findElement(By.id("openwindow")).click();
        Set<String> windowHandles= driver.getWindowHandles();
        String window2="";
        for (String w:windowHandles){
            if (!w.equals(originalWindow)){
                window2=w;
            }
        }
        driver.switchTo().window(window2);
        String window2Title = driver.getTitle();
        Thread.sleep(4000);
        //Assert by title
        Assert.assertTrue(!originalWindowTitle.equals(window2Title));
        //Assert by url
        Assert.assertEquals("https://letskodeit.teachable.com/courses",driver.getCurrentUrl());
        //Assert by handle
        System.out.println(window2);
        Assert.assertFalse(originalWindow.equalsIgnoreCase(window2));
    }





        public void horizMethod(int a) throws Exception {
            driver.get("http://the-internet.herokuapp.com/horizontal_slider");
            WebElement slider=driver.findElement(By.xpath("//input[@type='range']"));
            Actions actions= new Actions(driver);
            if (a==1) {
                actions.dragAndDropBy(slider,1,0).perform() ;
            }else if (a==2) {
                actions.dragAndDropBy(slider,10,0).perform() ;
            }else if (a==3) {
                actions.dragAndDropBy(slider,20,0).perform() ;
            }else if (a==4) {
                actions.dragAndDropBy(slider,30,0).perform() ;
            }else if (a==5) {
                actions.dragAndDropBy(slider,40,0).perform() ;
            }else {
                throw new Exception("incorrect input ");
            }
        }

        //    @Test
//
//    public void testSlider() {
//        driver.get("http://the-internet.herokuapp.com/horizontal_slider");
//        WebElement slider=driver.findElement(By.xpath("//input[@type='range']"));
//
//        Actions actions= new Actions(driver);
//
//         actions.dragAndDropBy(slider,50,0).perform() ;
//
//        }
        @Test
        public void horizMethod2() throws Exception {
            horizMethod(1);
        }

        }



