package com.service.hello.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestHello {

        HelloDelegate helloDelegate = new HelloDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = helloDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}