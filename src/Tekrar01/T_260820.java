package Tekrar01;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverAction;

public class T_260820 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "C:/Users/hknbe/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.navigate().to("https://www.amazon.com");
        driver.manage().window().maximize();
        WebElement aramaCubugu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaCubugu.sendKeys(" Selenium book");
        aramaCubugu.submit();







    }
}
