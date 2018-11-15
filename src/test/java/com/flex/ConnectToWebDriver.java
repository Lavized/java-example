package com.flex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.sql.DriverManager;

public class ConnectToWebDriver {

    public static WebDriver getWebDriver(){
        System.setProperty("webdriver.gecko.driver",
                String.valueOf(new File(DriverManager.class.getResource("/drivers/geckodriver.exe").getFile())));
        return new FirefoxDriver();
    }

}
