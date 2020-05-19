package com.test;

import org.testng.annotations.*;

public class TestNgBasics {

    @BeforeSuite
    public void setup(){
        System.out.println("BeforeSuite - setup system property for chrome");
    }

    @BeforeTest
    public void launchBrowser() {
        System.out.println("BeforeTest - launch chrome browser");
    }

    @BeforeClass
    public void login() {
        System.out.println("BeforeClass - login");
    }

    @BeforeMethod
    public void enterUrl() {
        System.out.println("BeforeMethod - Enter url");
    }

    @Test
    public void googleTitleTest(){
        System.out.println("Test - Google Title Test");
    }

    @Test
    public void searchTest() {
        System.out.println("Test - searchTest");
    }

    @Test
    public void googleLogoTest() {
        System.out.println("Test - googleLogoTest");
    }

    @AfterMethod
    public void logout(){
        System.out.println("AfterMethod - logout");
    }

    @AfterClass
    public void closeBrowser() {
        System.out.println("AfterClass - closebrowser");
    }

    @AfterTest
    public void deleteAllCookies() {
        System.out.println("AfterTest - deleteAllCookies");
    }

    @AfterSuite
    public void generateTestReport() {
        System.out.println("AfterSuite - generateTestReport");
    }
}
