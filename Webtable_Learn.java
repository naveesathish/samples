package com.Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_Learn {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/table");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> all_data = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement all : all_data) {
			System.out.println(all.getText());
			

		//WebElement row_data = driver.findElement(By.xpath("//table/tbody/tr[2]/td"));
		//for (WebElement row : all_data) {
		//	System.out.println(row.getText());
			
		
		}

	}

}

