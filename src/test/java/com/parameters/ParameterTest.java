package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    WebDriver driver;

    @Test
    @Parameters({"browser","url","emailId"})
    public void yahooLoginTest(String browser,String url , String emailId){
        if(browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver","/Users/santoshsrinivas/Documents/DemoProject1/drivers/chromedriver");
            driver = new ChromeDriver();
        } else if(browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver","/Users/santoshsrinivas/Documents/DemoProject1/drivers/geckodriver");
            driver = new ChromeDriver();
        }
        driver.get(url);
        driver.findElement(By.xpath("//input[@id='login-username']")).clear();
        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(emailId);
        driver.findElement(By.xpath("//input[@id='login-signin']")).click();

    }
}
