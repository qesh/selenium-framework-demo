package com.app.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private Driver(){}
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver==null){
            switch (ConfigurationReader.getProperty("browser")){
                case "chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();
                    break;
                case "edge" :
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    break;
                default:
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
            }
        }
        return driver;
    }

    public static void closeDriver(){
        if(driver != null){
            driver.quit();
            driver.close();
        }
    }
}
