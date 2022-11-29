package com.Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		System.out.println("******All Data******");
		List<WebElement> all_data = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement all : all_data) {
			System.out.println(all.getText());

		}
		System.out.println("********Row Data*****");
		List<WebElement> row_data = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
		for (WebElement row : row_data) {
			System.out.println(row.getText());
		}
		System.out.println("***** Column Data*******");
		List<WebElement> column_Data = driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
		for (WebElement column : column_Data) {
			System.out.println(column.getText());

		}
		System.out.println("*******particular Data*****");
        List<WebElement> particular_data = driver.findElements(By.xpath("//table/tbody/tr[3]/td[1]")); 
        for (WebElement pdata : particular_data) {
        	System.out.println(pdata.getText());
			
		}
	}
}