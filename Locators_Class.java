package com.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Class {

	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       
       driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
       driver.manage().window().maximize();
       WebElement firstName = driver.findElement(By.name("firstName"));
       firstName.sendKeys("naini");
       driver.findElement(By.name("lastName")).sendKeys("s");
       WebElement username = driver.findElement(By.id("username"));
       username.sendKeys("123456");
       WebElement passwd = driver.findElement(By.name("passwd"));
       passwd.sendKeys("king1234");
       driver.findElement(By.name("ConfirmPasswd")).sendKeys("king1234");
       
   
	}

}
