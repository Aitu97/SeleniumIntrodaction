package com.techtorial.tests.TestNGPractice;

import org.testng.annotations.*;

public class TestNG_Annotations1 {

    @Test(priority = 1)
    public void test1(){
        System.out.println("this is test1");
    }
    @Test(priority = 2, alwaysRun = true)
    public void test2(){
        System.out.println("this is test2");
    }
    @Test(priority = 3, enabled = true)
    public void test3(){
        System.out.println("this is test 3");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("this is before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("this is after method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("this is before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("this is after class");
    }




}
