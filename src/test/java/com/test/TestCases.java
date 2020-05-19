package com.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCases {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void test1() {
        System.out.println("Open Browser");
        Assert.assertEquals(true,true);
        System.out.println("enter username");
        System.out.println("enter password");
        System.out.println("click sign in button");
        Assert.assertEquals(true,true);
        System.out.println("validate home page");
        softAssert.assertEquals(true,false,"message1");
        System.out.println("go to deals page");
        System.out.println("create a deal");
        softAssert.assertEquals(true,false);
        System.out.println("go to contacts page");
        System.out.println("create a contact");
        softAssert.assertEquals(true,false);

        softAssert.assertAll();
    }

    @Test
    public void test2() {
        System.out.println("Open Browser");
        softAssert.assertEquals(true,false);
        softAssert.assertAll();
    }



}
