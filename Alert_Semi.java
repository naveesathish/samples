package com.Basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Alert_Semi {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//WebElement a1 = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
		//a1.click();

		
		//screenshot
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\acer\\eclipse-workspace\\Selenium_Concepts\\snaps//alertpic.png");
		FileHandler.copy(source, destination);
	}

}
