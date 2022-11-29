package com.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
        driver.manage().window().maximize();
       
        WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
        mobile.click();
        
        WebElement cover = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
        cover.click();
        
        WebElement contain = driver.findElement(By.xpath("//a[contains(text(),'Customer')]"));
        contain.click();
        
        WebElement fashion = driver.findElement(By.xpath("//a[contains(text(),'Fashion')]"));
        fashion.click();
        
        WebElement home = driver.findElement(By.xpath("//a[contains(text(),'Home & Kitchen')]"));
        home.click();
        
        WebElement book = driver.findElement(By.xpath("(//a[@tabindex='0'])[12]"));
        book.click();
        
        WebElement reord = driver.findElement(By.xpath("(//a[@tabindex='0'])[4]"));
        reord.click(); 
        
        WebElement search = driver.findElement(By.xpath("(//input[@tabindex='0'])[2]"));
        search.click();
        
        WebElement language = driver.findElement(By.xpath("//span[contains(@class,'icp-nav-language')]"));
        language.click();
        
        WebElement prime = driver.findElement(By.xpath("//a[contains(@id,'nav-link-amazonprime')]"));
        prime.click();
        
        WebElement sign = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
        sign.click();
        
        WebElement email = driver.findElement(By.xpath("//input[@type='email']")); 
        email.sendKeys("1234567890");

        WebElement cont = driver.findElement(By.xpath("//span[@id='continue']"));
        cont.click();
        
        WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
        pass.sendKeys("0110");
        
        WebElement submit = driver.findElement(By.xpath("//input[contains(@id,'signInSubmit')]"));
        submit.click();
        












	}

}
