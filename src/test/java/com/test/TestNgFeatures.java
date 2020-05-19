package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures {

    @Test
    public void loginTest() {
        System.out.println("login test");
        //int i = 9/0;
    }

    @Test(dependsOnMethods = "loginTest")
    public void homePageTest() {
        System.out.println("homePageTest");
    }

    @Test(dependsOnMethods = "loginTest")
    public void search() {
        System.out.println("search test");
    }

    @Test(dependsOnMethods = "loginTest")
    public void registration() {
        System.out.println("registration test");
    }
}
