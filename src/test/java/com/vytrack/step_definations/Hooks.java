package com.vytrack.step_definations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("\tThis is coming from BEFORE");
    }

    @After
    public void tearDown(){
        System.out.println("\tThis is coming from AFTER");
    }

    @Before("@db")
    public void setUpDB(){
        System.out.println("\tConnecting to database...");
    }

    @After("@db")
    public void tearDownDB(){
        System.out.println("\tDisconnecting to database...");
    }

}
