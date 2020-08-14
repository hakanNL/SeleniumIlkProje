package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/hknbe/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");

        String youtubeTitle = driver.getTitle();
        if( youtubeTitle.contains("Video") ){
            System.out.println("Var: "+youtubeTitle);
        }else {
            System.out.println("Yok: " + youtubeTitle);

        }
    }
}
