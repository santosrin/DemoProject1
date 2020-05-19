package com.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FBTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","/Users/santoshsrinivas/Documents/DemoProject1/drivers/chromedriver");
        //WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
    }

    @Test(priority = 1)
    public void fbTitle() {
        String title = driver.getTitle();
        System.out.println("Title is :" + title);
        Assert.assertEquals(title.toString(), "Facebook – log in or sign up");
    }


    @Test(priority = 2)
    public void fbTitle1() {
        String title = driver.getTitle();
        System.out.println("Title is :" + title);
        Assert.assertEquals(title.toString(), "Facebook – log in or sign up1");
    }


    @Test(priority = 3)
    public void fbTitle2() {
        String title = driver.getTitle();
        System.out.println("Title is :" + title);
        Assert.assertEquals(title.toString(), "Facebook – log in or sign up2    ");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

