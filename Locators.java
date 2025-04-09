package com.example;


import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Locators {
    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();

        // driver.get("https://www.saucedemo.com/");
        // driver.findElement(By.id("user-name")).sendKeys("standard_user");
        // Thread.sleep(2000);

        // driver.findElement(By.id("password")).sendKeys("secret_sauce");
        // Thread.sleep(2000);

        // driver.findElement(By.id("login-button")).click();
        // Thread.sleep(2000);

        // driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
        // Thread.sleep(2000);

        // driver.findElement(By.linkText("All Items")).click();
        // Thread.sleep(2000);

        // driver.findElement(By.xpath("//button[text()='Close Menu']")).click();
        // Thread.sleep(2000);

        //--------------------------------------------------------------------------------------------------
        
        
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000);

        //relative xpath
        driver.findElement(By.xpath("//input[@value='Login']")).click();  //relative xpath

        //absolute xpath
        //driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div/input[1]")).sendKeys("Testing");

        //start-with xpath
        //driver.findElement(By.xpath("//input[starts-with(@id,'user-')]")).sendKeys("Testing");

        //contains-xpath
        //driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys("Testing");

        //text-xpath
        //driver.findElement(By.xpath("//a[text()='All Items']")).click();

        //AND and OR
        // Thread.sleep(1000);
        // driver.findElement(By.xpath("//input[@id='user-name' or @placeholder='Username']")).sendKeys("standard_user");
        // Thread.sleep(1000);
        // driver.findElement(By.xpath("//input[@id='password' and @placeholder='password']")).sendKeys("secret_sauce");
        // Thread.sleep(1000);

        //Axes methods-parent,child,self
        // //input[@id='user-name']//self::input;  //It selects itself
        // //input[@id='user-name']//parent::div; //It selects parent

        //Axes methods-descendant,descendant-or-self
        // //div[@id='root']//descendant::div;              //It selects the child, grandchild,....
        // //div[@id='root']//descendant-or-self::div;      //It selects the child, grandchild,....along with itself (only if both the tagnames are same)
        // //div[@id='root']//descendant::div[@class='login_wrapper'];              //here in the descendant it looks for particular one

        //Axes methods-following,following-sibling
        // //div[@class='login_container']//following::div;            //It selects all the nodes that appear after current node
        // //div[@class='login_container']//following-sibling::div;    //It selects all the nodes that have same parent as current node & have same tagname & appear after current no

        //CSS selector 
        //driver.findElement(By.cssSelector("input[autocorrect='off']")).sendKeys("Testing");    //for all attributes

        //driver.findElement(By.cssSelector("input#user-name")).sendKeys("Testing");        //for 'id' attribute(other option)

        //driver.findElement(By.cssSelector("input.input_error.form_input")).sendKeys("Testing");   //for 'class' attribute

        //mix of css selectors (starting with id or class followed by any other(multiple also can be used))
        //driver.findElement(By.cssSelector("input#user-name[autocorrect='off']")).sendKeys("HIII");
        //driver.findElement(By.cssSelector("input.input_error.form_input[autocorrect='off']")).sendKeys("HIII");

        //Css Selector-substring
        //driver.findElement(By.cssSelector("input[name$=-name]")).sendKeys("Testing");   //use suffix
        //driver.findElement(By.cssSelector("input[name^=user-]")).sendKeys("Testing");   //use prefix
        //driver.findElement(By.cssSelector("input[name^=user-][name$=-name]")).sendKeys("Testing");    //mix of sufix is possible, prefix is possible and bothe sufix and prefix mix is also possible
        //driver.findElement(By.cssSelector("input[name*=-na]")).sendKeys("Testing");     //any text of that attribute value  

        //Css selector-child or subchild
        //div[id='root']>div[class='login_container']      (first one-parent, second one-child)
        //div[id='root'] div[id='login_button_container']  (first one-parent, second one-any descendant child)







    }
}

 



        
    

    

    

