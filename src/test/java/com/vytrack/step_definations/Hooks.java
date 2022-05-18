package com.vytrack.step_definations;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp(){
        Driver.get().manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","screenshot");
        }

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
