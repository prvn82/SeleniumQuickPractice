package com.selenium.in;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg {


    @Test(priority = 0)
    public void test6(){
        new AssertionError("testing");
    }
    @Test(priority = -1)
    public void test2(){
        Assert.fail();
    }

    @Test(priority = 1)
    public void test3(){
        Assert.assertTrue(true);
    }

    @Test(priority = 2)
    public void test4(){
        Assert.assertTrue(true);
    }

    @Test
    public void test5(){
        System.out.println("Testing all");
    }




}
