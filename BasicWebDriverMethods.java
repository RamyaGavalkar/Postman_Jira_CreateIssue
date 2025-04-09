package com.example;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicWebDriverMethods{
    public static void main(String[] args) throws InterruptedException{


        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");     //get()

        driver.manage().window().maximize();          //manage()

        // String currenturl=driver.getCurrentUrl();     //getCurrenturl()
        // System.out.println(currenturl);

        // String title=driver.getTitle();           //getTitle()
        // System.out.println(title);  

        // String pagesource=driver.getPageSource();       //getPageSource
        // System.out.println(pagesource);

        // driver.navigate().to("http://google.com");        //navigate()

        // driver.close();

        // driver.findElement(By.id("user-name")).sendKeys("standard_user");               //findElement()
        // Thread.sleep(2000);

        // driver.findElement(By.id("password")).sendKeys("secret_sauce");
        // Thread.sleep(2000);

        // driver.findElement(By.id("login-button")).click();
        // Thread.sleep(2000);

        // List<WebElement> ele1=driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));        //findElements()
        // for(WebElement element:ele1){
        //     System.out.println(element.getText());
        // }
        // Thread.sleep(6000);

        // driver.navigate().to("https:www.sugarcrm.com/");                  //navigate()
        // Thread.sleep(5000);
 
        // String windowhandle=driver.getWindowHandle();                  //getWindowHandle()
        // System.out.println(windowhandle);
        // Thread.sleep(5000);

        // Set<String> windowhandles=driver.getWindowHandles();           //getWindowHandles()
        // System.out.println(windowhandles);
        // Thread.sleep(5000);

        

        //driver.quit();



        
        





    }
}