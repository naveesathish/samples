package com.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Methods {

	public static void main(String[] args) throws InterruptedException {
		System .setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		driver.switchTo().frame(0);
		WebElement s1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		s1.sendKeys("invite");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		WebElement nt = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		nt.click();
		Thread.sleep(2000);
		WebElement of = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	    driver.switchTo().frame(of);
	    driver.switchTo().frame(0);
	    WebElement s2 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	    s2.sendKeys("welcome");
	}

}
