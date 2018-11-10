package com.course.testng.suite;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class groups {
    @Test(groups = "server")
    public void groupsonmethod() {
        System.out.println("服务端1");
    }

    @Test(groups = "server")
    public void groupsonmethod2() {
        System.out.println("服务端2");
    }

    @Test(groups = "client")
    public void groupsonmethod3() {
        System.out.println("客户端1");
    }

    @Test(groups = "client")
    public void groupsonmethod4() {
        System.out.println("客户端2");
    }

    @BeforeGroups(groups = "server")
    public void gorupsonserver() {
        System.out.println("beforegroups");
    }

    @AfterGroups(groups = "server")
    public void gorupsonserver2() {
        System.out.println("AfterGroups");
    }

    @BeforeGroups(groups = "client")
    public void gorupsonserver3() {
        System.out.println("client 1");
    }

    @AfterGroups(groups = "client")
    public void gorupsonserver4() {
        System.out.println("client 2");
    }
}
