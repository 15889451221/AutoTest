package com.course.testng.suite;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataproviderTest {
    @Test(dataProvider="data")
    public void testdataProvider(String name, int age) {
        System.out.println("name=" + name + ";age=" + age);
    }

    @DataProvider(name = "data")
    public Object[][] ProviderData() {
        Object[][] o = new Object[][]{
                {"zahngsan", 10},
                {"lisi", 20}
        };
        return o;
    }
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("name="+name+"age="+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("name="+name+"age="+age);
    }
    @DataProvider(name = "methodData")
    public Object[][] methodDtaTest(Method method){
         Object[][] result =null;
        if (method.getName().equals("test1")){
            result =new Object[][]{
                    {"zhangsan",30},
                    {"lisi",40}
            };
        }else if (method.getName().equals("test2")){
            result = new Object[][]{
                    {"wangwu",50},
                    {"zhaoliu",60}
            };
        }
        return result;
    }


}