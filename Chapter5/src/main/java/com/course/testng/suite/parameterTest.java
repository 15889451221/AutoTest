package com.course.testng.suite;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterTest {

    @Parameters({"name","age"})
    @Test
    public void Parameter1(String name,int age){
        System.out.println("name="+name+"age="+age);
    }
}