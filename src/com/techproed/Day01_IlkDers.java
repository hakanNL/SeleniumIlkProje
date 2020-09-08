package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:/Users/hknbe/Documents/selenium dependencies/drivers/chromedriver.exe");  // chrome driver i tanittik
        WebDriver Driver = new ChromeDriver();  // webdriver nesnesi olusturduk, chrome drivers i kullanabilir hale getirdik.
        Driver.get("http://google.com");  // driver imiza google.com a gitmesini soyledik.

       // webDriver.close();  // google kapatir
        Driver.quit(); // google acik olan tum pencereleri ile birlikte kapatir.


        
    }
}
