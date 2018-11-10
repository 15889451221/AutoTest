package com.course.testng.suite;

import org.testng.annotations.*;
import sun.awt.geom.AreaOp;

public class basicsAnnotation {

    @Test
    public void test() {
        System.out.println("test");
        System.out.println(Thread.currentThread().getId());
    }

    @Test
    public void tset() {
        System.out.println("test1");
        System.out.println(Thread.currentThread().getId());
    }

    @AfterMethod
    public void beforemethod() {
        System.out.println("AfterMethod");
    }

    @BeforeMethod
    public void beforemothod() {
        System.out.println("beboremethod");
    }

    @AfterClass
    public void AfterClass() {
        System.out.println("AfterClass");
    }

    @BeforeClass
    public void beforeclass() {
        System.out.println("BeforeClass");
    }

    @BeforeSuite
    public void beforesuite() {
        System.out.println("beforesuite");
    }

    @AfterSuite
    public void aftersuite() {
        System.out.println("aftersuite");
    }

}
