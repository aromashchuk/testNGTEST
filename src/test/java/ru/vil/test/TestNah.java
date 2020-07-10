package ru.vil.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNah {
    WebDriver driver;

@BeforeMethod
    public void init(){
   System.getProperty("webdriver.chrome.driver", "c:/chromedriver");
driver = new ChromeDriver();
}

@Test
    public void test(){
        driver.get("https://google.com");
}

@AfterMethod
    public void shutDown(){
        driver.quit();
}
}
