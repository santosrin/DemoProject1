package com.test;

import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class CustomeListener extends Base implements ITestListener {

    public void onTestFailure(ITestResult result) {
        System.out.println("FAILED test");
        try {
            failed(result.getMethod().getMethodName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
