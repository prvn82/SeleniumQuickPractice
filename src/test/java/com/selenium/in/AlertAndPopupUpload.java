package com.selenium.in;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndPopupUpload {

    static WebDriver driver=null;

    public static void main(String[] args) {



        try{

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();

            driver.findElement(By.xpath("//input[@title='Sign in']")).click();

           Alert alert= driver.switchTo().alert();
            System.out.println(alert.getText());
            alert.dismiss();
           // alert.sendKeys("sjhshs");


            driver.switchTo().newWindow(WindowType.TAB);

            driver.get("https://www.google.com");

            System.out.println(driver.getCurrentUrl());

            Thread.sleep(10000);

            System.out.println(driver.getWindowHandles().size());

            driver.switchTo().newWindow(WindowType.WINDOW);
            driver.get("https://twitter.com/");

            System.out.println(driver.getCurrentUrl());

            driver.getWindowHandles();
           // driver.findElement(By.className("sjssj")).
            driver.close();






        } catch (Exception e){

         e.printStackTrace();

        }

        finally {
            driver.quit();
        }
    }
}
