package com.course.testng.suite;

import org.testng.annotations.Test;

public class ExpectedException {

    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runExpectedException(){
        System.out.println("这是一个失败的test");
        throw new RuntimeException();
    }

    @Test( dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2");
    }

}
