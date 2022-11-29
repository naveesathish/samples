package com.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Intro {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
}
}
