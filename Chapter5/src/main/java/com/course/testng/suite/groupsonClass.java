package com.course.testng.suite;


import org.testng.annotations.Test;

@Test(groups = "str")
public class groupsonClass {
    public void group(){
        System.out.println("group1运行");
    }
    public void groupother(){
        System.out.println("groupother运行");
    }
}
