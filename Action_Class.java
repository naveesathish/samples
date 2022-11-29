package com.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
      WebDriver driver= new ChromeDriver();
      driver.get("https://demoqa.com/buttons");
      driver.manage().window().maximize();
      Thread.sleep(3000);
      WebElement cm = driver.findElement(By.xpath("//button[text()='Click Me']"));
      Actions act = new Actions(driver);
      act.click(cm).perform();
      WebElement rcm = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
      act.contextClick(rcm).perform();
      WebElement dcm = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
      act.doubleClick(dcm).perform();
      
      driver.navigate().to("https://www.meesho.com/");
      Thread.sleep(2000);
      WebElement move = driver.findElement(By.xpath("//span[text()='Download the Meesho App']"));
      act.moveToElement(move).perform();
      Thread.sleep(4000);
      
      driver.navigate().to("https://jqueryui.com/droppable/");
      driver.switchTo().frame(0);
       WebElement drc = driver.findElement(By.id("draggable"));
       WebElement drp = driver.findElement(By.id("droppable"));
       act.dragAndDrop(drc, drp).perform();
	}

}
