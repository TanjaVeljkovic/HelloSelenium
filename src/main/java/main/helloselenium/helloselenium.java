/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.helloselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class helloselenium {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         WebDriver driver = new ChromeDriver();   
        
         driver.get("https://www.imdb.com/");    
         
         System.out.println("URL: " + driver.getCurrentUrl());   
         System.out.println("Title: " + driver.getTitel());  

         WebElement searchBox = driver.findElement(By.id("suggestion-search"));
         searchButton.click(); 

    
    }
    
}
