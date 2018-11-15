package com.flex;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class TestLaunch {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start(){
        driver = ConnectToWebDriver.getWebDriver();
        wait = new WebDriverWait(driver,10);

    }


    @Test
    public void myFIrstTest(){
        driver.get("http:/google.com");
       WebElement searchField =  driver.findElement(By.name("q"));
       searchField.sendKeys("webdriver");
       searchField.submit();
        wait.until(titleIs("webdriver - Поиск в Google"));

    }

    @After
    public void stop(){
        driver.quit();
        driver = null;
    }

}
