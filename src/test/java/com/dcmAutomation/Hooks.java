package com.dcmAutomation;

import com.dcmAutomation.DriverInstance;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    DriverInstance di=new DriverInstance();
    @Before()
    public void setUpTest(){
        di.openBrowser();


    }

    @After
    public void tearDown(){
        di.closeBrowser();


    }
}
