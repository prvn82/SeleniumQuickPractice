package com.selenium.in;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumTable {

    public static void main(String[] args) {
        WebDriver driver = null;

        try {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://www.w3schools.com/html/html_tables.asp");

            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            WebElement el = driver.findElement(By.xpath("//table[@id='customers']"));
            System.out.println("Number of rows in employee table " + el.findElements(By.xpath(".//tbody/tr")).size());

            List<WebElement> elements = el.findElements(By.xpath(".//tbody/tr"));

            for (WebElement e : elements) {
                int counter=0;
                if (!e.getText().contains("Country")) {
                    counter++;
                String country = e.findElement(By.xpath(".//td[3]")).getText();
                System.out.println("Country name is " + country);

                if(country.equals("Mexico")){
                    String contact = e.findElement(By.xpath(".//td[2]")).getText();
                    String Company = e.findElement(By.xpath(".//td[1]")).getText();

                    System.out.println("Mexico country has company "
                    + Company+" with contactname "+contact);
                    System.out.println("This information is available at row number "+counter);
                }


            }
            }

        }finally {
            driver.quit();
        }







    }
}
