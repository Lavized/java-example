package com.flex;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class TestLaunch {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start(){
        driver = ConnectToWebDriver.getWebDriver();
       /* driver = new ChromeDriver(new ChromeDriverService.Builder()
                                        .usingDriverExecutable(new File(
                                                "D:\\dima\\tech\\idea_projects\\java-example\\src\\test\\resources\\drivers\\chromedriver.exe"))
                .build());*/
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
