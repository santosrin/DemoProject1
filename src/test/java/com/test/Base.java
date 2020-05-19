package com.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Base {

    public static WebDriver driver;

    public static void initialization() {
        System.setProperty("webdriver.chrome.driver","/Users/santoshsrinivas/Documents/DemoProject1/drivers/chromedriver");
        //WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    public void failed(String testMethod) throws IOException {
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile,new File("/Users/santoshsrinivas/Documents/DemoProject1/src" +
                "/test/screenshots/"+testMethod+".jpg" ));
    }
}
