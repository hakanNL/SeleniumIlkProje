package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:/Users/hknbe/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.google.com");   // google drive gitmesini soyledik
        webDriver.navigate().to("http://amazon.com"); // get komutu ile ayni islemi yapiyor
        webDriver.navigate().back();   // bir onceki sayfaya donme islemi yapar
        webDriver.navigate().forward();  // tekrar birsonraki sayfaya gider. ilerleme...
        webDriver.navigate().refresh();


    }}
