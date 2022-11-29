package com.Basic;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Screenshot {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("abcdefgh");
		driver.findElement(By.id("pass")).sendKeys("nainni");
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
	   //explicit wait
       // WebDriverWait wait= new WebDriverWait(driver,0);
		//wait.until(ExpectedConditions.visibilityOf(login));
	     login.click();

	}
	

}
	