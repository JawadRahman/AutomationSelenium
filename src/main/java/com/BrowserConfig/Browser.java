package com.BrowserConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
    public static WebDriver driver;
    public static void main(String[] args) {
        Chrome_open();
        Open_url();
        Browser_close();
        Firefox_open();
        Open_url();
        Browser_close();
    }

    public static void Chrome_open(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
    }

    public static void Firefox_open(){
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        driver=new FirefoxDriver();
    }


    public static void Browser_close(){
        driver.close();
    }

    public static void Open_url(){
        driver.get("https://www.youtube.com");
    }

}
