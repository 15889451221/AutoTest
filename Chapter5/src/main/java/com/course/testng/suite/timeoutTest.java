package com.course.testng.suite;

import org.testng.annotations.Test;

@Test(timeOut = 3000)
public class timeoutTest {
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }
}
