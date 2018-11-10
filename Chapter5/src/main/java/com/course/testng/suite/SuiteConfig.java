package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {

    @BeforeSuite
    public void beforesuite() {
        System.out.println();
        System.out.println("beforesuite 运行了");
    }

    @AfterSuite(enabled = true)
    public void afterSuite() {
        System.out.println("aftersuite 运行了");
    }
    @BeforeTest
    public void beforetest(){
        System.out.println("beforetest 运行");
    }
    @AfterTest
    public void aftertest(){
        System.out.println("aftertest 运行");
    }
}
