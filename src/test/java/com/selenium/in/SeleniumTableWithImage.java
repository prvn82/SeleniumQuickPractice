package com.selenium.in;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumTableWithImage {


    static WebDriver driver=null;

    public static void main(String[] args) {

        try {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://aquabottesting.com/tables-example2.html");

            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();

            WebElement el = driver.findElement(By.xpath("//table[@id='pricing-table']"));
            System.out.println("Number of rows in employee table " + el.findElements(By.xpath(".//tbody/tr")).size());

            List<WebElement> elements = el.findElements(By.xpath(".//tbody/tr"));

            for (WebElement e : elements) {
                if (!e.getText().contains("Available")) {
                    if(e.findElement(By.xpath(".//td[5]")).getAccessibleName().contains("checkmark")){
                        System.out.println(e.findElement(By.xpath(".//td[2]")).getText()+" is available");
                    }
                }

            }



            //Filter table and  verify

            driver.findElement(By.id("filter-input")).sendKeys("Meh");
           // Thread.sleep(10000);
            List<WebElement> elements1 = driver.findElements(By.xpath("//table[@id='filter-table']/tbody/tr"));

            //driver.findElement(By.)

            for(WebElement e : elements1) {
                if (!e.getAttribute("style").equals("display: none;")) {
                    if(e.getText().contains("Mehreen")){
                        System.out.println("!!Yuieee search feature worked");
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }




    }
}
