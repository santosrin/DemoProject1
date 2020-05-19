package com.datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HalfEbdayTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.google.driver","/Users/santoshsrinivas/Documents/DemoProject1/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
    }


    @DataProvider
    public void getTestData() {

    }

    @Test
    public void halfEfbayRegPageTest(String firstname , String lastname , String address1, String address2,
                                     String city , String state , String zipcode , String emailaddress) {

        //enter data
        driver.findElement(By.xpath("//input[@id='firstname']")).clear();
        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(firstname);

        driver.findElement(By.xpath("//input[@id='lastname']")).clear();
        driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(lastname);

        driver.findElement(By.xpath("//input[@id='address1']")).clear();
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys(address1);

        driver.findElement(By.xpath("//input[@id='address2']")).clear();
        driver.findElement(By.xpath("//input[@id='address2']")).sendKeys(address2);

        driver.findElement(By.xpath("//input[@id='city']")).clear();
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);

        driver.findElement(By.xpath("//select[@id='state']")).clear();
        driver.findElement(By.xpath("//select[@id='state']")).sendKeys(state);

        driver.findElement(By.xpath("//input[@id='zip']")).clear();
        driver.findElement(By.xpath("//input[@id='zip']")).sendKeys(zipcode);

        driver.findElement(By.xpath("//input[@id='email']")).clear();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailaddress);

        driver.findElement(By.xpath("//input[@id='retype_email']")).clear();
        driver.findElement(By.xpath("//input[@id='retype_email']")).sendKeys(emailaddress);

    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

