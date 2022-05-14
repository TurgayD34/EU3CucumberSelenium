package com.vytrack.step_definations;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        Driver.get().manage().window().maximize();
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
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
