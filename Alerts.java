package com.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System .setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement a1 = driver.findElement(By.xpath("//h5[contains(text(),'Frame & Windows')]"));
        a1.click();
        Thread.sleep(2000);
        WebElement findElement = driver.findElement(By.xpath("//button[@id='alertButton']"));
	}

}
