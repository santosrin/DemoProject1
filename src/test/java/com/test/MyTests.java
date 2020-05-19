package com.test;

import com.utility.RetryAnalyser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTests {

//    @Test(retryAnalyzer = RetryAnalyser.class)
//    public void test1() {
//        Assert.assertEquals(false,true);
//    }
//
//    @Test(retryAnalyzer = RetryAnalyser.class)
//    public void test2() {
//        Assert.assertEquals(false,true);
//    }

    @Test
    public void test1() {
        Assert.assertEquals(false,true);
    }

    @Test
    public void test2() {
        Assert.assertEquals(false,true);
    }
}
