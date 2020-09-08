package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test02 {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "C:/Users/hknbe/Documents/selenium dependencies/drivers/chromedriver.exe");  // chrome driver i tanittik
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.walmart.com");
        driver.manage().window().maximize();
        driver.navigate().refresh();

       String sayfaBasligi= driver.getTitle();
       String arananKelime="Save";

       if(sayfaBasligi.contains(arananKelime)) {
           System.out.println("Sayfa Basligi: " + arananKelime + "    iceriyor. Test PASS");
       }else{
           System.out.println("FAILED");
       }

       
        driver.close();
    }
}