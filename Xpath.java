package com.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
  System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.get("https://www.facebook.com/");
   driver.manage().window().maximize();
  WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
  create.click();
  Thread.sleep(3000);
//  WebElement firstname = driver.findElement(By.name("firstname"));
//  firstname.sendKeys("sathish");
//  WebElement lastname = driver.findElement(By.name("lastname"));
//  lastname.sendKeys("kumar");
//  WebElement mail = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
//  mail.sendKeys("abcdefgh");
//  WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
//  password.sendKeys("12345678")

  
  //drop down methods-single drop downz
  WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
  Select s= new Select(date);
  s.selectByIndex(24);
  WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
  Select s1=new Select(month);
  s1.selectByValue("5");
  WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
  Select s2= new Select(year);
  s2.selectByVisibleText("1996");
  
	}

}
