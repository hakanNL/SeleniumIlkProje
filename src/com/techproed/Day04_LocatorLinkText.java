package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_LocatorLinkText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/hknbe/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");

        WebElement singInLinki = driver.findElement(By.linkText("Sign in"));
        singInLinki.click();

        WebElement homeInLinki = driver.findElement(By.partialLinkText("Home"));

        homeInLinki.click();
    }
}
